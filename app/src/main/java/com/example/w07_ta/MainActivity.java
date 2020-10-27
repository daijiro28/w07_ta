package com.example.w07_ta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hello from Yuki.
        System.out.println("Hello, I'm Yuki.");
        System.out.println("Aloha");
    }
}