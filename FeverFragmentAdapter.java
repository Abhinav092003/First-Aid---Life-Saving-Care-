package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.FeverFragment1;
import Diseases_Fragment.FeverFragment2;
import Diseases_Fragment.FeverFragment3;

public class FeverFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public FeverFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FeverFragment1();
            case 1:
                return new FeverFragment2();
            case 2:
                return new FeverFragment3();

        }
        return new FeverFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
