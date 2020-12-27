package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class BlackSheep extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_sheep);
    }

    public void play(View v){
        if (mPlayer == null) {
            mPlayer = MediaPlayer.create(this, R.raw.blacksheep);
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        mPlayer.start();
    }

    public void pause(View v){
        if (mPlayer != null){
            mPlayer.pause();
        }
    }

    public void stop(View v){
        stopPlayer();
    }

    private void stopPlayer(){
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;

        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}