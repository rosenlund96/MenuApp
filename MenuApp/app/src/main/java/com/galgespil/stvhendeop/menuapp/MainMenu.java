package com.galgespil.stvhendeop.menuapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mathiaslarsen on 13/11/2016.
 */

public class MainMenu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    private NavigationView navView;
    private FragmentManager fragmentManager;
    private ImageView user;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        navView = (NavigationView) findViewById(R.id.navigation);
        navView.setNavigationItemSelectedListener(this);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fragmentManager = getSupportFragmentManager();
        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.article_fragment
                            , new RemindFragment())
                    .commit();
            mToolbar.setTitle("Opfølgning");
        }


    }

    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();



        switch (id){
            case R.id.navigation_remind:
                fragmentManager.beginTransaction()
                        .replace(R.id.article_fragment
                                , new RemindFragment())
                        .commit();
                mToolbar.setTitle("Opfølgning");
                break;
            case R.id.navigation_test:
                fragmentManager.beginTransaction()
                        .replace(R.id.article_fragment
                                , new ActiveTestsFragment())
                        .commit();
                mToolbar.setTitle("Udfyld profil");
                break;
            case R.id.navigation_results:
                fragmentManager.beginTransaction()
                        .replace(R.id.article_fragment
                                , new ResultListFragment())
                        .commit();
                mToolbar.setTitle("Resultater");

            case R.id.navigation_invite:
                fragmentManager.beginTransaction()
                        .replace(R.id.article_fragment
                                , new InviteFragment())
                        .commit();
                mToolbar.setTitle("Inviter");

            case R.id.navigation_settings:
                Intent i = new Intent(this, PrefFragment.class);
                startActivity(i);
                break;




        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){

            if (mToggle.onOptionsItemSelected(item)) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
}



