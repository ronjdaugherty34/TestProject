package com.example.ronalddaugherty.dualfragments.model;

import com.example.ronalddaugherty.dualfragments.NameAndAddress;

import java.util.ArrayList;

/**
 * Created by ronalddaugherty on 6/5/17.
 */

public class AddressBook {
    private static  AddressBook ourInstance = new AddressBook();

    private ArrayList <NameAndAddress> mNameAndAddresses;

    public static AddressBook getInstance() {
        return ourInstance;
    }

    private AddressBook() {
        mNameAndAddresses = new ArrayList<NameAndAddress>();

        NameAndAddress tempEntry = new NameAndAddress("B Obama", "The White House",
                "Washington", "DC1");

        //add it to the ArrayList
        mNameAndAddresses.add(tempEntry);

        //create new entry
        tempEntry = new NameAndAddress("E Windsor", "Buckingham Palace",
                "London","SW1A 1AA");

        //add it to the ArrayList
        mNameAndAddresses.add(tempEntry);

        //create  new entry
        tempEntry = new NameAndAddress("V Putin", "The Kremlin",
                "Moscow", "MS1");

        //add it to the arraylist
        mNameAndAddresses.add(tempEntry);

    }

    public ArrayList <NameAndAddress> getBook() {
        return  mNameAndAddresses;
    }
}
