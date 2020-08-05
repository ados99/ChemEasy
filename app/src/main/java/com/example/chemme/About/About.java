package com.example.chemme.About;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class About extends AppCompatActivity {
    private TextView about;
    private Button abouttheappbutton;
    private Button disclaimerbutton;
    private Button referencesbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");

        abouttheappbutton = findViewById(R.id.abouttheapp);
        disclaimerbutton = findViewById(R.id.disclaimer);
        referencesbutton = findViewById(R.id.references);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMain();
                }
            });
        }
        abouttheappbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAboutTheApp();
            }
        });
        disclaimerbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openDisclaimer();
            }
        });
        referencesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openReferences();
            }
        });





    }

    public void openAboutTheApp()
    {
        Intent intent = new Intent(this, AboutTheApp.class);
        startActivity(intent);
    }

    public void openDisclaimer()
    {
        Intent intent = new Intent(this, Disclaimer.class);
        startActivity(intent);
    }

    public void openReferences()
    {
        Intent intent = new Intent(this, References.class);
        startActivity(intent);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    public void openMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
