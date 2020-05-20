package com.example.chemme.Equilibria;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chemme.Equilibria.AcidsAndBases.AcidsAndBases;
import com.example.chemme.Equilibria.Kinetics.Kinetics;
import com.example.chemme.Equilibria.Solubility.Solubility;
import com.example.chemme.Equilibria.TitrationCurves.TitrationCurves;
import com.example.chemme.R;
import com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy.EnergyEnthalpyAndEntropy;
import com.example.chemme.Thermodynamics.LawsOfThermodynamics.LawsOfThermodynamics;

import org.w3c.dom.Text;

/**
 * Created by Atharva on 8/16/2018.
 */

public class Equilibria extends Activity {
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
        acidsandbasesbutton.setTypeface(myTypeFace);
        acidsandbasesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAcidsAndBases();
            }
        });
        solubilitybutton = findViewById(R.id.solubility);
        solubilitybutton.setTypeface(myTypeFace);
        solubilitybutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSolubility();
            }
        });
        kineticsbutton = findViewById(R.id.kinetics);
        kineticsbutton.setTypeface(myTypeFace);
        titrationcurvebutton= findViewById(R.id.titrationcurves);
        titrationcurvebutton.setTypeface(myTypeFace);
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
        TextView e= findViewById(R.id.equilibria);
        e.setTypeface(myTypeFace);

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
}
