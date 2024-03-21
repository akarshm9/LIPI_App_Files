package com.example.pdfviewer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CompScEngg extends Fragment {



    public CompScEngg() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_comp_sc_engg, container, false);
        Button sem3cse,sem4cse,sem5cse,sem6cse;

        //for semester 3
        sem3cse=view.findViewById(R.id.sem3cse);
        sem3cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageLink=new Intent(getActivity(),Syll3cse.class);
                startActivity(pageLink);
            }
        });

        //for semester 4
        view.findViewById(R.id.sem4cse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageLink2=new Intent(getActivity(),Syll4cse.class);
                startActivity(pageLink2);
            }
        });

        //for semester 5
        view.findViewById(R.id.sem5cse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageLink3=new Intent(getActivity(),syll5cse.class);
                startActivity(pageLink3);
            }
        });

        view.findViewById(R.id.sem6cse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageLink4=new Intent(getActivity(),syll6cse.class);
                startActivity(pageLink4);
            }
        });


        return view;
    }
}