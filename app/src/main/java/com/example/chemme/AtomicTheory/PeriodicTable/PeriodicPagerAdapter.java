package com.example.chemme.AtomicTheory.PeriodicTable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class PeriodicPagerAdapter extends FragmentPagerAdapter {
    public PeriodicPagerAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new IntroPeriodicTable();
            case 1:
                return new TheElementSquare();
            case 2:
                return new MetalsvsNonmetals();
            case 3:
                return new GroupsandPeriods();
            case 4:
                return new AlkaliMetals();
            case 5:
                return new AlkalineEarthMetals();
            case 6:
                return new TransitionMetals();
            case 7:
                return new Halogens();
            case 8:
                return new NobleGases();
            case 9:
                return new EndSlide(R.color.periodictable, PeriodicTable.class, "Periodic Table");
            default:
                break;
        }
        return null;
    }
    public int getCount()
    {
        return 10;
    }
}
