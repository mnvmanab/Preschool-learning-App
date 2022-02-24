package com.example.kidslap;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Number_Page extends AppCompatActivity {

    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5,
                sound6, sound7, sound8, sound9, sound10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_number__page);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            // 11 songs
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(11)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(11, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundPool.load(this, R.raw.number1, 1);
        sound2 = soundPool.load(this, R.raw.number2, 1);
        sound3 = soundPool.load(this, R.raw.number3, 1);
        sound4 = soundPool.load(this, R.raw.number4, 1);
        sound5 = soundPool.load(this, R.raw.number5, 1);
        sound6 = soundPool.load(this, R.raw.number6, 1);
        sound7 = soundPool.load(this, R.raw.number7, 1);
        sound8 = soundPool.load(this, R.raw.number8, 1);
        sound9 = soundPool.load(this, R.raw.number9, 1);
        sound10 = soundPool.load(this, R.raw.number10, 1);

    }

    public void playSound(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                soundPool.play(sound1,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_2:
                soundPool.play(sound2,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_3:
                soundPool.play(sound3,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_4:
                soundPool.play(sound4,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_5:
                soundPool.play(sound5,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_6:
                soundPool.play(sound6,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_7:
                soundPool.play(sound7,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_8:
                soundPool.play(sound8,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_9:
                soundPool.play(sound9,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_10:
                soundPool.play(sound10,1,1,0,0,1);
                //soundPool.autoPause();
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