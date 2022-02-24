package com.example.kidslap;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Colors_Page extends AppCompatActivity {

    private SoundPool soundPool;
    private int soundYellow, soundBlue, soundPink, soundOrange, soundBlack, soundRed, soundGreen, soundBrown, soundPurple, soundWhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_colors__page);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            // 10 songs
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(11)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(11, AudioManager.STREAM_MUSIC, 0);
        }

        soundYellow = soundPool.load(this, R.raw.color_yellow, 1);
        soundBlue = soundPool.load(this, R.raw.color_blue, 1);
        soundPink = soundPool.load(this, R.raw.color_pink, 1);
        soundOrange = soundPool.load(this, R.raw.color_orange, 1);
        soundBlack = soundPool.load(this, R.raw.color_black, 1);
        soundRed = soundPool.load(this, R.raw.color_red, 1);
        soundGreen = soundPool.load(this, R.raw.color_green, 1);
        soundBrown = soundPool.load(this, R.raw.color_brown, 1);
        soundPurple = soundPool.load(this, R.raw.color_purple, 1);
        soundWhite = soundPool.load(this, R.raw.color_white, 1);


    }

    public void playSound(View view) {
        switch (view.getId()){
            case R.id.btn_yellow:
                soundPool.play(soundYellow,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_blue:
                soundPool.play(soundBlue,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_pink:
                soundPool.play(soundPink,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_orange:
                soundPool.play(soundOrange,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_black:
                soundPool.play(soundBlack,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_red:
                soundPool.play(soundRed,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_green:
                soundPool.play(soundGreen,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_brown:
                soundPool.play(soundBrown,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_purple:
                soundPool.play(soundPurple,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_white:
                soundPool.play(soundWhite,1,1,0,0,1);
                // soundPool.autoPause();
                break;

        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}