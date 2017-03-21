package com.appcrops.listviewsample;

/**
 * Created by mraavi on 21/03/17.
 */

public class Cricketer {
    private String mName;
    private int mAge;
    private int mNumberOfMatches;
    private int mNumberOfRuns;
    private double mStrickRate;

    public Cricketer(String name, int age, int numOfMatches, int numberOfRuns, double strickRate) {
        mName = name;
        mAge = age;
        mNumberOfMatches = numOfMatches;
        mNumberOfRuns = numberOfRuns;
        mStrickRate = strickRate;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public int getAge() {
        return mAge;
    }
}
