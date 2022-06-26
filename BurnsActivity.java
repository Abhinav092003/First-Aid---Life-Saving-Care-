package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class BurnsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[] titles = {"Fragments","Symptoms","Medicines/Causes"};
    BurnsFragmentAdapter burnsFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burns);
        tabLayout = findViewById(R.id.tabburns);
        viewPager2=findViewById(R.id.viewburns);


        burnsFragmentAdapter = new BurnsFragmentAdapter(this);
        viewPager2.setAdapter(burnsFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();

    }
}