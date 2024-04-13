package com.example.pdfviewer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VPagerAdaptorNotes extends FragmentPagerAdapter {

    public VPagerAdaptorNotes(FragmentManager fmn) {
        super(fmn);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       if (position==0){
           return new me();
       }
       else if (position==1){
           return new CSE();
       }
       else if(position==2){
           return new ece();
       } else if (position==3) {
           return new ee();
       }
       else {
           return new ce();
       }
    }

    @Override
    public int getCount() {
        return 5;
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
            return "ECE";
        }
        else if (position==3){
            return "EE";
        }
        else {
            return "CE";
        }
    }
}
