package com.motivfit.balance.ui.fragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.motivfit.balance.R;
import com.motivfit.balance.ui.activity.FitnessMonitor;

import butterknife.Bind;

/**
 * Created by Danish Shah on 29-Oct-15.
 */
public class HomeFragment extends BaseFragment {

    @Bind(R.id.heart_rate)
    CardView hrate;

    @Bind(R.id.welcome_text)
    TextView welcome_text;

    @Bind(R.id.welcome_desc)
    TextView welcome_desc;
    @Bind(R.id.heart_rate_percent)
    TextView heart_rate;

    @Override
    public int layout() {
        return R.layout.fragment_home;
    }


    @Nullable
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar ab = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (ab != null) {
            ab.setTitle("Home");
        }

        Typeface roboto = Typeface.createFromAsset(getActivity().getAssets(),"Roboto-Light.ttf");
        welcome_text.setTypeface(roboto);
        welcome_desc.setTypeface(roboto);
        heart_rate.setTypeface(roboto);

        /**
         *   A special card which monitors the overall body fitness.
         *   On Clicking the card takes you to a new Activity(FitnessMonitor) which tracks your fitness and monitor them (a graph if possible).
         *   On first run before the home section is inflated FitnessMonitor activity will be inflated and some basic questions will be asked so that we
             can monitor the initial fitness of the user (We have a fitness expert in our team for that).
         */

        hrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hMonitor = new Intent(getActivity(), FitnessMonitor.class);
                startActivity(hMonitor);

                getActivity().overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });


    }
}
