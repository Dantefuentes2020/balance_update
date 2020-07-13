package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.appbalance.balance_d.db.Conexion;

import java.sql.SQLException;

public class Logueo extends AppCompatActivity {

    private EditText email;
    private EditText contrasena;

        Conexion admin=new Conexion(this,"database",null,1);


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        email= (EditText)findViewById(R.id.editemail);
        contrasena= (EditText)findViewById(R.id.editcontrasena);
    }

    public void registro(View view)
    {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }

    public void loguearse(View view)
    {


        String nombre=email.getText().toString();
        String pass=contrasena.getText().toString();

        if(nombre.isEmpty() && pass.isEmpty() ){
            Toast.makeText(this, "complete los campos requeridos", Toast.LENGTH_SHORT).show();

        }else if(pass.isEmpty()){

            Toast.makeText(this, "Falta agregar su contraseña", Toast.LENGTH_SHORT).show();
        }else if(nombre.isEmpty()){

            Toast.makeText(this, "Falta agregar su correo electronico", Toast.LENGTH_SHORT).show();
        }

        else {

            try {
                Cursor cursor=admin.consultalogin
                        (email.getText().toString(),contrasena.getText().toString());
                if (cursor.getCount()>0)

                { Intent r = new Intent(this,Imc_salud.class);

                    startActivity(r);}

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }}}