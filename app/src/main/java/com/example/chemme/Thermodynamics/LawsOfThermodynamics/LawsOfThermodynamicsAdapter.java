package com.example.chemme.Thermodynamics.LawsOfThermodynamics;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 12/31/2019.
 */

public class LawsOfThermodynamicsAdapter extends FragmentPagerAdapter {
    public LawsOfThermodynamicsAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new ZerothLaw();
            case 1:
                return new FirstLaw();
            case 2:
                return new SecondLaw();
            case 3:
                return new ThirdLaw();
            case 4:
                return new EndSlide(R.color.lot, LawsOfThermodynamics.class, "Laws of Thermodynamics");
        }
        return null;
    }
    public int getCount()
    {
        return 5;
    }
}
