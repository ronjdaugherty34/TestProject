package com.example.ronalddaugherty.whereitssnap.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ronalddaugherty.whereitssnap.R;

/**
 * Created by ronalddaugherty on 5/25/17.
 */

public class CaptureFragment extends Fragment {


        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            //Inflate the layout file then get all necessary references
            View view = inflater.inflate(R.layout.capture_fragment, container, false);

            return view;
        }

    }

