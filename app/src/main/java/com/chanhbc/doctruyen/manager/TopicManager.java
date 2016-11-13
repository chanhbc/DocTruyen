package com.chanhbc.doctruyen.manager;

import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.model.Topic;

import java.util.ArrayList;

public class TopicManager {
    private ArrayList<Topic> topics;
    private StoryManager storyManager;
    private static TopicManager instance;

    public TopicManager() {
        addArrListTopic();
    }

    public static TopicManager getInstance() {
        if (instance == null) {
            instance = new TopicManager();
        }
        return instance;
    }

    private void addArrListTopic() {
        topics = new ArrayList<Topic>();
        storyManager = new StoryManager();
        topics.add(new Topic("Truyện cười", R.drawable.ic_chonau2, storyManager.getStoriesFunny()));
        topics.add(new Topic("Truyện dân gian", R.drawable.ic_dangian, storyManager.getStoriesFolk()));
        topics.add(new Topic("Truyện cổ tích", R.drawable.ic_cotich, storyManager.getStoriesCoTich()));
        topics.add(new Topic("Truyện công sở", R.drawable.ic_congso, storyManager.getStoriesCongSo()));
        topics.add(new Topic("Truyện tình yêu", R.drawable.ic_tinhyeu, storyManager.getStoriesLove()));
        topics.add(new Topic("Truyện ngụ ngôn", R.drawable.ic_ngungon, storyManager.getStoriesNguNgon()));
        topics.add(new Topic("Truyện ngắn", R.drawable.ic_ngan, storyManager.getStoriesShort()));
        topics.add(new Topic("Truyện tam quốc", R.drawable.ic_tamquoc, storyManager.getStoriesTamQuoc()));
        topics.add(new Topic("Truyện tiếu lâm", R.drawable.ic_tieulam, storyManager.getStoriesTieuLam()));
        topics.add(new Topic("Truyện khác", R.drawable.ic_truyen, storyManager.getStoriesOther()));
    }

    public int getSize() {
        return topics.size();
    }

    public Topic getTopic(int position) {
        return topics.get(position);
    }
}
