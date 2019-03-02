package edu.cwu.app.makedisciples;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

import edu.cwu.app.makedisciples.Databases.NoteDatabaseAccess;

public class NoteDisplay extends AppCompatActivity {

    private ListView listView;
    private Button addButton;
    private NoteDatabaseAccess noteAccessor;
    private List<NoteHandler> notes;
    private static String tableName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_display);

        getSupportActionBar().setTitle(tableName);
        //variable declaration
        noteAccessor = NoteDatabaseAccess.getInstance(getApplicationContext());
        listView =findViewById(R.id.listView);
        addButton = findViewById(R.id.buttonAdd);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NoteHandler note = notes.get(position);
                TextView noteText = view.findViewById(R.id.txtNote);
                if (note.getFullyDisplay()){
                    noteText.setText(note.getShortText());
                    note.setIsFullyDisplay(false);
                }else {
                    noteText.setText(note.getText());
                    note.setIsFullyDisplay(true);
                }
            }
        });
    }
    public static void setTableName(String table){
        tableName = table;
    }
    @Override
    protected void onResume(){
        super.onResume();
        noteAccessor.open();
        notes = noteAccessor.getAllNotes(tableName);
        noteAccessor.close();
        NoteAdapter adapter = new NoteAdapter(this,notes);
        listView.setAdapter(adapter);

    }
    public void onDeleteClicked(NoteHandler note){
        noteAccessor.open();
        noteAccessor.delete(note,tableName);
    }
    public void onEditClicked(NoteHandler note){

    }

    private class NoteAdapter extends ArrayAdapter<NoteHandler>{

        public NoteAdapter(Context context,List<NoteHandler> object){
            super(context,0,object);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.note_list_layout,parent,false);
            }

            ImageView btnEdit = convertView.findViewById(R.id.btnEdit);
            ImageView btnDelete = convertView.findViewById(R.id.btnDelete);
            TextView txtDate = convertView.findViewById(R.id.txtDate);
            TextView txtNote = convertView.findViewById(R.id.txtNote);

            final NoteHandler note = notes.get(position);
            note.setIsFullyDisplay(false);
            txtDate.setText(note.getDate());
            txtNote.setText(note.getShortText());
            btnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onEditClicked(note);
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onDeleteClicked(note);
                }
            });
            return convertView;
        }
    }
}
