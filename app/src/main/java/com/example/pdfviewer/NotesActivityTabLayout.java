package com.example.pdfviewer;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class NotesActivityTabLayout extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notes_tab_layout);

        //setting toolbar
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Toolbar tn=findViewById(R.id.toolbar_notes);
        setSupportActionBar(tn);
        Objects.requireNonNull(getSupportActionBar()).setDefaultDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setTitle("LIPI");

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewPager vpagernotes=findViewById(R.id.vpagernotes);

        VPagerAdaptorNotes vpn=new VPagerAdaptorNotes(getSupportFragmentManager());
        vpagernotes.setAdapter(vpn);

        TabLayout tb=findViewById(R.id.notes_tab);
        tb.setupWithViewPager(vpagernotes);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}