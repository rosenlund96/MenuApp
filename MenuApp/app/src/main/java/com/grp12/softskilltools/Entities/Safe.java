package com.grp12.softskilltools.Entities;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class Safe {

    public AbstractItem[] abstractItems;
    private int NUMBER_OF_ITEMS = 5;

    public Safe(User user){
        Initialize(user);
    }


    public void Initialize(User user){
        abstractItems = new AbstractItem[NUMBER_OF_ITEMS];
    }
}
