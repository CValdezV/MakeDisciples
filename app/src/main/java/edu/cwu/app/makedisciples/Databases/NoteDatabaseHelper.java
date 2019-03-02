package edu.cwu.app.makedisciples.Databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


//seperate database for handling all entries made by user
public class NoteDatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME ="notes.db";
    public static final String BOOKNOTE_TABLE ="bookNotes";
    public static final String JOURNAL_TABLE ="journal";
    public static final String CHURCH_TABLE ="church";
    public static final String CAMPUS_TABLE ="campus";
    public static final String EVANGEL_TABLE ="evangelism";

    public NoteDatabaseHelper(Context context){
        super(context,DB_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+BOOKNOTE_TABLE+"(date INTEGER PRIMARY KEY, notes TEXT);");
        db.execSQL("CREATE TABLE "+JOURNAL_TABLE+"(date INTEGER PRIMARY KEY, notes TEXT);");
        db.execSQL("CREATE TABLE "+CHURCH_TABLE+"(date INTEGER PRIMARY KEY, notes TEXT);");
        db.execSQL("CREATE TABLE "+CAMPUS_TABLE+"(date INTEGER PRIMARY KEY, notes TEXT);");
        db.execSQL("CREATE TABLE "+EVANGEL_TABLE+"(date INTEGER PRIMARY KEY, notes TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
