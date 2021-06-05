package com.example.greenland;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ProgressBar splashprogress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashprogress =findViewById(R.id.Splash_progressBar);
        ObjectAnimator.ofInt(splashprogress,"progress", 100).setDuration(5000).start();
        new Handler().postDelayed(new Thread(){
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Slide.class);
                startActivity(intent);
                finish();

            }
        }, 5000);

    }
}