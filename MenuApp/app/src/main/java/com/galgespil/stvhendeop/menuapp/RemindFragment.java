package com.galgespil.stvhendeop.menuapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by mathiaslarsen on 08/11/2016.
 */



public class RemindFragment extends Fragment{

View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_remind, container, false);
        return myView;
    }

    }