package com.acr.animecommunityroom.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.acr.animecommunityroom.Fragment.FragmentAnime;
import com.acr.animecommunityroom.Fragment.FragmentForum;
import com.acr.animecommunityroom.R;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bvmmenu;
    private FrameLayout flContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      MEMBUANG TITLE BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        openFragment(new FragmentAnime());
        getSupportActionBar().setTitle("Anime");

        bvmmenu = findViewById(R.id.bnv_menu);
        flContainer = findViewById(R.id.fl_container);

        bvmmenu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fr;
                switch (item.getItemId()){
                    case R.id.menu_anime:
                        openFragment(new FragmentAnime());
                        getSupportActionBar().setTitle("Anime");
                        return true;
                    case R.id.menu_forum:
                        openFragment(new FragmentForum());
                        getSupportActionBar().setTitle("Forum");
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_nav_bottom, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void openFragment(Fragment frg) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.fl_container, frg);
        FT.commit();
    }
}