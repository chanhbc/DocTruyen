package com.chanhbc.doctruyen.model;

import java.util.ArrayList;

public class Topic {
    private String topic;
    private int image;
    private ArrayList<Story> stories;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<Story> getStories() {
        return stories;
    }

    public void setStories(ArrayList<Story> stories) {
        this.stories = stories;
    }

    public Topic(String topic, int image, ArrayList<Story> stories) {
        this.topic = topic;
        this.image = image;
        this.stories = stories;
    }
}
