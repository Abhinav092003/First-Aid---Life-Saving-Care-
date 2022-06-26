package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.AdultFragment1;
import Diseases_Fragment.AdultFragment2;
import Diseases_Fragment.AsthmaFragment3;

public class AdultFragmentAdapter extends FragmentStateAdapter {
    private String[] titles= {"Treatments","Symptoms","Medicines/Causes"};
    public AdultFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AdultFragment1();
            case 1:
                return new AdultFragment2();
            case 2:
                return new AsthmaFragment3();
        }
        return new AdultFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
