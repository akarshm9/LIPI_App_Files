package com.example.pdfviewer;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class home extends Fragment {



    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        Button syllabus=v.findViewById(R.id.syllabus);
        Button notes=v.findViewById(R.id.notes);
                syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(getActivity(), MainActivity2.class);
                startActivity(link);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nlinkk=new Intent(getActivity(),NotesActivityTabLayout.class);
                startActivity(nlinkk);
            }
        });

        return v;
    }
}