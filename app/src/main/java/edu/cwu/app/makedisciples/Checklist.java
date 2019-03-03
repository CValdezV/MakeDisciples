package edu.cwu.app.makedisciples;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Checklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reading_checklist);

        // Checks  what the value is stored in our PM
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        boolean checked1 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox1", false);
        checkBox1.setChecked(checked1);

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox2", false);
        checkBox2.setChecked(checked2);

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox3", false);
        checkBox3.setChecked(checked3);

        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox4", false);
        checkBox4.setChecked(checked4);

        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox5", false);
        checkBox5.setChecked(checked5);

        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox6", false);
        checkBox6.setChecked(checked6);

        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox7", false);
        checkBox7.setChecked(checked7);

        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        boolean checked8 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox8", false);
        checkBox8.setChecked(checked8);

        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        boolean checked9 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox9", false);
        checkBox9.setChecked(checked9);

        CheckBox checkBox10 = findViewById(R.id.checkBox10);
        boolean checked10 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox10", false);
        checkBox10.setChecked(checked10);

        CheckBox checkBox11 = findViewById(R.id.checkBox11);
        boolean checked11 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox11", false);
        checkBox11.setChecked(checked11);

        CheckBox checkBox12 = findViewById(R.id.checkBox12);
        boolean checked12 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox12", false);
        checkBox12.setChecked(checked12);

        CheckBox checkBox13 = findViewById(R.id.checkBox13);
        boolean checked13 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox13", false);
        checkBox13.setChecked(checked13);

        CheckBox checkBox14 = findViewById(R.id.checkBox14);
        boolean checked14 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox14", false);
        checkBox14.setChecked(checked14);

        CheckBox checkBox15 = findViewById(R.id.checkBox15);
        boolean checked15 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox15", false);
        checkBox15.setChecked(checked15);

        CheckBox checkBox16 = findViewById(R.id.checkBox16);
        boolean checked16 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox16", false);
        checkBox16.setChecked(checked16);

        CheckBox checkBox17 = findViewById(R.id.checkBox17);
        boolean checked17 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox17", false);
        checkBox17.setChecked(checked17);

        CheckBox checkBox18 = findViewById(R.id.checkBox18);
        boolean checked18 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox18", false);
        checkBox18.setChecked(checked18);

        CheckBox checkBox19 = findViewById(R.id.checkBox19);
        boolean checked19 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox19", false);
        checkBox19.setChecked(checked19);

        CheckBox checkBox20 = findViewById(R.id.checkBox20);
        boolean checked20 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox20", false);
        checkBox20.setChecked(checked20);

        CheckBox checkBox21 = findViewById(R.id.checkBox21);
        boolean checked21 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox21", false);
        checkBox21.setChecked(checked21);

        CheckBox checkBox22 = findViewById(R.id.checkBox22);
        boolean checked22 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox22", false);
        checkBox22.setChecked(checked22);

        CheckBox checkBox23 = findViewById(R.id.checkBox23);
        boolean checked23 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox23", false);
        checkBox23.setChecked(checked23);

        CheckBox checkBox24 = findViewById(R.id.checkBox24);
        boolean checked24 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox24", false);
        checkBox24.setChecked(checked24);

        CheckBox checkBox25 = findViewById(R.id.checkBox25);
        boolean checked25 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox25", false);
        checkBox25.setChecked(checked25);

        CheckBox checkBox26 = findViewById(R.id.checkBox26);
        boolean checked26 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox26", false);
        checkBox26.setChecked(checked26);

        CheckBox checkBox27 = findViewById(R.id.checkBox27);
        boolean checked27 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox27", false);
        checkBox27.setChecked(checked27);

        CheckBox checkBox28 = findViewById(R.id.checkBox28);
        boolean checked28 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox28", false);
        checkBox28.setChecked(checked28);

        CheckBox checkBox29 = findViewById(R.id.checkBox29);
        boolean checked29 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox29", false);
        checkBox29.setChecked(checked29);

        CheckBox checkBox30 = findViewById(R.id.checkBox30);
        boolean checked30 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox30", false);
        checkBox30.setChecked(checked30);

        CheckBox checkBox31 = findViewById(R.id.checkBox31);
        boolean checked31 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox31", false);
        checkBox31.setChecked(checked31);

        CheckBox checkBox32 = findViewById(R.id.checkBox32);
        boolean checked32 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox32", false);
        checkBox32.setChecked(checked32);

        CheckBox checkBox33 = findViewById(R.id.checkBox33);
        boolean checked33 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox33", false);
        checkBox33.setChecked(checked33);

        CheckBox checkBox34 = findViewById(R.id.checkBox34);
        boolean checked34 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox34", false);
        checkBox34.setChecked(checked34);

        CheckBox checkBox35 = findViewById(R.id.checkBox35);
        boolean checked35 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox35", false);
        checkBox35.setChecked(checked35);

        CheckBox checkBox36 = findViewById(R.id.checkBox36);
        boolean checked36 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox36", false);
        checkBox36.setChecked(checked36);

        CheckBox checkBox37 = findViewById(R.id.checkBox37);
        boolean checked37 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox37", false);
        checkBox37.setChecked(checked37);

        CheckBox checkBox38 = findViewById(R.id.checkBox38);
        boolean checked38 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox38", false);
        checkBox38.setChecked(checked38);

        CheckBox checkBox39 = findViewById(R.id.checkBox39);
        boolean checked39 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox39", false);
        checkBox39.setChecked(checked39);

        CheckBox checkBox40 = findViewById(R.id.checkBox40);
        boolean checked40 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox40", false);
        checkBox40.setChecked(checked40);

        CheckBox checkBox41 = findViewById(R.id.checkBox41);
        boolean checked41 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox41", false);
        checkBox41.setChecked(checked41);

        CheckBox checkBox42 = findViewById(R.id.checkBox42);
        boolean checked42 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox42", false);
        checkBox42.setChecked(checked42);

        CheckBox checkBox43 = findViewById(R.id.checkBox43);
        boolean checked43 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox43", false);
        checkBox43.setChecked(checked43);

        CheckBox checkBox44 = findViewById(R.id.checkBox44);
        boolean checked44 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox44", false);
        checkBox44.setChecked(checked44);

        CheckBox checkBox45 = findViewById(R.id.checkBox45);
        boolean checked45 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox45", false);
        checkBox45.setChecked(checked45);

        CheckBox checkBox46 = findViewById(R.id.checkBox46);
        boolean checked46 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox46", false);
        checkBox46.setChecked(checked46);

        CheckBox checkBox47 = findViewById(R.id.checkBox47);
        boolean checked47 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox47", false);
        checkBox47.setChecked(checked47);

        CheckBox checkBox48 = findViewById(R.id.checkBox48);
        boolean checked48 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox48", false);
        checkBox48.setChecked(checked48);

        CheckBox checkBox49 = findViewById(R.id.checkBox49);
        boolean checked49 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox49", false);
        checkBox49.setChecked(checked49);

        CheckBox checkBox50 = findViewById(R.id.checkBox50);
        boolean checked50 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox50", false);
        checkBox50.setChecked(checked50);

        CheckBox checkBox51 = findViewById(R.id.checkBox51);
        boolean checked51 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox51", false);
        checkBox51.setChecked(checked51);

        CheckBox checkBox52 = findViewById(R.id.checkBox52);
        boolean checked52 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox52", false);
        checkBox52.setChecked(checked52);

        CheckBox checkBox53 = findViewById(R.id.checkBox53);
        boolean checked53 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox53", false);
        checkBox53.setChecked(checked53);

        CheckBox checkBox54 = findViewById(R.id.checkBox54);
        boolean checked54 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox54", false);
        checkBox54.setChecked(checked54);

        CheckBox checkBox55 = findViewById(R.id.checkBox55);
        boolean checked55 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox55", false);
        checkBox55.setChecked(checked55);

        CheckBox checkBox56 = findViewById(R.id.checkBox56);
        boolean checked56 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox56", false);
        checkBox56.setChecked(checked56);

        CheckBox checkBox57 = findViewById(R.id.checkBox57);
        boolean checked57 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox57", false);
        checkBox57.setChecked(checked57);

        CheckBox checkBox58 = findViewById(R.id.checkBox58);
        boolean checked58 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox58", false);
        checkBox58.setChecked(checked58);

        CheckBox checkBox59 = findViewById(R.id.checkBox59);
        boolean checked59 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox59", false);
        checkBox59.setChecked(checked59);

        CheckBox checkBox60 = findViewById(R.id.checkBox60);
        boolean checked60 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox60", false);
        checkBox60.setChecked(checked60);

        CheckBox checkBox61 = findViewById(R.id.checkBox61);
        boolean checked61 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox61", false);
        checkBox61.setChecked(checked61);

        CheckBox checkBox62 = findViewById(R.id.checkBox62);
        boolean checked62 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox62", false);
        checkBox62.setChecked(checked62);

        CheckBox checkBox63 = findViewById(R.id.checkBox63);
        boolean checked63 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox63", false);
        checkBox63.setChecked(checked63);

        CheckBox checkBox64 = findViewById(R.id.checkBox64);
        boolean checked64 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox64", false);
        checkBox64.setChecked(checked64);

        CheckBox checkBox65 = findViewById(R.id.checkBox65);
        boolean checked65 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox65", false);
        checkBox65.setChecked(checked65);

        CheckBox checkBox66 = findViewById(R.id.checkBox66);
        boolean checked66 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox66", false);
        checkBox66.setChecked(checked66);

        CheckBox checkBox67 = findViewById(R.id.checkBox67);
        boolean checked67 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox67", false);
        checkBox67.setChecked(checked67);

        CheckBox checkBox68 = findViewById(R.id.checkBox68);
        boolean checked68 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox68", false);
        checkBox68.setChecked(checked68);

        CheckBox checkBox69 = findViewById(R.id.checkBox69);
        boolean checked69 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox69", false);
        checkBox69.setChecked(checked69);

        CheckBox checkBox70 = findViewById(R.id.checkBox70);
        boolean checked70 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox70", false);
        checkBox70.setChecked(checked70);

        CheckBox checkBox71 = findViewById(R.id.checkBox71);
        boolean checked71 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox71", false);
        checkBox71.setChecked(checked71);

        CheckBox checkBox72 = findViewById(R.id.checkBox72);
        boolean checked72 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox72", false);
        checkBox72.setChecked(checked72);

        CheckBox checkBox73 = findViewById(R.id.checkBox73);
        boolean checked73 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox73", false);
        checkBox73.setChecked(checked73);

        CheckBox checkBox74 = findViewById(R.id.checkBox74);
        boolean checked74 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox74", false);
        checkBox74.setChecked(checked74);

        CheckBox checkBox75 = findViewById(R.id.checkBox75);
        boolean checked75 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox75", false);
        checkBox75.setChecked(checked75);

        CheckBox checkBox76 = findViewById(R.id.checkBox76);
        boolean checked76 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox76", false);
        checkBox76.setChecked(checked76);

        CheckBox checkBox77 = findViewById(R.id.checkBox77);
        boolean checked77 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox77", false);
        checkBox77.setChecked(checked77);

        CheckBox checkBox78 = findViewById(R.id.checkBox78);
        boolean checked78 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox78", false);
        checkBox78.setChecked(checked78);

        CheckBox checkBox79 = findViewById(R.id.checkBox79);
        boolean checked79 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox79", false);
        checkBox79.setChecked(checked79);

        CheckBox checkBox80 = findViewById(R.id.checkBox80);
        boolean checked80 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("checkBox80", false);
        checkBox80.setChecked(checked80);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox1:
                // Change value
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox1", checked).apply();
                break;
            case R.id.checkBox2:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox2", checked).apply();
                break;
            case R.id.checkBox3:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox3", checked).apply();
               break;
            case R.id.checkBox4:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox4", checked).apply();
                break;
            case R.id.checkBox5:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox5", checked).apply();
                break;
            case R.id.checkBox6:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox6", checked).apply();
                break;
            case R.id.checkBox7:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox7", checked).apply();
                break;
            case R.id.checkBox8:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox8", checked).apply();
                break;
            case R.id.checkBox9:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox9", checked).apply();
                break;
            case R.id.checkBox10:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox10", checked).apply();
                break;
            case R.id.checkBox11:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox11", checked).apply();
                break;
            case R.id.checkBox12:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox13", checked).apply();
                break;
            case R.id.checkBox13:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox13", checked).apply();
                break;
            case R.id.checkBox14:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox14", checked).apply();
                break;
            case R.id.checkBox15:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox15", checked).apply();
                break;
            case R.id.checkBox16:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox16", checked).apply();
                break;
            case R.id.checkBox17:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox17", checked).apply();
                break;
            case R.id.checkBox18:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox18", checked).apply();
                break;
            case R.id.checkBox19:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox19", checked).apply();
                break;
            case R.id.checkBox20:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox20", checked).apply();
                break;
            case R.id.checkBox21:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox21", checked).apply();
                break;
            case R.id.checkBox22:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox22", checked).apply();
                break;
            case R.id.checkBox23:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox23", checked).apply();
                break;
            case R.id.checkBox24:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox24", checked).apply();
                break;
            case R.id.checkBox25:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox25", checked).apply();
                break;
            case R.id.checkBox26:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox26", checked).apply();
                break;
            case R.id.checkBox27:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox27", checked).apply();
                break;
            case R.id.checkBox28:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox28", checked).apply();
                break;
            case R.id.checkBox29:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox29", checked).apply();
                break;
            case R.id.checkBox30:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox30", checked).apply();
                break;
            case R.id.checkBox31:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox31", checked).apply();
                break;
            case R.id.checkBox32:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox32", checked).apply();
                break;
            case R.id.checkBox33:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox33", checked).apply();
                break;
            case R.id.checkBox34:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox34", checked).apply();
                break;
            case R.id.checkBox35:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox35", checked).apply();
                break;
            case R.id.checkBox36:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox36", checked).apply();
                break;
            case R.id.checkBox37:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox37", checked).apply();
                break;
            case R.id.checkBox38:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox38", checked).apply();
                break;
            case R.id.checkBox39:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox39", checked).apply();
                break;
            case R.id.checkBox40:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox40", checked).apply();
                break;
            case R.id.checkBox41:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox41", checked).apply();
                break;
            case R.id.checkBox42:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox42", checked).apply();
                break;
            case R.id.checkBox43:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox43", checked).apply();
                break;
            case R.id.checkBox44:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox44", checked).apply();
                break;
            case R.id.checkBox45:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox45", checked).apply();
                break;
            case R.id.checkBox46:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox46", checked).apply();
                break;
            case R.id.checkBox47:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox47", checked).apply();
                break;
            case R.id.checkBox48:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox48", checked).apply();
                break;
            case R.id.checkBox49:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox49", checked).apply();
                break;
            case R.id.checkBox50:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox50", checked).apply();
                break;
            case R.id.checkBox51:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox51", checked).apply();
                break;
            case R.id.checkBox52:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox52", checked).apply();
                break;
            case R.id.checkBox53:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox53", checked).apply();
                break;
            case R.id.checkBox54:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox54", checked).apply();
                break;
            case R.id.checkBox55:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox55", checked).apply();
                break;
            case R.id.checkBox56:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox56", checked).apply();
                break;
            case R.id.checkBox57:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox57", checked).apply();
                break;
            case R.id.checkBox58:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox58", checked).apply();
                break;
            case R.id.checkBox59:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox59", checked).apply();
                break;
            case R.id.checkBox60:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox60", checked).apply();
                break;
            case R.id.checkBox61:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox61", checked).apply();
                break;
            case R.id.checkBox62:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox62", checked).apply();
                break;
            case R.id.checkBox63:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox63", checked).apply();
                break;
            case R.id.checkBox64:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox64", checked).apply();
                break;
            case R.id.checkBox65:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox65", checked).apply();
                break;
            case R.id.checkBox66:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox66", checked).apply();
                break;
            case R.id.checkBox67:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox67", checked).apply();
                break;
            case R.id.checkBox68:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox68", checked).apply();
                break;
            case R.id.checkBox69:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox69", checked).apply();
                break;
            case R.id.checkBox70:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox70", checked).apply();
                break;
            case R.id.checkBox71:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox71", checked).apply();
                break;
            case R.id.checkBox72:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox72", checked).apply();
                break;
            case R.id.checkBox73:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox73", checked).apply();
                break;
            case R.id.checkBox74:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox74", checked).apply();
                break;
            case R.id.checkBox75:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox75", checked).apply();
                break;
            case R.id.checkBox76:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox76", checked).apply();
                break;
            case R.id.checkBox77:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox77", checked).apply();
                break;
            case R.id.checkBox78:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox78", checked).apply();
                break;
            case R.id.checkBox79:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox79", checked).apply();
                break;
            case R.id.checkBox80:
                PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("checkBox80", checked).apply();
                break;
        }
    }
}
