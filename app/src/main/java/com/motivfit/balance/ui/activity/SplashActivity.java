package com.motivfit.balance.ui.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.motivfit.balance.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Danish Shah on 22/01/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Bind(R.id.title_balance)
    TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ButterKnife.bind(this);

        Typeface roboto = Typeface.createFromAsset(getAssets(),"Roboto-Light.ttf");

        balance.setTypeface(roboto);

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {

                } finally {
                    Intent main = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(main);

                    finish();
                }
            }
        }.start();


    }
}
