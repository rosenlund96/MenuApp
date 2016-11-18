package com.grp12.softskilltools.Entities;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class Purchase {
    public AbstractItem abstractItem;
    public int quantity;
    public List<Pair<AbstractItem,Integer>> products = new ArrayList<>();

    public Purchase(){
        this.abstractItem = null;
        this.quantity = 0;



    }

    public void addItem(AbstractItem abstractItem, int quantity){
            products.add(new Pair<>(abstractItem,quantity));
    }

    public List<Pair<AbstractItem,Integer>> retrieveItems(){
        return products;
    }

}
