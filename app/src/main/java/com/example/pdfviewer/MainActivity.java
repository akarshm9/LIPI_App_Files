package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button syllabus,notes;
    Toolbar t;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        syllabus=findViewById(R.id.syllabus);
        t=findViewById(R.id.toolbar);

        setSupportActionBar(t);
        Objects.requireNonNull(getSupportActionBar()).setTitle("LIPI");
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(link);
            }
        });
    }
}