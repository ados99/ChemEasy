package com.example.chemme.AtomicTheory.ElectronEnergyLevels;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.chemme.R;
import com.google.android.material.tabs.TabLayout;

public class ElectronEnergyLevels extends FragmentActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_of_the_atom);
        viewPager = (ViewPager)findViewById(R.id.pager);
        EnergyLevelsAdapter padapter = new EnergyLevelsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(padapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout navbar = findViewById(R.id.navbar);
        tabLayout.setupWithViewPager(viewPager, true);
        navbar.setBackgroundColor(getResources().getColor(0 + R.color.electronenergylevels));
    }


}