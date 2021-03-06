package com.tistory.dayglo.smarting_android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by user on 2017-11-06.
 */

public class IntroActivity extends AppCompatActivity {
    private Handler mHandler;

    Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
//
//        LottieAnimationView introAnimationView = (LottieAnimationView) findViewById(R.id.intro_animation_view);
//        introAnimationView.setImageAssetsFolder("images/");
//        introAnimationView.setAnimation("intro.json");
//        introAnimationView.playAnimation();

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        mHandler = new Handler();
        mHandler.postDelayed(mRunnable, 2000);
    }
}
