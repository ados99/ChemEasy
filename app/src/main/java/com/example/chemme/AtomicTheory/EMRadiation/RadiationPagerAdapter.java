package com.example.chemme.AtomicTheory.EMRadiation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chemme.EndSlide;
import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class RadiationPagerAdapter extends FragmentPagerAdapter {
    public RadiationPagerAdapter(FragmentManager fm)
    {

        super(fm);
    }
    public Fragment getItem(int arg0)
    {
        switch(arg0)
        {
            case 0:
                return new EMSpectrum();
            case 1:
                return new PartsOfWave();
            case 2:
                return new Photon();
            case 3:
                return new EndSlide(R.color.emradiation, EMRadiation.class, "EM Radiation");
            default:
                break;
        }
        return null;
    }
    public int getCount()
    {
        return 4;
    }
}
