package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class StingActivity extends AppCompatActivity {
    private String[] titles ={"Treatments","Symptoms","Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sting);
        TabLayout tabLayout =findViewById(R.id.tabsting);
        ViewPager2 viewPager2 = findViewById(R.id.viewsting);
        StingFragmentAdapter stingFragmentAdapter = new StingFragmentAdapter(this);
        viewPager2.setAdapter(stingFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}