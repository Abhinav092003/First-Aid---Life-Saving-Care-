package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.EpilepsyFragment1;
import Diseases_Fragment.EpilepsyFragment2;
import Diseases_Fragment.EpilepsyFragment3;

public class EpilepsyFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public EpilepsyFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new EpilepsyFragment1();
            case 1:
                return new EpilepsyFragment2();
            case 2:
                return new EpilepsyFragment3();
        }
        return new EpilepsyFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
