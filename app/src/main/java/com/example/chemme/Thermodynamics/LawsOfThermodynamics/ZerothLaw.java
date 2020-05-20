package com.example.chemme.Thermodynamics.LawsOfThermodynamics;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.chemme.R;

/**
 * Created by Atharva on 12/31/2019.
 */

public class ZerothLaw extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.zerothlaw, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.zerothlaw);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.zerothlaw1);
        txt1.setTypeface(font);
        return v;
    }
}
