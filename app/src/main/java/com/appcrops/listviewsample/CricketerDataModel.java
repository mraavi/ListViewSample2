package com.appcrops.listviewsample;

import java.util.ArrayList;

/**
 * Created by mraavi on 21/03/17.
 */

public class CricketerDataModel {
    private ArrayList<Cricketer> mCricketerList;

    public CricketerDataModel() {
        mCricketerList = new ArrayList<Cricketer>();
        mCricketerList.add(new Cricketer("Virat", 27, 200, 5000, 50.3));
        mCricketerList.add(new Cricketer("Rohit", 29, 188, 4000, 45.8));
    }

    public ArrayList<Cricketer> getCricketerList(){
        return mCricketerList;
    }
}
