package com.grp12.softskilltools;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.galgespil.stvhendeop.menuapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

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
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private static final String TAG = "EmailPassword";





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

    mAuth = FirebaseAuth.getInstance();



    mAuthListener = new FirebaseAuth.AuthStateListener() {
        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {
                // User is signed in
                Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
            } else {
                // User is signed out
                Log.d(TAG, "onAuthStateChanged:signed_out");
            }
        }
    };

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
            case R.id.navigation_store:
                fragmentManager.beginTransaction()
                        .replace(R.id.article_fragment
                                , new StoreFragment())
                        .commit();
                mToolbar.setTitle("Butik");

            case R.id.navigation_logout:
                signOut();
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



    private void signOut() {
        mAuth.signOut();

    }
    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
}



