/*
 * Copyright (c) Andrew Quebe 2016 .
 */

package com.motivfit.balance;

/**
 * Created by Home on 02-Nov-15.
 */
public class Exercise {

    private int id;
    private int color_id;
    private String title;

    public Exercise(String title, int color_id, int id) {
        this.title = title;
        this.color_id = color_id;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public int getColor_id() {

        return color_id;
    }

}
