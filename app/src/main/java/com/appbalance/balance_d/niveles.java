package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class niveles extends AppCompatActivity {

   // TextView variable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles);

      //  recibirdatos();
    }
    public void siguiente(View view)
    {
        Intent i = new Intent(this,login.class);
        startActivity(i);
    }
        //public void recibirdatos () {
        //Bundle encuesta =getIntent().getExtras();
        //  int d1= encuesta.getInt("puntaje");

        //variable = (TextView) findViewById(R.id.number1);
        //  variable.setText(d1);
    }