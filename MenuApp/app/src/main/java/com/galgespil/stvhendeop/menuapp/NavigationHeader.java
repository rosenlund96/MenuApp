package com.galgespil.stvhendeop.menuapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mathiaslarsen on 15/11/2016.
 */

public class NavigationHeader extends AppCompatActivity implements View.OnClickListener {

    private ImageView user;
    private TextView userName,userEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_header);
        user = (ImageView)findViewById(R.id.imageView2);
        userName = (TextView)findViewById(R.id.textView);
        userEmail = (TextView)findViewById(R.id.textView13);
    }


    @Override
    public void onClick(View v) {
        if (v == user){

        }


    }
}
