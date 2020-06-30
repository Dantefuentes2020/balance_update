package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Msje_encuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msje_encuesta);
    }

    public void atras(View view)
    {
        Intent i = new Intent(this, Cuestionario.class);
        startActivity(i);
    }

    public void adelante(View view)
    {
        Intent i = new Intent(this, Logueo.class);
        startActivity(i);
    }
}