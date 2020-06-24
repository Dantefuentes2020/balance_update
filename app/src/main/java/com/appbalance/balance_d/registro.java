package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.appbalance.balance_d.db.datos;

import java.sql.Blob;
import java.util.Vector;

public class registro extends AppCompatActivity implements datos {

    private EditText nombre, apellido, email, password;
    private Button btn_registrarse;
    private Button btn_atras;

    private Context context;

    private static String registros = "datos";


public registro(Context context){
    this.context = context;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = findViewById(R.id.nombreid);
        apellido = findViewById(R.id.apellidoid);
        email = findViewById(R.id.emailid);
        password = findViewById(R.id.passid);
    }

    @Override

    public void registrarse(String nombre_usuario, String apellido_usuario, Blob email, Blob contrasena) {

        SharedPreferences preferencias = context.getSharedPreferences(registros, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= preferencias.edit();
        editor.putString("datos",nombre_usuario +" "+apellido_usuario +" "+email+" "+contrasena);
        editor.commit();

        }


    @Override
    public Vector<String> consultaregistros(int user) {
        return null;
    }
}