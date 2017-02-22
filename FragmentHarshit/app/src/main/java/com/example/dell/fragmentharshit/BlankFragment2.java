package com.example.dell.fragmentharshit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;


public class BlankFragment2 extends Fragment {

    RecyclerView myrecyclerview2;
    static int tableOf;
    TableShowAdapter tableShowAdapter ;
    public BlankFragment2() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        tableShowAdapter= new TableShowAdapter(tableOf);


        myrecyclerview2=(RecyclerView)v.findViewById(R.id.recyclerview2);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getContext()));
        myrecyclerview2.setAdapter(tableShowAdapter);
        tableShowAdapter.notifyDataSetChanged();



        return v;
    }
    public static void datasetter (int id){

       tableOf=id;
    }

}

