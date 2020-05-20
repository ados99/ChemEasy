package com.example.chemme.Equilibria.TitrationCurves;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 8/6/2018.
        */

public class TitrationCurvesAdapter extends FragmentPagerAdapter {
    public TitrationCurvesAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new IntroToTitrations();
            case 1:
                return new TitrationCurves2();
            case 2:
                return new StrongAcidStrongBaseTitration();
            case 3:
                return new StrongAcidWeakBaseTitration();
            case 4:
                return new WeakAcidStrongBaseTitration();

            case 5:
                return new EndSlide(R.color.titrationcurves, TitrationCurves.class);
        }
        return null;
    }
    public int getCount()
    {
        return 6;
    }
}
