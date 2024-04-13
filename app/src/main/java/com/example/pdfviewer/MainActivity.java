package com.example.pdfviewer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button syllabus,notes;
    Toolbar t;
    //public DrawerLayout dl=findViewById(R.id.drawer);
    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       syllabus=findViewById(R.id.syllabus);
        t=findViewById(R.id.toolbar);
       notes=findViewById(R.id.notes);
        BottomNavigationView bnv=findViewById(R.id.nav);




        setSupportActionBar(t);
        Objects.requireNonNull(getSupportActionBar()).setDefaultDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setTitle("LIPI");




bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();
        if (id==R.id.contributors){
            loadFragment(new contributor());
        } else if (id==R.id.developers) {
            loadFragment(new developer());
        } else if (id==R.id.pyq) {
            loadFragment(new pyq());
        } else if (id==R.id.fyc) {
            loadFragment(new common());
        }
        else {
            loadFragment(new home());
        }
        return true;
    }
});
bnv.setSelectedItemId(R.id.home);


    }


   // @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        new MenuInflater(this).inflate(R.id.);
//        return super.onCreateOptionsMenu(menu);
//    }

    private void loadFragment(Fragment frg) {
        FragmentManager fm=getSupportFragmentManager();
        @SuppressLint("CommitTransaction") FragmentTransaction ft=fm.beginTransaction();
        //ft.add(R.id.storage,frg);
        ft.replace(R.id.storage,frg);
        ft.commit();

    }
}