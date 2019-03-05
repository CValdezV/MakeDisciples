package edu.cwu.app.makedisciples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class WeekByWeek extends AppCompatActivity {

    private CheckBox chkGodTime, chkMentorMeeting, chkBibleStudy, chkCampusGroup, chkLocalChurch;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_by_week);
        addListenerOnButton();
        getSupportActionBar().setTitle("Week By Week CheckList");

    }
    public void addListenerOnButton() {

        chkGodTime = (CheckBox) findViewById(R.id.chkGodTime);
        chkMentorMeeting = (CheckBox) findViewById(R.id.chkMentorMeeting);
        chkBibleStudy = (CheckBox) findViewById(R.id.chkBibleStudy);
        chkCampusGroup = (CheckBox) findViewById(R.id.chkCampusGroup);
        chkLocalChurch = (CheckBox) findViewById(R.id.chkLocalChurch);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("God Time : ").append(chkGodTime.isChecked());
                result.append("\nMentor Meeting check : ").append(chkMentorMeeting.isChecked());
                result.append("\nBible Study check :").append(chkBibleStudy.isChecked());
                result.append("\nCampus Group check : ").append(chkCampusGroup.isChecked());
                result.append("\nLocal Church check :").append(chkLocalChurch.isChecked());

                Toast.makeText(WeekByWeek.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}
