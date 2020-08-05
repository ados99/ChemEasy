package com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy;

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
 * Created by Atharva on 12/27/2019.
 */

public class Entropy extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Entropy");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.eee)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.setImageDrawable(getResources().getDrawable(R.drawable.entropy));
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.em_width);
        im.getLayoutParams().height = (int) getResources().getDimension(R.dimen.em_height);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.entropy_content));

        return v;

    }
}
