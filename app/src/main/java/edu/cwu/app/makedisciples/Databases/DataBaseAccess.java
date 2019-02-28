package edu.cwu.app.makedisciples.Databases;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;



public class DataBaseAccess {
    private Context context;
    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;
    private  static DataBaseAccess access;

    public DataBaseAccess(Context context){
        this.context = context;
        databaseHelper = new DatabaseHelper(context);
    }

    public static DataBaseAccess getInstance(Context context){
        if (access == null){
            access = new DataBaseAccess(context);
        }
        return access;
    }

    public void open(){
        this.database = databaseHelper.getWritableDatabase();
    }
    public void close(){
        if (database != null){
            database.close();
        }
    }
    public String getContent(int id){

        Cursor cursor = database.rawQuery("SELECT content FROM bookContent WHERE _id = '"+id+"';", null);
        cursor.moveToFirst();

        String content = cursor.getString(0);


        return content;

    }
}
