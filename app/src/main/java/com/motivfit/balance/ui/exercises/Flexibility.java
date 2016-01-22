package com.motivfit.balance.ui.exercises;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.motivfit.balance.R;
import com.motivfit.balance.ui.fragment.BaseFragment;

/**
 * Created by Danish Shah on 02-Nov-15.
 */
public class Flexibility extends BaseFragment {

    @Override
    public int layout() {
        return R.layout.fragment_flexibility;
    }


    @Nullable
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Flexibility");
        }
    }
}
