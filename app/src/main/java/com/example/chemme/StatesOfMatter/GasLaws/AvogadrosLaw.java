package com.example.chemme.StatesOfMatter.GasLaws;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chemme.R;


/**
 * Created by Atharva on 8/9/2018.
 */

public class AvogadrosLaw extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.avogadroslaw, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.avogadroslaw);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.avogadroslaw2);
        txt1.setTypeface(font);
        return v;

    }
}
