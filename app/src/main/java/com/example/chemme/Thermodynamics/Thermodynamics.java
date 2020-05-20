package com.example.chemme.Thermodynamics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chemme.R;
import com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy.EnergyEnthalpyAndEntropy;
import com.example.chemme.Thermodynamics.HeatingCurves.HeatingCurves;
import com.example.chemme.Thermodynamics.LawsOfThermodynamics.LawsOfThermodynamics;
import com.example.chemme.Thermodynamics.LawsOfThermodynamics.ZerothLaw;
import com.example.chemme.Thermodynamics.Spontaneity.Spontaneity;

/**
 * Created by Atharva on 8/16/2018.
 */

public class Thermodynamics extends Activity {
    private Button heatingcurvebutton;
    private Button spontbutton;
    private Button lawsbutton;
    private Button energybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermodynamics);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        TextView myTextView4 = findViewById(R.id.thermodynamics);
        myTextView4.setTypeface(myTypeFace);
        heatingcurvebutton = findViewById(R.id.heatingcurves);
        heatingcurvebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHeatingCurves();
            }
        });
        heatingcurvebutton.setTypeface(myTypeFace);
        energybutton = findViewById(R.id.energyenthalpyandentropy);
        energybutton.setTypeface(myTypeFace);
        energybutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEnergy();
            }
        });
        lawsbutton =  findViewById(R.id.thermolaws);
        lawsbutton.setTypeface(myTypeFace);
        lawsbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openLaws();
            }
        });
        spontbutton =  findViewById(R.id.spontaneity);
        spontbutton.setTypeface(myTypeFace);
        spontbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSpontaneity();
            }
        });

    }
    public void openHeatingCurves()
    {
        Intent intent = new Intent(this, HeatingCurves.class);
        startActivity(intent);
    }
    public void openEnergy()
    {
        Intent intent = new Intent(this, EnergyEnthalpyAndEntropy.class);
        startActivity(intent);
    }

    public void openLaws()
    {
        Intent intent = new Intent(this, LawsOfThermodynamics.class);
        startActivity(intent);
    }

    public void openSpontaneity()
    {
        Intent intent = new Intent(this, Spontaneity.class);
        startActivity(intent);
    }
}
