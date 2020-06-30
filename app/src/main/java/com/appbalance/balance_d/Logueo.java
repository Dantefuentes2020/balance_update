package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.appbalance.balance_d.db.Conexion;

public class Logueo extends AppCompatActivity {

    private EditText email;
    private EditText contrasena;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        email= findViewById(R.id.editemail);
        contrasena= findViewById(R.id.editcontrasena);
    }



    public void loguearse(View view)
    {


        Conexion admin=new Conexion(this,"registrosbalance",null,1);
        SQLiteDatabase database=admin.getWritableDatabase();
        String nombre=email.getText().toString();
        String pass=contrasena.getText().toString();

        fila=database.rawQuery("SELECT nombre_usuario, apellido_usuario, email, contrasena FROM registrosbalance WHERE nombre_usuario='" +email+"' and contrasena='"+contrasena+"'",null);
        if(fila.moveToNext()){
            String usua=fila.getString(3);
            String pasword=fila.getString(4);

            if (nombre.equals(usua)&&pass.equals(pasword)){


                Intent ven=new Intent(this,Menu.class);
                startActivity(ven);


                email.setText("");
                contrasena.setText("");
                ingresomenu(view); }
            if (contrasena.getText().length() <1 && email.getText().length() <1)
            { Toast.makeText(this, "campos vacios, complete los campos para continuar", Toast.LENGTH_SHORT).show();

            }
        }
    }


    public void ingresomenu(View view)
    {
        Intent f = new Intent(this, Menu.class);
        startActivity(f);
    }

    public void registro(View view)
    {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}
