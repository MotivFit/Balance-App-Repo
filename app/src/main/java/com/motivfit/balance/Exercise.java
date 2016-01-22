/*
 * Copyright (c) Andrew Quebe 2016 .
 */

package com.motivfit.balance;

/**
 * Created by Danish Shah on 02-Nov-15.
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

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor_id() {

        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

}
