package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CutsActivity extends AppCompatActivity {
    private String[] titles = {"Treatments","Symptoms","Medicines/Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuts);

        TabLayout tabLayout =findViewById(R.id.tabcuts);
        ViewPager2 viewPager2 =findViewById(R.id.viewcuts);
        CutsFragmentAdapter cutsFragmentAdapter = new CutsFragmentAdapter(this);
        viewPager2.setAdapter(cutsFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();

    }
}