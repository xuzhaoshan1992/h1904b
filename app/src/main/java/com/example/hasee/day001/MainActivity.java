package com.example.hasee.day001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void test(){
        System.out.println("张三");
    }
    private void test1(){
        System.out.println("李四");
    }
}
