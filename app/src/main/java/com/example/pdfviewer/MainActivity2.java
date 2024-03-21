package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tab;
    ViewPager vpager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        vpager=findViewById(R.id.vpager);
        tab=findViewById(R.id.tab1);

     VPagerAdaptors adaptor=new VPagerAdaptors(getSupportFragmentManager());
     vpager.setAdapter(adaptor);

     tab.setupWithViewPager(vpager);


    }
}