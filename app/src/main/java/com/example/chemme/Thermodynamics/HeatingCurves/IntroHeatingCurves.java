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
 * Created by Atharva on 8/17/2018.
 */

public class IntroHeatingCurves extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.introheatingcurves, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.introheatingcurves);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.introheatingcurves2);
        txt1.setTypeface(font);
        return v;

    }
}
