package com.example.chemme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chemme.About.About;
import com.example.chemme.AtomicTheory.AtomicTheory;
import com.example.chemme.Equilibria.Equilibria;
import com.example.chemme.MolecularStructure.MolecularStructure;
import com.example.chemme.Quizzes.Quizzes.QuizzesMenu;
import com.example.chemme.StatesOfMatter.StatesOfMatter;
import com.example.chemme.Thermodynamics.Thermodynamics;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class MainActivity extends AppCompatActivity {
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



        button2 = findViewById(R.id.molecularstructurebutton);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openMolecularStructure();
            }
        });


        button3 = findViewById(R.id.quizzesbutton);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openQuizzes();
            }
        });

        button4 = findViewById(R.id.statesofmatterbutton);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openStatesOfMatter();
            }
        });


        button5 = findViewById(R.id.thermochemistrybutton);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openThermodynamics();
            }
        });


        button7 = findViewById(R.id.aboutbutton);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAbout();
            }
        });


        button6 = findViewById(R.id.equilibriabutton);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEquilibria();
            }
        });

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

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }


}
