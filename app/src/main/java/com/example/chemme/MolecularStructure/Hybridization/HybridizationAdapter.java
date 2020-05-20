package com.example.chemme.MolecularStructure.Hybridization;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class HybridizationAdapter extends FragmentPagerAdapter {
    public HybridizationAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new HybridOrbitals();
            case 1:
                return new SigmaBonds();
            case 2:
                return new PiBonds();
            case 3:
                return new EndSlide(R.color.hybridization, Hybridization.class, "Hybridization");
        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
