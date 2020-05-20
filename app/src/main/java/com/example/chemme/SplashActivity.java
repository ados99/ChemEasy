package com.example.chemme;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    Intent i = new Intent(SplashActivity.this, MainActivity.class);
    startActivity(i);
        try {
            finish();
            // Do some stuff
        } catch (Exception e) {
            e.getLocalizedMessage();
        }

    }
}