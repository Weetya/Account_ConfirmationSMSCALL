package com.example.weedya.account_confirmation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.weedya.account_confirmation.Navigation.StartFragmentResolver;

public class
MainActivity extends AppCompatActivity implements MoveTo, BackTo {
    // global variables
    FragmentManager fm;
    Fragment fragment; // it's fragment just for test. Should be replaces with needed fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        fragment = new StartFragmentResolver().getStartFragment();

        if (savedInstanceState == null) {
            // set start fragment
            this.moveTo(fragment);
        }
    }

    @Override
    public void moveTo(Fragment newFragment) {
        if (fm.findFragmentById(R.id.frame_container_main) != null)
            fm.beginTransaction().replace(R.id.frame_container_main, newFragment).addToBackStack(null).commit();
        else
            fm.beginTransaction().add(R.id.frame_container_main, newFragment).addToBackStack(null).commit();
    }

    @Override
    public void backTo() {
        if (fm.findFragmentById(R.id.frame_container_main) != null) {
            fm.popBackStack();
        }
    }

    @Override
    public void onBackPressed() {
        if (fm.getBackStackEntryCount() > 0) {
            this.backTo();
        } else {
            super.onBackPressed();
        }
    }
}
