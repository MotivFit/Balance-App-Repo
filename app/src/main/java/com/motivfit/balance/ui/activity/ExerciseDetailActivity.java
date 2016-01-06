/*
 * Copyright (c) Andrew Quebe 2016 .
 */

package com.motivfit.balance.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.motivfit.balance.R;

import butterknife.Bind;

/**
 * Created by Danish Shah on 29-Oct-15.
 */
public class ExerciseDetailActivity extends BaseActivity {

    @Bind(R.id.backdrop)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        Intent intent = getIntent();
        final String title = intent.getStringExtra("title");

        toolbar.setTitle(title);
        Glide.with(this).load(R.drawable.dumble).centerCrop().into(imageView);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        } else {
            getFragmentManager().popBackStack();
        }
    }
}