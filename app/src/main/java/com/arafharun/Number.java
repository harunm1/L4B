package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Number extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int oneSoundId;
    private int twoSoundId;
    private int threeSoundId;
    private int fourSoundId;
    private int fiveSoundId;
    private int sixSoundId;
    private int sevenSoundId;
    private int eightSoundId;
    private int nineSoundId;
    private int tenSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        oneSoundId = mSoundPool.load(getApplicationContext(), R.raw.one, 1);
        twoSoundId = mSoundPool.load(getApplicationContext(), R.raw.two, 1);
        threeSoundId = mSoundPool.load(getApplicationContext(), R.raw.three, 1);
        fourSoundId = mSoundPool.load(getApplicationContext(), R.raw.four, 1);
        fiveSoundId = mSoundPool.load(getApplicationContext(), R.raw.five, 1);
        sixSoundId = mSoundPool.load(getApplicationContext(), R.raw.six,1);
        sevenSoundId = mSoundPool.load(getApplicationContext(), R.raw.seven, 1);
        eightSoundId = mSoundPool.load(getApplicationContext(), R.raw.eight, 1);
        nineSoundId = mSoundPool.load(getApplicationContext(), R.raw.nine, 1);
        tenSoundId = mSoundPool.load(getApplicationContext(), R.raw.ten, 1);
    }

    // TODO: Add the play methods triggered by the buttons
    public void playOne(View v) {
        mSoundPool.play(oneSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playTwo(View v) {
        mSoundPool.play(twoSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playThree(View v) {
        mSoundPool.play(threeSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playFour(View v) {
        mSoundPool.play(fourSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playFive(View v) {
        mSoundPool.play(fiveSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playSix(View v) {
        mSoundPool.play(sixSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playSeven(View v) {
        mSoundPool.play(sevenSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playEight(View v) {
        mSoundPool.play(eightSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playNine(View v) {
        mSoundPool.play(nineSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playTen(View v) {
        mSoundPool.play(tenSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

}