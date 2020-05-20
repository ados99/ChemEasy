package com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;


/**
 * Created by Atharva on 8/17/2018.
 */

public class EnergyEnthalpyAndEntropyAdapter extends FragmentPagerAdapter {
    public EnergyEnthalpyAndEntropyAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new SystemAndSurroundings();
            case 1:
                return new Energy();
            case 2:
                return new Enthalpy();
            case 3:
                return new Entropy();
            case 4:
                return new EndSlide(R.color.eee, EnergyEnthalpyAndEntropy.class);
        }
        return null;
    }
    public int getCount()
    {
        return 5;
    }
}
