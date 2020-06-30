package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acerca_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void siguiente(View view)
    {
        Intent i = new Intent(this, Cuestionario.class);
        startActivity(i);

    }

    public void atras(View view)
    {
        Intent i = new Intent(this, Bienvenida.class);
        startActivity(i);
    }
}