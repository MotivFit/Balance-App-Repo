package com.motivfit.balance.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.motivfit.balance.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Danish Shah on 21/01/2016.
 */
public class FitnessMonitor extends AppCompatActivity{

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_monitor);
        ButterKnife.bind(this);

        if(toolbar!=null)
            toolbar.setTitle("Fitness Monitor");

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            toolbar.setElevation(R.dimen.toolbar_elevation);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
