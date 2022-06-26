package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.FractureFragment1;
import Diseases_Fragment.FractureFragment2;
import Diseases_Fragment.FractureFragment3;

public class FractureFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public FractureFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FractureFragment1();
            case 1:
                return new FractureFragment2();
            case 2:
                return new FractureFragment3();
        }
        return new FractureFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
