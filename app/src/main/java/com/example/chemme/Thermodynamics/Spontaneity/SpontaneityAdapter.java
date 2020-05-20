package com.example.chemme.Thermodynamics.Spontaneity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 12/31/2019.
 */

public class SpontaneityAdapter extends FragmentPagerAdapter {
    public SpontaneityAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new SpontaneousProcesses();
            case 1:
                return new GibbsFreeEnergy();
            case 2:
                return new GNegative();
            case 3:
                return new EndSlide(R.color.spontaneity, Spontaneity.class,"Spontaneity");
        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
