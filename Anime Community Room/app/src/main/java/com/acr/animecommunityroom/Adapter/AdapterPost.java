package com.acr.animecommunityroom.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acr.animecommunityroom.R;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.ViewHolder> {

    @NonNull
    @Override
    public AdapterPost.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPost.ViewHolder holder, int position) {
        Post post = data.get(position);
        holder.tvUsername.setText(post.getUsername());
        holder.tvComments.setText(post.getComment());
        holder.tvDate.setText(post.getCreatedDate());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvUsername, tvComments, tvDate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tv_username);
            tvComments = itemView.findViewById(R.id.tv_comment);
            tvDate = itemView.findViewById(R.id.tv_date);
        }
    }
}
