package edu.cwu.app.makedisciples;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import edu.cwu.app.makedisciples.Databases.DatabaseAccess;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //set title of action bar
        getSupportActionBar().setTitle("About the Author");

        //opening of database and setting textView
        DatabaseAccess access = DatabaseAccess.getInstance(getApplicationContext());
        access.open();
        TextView view = findViewById(R.id.aboutAuthor);
        String text =access.getContent(21);

        view.setText(text);
        view.setMovementMethod(new ScrollingMovementMethod());
        access.close();

    }
}