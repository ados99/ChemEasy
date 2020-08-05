package com.example.chemme.AtomicTheory.HistoryOfTheAtom;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.chemme.R;
import com.google.android.material.tabs.TabLayout;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;


public class HistoryOfTheAtom extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));





        TabLayout navbar = findViewById(R.id.navbar);
        navbar.setupWithViewPager(viewPager, true);
        navbar.setBackgroundColor(getResources().getColor(0 + R.color.historyoftheatom));

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
