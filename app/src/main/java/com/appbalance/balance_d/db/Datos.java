package com.appbalance.balance_d.db;

import android.database.Cursor;

import java.sql.Blob;
import java.util.Vector;

public interface Datos {
    public void registrarse(String nombre_usuario , String apellido_usuario, String email, String contrasena);
    public Vector<String> validar(String email, String contrasena);
    public Cursor consultalogin(String user, String pass);


}
