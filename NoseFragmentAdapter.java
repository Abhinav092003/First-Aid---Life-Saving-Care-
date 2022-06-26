package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.NoseFragment1;
import Diseases_Fragment.NoseFragment2;
import Diseases_Fragment.NoseFragment3;

public class NoseFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public NoseFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new NoseFragment1();
            case 1:
                return new NoseFragment2();
            case 2:
                return new NoseFragment3();
        }
        return new NoseFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
