package com.example.chemme.Equilibria.Kinetics;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 8/6/2018.
        */

public class KineticsAdapter extends FragmentPagerAdapter {
    public KineticsAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new IntroToKinetics();
            case 1:
                return new ReactionRates();
            case 2:
                return new RateLaws();
            case 3:
                return new ZerothOrder();
            case 4:
                return new FirstOrder();
            case 5:
                return new SecondOrder();
            case 6:
                return new EndSlide(R.color.kinetics, Kinetics.class);
        }
        return null;
    }
    public int getCount()
    {
        return 7;
    }
}
