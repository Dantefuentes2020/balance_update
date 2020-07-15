package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;

import com.appbalance.balance_d.db.Datos;

import java.util.Vector;

public class Ajustes extends AppCompatActivity implements Datos {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);


    }



    @Override
    public void registrarse(String nombre_usuario, String apellido_usuario, String email, String contrasena) {

    }

    @Override
    public Vector<String> validar(String email, String contrasena) {
        return null;
    }

    @Override
    public Cursor consultalogin(String user, String pass) {
        return null;
    }
}