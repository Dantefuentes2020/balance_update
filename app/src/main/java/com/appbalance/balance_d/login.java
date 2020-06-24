package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText email;
    private EditText contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email= findViewById(R.id.editemail);
        contrasena= findViewById(R.id.editcontrasena);
    }



    public void loguearse(View view)
    {
        if (contrasena.getText().length() <1 && email.getText().length() <1)
        { Toast.makeText(this, "campos vacios, complete los campos para continuar", Toast.LENGTH_SHORT).show();

        }
        if (contrasena.getText().length() >10 && email.getText().length() >10)
    {
        ingresomenu(view);
    }

    }

    public void ingresomenu(View view)
    {
        Intent f = new Intent(this,menu.class);
        startActivity(f);
    }

    public void registro(View view)
    {
        Intent i = new Intent(this,registro.class);
        startActivity(i);
    }
}
