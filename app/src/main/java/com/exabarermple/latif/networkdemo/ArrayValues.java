package com.exabarermple.latif.networkdemo;

import java.util.Date;

public class ArrayValues {
// arrayValues
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public ArrayValues(String magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
