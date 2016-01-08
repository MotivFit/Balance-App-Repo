package com.motivfit.balance.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.motivfit.balance.R;
import com.motivfit.balance.ui.adapter.ExerciseTabAdapter;

import butterknife.Bind;

/**
 * Created by Home on 02-Nov-15.
 */
public class ExerciseFragment extends BaseFragment {


    @Bind(R.id.tabs)
    public TabLayout tabLayout;
    @Bind(R.id.viewpager)
    public ViewPager viewPager;

    @Override
    public int layout() {
        return R.layout.fragment_exercise;
    }


    @Nullable
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ExerciseTabAdapter adapter = new ExerciseTabAdapter(getChildFragmentManager());
        adapter.notifyDataSetChanged();

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Exercise");
        }
        adapter.notifyDataSetChanged();

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(adapter);

    }

    }