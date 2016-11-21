package com.grp12.softskilltools.Entities;

import com.grp12.softskilltools.resources.ItemDefinition;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class Store {
    private User user;
    private Purchase purchase;
    private AbstractItem[] items;
    private int qty;
    private final int Store_items = 3;


    public Store(){


        initialize();



    }
    public void addToBasket(AbstractItem item, Purchase purchase, int qty){
        purchase.addItem(item,qty);
    }

    public void initialize(){
        items = new AbstractItem[Store_items];

        for (int i = 0; i < Store_items;i++){
            items[i].setName(ItemDefinition.TESTName_DATA[i]);
            items[i].setCost(ItemDefinition.TESTPrice_DATA[i]);
            items[i].setTestType(ItemDefinition.testType[i]);
        }

    }




}
