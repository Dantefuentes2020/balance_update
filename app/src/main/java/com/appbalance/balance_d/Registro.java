package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.appbalance.balance_d.db.Conexion;
import com.appbalance.balance_d.db.Datos;

import java.util.Vector;

public class Registro extends AppCompatActivity  implements Datos {

    private EditText nombre, apellido, email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre= (EditText)findViewById(R.id.nombreid);
        apellido = (EditText)findViewById(R.id.apellidoid);
        email = (EditText)findViewById(R.id.emailid);
        pass = (EditText)findViewById(R.id.passid);


    }
    public void registro(View view){
     String sMensaje;
        String nombreuser = nombre.getText().toString().trim();
        String apellidouser = apellido.getText().toString().trim();
        String emailuser = email.getText().toString().trim();
        String passuser = pass.getText().toString().trim();

        if(nombreuser.isEmpty() && apellidouser.isEmpty() && emailuser.isEmpty() && passuser.isEmpty()){ // V^V=V
            sMensaje =  "Debe completar todos los campos";
            mensajes(sMensaje);
        }else if(nombreuser.isEmpty()){
            sMensaje =  "Debe ingresar un nombre";
            mensajes(sMensaje);
        }else if(apellidouser.isEmpty()){
            sMensaje =  "Debe ingresar un apellido";
            mensajes(sMensaje);
        }else if(emailuser.isEmpty()){
            sMensaje =  "Debe ingresar su email";
            mensajes(sMensaje);
        }else if(passuser.isEmpty()){
            sMensaje =  "Debe ingresar una contraseña";
            mensajes(sMensaje);
        }
        else {

            registrarse(nombreuser, apellidouser, emailuser, passuser);


        }
        }

        public void mensajes(String mensaje){
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        }


    @Override
    public void registrarse(String nombre_usuario, String apellido_usuario, String email, String contrasena) {
        Conexion admin = new Conexion(this, "database", null, 1);
        SQLiteDatabase database = admin.getWritableDatabase();

        ContentValues contenedor = new ContentValues();
        contenedor.put("nombre_usuario",nombre_usuario);
        contenedor.put("apellido_usuario",apellido_usuario);
        contenedor.put("email",email);
        contenedor.put("contrasena",contrasena);

        database.insert("registrosbalance",null,contenedor);

        database.close();


        Toast.makeText(this, "Registro completado con exito", Toast.LENGTH_SHORT).show();

        Intent ven=new Intent(this,Logueo.class);

        startActivity(ven);
    }

    @Override
    public Vector<String> consultaregistros(String user) {

        return null;
    }


}