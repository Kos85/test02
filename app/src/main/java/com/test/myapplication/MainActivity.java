package com.test.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        process();

        Log.i("==>", "Hello World");

    }

    private void process() {
        System.out.println(getText());
    }

    private String getText() {
        return "NEXT";
    }

}
