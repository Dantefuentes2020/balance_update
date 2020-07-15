package com.appbalance.balance_d;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Musica extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
    }

    public void play (View view){

        mp = MediaPlayer.create(this,R.raw.haku);
        mp.start();
        Toast.makeText(this, "play", Toast.LENGTH_SHORT).show();
    }

    public void pause (View view){
        mp.pause();
        Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
    }

    public void stop (View view){
        mp.stop();
        mp = null;
        Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show();
    }
}
