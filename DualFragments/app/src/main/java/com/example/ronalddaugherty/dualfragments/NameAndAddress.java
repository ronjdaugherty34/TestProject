package com.example.ronalddaugherty.dualfragments;

import java.io.Serializable;

/**
 * Created by ronalddaugherty on 6/5/17.
 */

public class NameAndAddress implements Serializable {

    private String mName;
    private String mAddress1;
    private String mAddress2;
    private String mZipCode;

    public NameAndAddress (String name,
                           String address1,
                           String address2,
                           String zipCode) {

        mName = name;
        mAddress1 = address1;
        mAddress2 = address2;
        mZipCode = zipCode;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress1() {
        return mAddress1;
    }

    public void setmAddress1(String mAddress1) {
        this.mAddress1 = mAddress1;
    }

    public String getmAddress2() {
        return mAddress2;
    }

    public void setmAddress2(String mAddress2) {
        this.mAddress2 = mAddress2;
    }

    public String getmZipCode() {
        return mZipCode;
    }

    public void setmZipCode(String mZipCode) {
        this.mZipCode = mZipCode;
    }


}
