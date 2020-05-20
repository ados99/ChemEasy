package com.example.chemme.MolecularStructure.Bonding;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class ChemicalBonds extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.chemicalbonds, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.chemicalbonds);
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.chemicalbonds2);
        txt1.setTypeface(font);
        return v;
    }
}
