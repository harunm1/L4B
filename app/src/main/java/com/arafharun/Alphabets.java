package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Alphabets extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mASoundId;
    private int mBSoundId;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mHSoundId;
    private int mISoundId;
    private int mJSoundId;
    private int mKSoundId;
    private int mLSoundId;
    private int mMSoundId;
    private int mNSoundId;
    private int mOSoundId;
    private int mPSoundId;
    private int mQSoundId;
    private int mRSoundId;
    private int mSSoundId;
    private int mTSoundId;
    private int mUSoundId;
    private int mVSoundId;
    private int mWSoundId;
    private int mXSoundId;
    private int mYSoundId;
    private int mZSoundId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_b, 1);
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_g, 1);
        mHSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_h, 1);
        mISoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_i, 1);
        mJSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_j, 1);
        mKSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_k, 1);
        mLSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_l, 1);
        mMSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_m, 1);
        mNSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_n, 1);
        mOSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_o, 1);
        mPSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_p, 1);
        mQSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_q, 1);
        mRSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_r, 1);
        mSSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_s,1);
        mTSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_t, 1);
        mUSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_u, 1);
        mVSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_v, 1);
        mWSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_w, 1);
        mXSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_x, 1);
        mYSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_y, 1);
        mZSoundId = mSoundPool.load(getApplicationContext(), R.raw.letter_z, 1);

    }

    // TODO: Add the play methods triggered by the buttons
    public void playA(View v) {
        mSoundPool.play(mASoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View v) {
        mSoundPool.play(mBSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playC(View v) {
        mSoundPool.play(mCSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View v) {
        mSoundPool.play(mDSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View v) {
        mSoundPool.play(mESoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View v) {
        mSoundPool.play(mFSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View v) {
        mSoundPool.play(mGSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playH(View v) {
        mSoundPool.play(mHSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playI(View v) {
        mSoundPool.play(mISoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playJ(View v) {
        mSoundPool.play(mJSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playK(View v) {
        mSoundPool.play(mKSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playL(View v) {
        mSoundPool.play(mLSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playM(View v) {
        mSoundPool.play(mMSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playN(View v) {
        mSoundPool.play(mNSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playO(View v) {
        mSoundPool.play(mOSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playP(View v) {
        mSoundPool.play(mPSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playQ(View v) {
        mSoundPool.play(mQSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playR(View v) {
        mSoundPool.play(mRSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playS(View v) {
        mSoundPool.play(mSSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playT(View v) {
        mSoundPool.play(mTSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playU(View v) {
        mSoundPool.play(mUSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playV(View v) {
        mSoundPool.play(mVSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playW(View v) {
        mSoundPool.play(mWSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playX(View v) {
        mSoundPool.play(mXSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playY(View v) {
        mSoundPool.play(mYSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playZ(View v) {
        mSoundPool.play(mZSoundId,LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}