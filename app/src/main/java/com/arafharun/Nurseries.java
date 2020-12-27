package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nurseries extends AppCompatActivity {
    private ImageView blacksheep_page;
    private ImageView spider_page;
    private ImageView twinkle_page;
    private ImageView humpty_page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurseries);

        blacksheep_page = (ImageView) findViewById(R.id.black_sheep);
        blacksheep_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBlackSheep();
            }
        });

        spider_page = (ImageView) findViewById(R.id.spider);
        spider_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpider();
            }
        });

        twinkle_page = (ImageView) findViewById(R.id.twinkle);
        twinkle_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTwinkleStar();
            }
        });

        humpty_page = (ImageView) findViewById(R.id.humpty);
        humpty_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpider();
            }
        });

    }
    public void openBlackSheep() {
        Intent intent = new Intent(this, BlackSheep.class);
        startActivity(intent);
    }

    public void openSpider() {
        Intent intent = new Intent(this, Spider.class);
        startActivity(intent);
    }

    public void openTwinkleStar() {
        Intent intent = new Intent(this, Twinkle.class);
        startActivity(intent);
    }

    public void openHumptyDumpty() {
        Intent intent = new Intent(this, Humpty.class);
        startActivity(intent);
    }
}

