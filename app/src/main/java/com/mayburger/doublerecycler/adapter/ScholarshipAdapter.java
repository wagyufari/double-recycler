package com.mayburger.doublerecycler.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mayburger.doublerecycler.DetailActivity;
import com.mayburger.doublerecycler.R;
import com.mayburger.doublerecycler.model.Scholarship;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mayburger on 10/19/17.
 */

public class ScholarshipAdapter extends RecyclerView.Adapter<ScholarshipAdapter.ViewHolder> {

    private Activity mContext;
    private List<Scholarship> mData;

    public ScholarshipAdapter(Activity mContext, List<Scholarship> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.name.setText(mData.get(position).getName());
        holder.deadline.setText(mData.get(position).getDeadline());
        holder.degree.setText(mData.get(position).getDegree());
        holder.location.setText(mData.get(position).getLocation());
        Glide.with(mContext).load("https://dummyimage.com/640x4:3/").apply(new RequestOptions().centerCrop()).into(holder.image);
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra(mContext.getString(R.string.data_intent), mData.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.deadline)
        TextView deadline;
        @BindView(R.id.degree)
        TextView degree;
        @BindView(R.id.location)
        TextView location;
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.card)
        CardView card;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
