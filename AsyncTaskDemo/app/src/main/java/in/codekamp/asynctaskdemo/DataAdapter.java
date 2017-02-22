package in.codekamp.asynctaskdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Dell on 2/22/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {
     List<MailChimpList> list;


    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.data_row,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.textView.setText(list.get(position).title);
    }

    @Override
    public int getItemCount() {
        if(list!=null){
            return list.size();
        }else{
        return 0;}
    }
}
