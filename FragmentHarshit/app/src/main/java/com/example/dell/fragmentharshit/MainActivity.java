package com.example.dell.fragmentharshit;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragResult {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment blankFragment = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.frag1,blankFragment);
        fragmentTransaction.commit();

    }


    @Override
    public void funtion(int item) {
        Log.d("devil",item+"");
        BlankFragment2.datasetter(item);
        BlankFragment2 blankFragment2=new BlankFragment2();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1=fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.frag2,blankFragment2);
        fragmentTransaction1.commit();



    }
}
