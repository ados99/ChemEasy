package com.example.chemme.Equilibria.Kinetics;

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

public class ZerothOrder extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Zeroth Law");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.kinetics)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.setImageDrawable(getResources().getDrawable(R.drawable.zerothorder));
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.zeroth_width);
        im.getLayoutParams().height = (int) getResources().getDimension(R.dimen.zeroth_height);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.zeroth_order_content));

        return v;

    }
}
