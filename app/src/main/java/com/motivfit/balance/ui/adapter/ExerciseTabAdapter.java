package com.motivfit.balance.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.motivfit.balance.ui.exercises.CardiovascularEndurance;
import com.motivfit.balance.ui.exercises.Flexibility;
import com.motivfit.balance.ui.exercises.MuscularEndurance;
import com.motivfit.balance.ui.exercises.MuscularStrength;

/**
 * Created by pinpong on 08.01.16.
 */
public class ExerciseTabAdapter extends FragmentPagerAdapter {

    private String[] tabs = {"Cardiovascular Endurance", "Muscular Endurance", "Muscular Strength", "Flexibility"};

    public ExerciseTabAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CardiovascularEndurance();
            case 1:
                return new MuscularEndurance();
            case 2:
                return new MuscularStrength();
            case 3:
                return new Flexibility();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabs[position];
    }
}
