package com.example.chemme.AtomicTheory.ElectronEnergyLevels;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class EnergyLevelsAdapter extends FragmentPagerAdapter {
    public EnergyLevelsAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new EnergyLevels();
            case 1:
                return new PeriodicTableBlocks();
            case 2:
                return new ElectronConfiguration();
            case 3:
                return new QuantumNumbers();
            case 4:
                return new EndSlide(R.color.electronenergylevels, ElectronEnergyLevels.class, "Electron Energy Levels");
        }
        return null;
    }
    public int getCount()
    {
        return 5;
    }
}
