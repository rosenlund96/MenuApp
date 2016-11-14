package com.galgespil.stvhendeop.menuapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.galgespil.stvhendeop.menuapp.R.layout.frag_register;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button login;
    public Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_login);


        login = (Button) findViewById(R.id.button3);
        register = (Button) findViewById(R.id.button2);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }








    @Override
    public void onClick(View v) {

        if (v == login){
            Intent i = new Intent(MainActivity.this, MainMenu.class);
            startActivity(i);
        }
        else if (v == register){
            Intent i = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(i);
        }
    }
}
