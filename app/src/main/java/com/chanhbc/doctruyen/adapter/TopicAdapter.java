package com.chanhbc.doctruyen.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chanhbc.doctruyen.App;
import com.chanhbc.doctruyen.R;
import com.chanhbc.doctruyen.activity.MainActivity;
import com.chanhbc.doctruyen.manager.TopicManager;
import com.chanhbc.doctruyen.model.Topic;

public class TopicAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private OnItemClickIconListener onItemClickIconListener;

    public TopicAdapter() {
        inflater = LayoutInflater.from(App.getContext());
    }

    @Override
    public int getCount() {
        return TopicManager.getInstance().getSize();
    }

    @Override
    public Topic getItem(int position) {
        return TopicManager.getInstance().getTopic(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            view = inflater.inflate(R.layout.activity_topic, viewGroup, false);
            holder = new Holder();
            holder.ivIcon = (ImageView) view.findViewById(R.id.ivIcon);
            holder.tvTopic = (TextView) view.findViewById(R.id.tvTopic);
            holder.llListTopic = (LinearLayout) view.findViewById(R.id.llListTopic);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
        Topic topic = getItem(position);
        holder.ivIcon.setImageResource(topic.getImage());
        holder.tvTopic.setText(topic.getTopic());
        if (position % 2 == 0)
            holder.llListTopic.setBackgroundResource(R.drawable.item_shape_1);
        else
            holder.llListTopic.setBackgroundResource(R.drawable.item_shape_2);
        holder.ivIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickIconListener.onClickIcon(position);
            }
        });
        return view;
    }

    private class Holder {
        private ImageView ivIcon;
        private TextView tvTopic;
        private LinearLayout llListTopic;
    }

    public void setOnItemClickIconListener(OnItemClickIconListener listener) {
        onItemClickIconListener = listener;
    }

    public interface OnItemClickIconListener extends View.OnClickListener {
        void onClickIcon(int position);
    }
}
