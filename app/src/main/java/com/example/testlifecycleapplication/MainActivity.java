package com.example.testlifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

   public int Method(int x , int y) {


        if (x > y) {
            System.out.println("x is greater than y");
        }
       return (y);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


       void myMethod() {
        System.out.println("I just got executed!");
    }
}