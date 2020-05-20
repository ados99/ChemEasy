package com.example.chemme.Equilibria.AcidsAndBases;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 8/6/2018.
        */

public class AcidsAndBasesAdapter extends FragmentPagerAdapter {
    public AcidsAndBasesAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new ArrheniusDefinition();
            case 1:
                return new BronstedLowryDefinition();
            case 2:
                return new PHScale();
            case 3:
                return new StrongAndWeakAcids();
            case 4:
                return new StrongAndWeakBases();
            case 5:
                return new Neutralization();
            case 6:
                return new EndSlide(R.color.acidsandbases, AcidsAndBases.class, "Acids and Bases");
        }
        return null;
    }
    public int getCount()
    {
        return 7;
    }
}
