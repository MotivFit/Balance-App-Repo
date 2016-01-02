package com.motivfit.balance.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.motivfit.balance.Exercise;
import com.motivfit.balance.ExerciseDetailActivity;
import com.motivfit.balance.Preferences;
import com.motivfit.balance.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danish Shah on 02-Nov-15.
 */
public class CardiovascularEndurance extends Fragment {

    private List<Exercise> exe = new ArrayList<Exercise>();
    private boolean first_run;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_cardiovascular_endurance, container, false);

        final Preferences preferences = new Preferences(getContext());
        first_run = preferences.isFirstRun();

        final CardView cinfo = (CardView) v.findViewById(R.id.card_info_cardio);

        TextView dismiss = (TextView) v.findViewById(R.id.gotit);
        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cinfo.setVisibility(View.GONE);
                first_run = preferences.firstRunOver();
            }
        });

        if (first_run == false) {
            v.removeView(cinfo);
        }

        populateExerciseList();
        populateListView(v);

        return v;
    }

    private void populateListView(View v) {
        ArrayAdapter<Exercise> adapter = new ExerciseAdapter();
        final GridView gridView = (GridView) v.findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

    }

    public void populateExerciseList() {
        exe.add(new Exercise("Trisep Dips", android.R.color.holo_blue_light, R.drawable.ic_jog));
        exe.add(new Exercise("Treadmill", android.R.color.holo_red_light, R.drawable.ic_jog));
        exe.add(new Exercise("Rowing Machine", android.R.color.holo_purple, R.drawable.ic_jog));
        exe.add(new Exercise("Pushups", android.R.color.holo_green_light, R.drawable.ic_jog));
        exe.add(new Exercise("Cardio Bike", android.R.color.holo_orange_light, R.drawable.ic_jog));
        exe.add(new Exercise("Chin-ups", android.R.color.holo_red_dark, R.drawable.ic_jog));
        exe.add(new Exercise("Step Machine", android.R.color.holo_blue_dark, R.drawable.ic_jog));
        exe.add(new Exercise("Skipping Rope", android.R.color.holo_orange_dark, R.drawable.ic_jog));

    }

    public class ExerciseAdapter extends ArrayAdapter<Exercise> {


        public ExerciseAdapter() {
            super(getActivity(), R.layout.grid_content, exe);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.grid_content, parent, false);
            }

            final Exercise cexe = exe.get(position);

            CardView cardexe = (CardView) convertView.findViewById(R.id.card_info_cardio);
            cardexe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent detail = new Intent(getActivity(), ExerciseDetailActivity.class);
                    detail.putExtra("title", cexe.getTitle());
                    startActivity(detail);
                }
            });

            ImageView imageView = (ImageView) convertView.findViewById(R.id.exe_image);
            imageView.setImageResource(cexe.getId());
            imageView.setBackgroundColor(getResources().getColor(cexe.getColor_id()));

            TextView textView = (TextView) convertView.findViewById(R.id.exe_title);
            textView.setText(cexe.getTitle());

            return convertView;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
