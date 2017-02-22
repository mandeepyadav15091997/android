package com.example.dell.fragmentharshit;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dell on 2/19/2017.
 */

public class TableNoAdapter extends RecyclerView.Adapter<TableNoViewHolder> {
    @Override
    public TableNoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.table_no_row,parent,false);
        return new TableNoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TableNoViewHolder holder, final int position) {
    holder.dataseter(position);
    }

    @Override
    public int getItemCount() {
        return 500;
    }
}
