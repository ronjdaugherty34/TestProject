package com.example.ronalddaugherty.testproject.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ronalddaugherty.testproject.R;

/**
 * Created by ronalddaugherty on 6/8/17.
 */

public class ReadFragment extends Fragment {

    public static ReadFragment newInstance() {
        ReadFragment fragment = new ReadFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_read, container, false);
    }
}
