package edu.cwu.app.makedisciples.Databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.cwu.app.makedisciples.NoteHandler;


public class NoteDatabaseAccess {
    private SQLiteDatabase database;
    private NoteDatabaseHelper dbHelper;
    private static volatile NoteDatabaseAccess instance;

    private NoteDatabaseAccess(Context context){
        dbHelper = new NoteDatabaseHelper(context);
    }

    public static synchronized NoteDatabaseAccess getInstance(Context context){
        if (instance == null){
            instance = new NoteDatabaseAccess(context);
        }
        return instance;
    }
    public void open(){
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        if (database !=null){
            database.close();
        }
    }

    public void save(NoteHandler notes,String table){
        ContentValues values = new ContentValues();
        values.put("date",notes.getTime());
        values.put("notes",notes.getText());
        String date = Long.toString(notes.getTime());
        switch (table){
            case "book":
                database.insert(NoteDatabaseHelper.BOOKNOTE_TABLE,null,values);
                break;
            case "journal":
                database.insert(NoteDatabaseHelper.JOURNAL_TABLE,null,values);
                break;
            case "church":
                database.insert(NoteDatabaseHelper.CHURCH_TABLE,null,values);
                break;
            case"campus":
                database.insert(NoteDatabaseHelper.CAMPUS_TABLE,null,values);
                break;
            case "evangelism":
                database.insert(NoteDatabaseHelper.EVANGEL_TABLE,null,values);
                break;

        }
    }
    public void update(NoteHandler notes,String table){
        ContentValues values = new ContentValues();
        values.put("date",notes.getTime());
        values.put("notes",notes.getText());
        String date = Long.toString(notes.getTime());
        switch (table){
            case "book":
                database.update(NoteDatabaseHelper.BOOKNOTE_TABLE,values,"date = ?",new String[]{date});
                break;
            case "journal":
                database.update(NoteDatabaseHelper.JOURNAL_TABLE,values,"date = ?",new String[]{date});
                break;
            case "church":
                database.update(NoteDatabaseHelper.CHURCH_TABLE,values,"date = ?",new String[]{date});
                break;
            case"campus":
                database.update(NoteDatabaseHelper.CAMPUS_TABLE,values,"date = ?",new String[]{date});
                break;
            case "evangelism":
                database.update(NoteDatabaseHelper.EVANGEL_TABLE,values,"date = ?",new String[]{date});
                break;

        }
    }
    public void delete(NoteHandler notes,String table){
        String date = Long.toString(notes.getTime());
        switch (table){
            case "book":
                database.delete(NoteDatabaseHelper.BOOKNOTE_TABLE,"date = ?",new String[]{date});
                break;
            case "journal":
                database.delete(NoteDatabaseHelper.JOURNAL_TABLE,"date = ?",new String[]{date});
                break;
            case "church":
                database.delete(NoteDatabaseHelper.CHURCH_TABLE,"date = ?",new String[]{date});
                break;
            case"campus":
                database.delete(NoteDatabaseHelper.CAMPUS_TABLE,"date = ?",new String[]{date});
                break;
            case "evangelism":
                database.delete(NoteDatabaseHelper.EVANGEL_TABLE,"date = ?",new String[]{date});
                break;

        }
    }
    public List<NoteHandler> getAllNotes(String table){
        List<NoteHandler> notes = new ArrayList<>();
        Cursor cursor = null;
        switch (table){
            case "book":
                cursor =database.rawQuery("SELECT * FROM "+NoteDatabaseHelper.BOOKNOTE_TABLE+" ORDER BY date DESC",null);
                break;
            case "journal":
                cursor =database.rawQuery("SELECT * FROM "+NoteDatabaseHelper.JOURNAL_TABLE+" ORDER BY date DESC",null);
                break;
            case "church":
                cursor =database.rawQuery("SELECT * FROM "+NoteDatabaseHelper.CHURCH_TABLE+" ORDER BY date DESC",null);
                break;
            case"campus":
                cursor =database.rawQuery("SELECT * FROM "+NoteDatabaseHelper.CAMPUS_TABLE+" ORDER BY date DESC",null);
                break;
            case "evangelism":
                cursor =database.rawQuery("SELECT * FROM "+NoteDatabaseHelper.EVANGEL_TABLE+" ORDER BY date DESC",null);
                break;

        }
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            long time = cursor.getLong(0);
            String text = cursor.getString(1);
            notes.add(new NoteHandler(time,text));
            cursor.moveToNext();
        }
        cursor.close();

        return notes;
    }

}
