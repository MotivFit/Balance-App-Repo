package com.motivfit.balance.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.motivfit.balance.R;

/**
 * Created by Home on 29-Oct-15.
 */
public class HomeFragment extends BaseFragment {

    @Override
    public int layout() {
        return R.layout.fragment_exercise;
    }


    @Nullable
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Home");
        }
    }
}
