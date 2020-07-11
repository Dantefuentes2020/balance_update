package com.appbalance.balance_d.db;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Vector;

public class Conexion extends SQLiteOpenHelper {
    public Conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String sQuery= "CREATE TABLE registrosbalance(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre_usuario TEXT,apellido_usuario TEXT,email TEXT,contrasena TEXT)";
        database.execSQL(sQuery);



    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {

    }
    //metodos de insercion

    public void registrarse(String nombre_usuario , String apellido_usuario, String email, String contrasena)
    {SQLiteDatabase database = getWritableDatabase();
    String sQuery= "Insert INTO registrosbalance VALUES ("+ nombre_usuario+", "+apellido_usuario+","+email+","+contrasena+" )";
    database.execSQL(sQuery);
    database.close();

    }



    public Vector<String> consultaregistros(String nombre){
    Vector<String> consulta = new Vector<String>();
    SQLiteDatabase database = getReadableDatabase();
    String SQuery = "SELECT nombre_usuario, apellido_usuario, email, contrasena FROM registrosbalance WHERE nombre_usuario=" +nombre;
    Cursor cursor =database.rawQuery(SQuery,null);

    while(cursor.moveToNext()){
        consulta.add(cursor.getString(0)+""+cursor.getString(1)+""+cursor.getString(2)+""+cursor.getString(3));
    }

    cursor.close();
    database.close();
    return consulta;

    }


    public Vector<String> validar(String email, String contrasena){
        Vector<String> consulta = new Vector<String>();
        SQLiteDatabase database = getReadableDatabase();
        String Squery = "SELECT nombre_usuario, apellido_usuario, email, contrasena FROM registrosbalance WHERE nombre_usuario="+email+" and contrasena="+contrasena;
        Cursor cursor =database.rawQuery(Squery,null);
        while (cursor.moveToNext()){
            consulta.add(cursor.getString(0)+""+cursor.getString(1)+""+cursor.getString(2)+""+cursor.getString(3));
        }

        cursor.close();
        database.close();
        return consulta;
    }



    public Cursor consultalogin(String user, String pass) throws SQLException{
        SQLiteDatabase database = getReadableDatabase();

        Cursor mcursor=null;
      mcursor=this.getReadableDatabase().query("registrosbalance", new String[]{"id","nombre_usuario","apellido_usuario","email","contrasena"},"email like'"+user+"and contrasena like '"+pass+"'",null,null,null,null);

        return mcursor;
    }

    }



