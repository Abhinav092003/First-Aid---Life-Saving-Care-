package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.DrowningFragment1;
import Diseases_Fragment.DrowningFragment2;
import Diseases_Fragment.DrowningFragment3;

public class DrowningFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Medicines/Causes"};
    public DrowningFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DrowningFragment1();
            case 1:
                return new DrowningFragment2();
            case 2:
                return new DrowningFragment3();
        }
        return new DrowningFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
