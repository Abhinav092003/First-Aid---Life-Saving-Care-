package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.BurnsFragment1;
import Diseases_Fragment.BurnsFragment2;
import Diseases_Fragment.BurnsFragment3;

public class BurnsFragmentAdapter extends FragmentStateAdapter {
    private String[] titles = {"Fragments","Symptoms","Medicines/Causes"};
    public BurnsFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BurnsFragment1();
            case 1:
                return new BurnsFragment2();
            case 2:
                return new BurnsFragment3();
        }
        return new BurnsFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
