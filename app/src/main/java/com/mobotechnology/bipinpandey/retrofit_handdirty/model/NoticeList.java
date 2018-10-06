package com.mobotechnology.bipinpandey.retrofit_handdirty.model;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NoticeList {

    @SerializedName("notice_list")
    private ArrayList<Notice> noticeList;

    public ArrayList<Notice> getnoticearraylist() {
        Log.d("d","d" );
        return noticeList;
    }

    public void setNoticeArrayList(ArrayList<Notice> noticeArrayList) {
        this.noticeList = noticeArrayList;
    }
}