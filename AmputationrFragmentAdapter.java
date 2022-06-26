package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.AmputationFragment1;
import Diseases_Fragment.AmputationFragment2;
import Diseases_Fragment.AmputationFragment3;

public class AmputationrFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public AmputationrFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AmputationFragment1();
            case 1:
                return new AmputationFragment2();
            case 2:
                return new AmputationFragment3();
        }
        return new AmputationFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
