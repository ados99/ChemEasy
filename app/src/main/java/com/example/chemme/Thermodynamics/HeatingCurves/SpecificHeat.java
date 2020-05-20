package com.example.chemme.Thermodynamics.HeatingCurves;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chemme.R;
import androidx.fragment.app.Fragment;
/**
 * Created by Atharva on 8/26/2018.
 */

public class SpecificHeat extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.specificheat, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.specificheat);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.specificheat2);
        txt1.setTypeface(font);
        return v;
    }
}
