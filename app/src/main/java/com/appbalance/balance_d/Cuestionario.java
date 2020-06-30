package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cuestionario extends AppCompatActivity {
    //RadioButton P1R1,P1R2,P1R3,P2R1,P2R2,P2R3,P3R1,P3R2,P3R3,P4R1,P4R2,P4R3,P5R1,P5R2,P5R3,P6R1,P6R2,P6R3;

  // int puntajetotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
     //   P1R1= (RadioButton) findViewById(R.id.P1R1);
     //   P1R2= (RadioButton) findViewById(R.id.P1R2);
     //   P1R3= (RadioButton) findViewById(R.id.P1R3);
      //  P2R1= (RadioButton) findViewById(R.id.P2R1);
      //  P2R2= (RadioButton) findViewById(R.id.P2R2);
     //   P2R3= (RadioButton) findViewById(R.id.P2R3);
      //  P3R1= (RadioButton) findViewById(R.id.P3R1);
     //   P3R2= (RadioButton) findViewById(R.id.P3R2);
   ////  P4R1= (RadioButton) findViewById(R.id.P4R1);
      //  P4R2= (RadioButton) findViewById(R.id.P4R2);
      //  P4R3= (RadioButton) findViewById(R.id.P4R3);
      //  P5R1= (RadioButton) findViewById(R.id.P5R1);
      //  P5R2= (RadioButton) findViewById(R.id.P5R2);
     //   P5R3= (RadioButton) findViewById(R.id.P5R3);
      ////  P6R1= (RadioButton) findViewById(R.id.P6R1);
    //    P6R2= (RadioButton) findViewById(R.id.P6R2);
    //    P6R3= (RadioButton) findViewById(R.id.P6R3);
    }

    public void aceptar(View view)
    {
       // if(P1R1.isSelected())
     //   {
       //     puntajetotal =+3 ;
     //   }

     //   if(P1R2.isSelected())
     //   {
     //       puntajetotal=+1 ;
     //   }
      //  if(P1R3.isSelected())
     //   {
    //        puntajetotal=+0 ;
   //     }
        Intent i = new Intent(this, Msje_encuesta.class);
      //  i.putExtra("puntaje",puntajetotal);
        startActivity(i);
    }

}
