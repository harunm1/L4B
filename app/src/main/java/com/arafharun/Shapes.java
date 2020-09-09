package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Shapes extends AppCompatActivity {
    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int triangleSoundId;
    private int squareSoundId;
    private int rectangleSoundId;
    private int circleSoundId;
    private int ovalSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        triangleSoundId = mSoundPool.load(getApplicationContext(), R.raw.triangle, 1);
        squareSoundId = mSoundPool.load(getApplicationContext(), R.raw.square, 1);
        rectangleSoundId = mSoundPool.load(getApplicationContext(), R.raw.rectangle, 1);
        circleSoundId = mSoundPool.load(getApplicationContext(), R.raw.circle, 1);
        ovalSoundId = mSoundPool.load(getApplicationContext(), R.raw.oval, 1);
    }

    // TODO: Add the play methods triggered by the buttons
    public void playTriangle(View v) {
        mSoundPool.play(triangleSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playSquare(View v) {
        mSoundPool.play(squareSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playRectangle(View v) {
        mSoundPool.play(rectangleSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playCircle(View v) {
        mSoundPool.play(circleSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playOval(View v) {
        mSoundPool.play(ovalSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}