package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.StrokeFragment1;
import Diseases_Fragment.StrokeFragment2;
import Diseases_Fragment.StrokeFragment3;

public class StrokeFragmentAdadpter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public StrokeFragmentAdadpter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new StrokeFragment1();
            case 1:
                return new StrokeFragment2();
            case 2:
                return new StrokeFragment3();
        }
        return new StrokeFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
