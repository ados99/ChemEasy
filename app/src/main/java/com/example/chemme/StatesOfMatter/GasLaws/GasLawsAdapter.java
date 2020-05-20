package com.example.chemme.StatesOfMatter.GasLaws;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 8/6/2018.
        */

public class GasLawsAdapter extends FragmentPagerAdapter {
    public GasLawsAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new GasesOverview();
            case 1:
                return new CharlesLaw();
            case 2:
                return new BoylesLaw();
            case 3:
                return new AvogadrosLaw();
            case 4:
                return new IdealGasLaw();
            case 5:
                return new EndSlide(R.color.gaslaws, GasLaws.class, "Gas Laws");
        }
        return null;
    }
    public int getCount()
    {
        return 6;
    }
}
