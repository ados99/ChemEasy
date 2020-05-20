package com.example.chemme.StatesOfMatter.PhaseChanges;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class PhaseChangesAdapter extends FragmentPagerAdapter {
    public PhaseChangesAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new PhaseDiagram();
            case 1:
                return new PhaseChangesTable();
            case 2:
                return new EndSlide(R.color.phasechanges, PhaseChanges.class);
        }
        return null;
    }
    public int getCount()
    {
        return 3;
    }
}
