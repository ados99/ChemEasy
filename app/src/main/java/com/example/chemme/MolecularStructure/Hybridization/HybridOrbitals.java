package com.example.chemme.MolecularStructure.Hybridization;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.chemme.R;

/**
 * Created by Atharva on 7/22/2018.
 */

public class HybridOrbitals extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Hybrid Orbitals");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.hybridization)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.setImageDrawable(getResources().getDrawable(R.drawable.hybridorbitals));
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.em_width);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.hybrid_orbitals_content));

        return v;
    }
}
