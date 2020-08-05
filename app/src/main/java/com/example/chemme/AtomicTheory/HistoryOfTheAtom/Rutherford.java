package com.example.chemme.AtomicTheory.HistoryOfTheAtom;


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
 * Created by Atharva on 6/6/2018.
 */

public class Rutherford extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.title);
        txt.setText("Ernst Rutherford");

        ImageView image = (ImageView)v.findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(R.drawable.rutherford));
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setText(getResources().getString(R.string.rutherford_content));

        return v;
    }
}

