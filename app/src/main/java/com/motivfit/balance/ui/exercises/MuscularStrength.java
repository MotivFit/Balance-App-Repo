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
public class MuscularStrength extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return (ViewGroup) inflater.inflate(R.layout.fragment_muscular_strength, container, false);
    }
}
