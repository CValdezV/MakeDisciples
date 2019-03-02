package edu.cwu.app.makedisciples;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cwu.app.makedisciples.Adapter.CustomExpandableAdapter;
import edu.cwu.app.makedisciples.Databases.DatabaseAccess;

public class MainActivity extends AppCompatActivity {

    private List<String>listDataHeader;
    private HashMap<String,List<String>>listDataChild;
    private ExpandableListView expListView;
    private ExpandableListAdapter listAdapter;
    private DrawerLayout myDrawer;
    private TextView displayText;
    private  DatabaseAccess databaseAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        expListView = findViewById(R.id.expandableListView);
        displayText = findViewById(R.id.textDisplay);
            databaseAccess.open();
            displayText.setText(databaseAccess.getContent(2));
            displayText.setMovementMethod(new ScrollingMovementMethod());
            databaseAccess.close();

        //database access

        //List setup
        listSetup();

        populateNav();

        myDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, myDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    //child listener and group listener for navList
    private void populateNav() {
        listAdapter = new CustomExpandableAdapter(this,listDataHeader,listDataChild);
        expListView.setAdapter(listAdapter);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {



                //retrieve child name from list
                List<String> temp = listDataChild.get(listDataHeader.get(groupPosition));

                databaseAccess.open();

                int entryID = displayInfo(temp.get(childPosition));
                /*case ("Book Notes"): return 62;
            case ("Journal Entries"): return 23;
            case ("Local Church"): return 24;
            case ("Campus Worship"): return 25;
            case ("Evangelism Log"): return 26;
            case ("Bible Reading Checklist"): return 27;
            case ("Week by Week Disciplines"): return 28;*/
                //can be switch case later
                if (entryID ==1){
                    Intent intent = new Intent(MainActivity.this,Abbreviations.class);
                    startActivity(intent);
                }else if (entryID ==21){
                    Intent intent = new Intent(MainActivity.this,About.class);
                    startActivity(intent);

                }else if (entryID == 62){
                    NoteDisplay.setTableName("book");
                    Intent intent = new Intent(MainActivity.this,NoteDisplay.class);
                    startActivity(intent);
                }else if (entryID == 23){
                    NoteDisplay.setTableName("journal");
                    Intent intent = new Intent(MainActivity.this,NoteDisplay.class);
                    startActivity(intent);

                }else if (entryID == 24){
                    NoteDisplay.setTableName("church");
                    Intent intent = new Intent(MainActivity.this,NoteDisplay.class);
                    startActivity(intent);

                }else if (entryID == 25){
                    NoteDisplay.setTableName("campus");
                    Intent intent = new Intent(MainActivity.this,NoteDisplay.class);
                    startActivity(intent);

                }else if (entryID == 26){
                    NoteDisplay.setTableName("evangelism");
                    Intent intent = new Intent(MainActivity.this,NoteDisplay.class);
                    startActivity(intent);

                }else if (entryID == 27){

                }else if (entryID == 28){

                }else {
                    String display =databaseAccess.getContent(displayInfo(temp.get(childPosition)));
                    displayText.setText(display);
                    displayText.setMovementMethod(new ScrollingMovementMethod());
                    displayText.scrollTo(0, 0);
                }


                databaseAccess.close();
                expListView.collapseGroup(groupPosition);
                myDrawer.closeDrawer(GravityCompat.START);
                return false;
            }
        });

    }

    private void listSetup() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String,List<String>>();

        //headers for all child items
        listDataHeader.add("Making Disciples"); //0
        listDataHeader.add("Gospel Message"); // 1
        listDataHeader.add("Weekly Mentor Meeting"); //2
        listDataHeader.add("Your Disciplines"); //3
        listDataHeader.add("Bible Study Groups"); //4
        listDataHeader.add("Daily God Times"); // 5
        listDataHeader.add("Primary Goals"); // 6
        listDataHeader.add("Bible Studies"); // 7
        listDataHeader.add("Afterword"); //8
        listDataHeader.add("Notes & Activities"); // 9

        //dataHeader at 0
        List<String> disciples = new ArrayList<String>();
        disciples.add("Bible Abbreviations");
        disciples.add("Introduction");
        disciples.add("Where to Use the App");

        //dataHeader at 1
        List<String> gospel = new ArrayList<String>();
        gospel.add("The Message");
        gospel.add("Giving Life to Jesus");
        gospel.add("Being a Disciple");

        //dataHeader at 2
        List<String> mentor = new ArrayList<String>();
        mentor.add("Directions for Mentors");
        mentor.add("Suggested Material");
        mentor.add("Primary Goals");

        //dataHeader at 3
        List<String> disciplines = new ArrayList<String>();
        disciplines.add("Your Disciplines");
        disciplines.add("Doing a SOAPT");
        disciplines.add("SOAPT");
        disciplines.add("Start Using SOAPT");
        disciplines.add("Prayer page");
        disciplines.add("Additional Readings");

        //dataHeader at 4
        List<String> bibleStudy = new ArrayList<String>();
        bibleStudy.add("Why do Residence Hall Studies?");
        bibleStudy.add("Starting a Bible Study");
        bibleStudy.add("Using the Materials");
        bibleStudy.add("Leading bible Studies");

        //dataHeader at 8
        List<String> afterWord = new ArrayList<String>();
        afterWord.add("Acknowledgements");
        afterWord.add("About the Author");
        afterWord.add("About Chi Alpha");

        //dataHeader at 5
        List<String> godTimes = new ArrayList<String>();
        godTimes.add("Spend Time with God");
        godTimes.add("Layout for Lord's Prayer");
        godTimes.add("Lord's Questions part 1");
        godTimes.add("Lord's Questions part 2");
        godTimes.add("Lord's Questions part 3");
        godTimes.add("Morning Prayer");
        godTimes.add("Morning Questions part 1");
        godTimes.add("Morning Questions part 2");
        godTimes.add("Morning Questions part 3");
        godTimes.add("Morning Questions part 4");
        godTimes.add("Bible Questions part 1");
        godTimes.add("Bible Questions part 2");

        //dataHeader at 6
        List<String> primeGoals = new ArrayList<String>();
        primeGoals.add("Discussions part 1");
        primeGoals.add("Discussions part 2");
        primeGoals.add("Discussions part 3");
        primeGoals.add("Discussions part 4");
        primeGoals.add("Discussions part 5");
        primeGoals.add("Discussions part 6");

        //dataHeader at 7
        List<String> studyBible = new ArrayList<String>();
        studyBible.add("Purpose of Group");
        studyBible.add("Who is Jesus?");
        studyBible.add("Do You Have Questions?");
        studyBible.add("First Two Disciples");
        studyBible.add("Loving Father");
        studyBible.add("The Invitation");
        studyBible.add("Honouring god");
        studyBible.add("Social Outcast");
        studyBible.add("The Secret");
        studyBible.add("Forgiveness");
        studyBible.add("Power Over Sickness & Demons");
        studyBible.add("The Shepherd");
        studyBible.add("How do I Grow");
        studyBible.add("Crucifixion");
        studyBible.add("Resurrection");

        //dataHeader at 9
        List<String> noteTaking = new ArrayList<String>();
        noteTaking.add("Journal Entries");
        noteTaking.add("Book Notes");
        noteTaking.add("Local Church");
        noteTaking.add("Campus Worship");
        noteTaking.add("Evangelism Log");
        noteTaking.add("Bible Reading Checklist");
        noteTaking.add("Week by Week Disciplines");


        listDataChild.put(listDataHeader.get(0),disciples);
        listDataChild.put(listDataHeader.get(1),gospel);
        listDataChild.put(listDataHeader.get(2),mentor);
        listDataChild.put(listDataHeader.get(3),disciplines);
        listDataChild.put(listDataHeader.get(4),bibleStudy);
        listDataChild.put(listDataHeader.get(5),godTimes);
        listDataChild.put(listDataHeader.get(6),primeGoals);
        listDataChild.put(listDataHeader.get(7),studyBible);
        listDataChild.put(listDataHeader.get(8),afterWord);
        listDataChild.put(listDataHeader.get(9),noteTaking);
    }

    //layered switch case to get the id to display content from database
    public int displayInfo(String chapterName) {
        switch (chapterName) {
            case ("Bible Abbreviations"): return 1;
            case ("Introduction"): return 2;
            case ("Where to Use the App"): return 3;
            case ("The Message"): return 4;
            case ("Giving Life to Jesus"): return 5;
            case ("Being a Disciple"): return 6;
            case ("Directions for Mentors"): return 7;
            case ("Suggested Material"): return 8;
            case ("Primary Goals"): return 9;
            case ("Your Disciplines"): return 10;
            case ("Doing a SOAPT"): return 11;
            case ("SOAPT"): return 12;
            case ("Start Using Soapt"): return 13;
            case ("Prayer Page"): return 14;
            case ("Additional Readings"): return 15;
            case ("Why do Residence Hall Studies?"): return 16;
            case ("Starting a Bible Study"): return 17;
            case ("Using the Materials"): return 18;
            case ("Leading Bible Studies"): return 19;


            case ("About Chi Alpha"): return 20;
            case ("About the Author"): return 21;
            case ("Acknowledgements"): return 22;

            //Book note extra case to store notes taken from book

            case ("Journal Entries"): return 23;
            case ("Local Church"): return 24;
            case ("Campus Worship"): return 25;
            case ("Evangelism Log"): return 26;
            case ("Bible Reading Checklist"): return 27;
            case ("Week by Week Disciplines"): return 28;

            case ("Spending Time with God"): return 29;
            case ("Layout for Lord's Prayer"): return 30;
            case ("Lord's Questions part 1"): return 31;
            case ("Lord's Questions part 2"): return 32;
            case ("Lord's Questions part 3"): return 33;
            case ("Morning Prayer"): return 34;
            case ("Morning Questions part 1"): return 35;
            case ("Morning Questions part 2"): return 36;
            case ("Morning Questions part 3"): return 37;
            case ("Morning Questions part 4"): return 38;
            case ("Bible Question part 1"): return 39;
            case ("Bible Questions part 2"): return 40;
            case ("Discussions part 1"): return 41;
            case ("Discussions part 2"): return 42;
            case ("Discussions part 3"): return 43;
            case ("Discussions part 4"): return 44;
            case ("Discussions part 5"): return 45;
            case ("Discussions part 6"): return 46;
            case ("Purpose of Group"): return 47; //Bible Studies
            case ("Who is Jesus?"): return 48;
            case ("Do You Have Questions?"): return 49;
            case ("First Two Disciples"): return 50;
            case ("Loving Father"): return 51;
            case ("The Invitation"): return 52;
            case ("Honouring God"): return 53;
            case ("Social Outcast"): return 54;
            case ("The Secret"): return 55;
            case ("Forgiveness"): return 56;
            case ("Power Over Sickness & Demons"): return 57;
            case ("The Shepherd"): return 58;
            case ("How do I Grow"): return 59;
            case ("Crucifixion"): return 60;
            case ("Resurrection"): return 61;
            case ("Book Notes"): return 62;
            default: return 0;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
