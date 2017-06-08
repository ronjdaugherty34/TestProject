package com.example.ronalddaugherty.simplefragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get fragment manager
        FragmentManager fragmentManager = getFragmentManager();

        //Create a new fragment using the manger
        // Passing in the id if the layout to hold it
       Fragment fragment= fragmentManager.findFragmentById(R.id.fragmentHolder);

       //Check the fragment has not already been initialized
        if (fragment == null) {

            // Inititlize the fragment based in our Simple Fragment
            fragment = new SimpleFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragmentHolder, fragment)
                    .commit();

        }
    }
}
