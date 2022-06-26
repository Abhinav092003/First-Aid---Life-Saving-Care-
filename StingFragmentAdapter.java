package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.StingFragment1;
import Diseases_Fragment.StingFragment2;
import Diseases_Fragment.StingFragment3;

public class StingFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public StingFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new StingFragment1();
            case 1:
                return new StingFragment2();
            case 2:
                return new StingFragment3();
        }
        return new StingFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
