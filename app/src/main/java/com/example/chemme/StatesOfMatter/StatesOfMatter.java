package com.example.chemme.StatesOfMatter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.R;
import com.example.chemme.StatesOfMatter.GasLaws.GasLaws;
import com.example.chemme.StatesOfMatter.GasProperties.GasProperties;
import com.example.chemme.StatesOfMatter.PhaseChanges.PhaseChanges;
import com.example.chemme.StatesOfMatter.SolidStructure.SolidStructure;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class StatesOfMatter extends AppCompatActivity {
    private Button button;
    private Button phasechangesbutton;
    private Button gaslawsbutton;
    private Button gaspropertiesbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_of_matter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar!=null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMain();
                }
            });
        };




        button = findViewById(R.id.solidstructurebutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSolidStructure();
            }
        });
        phasechangesbutton = findViewById(R.id.phasechangesbutton);
        phasechangesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openPhaseChanges();
            }
        });
        gaslawsbutton = findViewById(R.id.  gaslawsbutton);
        gaslawsbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openGasLaws();
            }
        });
        gaspropertiesbutton = findViewById(R.id.  gaspropertiesbutton);
        gaspropertiesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openGasProperties();
            }


        });

    }
    public void openSolidStructure()
    {
        Intent intent = new Intent(this, SolidStructure.class);
        startActivity(intent);
    }
    public void openPhaseChanges()
    {
        Intent intent = new Intent(this, PhaseChanges.class);
        startActivity(intent);
    }
    public void openGasLaws()
    {
        Intent intent = new Intent(this, GasLaws.class);
        startActivity(intent);
    }
    public void openGasProperties()
    {
        Intent intent = new Intent(this, GasProperties.class);
        startActivity(intent);
    }

    public void openMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
