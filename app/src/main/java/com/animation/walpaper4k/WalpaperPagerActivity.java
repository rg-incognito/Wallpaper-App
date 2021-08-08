package com.animation.walpaper4k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class WalpaperPagerActivity extends AppCompatActivity {
    int pos;

    ArrayList<String> allImageList = new ArrayList<>();
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walpaper_pager);
        pos = getIntent().getIntExtra("pos",0);
        allImageList = getIntent().getStringArrayListExtra("list");
        viewPager = findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter=new PagerAdapter(WalpaperPagerActivity.this,allImageList);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(pos);



    }
}