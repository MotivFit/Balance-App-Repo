package com.motivfit.balance.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.motivfit.balance.R;
import com.motivfit.balance.exercises.CardiovascularEndurance;
import com.motivfit.balance.exercises.Flexibility;
import com.motivfit.balance.exercises.MuscularEndurance;
import com.motivfit.balance.exercises.MuscularStrength;
import com.motivfit.balance.view.SlidingTabLayout;

/**
 * Created by Home on 02-Nov-15.
 */
public class ExerciseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_exercise, container, false);

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Exercise");
        }

        Adapter adapter = new Adapter(getActivity().getSupportFragmentManager());
        adapter.notifyDataSetChanged();

        ViewPager viewPager = (ViewPager) v.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SlidingTabLayout tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        tabs.setViewPager(viewPager);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });


        return v;
    }

    static class Adapter extends FragmentPagerAdapter {

        private String[] tabs = {"Cardiovascular Endurance", "Muscular Endurance", "Muscular Strength", "Flexibility"};

        public Adapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = new Fragment();
            switch (position) {
                case 0:
                    f = new CardiovascularEndurance();
                    break;
                case 1:
                    f = new MuscularEndurance();
                    break;
                case 2:
                    f = new MuscularStrength();
                    break;
                case 3:
                    f = new Flexibility();
                    break;

            }
            return f;
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
}
