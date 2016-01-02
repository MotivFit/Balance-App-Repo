package com.ufit.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ufit.R;

/**
 * Created by Home on 29-Oct-15.
 */
public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_home,container,false);

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if(ab!=null){
            ab.setTitle("Home");
        }


        return v;
    }
}
