package com.example.android.miwok;

public class Grade {

    private int mGrade;
    private String mSubject;

    public Grade(String subject, int grade ) {
        mSubject = subject;
        mGrade = grade;
    }

    public int getGrade() {
        return mGrade;
    }
    public void setGrade(int newGrade) {
        mGrade = newGrade;
    }

    public String getSubject() {
        return mSubject;
    }

    public String printGrade() {
        String v = "\n " + mSubject + ": " + Integer.toString(mGrade);
        return v;
    }
}
