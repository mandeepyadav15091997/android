package com.example.dell.fragmentharshit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Dell on 2/19/2017.
 */

public class TableShowViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    String s;
    public TableShowViewHolder(View itemView) {

        super(itemView);

        textView=(TextView)itemView.findViewById(R.id.tableshowtext);
    }
    public void funtion(int tableof,int id ){
         s= tableof+" *"+Integer.toString(id+1)+" =  "+Integer.toString(tableof*(id+1));
        textView.setText(s);
    }
}
