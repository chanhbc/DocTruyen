package com.chanhbc.doctruyen.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.adapter.StoryAdapter;
import com.chanhbc.doctruyen.adapter.StoryViewPagerAdapter;
import com.chanhbc.doctruyen.adapter.TopicAdapter;
import com.chanhbc.doctruyen.manager.StoryManager;
import com.chanhbc.doctruyen.model.Story;
import com.chanhbc.doctruyen.model.Topic;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements TopicAdapter.OnItemClickIconListener,
        AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener {
    private TopicAdapter topicAdapter;
    private ListView lvTopic;
    private ListView lvStory;
    private StoryAdapter storyAdapter;
    private StoryManager storyManager;
    private LinearLayout llContentStory;
    private TextView tvTitle;
    private TextView tvContent;
    private ViewPager vpContentStory;
    private StoryViewPagerAdapter storyViewPagerAdapter;
    private Animation animation;
    private Animation animation2;
    private Animation animation3;
    private Animation animation4;
    private Animation animation5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlizeComponents();
    }

    private void initlizeComponents() {
        lvTopic = (ListView) findViewById(R.id.lvTopic);
        lvStory = (ListView) findViewById(R.id.lvStory);
        llContentStory = (LinearLayout) findViewById(R.id.llContentStory);
        llContentStory.setVisibility(View.GONE);
        lvStory.setVisibility(View.GONE);
        tvTitle = (TextView) findViewById(R.id.tvTitle2);
        tvContent = (TextView) findViewById(R.id.tvContent2);
        vpContentStory = (ViewPager) findViewById(R.id.vpStoryContent);
        vpContentStory.setVisibility(View.GONE);
        storyManager = new StoryManager();
        initlizeTopics();
        animation = AnimationUtils.loadAnimation(this, R.anim.anim_1);
        animation2 = AnimationUtils.loadAnimation(this, R.anim.anim_2);
        animation3 = AnimationUtils.loadAnimation(this, R.anim.anim_alpha_1);
        animation4 = AnimationUtils.loadAnimation(this, R.anim.anim_alpha_2);
        animation5 = AnimationUtils.loadAnimation(this, R.anim.anim_3);
    }

    private void initlizeTopics() {
        topicAdapter = new TopicAdapter();
        topicAdapter.setOnItemClickIconListener(this);
        lvTopic.setAdapter(topicAdapter);
        lvTopic.setOnItemClickListener(this);
        lvTopic.setOnItemLongClickListener(this);
    }

    private void initlizeStories(ArrayList<Story> stories) {
        storyManager = new StoryManager();
        storyManager.setStories(stories);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_1);
        storyAdapter = new StoryAdapter(storyManager, animation);
        lvStory.setAdapter(storyAdapter);
        lvStory.setOnItemClickListener(this);
    }

    @Override
    public void onClickIcon(int position) {
        Toast.makeText(this, "this is icon", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch (adapterView.getId()) {
            case R.id.lvTopic:
                lvTopic.setAnimation(animation2);
                lvStory.setVisibility(View.VISIBLE);
                lvTopic.setVisibility(View.GONE);
                lvStory.setAnimation(animation);
                Topic topic = topicAdapter.getItem(position);
                initlizeStories(topic.getStories());
                break;
            case R.id.lvStory:
                lvStory.setAnimation(animation3);
                lvStory.setVisibility(View.GONE);
                llContentStory.setVisibility(View.VISIBLE);
                llContentStory.setAnimation(animation4);
                vpContentStory.setVisibility(View.VISIBLE);
                storyViewPagerAdapter = new StoryViewPagerAdapter(storyManager, animation5);
                vpContentStory.setAdapter(storyViewPagerAdapter);
                vpContentStory.setCurrentItem(position);
                break;
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return true;
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "This Icon", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (llContentStory.getVisibility() == View.VISIBLE) {
            lvStory.setVisibility(View.VISIBLE);
            llContentStory.setVisibility(View.GONE);
        } else if (lvStory.getVisibility() == View.VISIBLE) {
            lvStory.setVisibility(View.GONE);
            lvTopic.setVisibility(View.VISIBLE);
        } else if (lvTopic.getVisibility() == View.VISIBLE) {
            super.onBackPressed();
        }
    }
}
