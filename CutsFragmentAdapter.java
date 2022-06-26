package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.CutsFragment1;
import Diseases_Fragment.CutsFragment2;
import Diseases_Fragment.CutsFragment3;

public class CutsFragmentAdapter extends FragmentStateAdapter {
    private String[] titles = {"Treatments","Symptoms","Medicines/Causes"};
    public CutsFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new CutsFragment1();
            case 1:
                return new CutsFragment2();
            case 2:
                return new CutsFragment3();
        }
        return new CutsFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
