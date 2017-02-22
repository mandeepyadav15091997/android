package in.codekamp.asynctaskdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Dell on 2/22/2017.
 */

public class DataViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public DataViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.output);
    }
}
