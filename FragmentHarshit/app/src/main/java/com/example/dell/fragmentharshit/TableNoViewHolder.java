package com.example.dell.fragmentharshit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class TableNoViewHolder extends RecyclerView.ViewHolder {
    private TextView myTextview;
    View view;
    static FragResult fragResult;
    int id;
    public TableNoViewHolder(final View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragResult=(FragResult)itemView.getContext();
                fragResult.funtion(id);
            }
        });
        myTextview=(TextView)itemView.findViewById(R.id.table_of);

    }
     void dataseter(int id)
     {
         this.id =id+1;
        myTextview.setText("Table of "+Integer.toString(id+1));
    }

}
