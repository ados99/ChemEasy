package com.example.chemme;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.chemme.Quizzes.Quizzes.GiantQuiz;

/**
 * Created by Atharva on 6/8/2018.
 */

public class EndSlide extends Fragment {
    private Button choice1;
    private Button choice2;
    private Button choice3;
    int color;
    Class beginning;
    String topic;

    public EndSlide(int color, Class beginning,String topic)
    {
        this.color = color;
        this.beginning = beginning;
        this.topic = topic;
    }

    public EndSlide(int color, Class beginning)
    {
        this.color = color;
        this.beginning = beginning;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.endslide, container, false);
        choice1 = (Button) v.findViewById(R.id.choice1);
        if(this.topic==null)
        {
            choice1.setVisibility(View.GONE);
        }
        else
        {
            choice1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View V) {
                    openQuiz();
                }
            });
        }


        choice2 = (Button) v.findViewById(R.id.choice2);
        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                openElectronEnergyLevels();
            }
        });
        choice3 = (Button) v.findViewById(R.id.choice3);
        choice3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                openMainActivity();
            }
        });
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/iceland.regular.ttf");
        TextView txt = (TextView) v.findViewById(R.id.question);
        txt.setTypeface(font);
        choice1.setTypeface(font);
        choice2.setTypeface(font);
        choice3.setTypeface(font);
        TextView txt4 = (TextView) v.findViewById(R.id.endofsection);
        txt4.setTypeface(font);
        txt4.setBackgroundColor(Color.parseColor(getResources().getString(this.color)));
        return v;

    }

    public void openQuiz() {
        Intent intent = new Intent(getActivity(), GiantQuiz.class);
        intent.putExtra("Quiz",this.topic);
        startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }

    public void openElectronEnergyLevels() {
        Intent intent = new Intent(getActivity(), this.beginning);
        startActivity(intent);
    }
}