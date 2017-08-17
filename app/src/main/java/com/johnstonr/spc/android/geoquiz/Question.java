package com.johnstonr.spc.android.geoquiz;

/**
 * Created by Bob on 8/17/2017.
 * Added for Chapter 2
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question() {}

    public Question(int question, boolean answer)
    {
        setTextResId(question);
        setAnswerTrue(answer);
    }
}
