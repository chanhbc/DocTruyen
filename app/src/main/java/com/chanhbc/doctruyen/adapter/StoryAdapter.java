package com.chanhbc.doctruyen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chanhbc.doctruyen.App;
import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.manager.StoryManager;
import com.chanhbc.doctruyen.model.Story;

public class StoryAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private OnItemClickIconListener onItemClickIconListener;
    private StoryManager storyManager;
    private Animation animation;

    public StoryAdapter(StoryManager storyManager,Animation animation) {
        inflater = LayoutInflater.from(App.getContext());
        this.storyManager = storyManager;
        this.animation = animation;
    }

    @Override
    public int getCount() {
        return storyManager.getSize();
    }

    @Override
    public Story getItem(int position) {
        return storyManager.getStory(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            view = inflater.inflate(R.layout.activity_story, viewGroup, false);
            holder = new Holder();
            holder.ivIcon = (ImageView) view.findViewById(R.id.ivIcon2);
            holder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            holder.tvContent = (TextView) view.findViewById(R.id.tvContent);
            holder.llListStory = (LinearLayout) view.findViewById(R.id.llListStory);
                    view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();

        }
        Story story = getItem(position);
        holder.ivIcon.setImageResource(story.getIvIcon());
        holder.tvTitle.setText(story.getTitle());
        String str = story.getContent().substring(0, story.getContent().lastIndexOf(" ", 32)) + " ...";
        holder.tvContent.setText(str);
        if (position % 2 == 0)
            holder.llListStory.setBackgroundResource(R.drawable.item_shape_1);
        else
            holder.llListStory.setBackgroundResource(R.drawable.item_shape_2);
        //view.setAnimation(animation);
        return view;
    }

    private class Holder {
        private ImageView ivIcon;
        private TextView tvTitle;
        private TextView tvContent;
        private LinearLayout llListStory;
    }

    public void setOnItemClickIconListener(OnItemClickIconListener listener) {
        onItemClickIconListener = listener;
    }

    private interface OnItemClickIconListener {
        void onClickIcon(int position);
    }
}

