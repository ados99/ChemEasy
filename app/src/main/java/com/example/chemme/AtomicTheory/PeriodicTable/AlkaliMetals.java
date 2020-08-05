package com.example.chemme.AtomicTheory.PeriodicTable;

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
 * Created by Atharva on 6/8/2018.
 */

public class AlkaliMetals extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Alkali Metals");

        txt.setBackgroundColor(Color.parseColor(getResources().getString(0+R.color.periodictable)));
        ImageView im = (ImageView)v.findViewById(R.id.image);
        im.requestLayout();
        im.getLayoutParams().width = (int) getResources().getDimension(R.dimen.periodic_table_width);
        im.setImageDrawable(getResources().getDrawable(R.drawable.alkalimetals));
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.alkali_metals_content));

        return v;
    }
}