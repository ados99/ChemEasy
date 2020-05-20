package com.example.chemme.Equilibria.TitrationCurves;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chemme.R;

/**
 * Created by Atharva on 12/27/2019.
 */

public class TitrationCurves2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.titrationcurves2, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.titrationcurves2);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.titrationcurves21);
        txt1.setTypeface(font);
        return v;

    }
}
