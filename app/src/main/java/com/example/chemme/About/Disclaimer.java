package com.example.chemme.About;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class Disclaimer extends AppCompatActivity {
    private TextView abouttheapp,abouttheapp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                    openAbout();
                }
            });
        }
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    public void openAbout()
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }



}

