package in.codekamp.asynctaskdemo;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import javax.net.ssl.ManagerFactoryParameters;

public class MainActivity extends AppCompatActivity {
    static DataShowFragment dataShowFragment;

    static List<MailChimpList> list;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.clickme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FetchLists a = new FetchLists();
                a.execute(8,0);
            }
        });
        dataShowFragment= new DataShowFragment();
        dataShowFragment.returnList(list);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container,dataShowFragment);
        transaction.commit();



        Log.d("devil","fragment formed");


    }


    public static void listfetched(List<MailChimpList> list){
       dataShowFragment.modifyadapter(list);
    }


}
