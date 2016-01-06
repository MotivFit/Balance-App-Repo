package com.motivfit.balance.ui.exercises;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.motivfit.balance.R;

/**
 * Created by Home on 02-Nov-15.
 */
public class Flexibility extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_flexibility, container, false);

        return v;
    }
}
