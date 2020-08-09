package com.example.chemme.AtomicTheory.PeriodicTrends;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.chemme.R;
import com.google.android.material.tabs.TabLayout;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class PeriodicTrends extends AppCompatActivity {
    ViewPager viewPager;
    TrendsPagerAdapter padapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        viewPager = (ViewPager)findViewById(R.id.pager);
        padapter = new TrendsPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(padapter);


        Bundle extras = getIntent().getExtras();
        int position = 0;
        if(extras != null) {
            position = extras.getInt("viewpager_position");
            viewPager.setCurrentItem(position);
        }

        TabLayout navbar = findViewById(R.id.navbar);
        navbar.setupWithViewPager(viewPager, true);
        navbar.setBackgroundColor(getResources().getColor(0 + R.color.periodictrends));

        ImageButton back = findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}

