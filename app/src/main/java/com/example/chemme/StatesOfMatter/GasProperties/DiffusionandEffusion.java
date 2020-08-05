package com.example.chemme.StatesOfMatter.GasProperties;

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
 * Created by Atharva on 8/12/2018.
 */

public class DiffusionandEffusion extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Diffusion and Effusion");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.gasproperties)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.setImageDrawable(getResources().getDrawable(R.drawable.diff));
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.em_width);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.diff_content));

        return v;

    }
}
