package com.grp12.softskilltools.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galgespil.stvhendeop.menuapp.R;

/**
 * Created by mathiaslarsen on 15/11/2016.
 */

public class MyAccountFragment extends Fragment {
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_myaccount, container, false);
        return myView;
    }

}
