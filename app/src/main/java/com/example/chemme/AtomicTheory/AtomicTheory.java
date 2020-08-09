package com.example.chemme.AtomicTheory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.AtomicTheory.EMRadiation.EMRadiation;
import com.example.chemme.AtomicTheory.ElectronEnergyLevels.ElectronEnergyLevels;
import com.example.chemme.AtomicTheory.HistoryOfTheAtom.HistoryOfTheAtom;
import com.example.chemme.AtomicTheory.PeriodicTable.PeriodicTable;
import com.example.chemme.AtomicTheory.PeriodicTrends.PeriodicTrends;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class AtomicTheory extends AppCompatActivity{
    private Button button;
    private Button periodicbutton;
    private Button trendsbutton;
    private Button emradiationbutton;
    private Button electronenergylevelsbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atomic_theory);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }


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
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
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

    @Override
    public void onBackPressed() {
        finish();
    }

}
