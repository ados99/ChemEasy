package com.example.chemme.MolecularStructure.Bonding;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class BondingAdapter extends FragmentPagerAdapter {
    public BondingAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new ChemicalBonds();
            case 1:
                return new IonicBonding();
            case 2:
                return new CovalentBonding();
            case 3:
                return new PolarCovalentBonding();
            case 4:
                return new EndSlide(R.color.bonding, Bonding.class, "Bonding");

        }
        return null;
    }
    public int getCount()
    {
        return 5;
    }
}
