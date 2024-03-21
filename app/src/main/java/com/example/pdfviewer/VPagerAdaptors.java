package com.example.pdfviewer;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VPagerAdaptors extends FragmentPagerAdapter {

    public VPagerAdaptors(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new Mechancial();
        } else if (position==1) {
            return new CompScEngg();
        } else if (position==2) {
            return new Electrical();
        } else if (position==3) {
            return new Electronics();
        } else {
            return new Civil();

        }

    }

    @Override
    public int getCount() {
        return 5; //number of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "ME";
        }
        else if (position==1){
            return "CSE";
        }
        else if (position==2){
            return "EE";
        }
        else if (position==3){
            return "ECE";
        }
       else {
            return "CE";
        }
    }
}
