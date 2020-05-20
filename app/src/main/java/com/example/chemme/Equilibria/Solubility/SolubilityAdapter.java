package com.example.chemme.Equilibria.Solubility;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.AtomicTheory.ElectronEnergyLevels.ElectronEnergyLevels;
import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 8/6/2018.
        */

public class SolubilityAdapter extends FragmentPagerAdapter {
    public SolubilityAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new LeChatliersPrinciple();
            case 1:
                return new SoluteSolventInteractions();
            case 2:
                return new CommonIonEffect();
            case 3:
                return new TemperatureSolubility();
            case 4:
                return new PressureSolubility();
            case 5:
                return new EndSlide(R.color.solubility, Solubility.class, "Solubility");
        }
        return null;
    }
    public int getCount()
    {
        return 6;
    }
}
