package com.example.user.android_assignment_10_2;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Layout1 extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //creates and returns the hierarchy associated with the fragment
        //the layout inflater object can be used to inflate any views in the fragment
        //the view group contains views and is base class of layouts and views containers
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout1, container, false);
        //returns the inflater with respective layout
    }

}



