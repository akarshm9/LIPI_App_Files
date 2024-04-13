package com.example.pdfviewer;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class contributor extends Fragment {

    ArrayList<String> clist=new ArrayList<>();


    public contributor() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_contributor, container, false);
         ListView lv=v.findViewById(R.id.lcontibutorlist);

        clist.add("Suman Shekhar(BPSC), Lecturer, CSE, GPM");
        clist.add("Manisha Rani(BPSC),Asst. prof., GEC Sheikhpura");
        clist.add("Akarsh Mishra");
ArrayAdapter<String> adp=new ArrayAdapter<>(requireActivity(), android.R.layout.simple_list_item_1,clist);
lv.setAdapter(adp);
        return  v;
    }
}