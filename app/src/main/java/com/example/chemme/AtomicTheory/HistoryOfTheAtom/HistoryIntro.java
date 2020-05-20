package com.example.chemme.AtomicTheory.HistoryOfTheAtom;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.chemme.R;

/**
 * Created by Atharva on 6/5/2018.
 */

public class HistoryIntro extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.generic_slide, container, false);
        TextView txt = (TextView) v.findViewById(R.id.title);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        txt.setTypeface(font);
        TextView txt1 = (TextView) v.findViewById(R.id.content);
        txt1.setTypeface(font);
        return v;
    }
}
