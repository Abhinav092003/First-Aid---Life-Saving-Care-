package com.example.firstaid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import Diseases_Fragment.PoisonFragment1;
import Diseases_Fragment.PoisonFragment2;
import Diseases_Fragment.PoisonFragment3;

public class PoisonFragmentAdapter extends FragmentStateAdapter {
    private String[] titles ={"Treatments","Symptoms","Causes"};
    public PoisonFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PoisonFragment1();
            case 1:
                return new PoisonFragment2();
            case 2:
                return new PoisonFragment3();
        }

        return new PoisonFragment1();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
