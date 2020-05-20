package com.example.chemme.StatesOfMatter;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

import com.example.chemme.R;
import com.example.chemme.StatesOfMatter.GasLaws.GasLaws;
import com.example.chemme.StatesOfMatter.GasProperties.GasProperties;
import com.example.chemme.StatesOfMatter.PhaseChanges.PhaseChanges;
import com.example.chemme.StatesOfMatter.SolidStructure.SolidStructure;

public class StatesOfMatter extends Activity {
    private Button button;
    private Button phasechangesbutton;
    private Button gaslawsbutton;
    private Button gaspropertiesbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_of_matter);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        TextView myTextView = findViewById(R.id.solidstructurebutton);
        TextView myTextView2 = findViewById(R.id.phasechangesbutton);
        TextView myTextView3 = findViewById(R.id.gaslawsbutton);
        TextView myTextView4 = findViewById(R.id.gaspropertiesbutton);
        TextView myTextView5 = findViewById(R.id.statesofmatter);
        myTextView.setTypeface(myTypeFace);
        myTextView2.setTypeface(myTypeFace);
        myTextView3.setTypeface(myTypeFace);
        myTextView4.setTypeface(myTypeFace);
        myTextView5.setTypeface(myTypeFace);
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
}
