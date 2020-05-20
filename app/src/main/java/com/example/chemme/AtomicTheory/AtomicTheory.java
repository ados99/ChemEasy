package com.example.chemme.AtomicTheory;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

import com.example.chemme.AtomicTheory.EMRadiation.EMRadiation;
import com.example.chemme.AtomicTheory.ElectronEnergyLevels.ElectronEnergyLevels;
import com.example.chemme.AtomicTheory.HistoryOfTheAtom.HistoryOfTheAtom;
import com.example.chemme.AtomicTheory.PeriodicTable.PeriodicTable;
import com.example.chemme.AtomicTheory.PeriodicTrends.PeriodicTrends;
import com.example.chemme.R;

public class AtomicTheory extends Activity {
    private Button button;
    private Button periodicbutton;
    private Button trendsbutton;
    private Button emradiationbutton;
    private Button electronenergylevelsbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atomic_theory);
        button = findViewById(R.id.historyoftheatombutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHistoryOfTheAtom();
            }
        });
        periodicbutton = findViewById(R.id.theperiodictablebutton);
        periodicbutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {openPeriodicTable();
            }
        });
        trendsbutton = findViewById(R.id.periodictrendsbutton);
        trendsbutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {openPeriodicTrends();
            }
        });
        emradiationbutton = findViewById(R.id.electromagnetic);
        emradiationbutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {openEMRadiation();
            }
        });
        electronenergylevelsbutton = findViewById(R.id.electonenergylevelsbutton);
        electronenergylevelsbutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View V)
            {openElectronEnergyLevels();
            }
        });




        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        TextView myTextView = findViewById(R.id.historyoftheatombutton);
        myTextView.setTypeface(myTypeFace);
        TextView myTextView2 = findViewById(R.id.theperiodictablebutton);
        myTextView2.setTypeface(myTypeFace);
        TextView myTextView3 = findViewById(R.id.periodictrendsbutton);
        myTextView3.setTypeface(myTypeFace);
        TextView myTextView4 = findViewById(R.id.electonenergylevelsbutton);
        myTextView4.setTypeface(myTypeFace);
        TextView myTextView5 = findViewById(R.id.atomictheory);
        myTextView5.setTypeface(myTypeFace);
        TextView myTextView6 = findViewById(R.id.electromagnetic);
        myTextView6.setTypeface(myTypeFace);
    }

    public void openHistoryOfTheAtom()
    {
        Intent intent = new Intent(this, HistoryOfTheAtom.class);
        startActivity(intent);
    }

    public void openPeriodicTable()
    {
        Intent intent = new Intent(this, PeriodicTable.class);
        startActivity(intent);
    }

    public void openPeriodicTrends()
    {
        Intent intent = new Intent(this, PeriodicTrends.class);
        startActivity(intent);
    }

    public void openEMRadiation()
    {
        Intent intent = new Intent(this, EMRadiation.class);
        startActivity(intent);
    }

    public void openElectronEnergyLevels()
    {
        Intent intent = new Intent(this, ElectronEnergyLevels.class);
        startActivity(intent);
    }



}
