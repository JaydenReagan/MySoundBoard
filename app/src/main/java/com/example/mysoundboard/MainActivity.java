package com.example.mysoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mysoundboard.R;

public class MainActivity extends AppCompatActivity {
    ImageView Bayonetta, Ike, Kirby, Link, Lucas, Mario, Pit, Sonic, Sora;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bayonetta = findViewById(R.id.imgBayonetta);
        Bayonetta.setOnClickListener(playSound);

        Ike = findViewById(R.id.imgIke);
        Ike.setOnClickListener(playSound);

        Kirby = findViewById(R.id.imgKirby);
        Kirby.setOnClickListener(playSound);

        Link = findViewById(R.id.imgLink);
        Link.setOnClickListener(playSound);

        Lucas = findViewById(R.id.imgLucas);
        Lucas.setOnClickListener(playSound);

        Mario = findViewById(R.id.imgMario);
        Mario.setOnClickListener(playSound);

        Pit = findViewById(R.id.imgPit);
        Pit.setOnClickListener(playSound);

        Sonic = findViewById(R.id.imgSonic);
        Sonic.setOnClickListener(playSound);

        Sora = findViewById(R.id.imgSora);
        Sora.setOnClickListener(playSound);
    }

    View.OnClickListener playSound = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.imgBayonetta:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.bayonetta);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    Toast.makeText(MainActivity.this, "You clicked Bayonetta", Toast.LENGTH_LONG).show();
                    break;
                case R.id.imgIke:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ike);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgKirby:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.kirby);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgLink:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.link);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgLucas:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.lucas);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgMario:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mario);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgPit:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pit);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgSonic:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sonic);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
                    break;
                case R.id.imgSora:
                    if (mediaPlayer == null){
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sora);
                    }
                    mediaPlayer.start();
                    mediaPlayer = null;
            }
        }
    };

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.release();
    }
}