package com.example.chemme.StatesOfMatter.SolidStructure;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/* Created by Atharva on 6/5/2018.
        */

public class SolidStructureAdapter extends FragmentPagerAdapter {
    public SolidStructureAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new Solids();
            case 1:
                return new IonicSolids();
            case 2:
                return new MolecularSolids();
            case 3:
                return new MetallicSolids();
            case 4:
                return new NetworkSolids();
            case 5:
                return new EndSlide(R.color.solidstructures, SolidStructure.class, "Solid Structures");
        }
        return null;
    }
    public int getCount()
    {
        return 6;
    }
}
