package com.example.chemme.AtomicTheory.HistoryOfTheAtom;


import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.chemme.R;
import com.google.android.material.tabs.TabLayout;


public class HistoryOfTheAtom extends FragmentActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_of_the_atom);
        viewPager = findViewById(R.id.pager);
        adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout navbar = findViewById(R.id.navbar);
        tabLayout.setupWithViewPager(viewPager, true);
        navbar.setBackgroundColor(getResources().getColor(0 + R.color.historyoftheatom));

    }


}
