package com.grp12.softskilltools.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.galgespil.stvhendeop.menuapp.R;
import com.grp12.softskilltools.Entities.AbstractItem;
import com.grp12.softskilltools.Entities.Purchase;
import com.grp12.softskilltools.Entities.User;
import com.grp12.softskilltools.resources.ItemDefinition;


/**
 * Created by mathiaslarsen on 16/11/2016.
 */

public class StoreFragment extends ListFragment {
    private User user;
    private Purchase purchase;
    private AbstractItem[] items;
    private int qty;
    private final int Store_items = 3;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_store, container, false);
        return myView;
    }

    public StoreFragment(){


        initialize();



    }
    public void addToBasket(AbstractItem item, Purchase purchase, int qty){
        purchase.addItem(item,qty);
    }

    public void initialize() {
        items = new AbstractItem[Store_items];

        for (int i = 0; i < Store_items; i++) {
            items[i].setName(ItemDefinition.TESTName_DATA[i]);
            items[i].setCost(ItemDefinition.TESTPrice_DATA[i]);
            items[i].setTestType(ItemDefinition.testType[i]);
        }
    }
}
