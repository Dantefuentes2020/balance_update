package com.appbalance.balance_d.db;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.Blob;
import java.util.Vector;

public class conexion extends SQLiteOpenHelper implements datos{
    public conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String sQuery= "CREATE TABLE registrosbalance(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre_usuario TEXT,apellido_usuario TEXT,email BLOB,contrasena BLOB)";
        database.execSQL(sQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {

    }
    //metodos de insercion

    public void registrarse(String nombre_usuario , String apellido_usuario, Blob email, Blob contrasena)
    {SQLiteDatabase database = getWritableDatabase();
    String sQuery= "Insert INTO registrosbalance VALUES ("+ nombre_usuario+", "+apellido_usuario+","+email+","+contrasena+" )";
    database.execSQL(sQuery);
    database.close();

    }
    public Vector<String> consultaregistros(int user){
    Vector<String> consulta = new Vector<String>();
    SQLiteDatabase database = getReadableDatabase();
    String SQuery = "SELECT nombre_usuario, apellido_usuario, email, contrasena FROM registrosbalance WHERE id=" +user;
    Cursor cursor =database.rawQuery(SQuery,null);

    while(cursor.moveToNext()){
        consulta.add(cursor.getString(0)+""+cursor.getString(1)+""+cursor.getBlob(2)+""+cursor.getBlob(3));
    }
    //cerramos el cursor
    cursor.close();
    database.close();
    return consulta;
    }
}
