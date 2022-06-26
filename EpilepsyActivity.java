package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class EpilepsyActivity extends AppCompatActivity {
    private String[] titles ={"Treatments","Symptoms","Causes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epilepsy);
        TabLayout tabLayout =findViewById(R.id.tabepilepsy);
        ViewPager2 viewPager2 =findViewById(R.id.viewepilepsy);
        EpilepsyFragmentAdapter epilepsyFragmentAdapter =new EpilepsyFragmentAdapter(this);
        viewPager2.setAdapter(epilepsyFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(titles[position])).attach();
    }
}