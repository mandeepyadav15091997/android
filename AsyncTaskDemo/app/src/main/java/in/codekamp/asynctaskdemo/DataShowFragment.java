package in.codekamp.asynctaskdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class DataShowFragment extends Fragment {

    RecyclerView recyclerView;
    DataAdapter dataAdapter;
    List<MailChimpList> list;
    View view;

    public DataShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_data_show, container, false);

        dataAdapter = new DataAdapter();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(dataAdapter);

        return view;
    }


    public void returnList(List<MailChimpList> list) {
        this.list = list;
    }

    public void modifyadapter(List<MailChimpList> list){
        dataAdapter.list = list;
        dataAdapter.notifyDataSetChanged();
    }

}