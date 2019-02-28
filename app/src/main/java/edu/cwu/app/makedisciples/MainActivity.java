package edu.cwu.app.makedisciples;

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

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private List<String>listDataHeader;
    private HashMap<String,List<String>>listDataChild;
    private ExpandableListView expListView;
    private ExpandableListAdapter listAdapter;
    private DrawerLayout myDrawer;
    private TextView displayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        expListView = findViewById(R.id.expandableListView);
        displayText = findViewById(R.id.textDisplay);

        //database access

        //List setup
        listSetup();

        populateNav();

        myDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, myDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        myDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();

                String display =databaseAccess.getContent(displayInfo(temp.get(childPosition)));
                displayText.setText(display);
                displayText.setMovementMethod(new ScrollingMovementMethod());
                displayText.scrollTo(0,0);


                databaseAccess.close();
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
      //convert to switch if time
        if (chapterName.equals("Bible Abbreviations")){
            return 1;
        }else if (chapterName.equals("Introduction")){
            return 2;
        }else if (chapterName.equals("Where to Use the App")){
            return 3;
        }else if (chapterName.equals("The Message")){
            return 4;
        }else if (chapterName.equals("Giving Life to Jesus")){
            return 5;
        }else if (chapterName.equals("Being a Disciple")){
            return 6;
        }else if (chapterName.equals("Directions for Mentors")){
            return 7;
        }else if (chapterName.equals("Suggested Material")){
            return 8;
        }else if (chapterName.equals("Primary Goals")){
            return 9;
        }else if (chapterName.equals("Your Disciplines")){
            return 10;
        }else if (chapterName.equals("Doing a SOAPT")){
            return 11;
        }else if (chapterName.equals("SOAPT")){
            return 12;
        }else if (chapterName.equals("Start Using SOAPT")){
            return 13;
        }else if (chapterName.equals("Prayer Page")){
            return 14;
        }else if (chapterName.equals("Additional Readings")){
            return 15;
        }else if (chapterName.equals("Why do Residence Hall Studies?")){
            return 16;
        }else if (chapterName.equals("Starting a Bible Study")){
            return 17;
        }else if (chapterName.equals("Using the Materials")){
            return 18;
        }else if (chapterName.equals("Leading Bible Studies")){
            return 19;
        }else if (chapterName.equals("Spend Time with God")){
            return 29;
        }else if (chapterName.equals("Layout for Lord's Prayer")){
            return 30;
        }else if (chapterName.equals("Lord's Questions part 1")){
            return 31;
        }else if (chapterName.equals("Lord's Questions part 2")){
            return 32;
        }else if (chapterName.equals("Lord's Questions part 3")){
            return 33;
        }else if (chapterName.equals("Morning Prayer")){
            return 34;
        }else if (chapterName.equals("Morning Questions part 1")){
            return 35;
        }else if (chapterName.equals("Morning Questions part 2")){
            return 36;
        }else if (chapterName.equals("Morning Questions part 3")){
            return 37;
        }else if (chapterName.equals("Morning Questions part 4")){
            return 38;
        }else if (chapterName.equals("Bible Questions part 1")){
            return 39;
        }else if (chapterName.equals("Bible Questions part 2")){
            return 40;
        }else if (chapterName.equals("Discussions part 1")){    //Primary Goals
            return 41;
        }else if (chapterName.equals("Discussions part 2")){
            return 42;
        }else if (chapterName.equals("Discussions part 3")){
            return 43;
        }else if (chapterName.equals("Discussions part 4")){
            return 44;
        }else if (chapterName.equals("Discussions part 5")){
            return 45;
        }else if (chapterName.equals("Discussions part 6")){
            return 46;
        }else if (chapterName.equals("Purpose of Group")){  //Bible Studies
            return 47;
        }else if (chapterName.equals("Who is Jesus?")){
            return 48;
        }else if (chapterName.equals("Do You Have Questions?")){
            return 49;
        }else if (chapterName.equals("First Two Disciples")){
            return 50;
        }else if (chapterName.equals("Loving Father")){
            return 51;
        }else if (chapterName.equals("The Invitation")){
            return 52;
        }else if (chapterName.equals("Honouring God")){
            return 53;
        }else if (chapterName.equals("Social Outcast")){
            return 54;
        }else if (chapterName.equals("The Secret")){
            return 55;
        }else if (chapterName.equals("Forgiveness")){
            return 56;
        }else if (chapterName.equals("Power Over Sickness & Demons")){
            return 57;
        }else if (chapterName.equals("The Shepherd")){
            return 58;
        }else if (chapterName.equals("How do I Grow")){
            return 59;
        }else if (chapterName.equals("Crucifixion")){
            return 60;
        }else if (chapterName.equals("Resurrection")){
            return 61;
        }else if (chapterName.equals("Acknowledgements")){  //afterword
            return 22;
        }else if (chapterName.equals("About the Author")){
            return 21;
        }else if (chapterName.equals("About Chi Alpha")){
            return 20;
        } else if (chapterName.equals("Journal Entries")){ //Notes and activities
            return 23;
        }else if (chapterName.equals("Local Church")){
            return 24;
        }else if (chapterName.equals("Campus Worship")){
            return 25;
        }else if (chapterName.equals("Bible Reading Checklist")){
            return 27;
        }else if (chapterName.equals("Week by Week Disciplines")){
            return 28;
        }else if (chapterName.equals("Evangelism Log")){
            return 26;
        }

       return 0;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
