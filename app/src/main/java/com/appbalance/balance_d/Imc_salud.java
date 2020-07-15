package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Imc_salud extends AppCompatActivity {

    private EditText estatura , peso;
    TextView valorimc, Multitext,Multitextm,Multitexta;

    double imc, datoestatura, datopeso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc_salud);

        estatura = (EditText)findViewById(R.id.idestatura);
        peso = (EditText)findViewById(R.id.idpeso);
        valorimc =(TextView) findViewById(R.id.idvalor);
        Multitext=(TextView) findViewById(R.id.textView45);
        Multitextm=(TextView) findViewById(R.id.textView46);
        Multitexta=(TextView) findViewById(R.id.textView51);

    }



    public void ver(View view){
         datoestatura=Double.parseDouble(estatura.getText().toString());
         datopeso =Double.parseDouble(peso.getText().toString());

        imc = (datopeso/(datoestatura*datoestatura));

        valorimc.setText(String.valueOf(imc));




             // Intent ven=new Intent(this,Consejo_salud.class);
            //      ven.putExtra("imc",imc);
          //    startActivity(ven);

        String bajopeso= "La delgadez puede deberse a diversos factores, tales como genéticos y dietéticos. Independiente de su causa, es importante para tu bienestar mantener un peso saludable";
        String pesomedio= "El equilibrio del organismo -su homeostasis- se obtiene con mayor facilidad si el peso de una persona es normal. Una dieta balanceada y ejercicio ayudan a mantenerse en esta categoría";
        String pesoalto= "Una mala alimentación y hábitos sedentarios pueden contribuir a acumular grasa en tu cuerpo, lo que puede llevar a problemas médicos en el futuro";

        if(imc<18.5) ;{
            Multitext.setText(bajopeso);
        }
        if(imc >18.5);{
            Multitext.setText("");
            Multitextm.setText(pesomedio); }


        if(imc>24);{
            Multitext.setText("");
            Multitextm.setText("");

            Multitexta.setText(pesoalto);
        }

    }


}