package com.example.nutrientiv3.ui.settings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nutrientiv3.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().hide();
    }

}