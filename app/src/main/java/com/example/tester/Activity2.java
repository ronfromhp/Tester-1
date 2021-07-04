package com.example.tester;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v -> openactivity3());
    }
    public void openactivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}
