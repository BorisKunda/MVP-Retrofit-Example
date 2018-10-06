package com.mobotechnology.bipinpandey.retrofit_handdirty.model;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

public class Notice {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("brief")
    private String brief;
    @SerializedName("filesource")
    private String fileSource;

    public Notice(String id, String title, String brief, String fileSource) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.fileSource = fileSource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        Log.d("d","d" );
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Log.d("d","d" );
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public String getFileSource() {
        return fileSource;
    }


}