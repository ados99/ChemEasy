package com.example.chemme.StatesOfMatter.GasProperties;

import androidx.fragment.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chemme.R;

/**
 * Created by Atharva on 8/14/2018.
 */

public class GrahamsLaw extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.grahamslaw, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.grahamslaw);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.grahamslaw2);
        txt1.setTypeface(font);
        return v;

    }
}
