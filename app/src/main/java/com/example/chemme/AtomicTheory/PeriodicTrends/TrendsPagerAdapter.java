package com.example.chemme.AtomicTheory.PeriodicTrends;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class TrendsPagerAdapter extends FragmentPagerAdapter {
    public TrendsPagerAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new AtomicRadius();
            case 1:
                return new Electronegativity();
            case 2:
                return new IonizationEnergy();
            case 3:
                return new ElectronAffinity();
            case 4:
                return new EndSlide(R.color.periodictrends, PeriodicTrends.class, "Periodic Trends");
            default:
                break;
        }
        return null;
    }
    public int getCount()
    {
        return 5;
    }
}
