package com.grp12.softskilltools.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galgespil.stvhendeop.menuapp.R;
import com.github.mikephil.charting.charts.PieChart;

/**
 * Created by mathiaslarsen on 27/11/2016.
 */

public class DISCResultFragment extends Fragment {

    PieChart result;
    View myView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.frag_disc_result, container, false);
        result = (PieChart) myView.findViewById(R.id.pieChart);
        return myView;
    }
}
