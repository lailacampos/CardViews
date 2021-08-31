package com.laila.udemy.cardviewsapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.laila.udemy.cardviewsapp.R;
import com.laila.udemy.cardviewsapp.model.AppPost;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<AppPost> appPostList;

    public MyAdapter() {}

    public MyAdapter(List<AppPost> appPostList) {
        this.appPostList = appPostList;
    }

    @NonNull
    @Override
    // This method is called right when the adapter is created and is used to initialize the ViewHolder(s).
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflates a layout from XML and returns the holder
        // parent.getContext() is the context that each component of the list is in
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list, parent, false);

        return new MyViewHolder(itemList);
    }

    @Override
    // This method is called for each ViewHolder to bind it to the adapter.
    // This is where the data will be passed to the ViewHolder.
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        AppPost appPost = appPostList.get(position);
        holder.nameTextView.setText(appPost.getName());
        holder.whenTextView.setText(appPost.getPostDate());
        holder.subtitleTextView.setText(appPost.getSubtitle());
        holder.imageView.setImageResource(appPost.getPostImage());

    }

    @Override
    public int getItemCount() {
        return appPostList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView, whenTextView, subtitleTextView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.nameTextView = itemView.findViewById(R.id.name_TextView);
            this.whenTextView = itemView.findViewById(R.id.when_TextView);
            this.subtitleTextView = itemView.findViewById(R.id.body_TextView);
            this.imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
