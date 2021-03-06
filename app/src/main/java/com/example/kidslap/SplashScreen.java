package com.example.kidslap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;  //for splash screeen

    //variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //animations......
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //hooks...
        image = findViewById(R.id.imageView);
        slogan =findViewById(R.id.textView2);

        //assign animation to these..
        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);

        //to go-to new page from splash screen along with animation(pair wala part)
        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);

                Pair[] pairs = new Pair[2];
                pairs[0]=new Pair<View,String>(image, "logo_image");
                pairs[1]=new Pair<View,String>(slogan, "logo_text");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this, pairs);

                startActivity(intent,options.toBundle());
                finish();
            }
        }, SPLASH_SCREEN);
    }
}