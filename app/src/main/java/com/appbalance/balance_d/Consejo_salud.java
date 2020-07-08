package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Consejo_salud extends AppCompatActivity {
TextView imcdat;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejo_salud);

    Bundle dato = getIntent().getExtras();

    int indice = Integer.parseInt(dato.getString("imc"));

    imcdat = (TextView) findViewById(R.id.vieimc);

    imcdat.setText(indice);


    }


}