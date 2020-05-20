package com.example.chemme.AtomicTheory.HistoryOfTheAtom;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm)
    {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new HistoryIntro();
            case 1:
                return new Dalton();
            case 2:
                return new Thomson();
            case 3:
                return new Rutherford();
            case 4:
                return new Bohr();
            case 5:
                return new Schrodinger();
            case 6:
                return new PartsOfAnAtom();
            case 7:
                return new EndSlide(R.color.historyoftheatom, HistoryOfTheAtom.class, "History of the Atom");
            default:
                break;
        }
        return null;
    }
    public int getCount()
    {
        return 8;
    }
}
