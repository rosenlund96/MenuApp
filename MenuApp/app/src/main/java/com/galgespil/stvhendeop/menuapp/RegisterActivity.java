package com.galgespil.stvhendeop.menuapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mathiaslarsen on 13/11/2016.
 */

public class RegisterActivity extends AppCompatActivity{

    String forNavn;
    String efterNavn;
    String email;
    String kodeord;
    long telefon;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_register);
    }
}
