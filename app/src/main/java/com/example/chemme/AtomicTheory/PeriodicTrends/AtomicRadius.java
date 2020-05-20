package com.example.chemme.AtomicTheory.PeriodicTrends;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.chemme.R;

/**
 * Created by Atharva on 6/6/2018.
 */

public class AtomicRadius extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.atomicradius, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.atomicradius);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.atomicradius1);
        txt1.setTypeface(font);
        return v;
    }
}