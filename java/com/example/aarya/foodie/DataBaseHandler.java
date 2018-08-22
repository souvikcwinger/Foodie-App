package com.example.aarya.foodie;

/**
 * Created by aarya on 2/14/18.
 */
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHandler extends SQLiteOpenHelper {

    public DataBaseHandler(Context context, Object name,
                           Object factory, int version) {

        // TODO Auto-generated constructor stub
        super(context,  DATABASE_NAME, null, DATABASE_VERSION);
    }


    String password;
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Mydatabase.db";

    // Contacts table name
    private static final String TABLE_REGISTER= "register";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_EMAIL="email";
    public static final String KEY_PASSWORD = "password";

    public static final String CREATE_TABLE="CREATE TABLE " + TABLE_REGISTER + "("
            + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"+KEY_PHONE + " TEXT,"+KEY_EMAIL+
            " TEXT," + KEY_PASSWORD + " TEXT " + ")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_REGISTER);

        // Create tables again
        onCreate(db);
    }

    void addregister(Registerdata registerdata)
    // code to add the new register
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME,registerdata.getName()); // register first Name
        values.put(KEY_PHONE, registerdata. getPhone() ); // register last name
        values.put(KEY_EMAIL, registerdata.getEmail());//register email id
        values.put(KEY_PASSWORD, registerdata.getPassword());
        // Inserting Row

        db.insert(TABLE_REGISTER, null, values);
        db.close(); // Closing database connection

    }



    //code to get the register
    String getregister(String username){
        SQLiteDatabase db = this.getReadableDatabase();
        //String selectquery="SELECT * FROM TABLE_REGISTER";
        Cursor cursor=db.query(TABLE_REGISTER,null,  "email=?",new String[]{username},null, null, null, null);

        if(cursor.getCount()<1){
            cursor.close();
            return "Not Exist";
        }
        else if(cursor.getCount()>=1 && cursor.moveToFirst()){

            password = cursor.getString(cursor.getColumnIndex(KEY_PASSWORD));
            cursor.close();

        }
        return password;


    }


    public String getDatabaseName() {
        return DATABASE_NAME;
    }

    public static String getKeyId() {
        return KEY_ID;
    }

    public static String getTableContacts() {
        return TABLE_REGISTER;
    }

    public static int getDatabaseVersion() {
        return DATABASE_VERSION;
    }

}
