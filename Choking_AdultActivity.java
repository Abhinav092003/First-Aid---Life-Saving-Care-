package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Choking_AdultActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[] titles= {"Treatments","Symptoms","Medicines/Causes"};
    AdultFragmentAdapter adultFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choking_adult);
        tabLayout = findViewById(R.id.tabadult);
        viewPager2=findViewById(R.id.viewadult);

        adultFragmentAdapter = new AdultFragmentAdapter(this);
        viewPager2.setAdapter(adultFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();


    }
}