package com.example.chemme.MolecularStructure.VSEPR;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class VSEPRAdapter extends FragmentPagerAdapter {
    public VSEPRAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new VSEPRTheory();
            case 1:
                return new VSEPRTable();
            case 2:
                return new VSEPRTable2();
            case 3:
                return new EndSlide(R.color.vsepr, VSEPR.class, "VSEPR");
        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
