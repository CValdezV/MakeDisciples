package edu.cwu.app.makedisciples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.cwu.app.makedisciples.Databases.NoteDatabaseAccess;

//Seperate class for taking notes on the book pages themselves
public class BookNoteTaking extends AppCompatActivity {

    private TextView view;
    private EditText editText;
    private Button saveButton;
    private Button cancelButton;
    private static String page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_note_taking);

        //variable declaration
        view = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
        saveButton = findViewById(R.id.buttonSave);
        cancelButton = findViewById(R.id.buttonCancel);
        getSupportActionBar().setTitle("New Book Note");
        view.setText(page);
        view.setMovementMethod(new ScrollingMovementMethod());

        //button listeners
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

    public static void setPage(String currPage){
        page = currPage;

    }
    private void onCancelClicked() {
        this.finish();
    }

    private void onSaveClicked() {
        NoteDatabaseAccess access = NoteDatabaseAccess.getInstance(this);
        access.open();

            NoteHandler temp = new NoteHandler();
            temp.setText(editText.getText().toString());
            access.save(temp,"book");

        access.close();
        this.finish();
    }
}
