package com.motivfit.balance.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.motivfit.balance.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by pinpong on 06.01.16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    //Override methods and add code which will be executed in every child activity.

    /**
     * TAG for all the activities with their names
     */
    protected static String TAG = "BaseActivity";

    @Bind(R.id.toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getClass().getSimpleName();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);

        ButterKnife.bind(this);

        if (toolbar == null)
            throw new NullPointerException("Its the time we build separate BaseActivity which does not have Toolbar in xml");
        setSupportActionBar(toolbar);
    }
}
