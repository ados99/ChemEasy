package com.example.chemme.About;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chemme.R;

public class Disclaimer extends AppCompatActivity {
    private TextView abouttheapp,abouttheapp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");

        abouttheapp = findViewById(R.id.top);
        abouttheapp.setTypeface(myTypeFace);

        abouttheapp1 = findViewById(R.id.text);
        abouttheapp1.setTypeface(myTypeFace);


    }


}

