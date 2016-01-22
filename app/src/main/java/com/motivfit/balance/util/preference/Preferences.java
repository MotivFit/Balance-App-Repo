package com.motivfit.balance.util.preference;

/*
 * Copyright (c) Andrew Quebe 2016 .
 */

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Danish Shah on 03-Nov-15.
 */
public class Preferences {

    private static final String FIRSTRUN = "firstrun";

    private final Context context;

    public Preferences(Context context) {
        this.context = context;
    }

    private SharedPreferences getSharedPreferences() {
        return context.getSharedPreferences("Balance", Context.MODE_PRIVATE);
    }

    public boolean isFirstRun() {
        return getSharedPreferences().getBoolean(FIRSTRUN, true);
    }

    public boolean firstRunOver() {
        getSharedPreferences().edit().putBoolean(FIRSTRUN, false);
        return getSharedPreferences().getBoolean(FIRSTRUN, false);
    }

}
