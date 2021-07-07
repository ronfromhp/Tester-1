package com.example.tester;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btn = findViewById(R.id.button1);
        //btn.setOnClickListener(v -> openactivity2());
        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(v -> openactivity3());
    }
    public void openactivity2(){
        Intent act = new Intent(this, Activity2.class);
        startActivity(act);
    }
    public void openactivity3(){
        Intent act = new Intent(this, Activity3.class);
        startActivity(act);

    }
}