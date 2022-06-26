package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AsthmaActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private String[] titles = {"Treatments","Symptoms","Medicines/Causes"};
    AsthmaFragmentAdapter asthmaFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);

        tabLayout =findViewById(R.id.tabasthma);
        viewPager2=findViewById(R.id.viewasthma);
        asthmaFragmentAdapter = new AsthmaFragmentAdapter(this);
        viewPager2.setAdapter(asthmaFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}