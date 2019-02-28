package edu.cwu.app.makedisciples.Databases;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteAssetHelper {
    public static final String DATABASE_NAME= "bookContent.db";
    private static final int DATABASE_VERSION=1;


    //constructor
    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);


    }
/*    public void createDatabase()throws IOException{
        boolean dbExist = checkDataBase();
        if (dbExist){
        }else {
            this.getReadableDatabase();
            try {
                copyDataBase();
            }catch (IOException e){
                throw new Error("error copying database");
            }
        }
    }

    public void copyDataBase()throws IOException {
        InputStream mInput =  context.getAssets().open(DATABASE_NAME);
        String outfileName = DB_PATH;
        OutputStream mOutput = new FileOutputStream(outfileName);
        byte[] buffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(buffer))>0) {
            mOutput.write(buffer, 0, mLength);
        }
        mOutput.flush();
        mInput.close();
        mOutput.close();
    }

   public void openDatabase()throws SQLException {
        String myPath = DB_PATH+DATABASE_NAME;
        myDatabase = SQLiteDatabase.openDatabase(myPath,null,SQLiteDatabase.OPEN_READWRITE);

    }

    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        try {
            String myPath = DB_PATH+DATABASE_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath,null,SQLiteDatabase.OPEN_READONLY);
        }catch (SQLException e){

        }
        if (checkDB != null){
            checkDB.close();
        }
        return checkDB!= null;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion>oldVersion){
            try {
                copyDataBase();
            }catch (IOException e){

            }
        }
    }


    @Override
    public synchronized void close() {
        if (myDatabase != null){
            myDatabase.close();
        }
        super.close();
    }

*/
}