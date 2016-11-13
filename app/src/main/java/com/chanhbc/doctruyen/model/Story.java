package com.chanhbc.doctruyen.model;

import android.widget.ImageView;

public class Story {
    private int ivIcon;
    private String title;
    private String content;

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIvIcon() {
        return ivIcon;
    }

    public Story(int ivIcon, String title, String content) {
        this.title = title;
        this.content = content;
        this.ivIcon = ivIcon;
    }
}
