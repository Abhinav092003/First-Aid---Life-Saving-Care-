package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AmputationActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    AmputationrFragmentAdapter amputationrFragmentAdapter;
    private String[] titles ={"Treatments","Symptoms","Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amputation);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2=findViewById(R.id.viewPager2);
        amputationrFragmentAdapter =new AmputationrFragmentAdapter(this);
        viewPager2.setAdapter(amputationrFragmentAdapter);

        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();
    }


}