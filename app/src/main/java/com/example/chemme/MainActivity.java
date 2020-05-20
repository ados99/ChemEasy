package com.example.chemme;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

import com.example.chemme.About.About;
import com.example.chemme.AtomicTheory.AtomicTheory;
import com.example.chemme.Equilibria.Equilibria;
import com.example.chemme.MolecularStructure.MolecularStructure;
import com.example.chemme.Quizzes.Quizzes.QuizzesMenu;
import com.example.chemme.StatesOfMatter.StatesOfMatter;
import com.example.chemme.Thermodynamics.Thermodynamics;

public class MainActivity extends Activity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");

        button = findViewById(R.id.atomictheorybutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAtomicTheory();
            }
        });
        button.setTypeface(myTypeFace);


        button2 = findViewById(R.id.molecularstructurebutton);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openMolecularStructure();
            }
        });
        button2.setTypeface(myTypeFace);

        button3 = findViewById(R.id.quizzesbutton);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openQuizzes();
            }
        });
        button3.setTypeface(myTypeFace);

        button4 = findViewById(R.id.statesofmatterbutton);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openStatesOfMatter();
            }
        });
        button4.setTypeface(myTypeFace);

        button5 = findViewById(R.id.thermochemistrybutton);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openThermodynamics();
            }
        });
        button5.setTypeface(myTypeFace);

        button7 = findViewById(R.id.aboutbutton);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAbout();
            }
        });
        button7.setTypeface(myTypeFace);

        button6 = findViewById(R.id.equilibriabutton);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEquilibria();
            }
        });
        button6.setTypeface(myTypeFace);

        TextView myTextView6 = findViewById(R.id.aboutbutton);
        TextView myTextView8 = findViewById(R.id.ChemMe);
        myTextView6.setTypeface(myTypeFace);
        myTextView8.setTypeface(myTypeFace);

    }
    public void openAtomicTheory()
    {
        Intent intent = new Intent(this, AtomicTheory.class);
        startActivity(intent);
    }
    public void openMolecularStructure()
    {
        Intent intent = new Intent(this, MolecularStructure.class);
        startActivity(intent);
    }
    public void openQuizzes()
    {
        Intent intent = new Intent(this, QuizzesMenu.class);
        startActivity(intent);
    }
    public void openStatesOfMatter()
    {
        Intent intent = new Intent(this, StatesOfMatter.class);
        startActivity(intent);
    }
    public void openThermodynamics()
    {
        Intent intent = new Intent(this, Thermodynamics.class);
        startActivity(intent);
    }
    public void openEquilibria()
    {
        Intent intent = new Intent(this, Equilibria.class);
        startActivity(intent);
    }

    public void openAbout()
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }



}
