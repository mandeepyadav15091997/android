package com.example.dell.fragmentharshit;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dell on 2/19/2017.
 */

public class TableShowAdapter extends RecyclerView.Adapter<TableShowViewHolder> {

     int tableOf;

    public   TableShowAdapter(int id ){
        Log.d("devil",""+id);
        tableOf=id;

    }

    @Override
    public TableShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View v=layoutInflater.inflate(R.layout.table_show_row,parent,false);


        return new TableShowViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TableShowViewHolder holder, int position) {
holder.funtion(tableOf,position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
