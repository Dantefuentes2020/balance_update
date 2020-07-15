package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }

    public void Atrasc(View view)
    {
        Intent i = new Intent(this, Menuprincipal.class);
        startActivity(i);
    }



    public void guardar(View view)
    {
        Intent i = new Intent(this, Menuprincipal.class);
        startActivity(i);
    }
}
