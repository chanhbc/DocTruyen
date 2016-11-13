package com.chanhbc.doctruyen.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import com.chanhbc.doctruyen.App;
import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.manager.StoryManager;
import com.chanhbc.doctruyen.model.Story;

public class StoryViewPagerAdapter extends PagerAdapter {
    private LayoutInflater inflater;
    private StoryManager storyManager;
    private Animation animation;

    public StoryViewPagerAdapter(StoryManager storyManager, Animation animation) {
        this.storyManager = storyManager;
        inflater = LayoutInflater.from(App.getContext());
        this.animation = animation;
    }

    @Override
    public int getCount() {
        return storyManager.getSize();
    }

    public Story getStory(int position) {
        return storyManager.getStory(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.activity_viewpager_content, container, false);
        Holder holder = new Holder();
        holder.tvTitle = (TextView) view.findViewById(R.id.tvTitle3);
        holder.tvContent = (TextView) view.findViewById(R.id.tvContent3);
        view.setTag(holder);
        Story story = getStory(position);
        holder.tvTitle.setText(story.getTitle());
        holder.tvContent.setText(story.getContent());
        container.addView(view);
        view.setAnimation(animation);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    private class Holder {
        private TextView tvTitle;
        private TextView tvContent;
    }
}
