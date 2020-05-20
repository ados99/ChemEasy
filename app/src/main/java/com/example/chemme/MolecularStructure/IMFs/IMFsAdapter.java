package com.example.chemme.MolecularStructure.IMFs;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class IMFsAdapter extends FragmentPagerAdapter {
    public IMFsAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new IntermolecularForces();
            case 1:
                return new LondonDispersionForces();
            case 2:
                return new DipoleDipoleForces();
            case 3:
                return new HBonding();
            case 4:
                return new IonDipoleForces();
            case 5:
                return new EndSlide(R.color.imfs, IMFs.class, "Intermolecular Forces");

        }
        return null;
    }
    public int getCount()
    {
        return 6;
    }
}
