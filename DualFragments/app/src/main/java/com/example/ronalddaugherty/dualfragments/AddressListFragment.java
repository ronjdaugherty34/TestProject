package com.example.ronalddaugherty.dualfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ronalddaugherty.dualfragments.model.ActivityComs;
import com.example.ronalddaugherty.dualfragments.model.AddressBook;

import java.util.ArrayList;

/**
 * Created by ronalddaugherty on 6/5/17.
 */

public class AddressListFragment extends ListFragment {

    private ActivityComs mActivityComs;

    private ArrayList<NameAndAddress> mNamesAndAddresses;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mNamesAndAddresses = AddressBook.getInstance().getBook();
        AddressListAdapter adapter = new AddressListAdapter
                (mNamesAndAddresses);
        setListAdapter(adapter);
    }
    private class AddressListAdapter extends ArrayAdapter<NameAndAddress> {

        public AddressListAdapter(ArrayList<NameAndAddress> nameAndAddresses) {
            super(getActivity(), R.layout.list_item, nameAndAddresses);
        }

        @Override
        public View getView (int whichItem, View view, ViewGroup viewGroup) {
            if (view == null) {

                LayoutInflater inflater = (LayoutInflater)  getActivity().getLayoutInflater();
                view = inflater.inflate(R.layout.list_item, null);
            }
            NameAndAddress tempNameAndAddress = getItem(whichItem);
            TextView txtName = (TextView) view.findViewById(R.id.txtName);
            txtName.setText(tempNameAndAddress.getmName());

            return view;
        }

    }
    @Override
    public void onAttach (Activity activity) {
        super.onAttach(activity);
    }
}
