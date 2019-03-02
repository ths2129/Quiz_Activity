package com.example.quiz_activity;


import android.widget.Button;
import android.widget.TextView;

public class Question { //creates an object to hold fields

    private int mTextResId;   //m variables
    private Boolean mAnswerTrue;


    public Question(int isTextResId, boolean isAnswerTrue){
        mTextResId = isTextResId;
        mAnswerTrue = isAnswerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public Boolean getmAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(Boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }}
