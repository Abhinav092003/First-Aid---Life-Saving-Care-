package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NosebleedActivity extends AppCompatActivity {
    private String[] titles ={"Treatments","Symptoms","Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosebleed);
        TabLayout tabLayout =findViewById(R.id.tabnosebleed);
        ViewPager2 viewPager2 =findViewById(R.id.viewnosebleed);
        NoseFragmentAdapter noseFragmentAdapter = new NoseFragmentAdapter(this);
        viewPager2.setAdapter(noseFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}