package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Imc_salud extends AppCompatActivity {

    private EditText estatura , peso;
    TextView valorimc;

    double imc, datoestatura, datopeso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc_salud);

        estatura = (EditText)findViewById(R.id.idestatura);
        peso = (EditText)findViewById(R.id.idpeso);
        valorimc =(TextView) findViewById(R.id.idvalor);
    }



    public void ver(View view){
         datoestatura=Double.parseDouble(estatura.getText().toString());
         datopeso =Double.parseDouble(peso.getText().toString());

        imc = (datopeso/(datoestatura*datoestatura));

        valorimc.setText(String.valueOf(imc));


       // if (imc <18.5);

             // Intent ven=new Intent(this,Consejo_salud.class);
            //      ven.putExtra("imc",imc);
          //    startActivity(ven);

    }


}