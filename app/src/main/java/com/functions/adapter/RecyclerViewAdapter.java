
/*
 * Created by Isabel Maniega on 27/07/18 10:56
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 27/07/18 10:56
 */

package com.functions.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.functions.R;
import com.functions.models.Lessons;

import java.util.List;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.LessonViewHolder> {

    private final Context mContext;
    private final List<Lessons> mLessonsList;


    public RecyclerViewAdapter (Context context, List<Lessons> horizontalList) {
        mContext = context;
        this.mLessonsList = horizontalList;
    }

    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.costum_layout, parent, false);
        return new LessonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {

        holder.mLessonTittle.setText(mLessonsList.get(position).getTitle());
        holder.mLesssonSubtittle.setText(mLessonsList.get(position).getsubtitle());
        holder.mImage.setImageResource(mLessonsList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mLessonsList.size();
    }



    public class LessonViewHolder extends RecyclerView.ViewHolder {

        final TextView mLessonTittle;
        final TextView mLesssonSubtittle;
        final ImageView mImage;

        public LessonViewHolder(View itemView) {
            super(itemView);
            mLessonTittle = itemView.findViewById(R.id.textview1);
            mLesssonSubtittle = itemView.findViewById(R.id.textview2);
            mImage = itemView.findViewById(R.id.image_main);
        }

    }

}
