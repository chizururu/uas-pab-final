package com.acr.animecommunityroom.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acr.animecommunityroom.R;

public class AdapterAnime extends RecyclerView.Adapter<AdapterAnime.GridViewHolder> {
    @NonNull
    @Override
    public AdapterAnime.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_anime, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnime.GridViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudulAnime;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.iv_fanime);
            tvJudulAnime = itemView.findViewById(R.id.tv_anime);
        }
    }
}
