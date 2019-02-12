package com.example.android.miwok;

import java.util.ArrayList;

public class GradeCard {

    private String mName;
    private String v;
    private int mHistory;
    private int mEnglish;
    private int mMaths;

public GradeCard(String name) {
    mName = name;
    }

    public int getGradeHistory() {
        return mHistory;
    }
    public void setGradeHistory(int newGrade) {
        mHistory = newGrade;
    }

    public int getGradeEnglish() {
        return mEnglish;
    }
    public void setGradeEnglish(int newGrade) {
        mEnglish = newGrade;
    }

    public int getGradeMaths() {
        return mMaths;
    }
    public void setGradeMaths(int newGrade) {
        mMaths = newGrade;
    }


    public String getGradeCard() {
    v = "Name: " + mName + "\nEnglish: " + mEnglish + "\nMaths: " + mMaths;
    return v;
    }



}
