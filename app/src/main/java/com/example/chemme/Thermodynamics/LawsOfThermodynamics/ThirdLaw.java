package com.example.chemme.Thermodynamics.LawsOfThermodynamics;

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
 * Created by Atharva on 12/31/2019.
 */

public class ThirdLaw extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Third Law");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.lot)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.setImageDrawable(getResources().getDrawable(R.drawable.thirdlaw));
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.em_width);
        im.getLayoutParams().height = (int) getResources().getDimension(R.dimen.pb_height);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.third_law_content));

        return v;
    }
}
