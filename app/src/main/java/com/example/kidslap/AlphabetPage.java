package com.example.kidslap;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class AlphabetPage extends AppCompatActivity {
    private SoundPool soundPool;
    private int soundA, soundB, soundC, soundD, soundE, soundF,
            soundG, soundH, soundI, soundJ, soundK, soundL,
            soundM, soundN, soundO, soundP, soundQ, soundR,
            soundS, soundT, soundU, soundV, soundW, soundX,
            soundY, soundZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_alphabet_page);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            // 26 songs
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(26)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(26, AudioManager.STREAM_MUSIC, 0);
        }

        soundA = soundPool.load(this, R.raw.letter_a, 1);
        soundB = soundPool.load(this, R.raw.letter_b, 1);
        soundC = soundPool.load(this, R.raw.letter_c, 1);
        soundD = soundPool.load(this, R.raw.letter_d, 1);
        soundE = soundPool.load(this, R.raw.letter_e, 1);
        soundF = soundPool.load(this, R.raw.letter_f, 1);

        soundG = soundPool.load(this, R.raw.letter_g, 1);
        soundH = soundPool.load(this, R.raw.letter_h, 1);
        soundI = soundPool.load(this, R.raw.letter_i, 1);
        soundJ = soundPool.load(this, R.raw.letter_j, 1);
        soundK = soundPool.load(this, R.raw.letter_k, 1);
        soundL = soundPool.load(this, R.raw.letter_l, 1);

        soundM = soundPool.load(this, R.raw.letter_m, 1);
        soundN = soundPool.load(this, R.raw.letter_n, 1);
        soundO = soundPool.load(this, R.raw.letter_o, 1);
        soundP = soundPool.load(this, R.raw.letter_p, 1);
        soundQ = soundPool.load(this, R.raw.letter_q, 1);
        soundR = soundPool.load(this, R.raw.letter_r, 1);

        soundS = soundPool.load(this, R.raw.letter_s, 1);
        soundT = soundPool.load(this, R.raw.letter_t, 1);
        soundU = soundPool.load(this, R.raw.letter_u, 1);
        soundV = soundPool.load(this, R.raw.letter_v, 1);
        soundW = soundPool.load(this, R.raw.letter_w, 1);
        soundX = soundPool.load(this, R.raw.letter_x, 1);

        soundY = soundPool.load(this, R.raw.letter_y, 1);
        soundZ = soundPool.load(this, R.raw.letter_z, 1);

    }

    public void playSound(View view) {
        switch (view.getId()){
            case R.id.btn_a:
                soundPool.play(soundA,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_b:
                soundPool.play(soundB,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_c:
                soundPool.play(soundC,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_d:
                soundPool.play(soundD,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_e:
                soundPool.play(soundE,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_f:
                soundPool.play(soundF,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_g:
                soundPool.play(soundG,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_h:
                soundPool.play(soundH,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_i:
                soundPool.play(soundI,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_j:
                soundPool.play(soundJ,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_k:
                soundPool.play(soundK,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_l:
                soundPool.play(soundL,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_m:
                soundPool.play(soundM,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_n:
                soundPool.play(soundN,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_o:
                soundPool.play(soundO,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_p:
                soundPool.play(soundP,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_q:
                soundPool.play(soundQ,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_r:
                soundPool.play(soundR,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_s:
                soundPool.play(soundS,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_t:
                soundPool.play(soundT,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_u:
                soundPool.play(soundU,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_v:
                soundPool.play(soundV,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_w:
                soundPool.play(soundW,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_x:
                soundPool.play(soundX,1,1,0,0,1);
                //soundPool.autoPause();
                break;
            case R.id.btn_y:
                soundPool.play(soundY,1,1,0,0,1);
                // soundPool.autoPause();
                break;
            case R.id.btn_z:
                soundPool.play(soundZ,1,1,0,0,1);
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