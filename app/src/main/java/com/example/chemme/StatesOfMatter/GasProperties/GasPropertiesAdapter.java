package com.example.chemme.StatesOfMatter.GasProperties;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 8/11/2018.
 */

public class GasPropertiesAdapter extends FragmentPagerAdapter {
    public GasPropertiesAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new KineticMolecularTheory();
            case 1:
                return new DiffusionandEffusion();
            case 2:
                return new GrahamsLaw();
            case 3:
                return new EndSlide(R.color.gasproperties, GasProperties.class, "Gas Properties");

        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
