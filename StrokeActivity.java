package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class StrokeActivity extends AppCompatActivity {
    private String[] titles ={"Treatments","Symptoms","Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroke);
        TabLayout tabLayout =findViewById(R.id.tabstroke);
        ViewPager2 viewPager2 =findViewById(R.id.viewstroke);
        StrokeFragmentAdadpter strokeFragmentAdadpter =new StrokeFragmentAdadpter(this);
        viewPager2.setAdapter(strokeFragmentAdadpter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}