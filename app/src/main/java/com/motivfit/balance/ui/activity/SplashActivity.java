package com.motivfit.balance.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.motivfit.balance.R;

/**
 * Created by Danish Shah on 22/01/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                } finally {
                    Intent main = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(main);

                    overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                }
            }
        }.start();

    }
}
