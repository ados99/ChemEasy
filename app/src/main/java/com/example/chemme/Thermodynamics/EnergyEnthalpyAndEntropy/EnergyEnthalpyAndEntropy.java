package com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.chemme.R;
import com.google.android.material.tabs.TabLayout;

;

/**
 * Created by Atharva on 12/27/2019.
 */

public class EnergyEnthalpyAndEntropy extends FragmentActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_of_the_atom);
        viewPager = (ViewPager)findViewById(R.id.pager);
        EnergyEnthalpyAndEntropyAdapter padapter = new EnergyEnthalpyAndEntropyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(padapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        TabLayout navbar = findViewById(R.id.navbar);
        tabLayout.setupWithViewPager(viewPager, true);
        navbar.setBackgroundColor(getResources().getColor(0 + R.color.eee));
    }
}
