package edu.cwu.app.makedisciples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.cwu.app.makedisciples.Databases.NoteDatabaseAccess;

public class EditNote extends AppCompatActivity {
    private EditText editText;
    private Button saveButton;
    private Button cancelButton;
    private NoteHandler note;
    private static String tableName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
        getSupportActionBar().setTitle("New "+tableName+" Note");
        editText = findViewById(R.id.etText);
        saveButton = findViewById(R.id.btnSave);
        cancelButton = findViewById(R.id.btnCancel);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            note = (NoteHandler)bundle.get("NOTE");
            if (note != null){
                editText.setText(note.getText());
            }
        }

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSaveClicked();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCancelClicked();
            }
        });


    }
    //determines what table to add notes to
    public static void setTableName(String name){
        tableName = name;
    }

    private void onCancelClicked() {
        this.finish();
    }

    private void onSaveClicked() {
        NoteDatabaseAccess access = NoteDatabaseAccess.getInstance(this);
        access.open();

        if (note == null){
            NoteHandler temp = new NoteHandler();
            temp.setText(editText.getText().toString());
            access.save(temp,tableName);
        }else {
            note.setText(editText.getText().toString());
            access.update(note,tableName);
        }
        access.close();
        this.finish();
    }
}
