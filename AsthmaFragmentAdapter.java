package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.AsthmaFragment1;
import Diseases_Fragment.AsthmaFragment2;
import Diseases_Fragment.AsthmaFragment3;

public class AsthmaFragmentAdapter extends FragmentStateAdapter {
    private String[] titles = {"Treatments","Symptoms","Medicines/Causes"};
    public AsthmaFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AsthmaFragment1();
            case 1:
                return new AsthmaFragment2();
            case 2:
                return new AsthmaFragment3();

        }
        return new AsthmaFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
