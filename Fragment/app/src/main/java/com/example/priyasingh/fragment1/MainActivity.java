package com.example.priyasingh.fragment1;
import static com.example.priyasingh.fragment1.R.*;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.Fragment1;
import layout.Fragment2;
import layout.Fragment3;
import layout.Fragment4;
import layout.Fragment5;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Fragment1 ob1=new Fragment1();
        Fragment2 ob2=new Fragment2();
        Fragment3 ob3=new Fragment3();
        Fragment4 ob4=new Fragment4();
        Fragment5 ob5=new Fragment5();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();//create an instance of Fragment-transaction

        ft.add(R.id.frag1,ob1);
        ft.add(R.id.frag2,ob2);
        ft.add(R.id.frag2,ob3);
        ft.add(R.id.frag2,ob4);
        ft.add(R.id.frag2,ob5);
        ft.commit();
    }
}
