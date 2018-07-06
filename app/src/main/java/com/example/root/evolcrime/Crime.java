package com.example.root.evolcrime;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;

    public UUID getId() {
        return mId;
    }

    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(UUID mId, Date mDate) {
        this.mId = mId;
        this.mDate = mDate;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
