package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menuprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
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