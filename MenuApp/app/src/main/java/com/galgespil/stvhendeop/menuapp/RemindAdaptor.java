package com.galgespil.stvhendeop.menuapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mathiaslarsen on 13/11/2016.
 */

public class RemindAdaptor extends ArrayAdapter<String> {

    int[] progress;

    RemindAdaptor(Context context, String[] names, int[] progress){
        super(context,R.layout.remind_adaptor,names);
        this.progress = progress;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.remind_adaptor,parent,false);

        String pos = getItem(position);
        TextView name = (TextView) customView.findViewById(R.id.firstLine);
        TextView progress = (TextView) customView.findViewById(R.id.secondLine);
        ImageView pic = (ImageView) customView.findViewById(R.id.icon);

        name.setText(pos);
        progress.setText(progress+"%");

        return customView;
    }

}
