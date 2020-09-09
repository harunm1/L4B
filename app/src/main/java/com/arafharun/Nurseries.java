package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Nurseries extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int blacksheepSoundId;
    private int humptySoundId;
    private int twinkleSoundId;
    private int spiderSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurseries);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        blacksheepSoundId = mSoundPool.load(getApplicationContext(), R.raw.blacksheep, 1);
        humptySoundId = mSoundPool.load(getApplicationContext(), R.raw.humpty, 1);
        twinkleSoundId = mSoundPool.load(getApplicationContext(), R.raw.twinkle, 1);
        spiderSoundId = mSoundPool.load(getApplicationContext(), R.raw.spider, 1);
    }

    // TODO: Add the play methods triggered by the buttons
    public void playBlackSheep(View v) {
        mSoundPool.play(blacksheepSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playHumpty(View v) {
        mSoundPool.play(humptySoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playTwinkle(View v) {
        mSoundPool.play(twinkleSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playSpider(View v) {
        mSoundPool.play(spiderSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

}