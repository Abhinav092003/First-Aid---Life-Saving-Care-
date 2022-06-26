package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FeverActivity extends AppCompatActivity {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);
        TabLayout tabLayout =findViewById(R.id.tabfever);
        ViewPager2 viewPager2 =findViewById(R.id.viewfever);
        FeverFragmentAdapter feverFragmentAdapter =new FeverFragmentAdapter(this);
        viewPager2.setAdapter(feverFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}