package com.example.chemme.Thermodynamics;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.R;
import com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy.EnergyEnthalpyAndEntropy;
import com.example.chemme.Thermodynamics.HeatingCurves.HeatingCurves;
import com.example.chemme.Thermodynamics.LawsOfThermodynamics.LawsOfThermodynamics;
import com.example.chemme.Thermodynamics.Spontaneity.Spontaneity;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

/**
 * Created by Atharva on 8/16/2018.
 */

public class Thermodynamics extends AppCompatActivity {
    private Button heatingcurvebutton;
    private Button spontbutton;
    private Button lawsbutton;
    private Button energybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermodynamics);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");

        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMain();
                }});
            }

        heatingcurvebutton = findViewById(R.id.heatingcurves);
        heatingcurvebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHeatingCurves();
            }
        });

        energybutton = findViewById(R.id.energyenthalpyandentropy);

        energybutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEnergy();
            }
        });
        lawsbutton =  findViewById(R.id.thermolaws);

        lawsbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openLaws();
            }
        });
        spontbutton =  findViewById(R.id.spontaneity);

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

    public void openMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openSpontaneity()
    {
        Intent intent = new Intent(this, Spontaneity.class);
        startActivity(intent);
    }
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
