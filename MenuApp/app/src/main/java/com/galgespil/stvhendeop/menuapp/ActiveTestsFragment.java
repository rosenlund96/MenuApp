package com.galgespil.stvhendeop.menuapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mathiaslarsen on 14/11/2016.
 */

public class ActiveTestsFragment extends Fragment {

    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_active_tests, container, false);
        return myView;
    }

}
