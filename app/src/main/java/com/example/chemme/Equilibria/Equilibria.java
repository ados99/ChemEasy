package com.example.chemme.Equilibria;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.Equilibria.AcidsAndBases.AcidsAndBases;
import com.example.chemme.Equilibria.Kinetics.Kinetics;
import com.example.chemme.Equilibria.Solubility.Solubility;
import com.example.chemme.Equilibria.TitrationCurves.TitrationCurves;
import com.example.chemme.MainActivity;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

/**
 * Created by Atharva on 8/16/2018.
 */

public class Equilibria extends AppCompatActivity {
    private Button kineticsbutton;
    private Button acidsandbasesbutton;
    private Button solubilitybutton;
    private Button titrationcurvebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilibria);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        acidsandbasesbutton = findViewById(R.id.acidsandbases);

        acidsandbasesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAcidsAndBases();
            }
        });
        solubilitybutton = findViewById(R.id.solubility);

        solubilitybutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSolubility();
            }
        });
        kineticsbutton = findViewById(R.id.kinetics);

        titrationcurvebutton= findViewById(R.id.titrationcurves);

        titrationcurvebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openTitrationCurves();
            }
        });
        kineticsbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openKinetics();
            }
        });

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
    }
    public void openKinetics()
    {
        Intent intent = new Intent(this, Kinetics.class);
        startActivity(intent);
    }
    public void openAcidsAndBases()
    {
        Intent intent = new Intent(this, AcidsAndBases.class);
        startActivity(intent);
    }
    public void openSolubility()
    {
        Intent intent = new Intent(this, Solubility.class);
        startActivity(intent);
    }
    public void openTitrationCurves()
    {
        Intent intent = new Intent(this, TitrationCurves.class);
        startActivity(intent);
    }
    /*
    public void openEnergy()
    {
        Intent intent = new Intent(this, EnergyEnthalpyAndEntropy.class);
        startActivity(intent);
    }

    public void openLaws()
    {
        Intent intent = new Intent(this, LawsOfThermodynamics.class);
        startActivity(intent);
    }*/
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
    public void openMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        finish();
    }

}
