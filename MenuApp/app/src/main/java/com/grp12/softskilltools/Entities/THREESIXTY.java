package com.grp12.softskilltools.Entities;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class THREESIXTY extends AbstractItem {

    private String name;

    public THREESIXTY(double cost, boolean isUsed, String name) {
        super(cost, isUsed);
        this.name = name;
    }
}
