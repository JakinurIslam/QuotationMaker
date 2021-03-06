package com.example.quotationmaker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "register.db";
    public static final String TABLE_NAME = "registeruser";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "cname";
    public static final String COL_3 = "address";
    public static final String COL_4 = "username";
    public static final String COL_5 = "password";
    public static final String COL_6 = "cpw";
    public static final String COL_7 = "logo";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT, cname TEXT, address TEXT, username TEXT, password TEXT, cpw TEXT, logo TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " +TABLE_NAME );
        onCreate(sqLiteDatabase);

    }
    public long addUser(String cname , String address,String username,String password,String cpw,String logo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("company name", cname );
        contentValues.put("company address", address );
        contentValues.put("user name",username);
        contentValues.put("password", password );
        contentValues.put("confirm password", cpw );
        contentValues.put("company logo", logo );
        long res = db.insert("registeruser",null,contentValues);
        db.close();
        return res;
    }
    public boolean checkUser(String username, String password){
        String[] columns = {COL_1};
        SQLiteDatabase db =  getReadableDatabase();
        String selection = COL_4 + "=?" + " and " + COL_5 + "=?";
        String[] selectionArgs = { username, password};
        Cursor cursor = db.query(TABLE_NAME,columns, selection, selectionArgs, null, null, null );
        int count = cursor.getCount();
        cursor.close();
        db.close();
        if (count>0)
            return true;
        else
            return false;
    }
}
