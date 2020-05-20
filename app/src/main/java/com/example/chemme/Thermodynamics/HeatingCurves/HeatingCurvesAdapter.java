package com.example.chemme.Thermodynamics.HeatingCurves;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;


/**
 * Created by Atharva on 8/17/2018.
 */

public class HeatingCurvesAdapter extends FragmentPagerAdapter {
    public HeatingCurvesAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new IntroHeatingCurves();
            case 1:
                return new CoolingCurves();
            case 2:
                return new SpecificHeat();
            case 3:
                return new EndSlide(R.color.heatingcurves, HeatingCurves.class);
        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
