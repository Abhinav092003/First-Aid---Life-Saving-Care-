package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}