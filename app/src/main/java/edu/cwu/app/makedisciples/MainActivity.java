package edu.cwu.app.makedisciples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

                displayText.setText(groupPosition+" "+childPosition);
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
        disciples.add("bible abbreviations");
        disciples.add("Introduction");
        disciples.add("Where to use the app");

        //dataHeader at 1
        List<String> gospel = new ArrayList<String>();
        gospel.add("the Message");
        gospel.add("giving life to Jesus");
        gospel.add("Being a Disciple");

        //dataHeader at 2
        List<String> mentor = new ArrayList<String>();
        mentor.add("Directions for mentors");
        mentor.add("Suggested material");
        mentor.add("Primary Goals");

        //dataHeader at 3
        List<String> disciplines = new ArrayList<String>();
        disciplines.add("Your Disciplines");
        disciplines.add("Bible Reading checkList");
        disciplines.add("Week by Week ");
        disciplines.add("Doing a SOAPT");
        disciplines.add("SOAPT");
        disciplines.add("Start Using SOAPT");
        disciplines.add("Prayer page");

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
        godTimes.add("Layout for Lord's prayer");
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
        studyBible.add("Purpose Of Group");
        studyBible.add("Who is Jesus?");
        studyBible.add("Do You Have Questions?");
        studyBible.add("First Two Disciples");
        studyBible.add("Loving Father");
        studyBible.add("The Invitation");
        studyBible.add("Honouring god");
        studyBible.add("Social Outcast");
        studyBible.add("The Secret");
        studyBible.add("Forgiveness");
        studyBible.add("Power Over Sickness//Demons");
        studyBible.add("The Shepperd");
        studyBible.add("How do I Grow");
        studyBible.add("Crucifixion");
        studyBible.add("Resurrection");

        //dataHeader at 9
        List<String> noteTaking = new ArrayList<String>();
        noteTaking.add("Journal Entries");
        noteTaking.add("Local Church");
        noteTaking.add("Campus Worship");
        noteTaking.add("Bible Reading Checklist");
        noteTaking.add("Week by Week Disciplines");
        noteTaking.add("Evangelism Log");

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
    public int displayInfo(int groupPosition, int childPosition) {

        switch (groupPosition){
            case 0:
                switch (childPosition){
                    case 0:
                        return 1;

                    case 1:
                        return 2;
                    case 2:
                        return 3;
                }
                break;
            case 1:
                switch (childPosition){
                    case 0:
                        return 4;
                    case 1:
                        return 5;
                    case 2:
                        return 6;
                }
            case 2:
                switch (childPosition) {
                    case 0:
                        return 7;
                    case 1:
                        return 8;
                    case 2:
                        return 9;
                }
            case 3:
                switch (childPosition) {
                    case 0:
                        return 10;
                    case 1:
                        return 11;
                    case 2:
                        return 12;
                    case 3:
                        return 13;
                    case 4:
                        return 14;
                    case 5:
                        return 15;
                    case 6:
                        return 16;
                    case 7:
                        return 17;
                    case 8:
                        return 18;
                    case 9:
                        return 19;
                }
            case 4:
                switch (childPosition){
                    case 0:
                        return 20;
                    case 1:
                        return 21;
                    case 2:
                        return 22;
                    case 3:
                        return 23;
                    case 4:
                        return 24;
                    case 5:
                        return 25;
                }
            case 5:
                switch (childPosition){
                    case 0:
                        return 26;
                    case 1:
                        return 27;
                    case 2:
                        return 31;
                    case 3:
                        return 32;
                    case 4:
                        return 33;
                }

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
