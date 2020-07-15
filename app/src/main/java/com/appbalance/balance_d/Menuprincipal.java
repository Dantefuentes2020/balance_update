package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menuprincipal extends AppCompatActivity {
    private TextView nombreuser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
        nombreuser=(TextView)findViewById(R.id.textView52);

        String nombre=getIntent().getStringExtra("nombre");
        nombreuser.setText("Hola  "+nombre);
    }

    public void ajustes(View view)
    {
        Intent i = new Intent(this, Ajustes.class);
        startActivity(i);
    }
    public void imc_salud(View view)

    {
        Intent i = new Intent(this, Imc_salud.class);
        startActivity(i);
    }
    public void Tips(View view)
    {
        Intent i = new Intent(this, Tips.class);
        startActivity(i);
    }
    public void musica(View view)
    {
        Intent i = new Intent(this, Musica.class);
        startActivity(i);
    }
    public void Juegos(View view)
    {
        Intent i = new Intent(this, Juegos.class);
        startActivity(i);
    }
    public void Tareas(View view)
    {
        Intent i = new Intent(this, Tareas.class);
        startActivity(i);
    }

}