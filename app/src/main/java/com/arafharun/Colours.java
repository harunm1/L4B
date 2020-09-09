package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Colours extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int redSoundId;
    private int orangeSoundId;
    private int yellowSoundId;
    private int blueSoundId;
    private int purpleSoundId;
    private int pinkSoundId;
    private int greenSoundId;
    private int brownSoundId;
    private int blackSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        redSoundId = mSoundPool.load(getApplicationContext(), R.raw.red, 1);
        orangeSoundId = mSoundPool.load(getApplicationContext(), R.raw.orange, 1);
        yellowSoundId = mSoundPool.load(getApplicationContext(), R.raw.yellow, 1);
        blueSoundId = mSoundPool.load(getApplicationContext(), R.raw.blue, 1);
        pinkSoundId = mSoundPool.load(getApplicationContext(), R.raw.pink, 1);
        purpleSoundId = mSoundPool.load(getApplicationContext(), R.raw.purple,1);
        greenSoundId = mSoundPool.load(getApplicationContext(), R.raw.colour_green, 1);
        blackSoundId = mSoundPool.load(getApplicationContext(), R.raw.black, 1);
        brownSoundId = mSoundPool.load(getApplicationContext(), R.raw.brown, 1);
    }

    // TODO: Add the play methods triggered by the buttons
    public void playRed(View v) {
        mSoundPool.play(redSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playYellow(View v) {
        mSoundPool.play(yellowSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playOrange(View v) {
        mSoundPool.play(orangeSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playBlue(View v) {
        mSoundPool.play(blueSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playPink(View v) {
        mSoundPool.play(pinkSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playPurple(View v) {
        mSoundPool.play(purpleSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playGreen(View v) {
        mSoundPool.play(greenSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playBrown(View v) {
        mSoundPool.play(brownSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playBlack(View v) {
        mSoundPool.play(blackSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }


}