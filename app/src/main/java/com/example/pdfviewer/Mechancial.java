package com.example.pdfviewer;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Mechancial extends Fragment {


Button sem4,sem5,sem6;
    public Mechancial() {
        // Required empty public constructor
    }




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mechancial, container, false);
        Button btnlink=view.findViewById(R.id.sem3);
        btnlink.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                Intent linkk;
                linkk = new Intent(getActivity(), Notes3me.class);
                startActivity(linkk);
            }
        });
sem4=view.findViewById(R.id.sem4);
sem4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent link=new Intent(getActivity(),Notes4me.class);
        startActivity(link);
    }
});
sem5=view.findViewById(R.id.sem5);
sem5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent linkkk=new Intent(getActivity(), Syll5me.class);
        startActivity(linkkk);
    }
});
sem6=view.findViewById(R.id.sem6);
sem6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent a=new Intent(getActivity(), Syll6me.class);
        startActivity(a);
    }
});
        return view;
    }
}