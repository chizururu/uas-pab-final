package com.acr.animecommunityroom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.acr.animecommunityroom.R;
import com.bumptech.glide.Glide;

public class AnimeDetail extends AppCompatActivity {
    private ImageView ivAnime;
    private TextView tvAnime, tvGenre, tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_detail);
        ivAnime = findViewById(R.id.iv_fanime);
        tvAnime = findViewById(R.id.tv_anime);
        tvGenre = findViewById(R.id.tv_genre);
        tvDesc = findViewById(R.id.tv_description);

        Intent terima = getIntent();
        String ivFoto = terima.getStringExtra("varFoto");
        String tllAnime = terima.getStringExtra("varJudulAnime");
        String genre = terima.getStringExtra("varGenre");
        String desc = terima.getStringExtra("varDeskripsi");

        getSupportActionBar().setTitle(tllAnime);

        tvAnime.setText(tllAnime);
        tvGenre.setText(genre);
        tvDesc.setText(desc);
        Glide.with(AnimeDetail.this)
                .load(ivFoto)
                .into(ivAnime);
    }
}