package com.example.chemme.MolecularStructure;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

import com.example.chemme.MolecularStructure.Bonding.Bonding;
import com.example.chemme.MolecularStructure.Hybridization.Hybridization;
import com.example.chemme.MolecularStructure.IMFs.IMFs;
import com.example.chemme.MolecularStructure.VSEPR.VSEPR;
import com.example.chemme.R;

public class MolecularStructure extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        Button vseprbutton;
        Button imfsbutton;
        Button hybridizationbutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molecular_structure);

        button = findViewById(R.id.bondingbutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openBonding();
            }
        });

        vseprbutton = findViewById(R.id.vseprbutton);
        vseprbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openVSEPR();
            }
        });

        imfsbutton = findViewById(R.id.imfbutton);
        imfsbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openIMFs();
            }
        });

        hybridizationbutton = findViewById(R.id.hybridizationbutton);
        hybridizationbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHybridization();
            }
        });


        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        TextView myTextView = findViewById(R.id.bondingbutton);
        myTextView.setTypeface(myTypeFace);
        TextView myTextView2 = findViewById(R.id.vseprbutton);
        myTextView2.setTypeface(myTypeFace);
        TextView myTextView3 = findViewById(R.id.hybridizationbutton);
        myTextView3.setTypeface(myTypeFace);
        TextView myTextView4 = findViewById(R.id.imfbutton);
        myTextView4.setTypeface(myTypeFace);
        TextView myTextView5 = findViewById(R.id.molecularstructure);
        myTextView5.setTypeface(myTypeFace);

    }
    public void openBonding()
    {
        Intent intent = new Intent(this, Bonding.class);
        startActivity(intent);
    }
    public void openVSEPR()
    {
        Intent intent = new Intent(this, VSEPR.class);
        startActivity(intent);
    }
    public void openIMFs()
    {
        Intent intent = new Intent(this, IMFs.class);
        startActivity(intent);
    }
    public void openHybridization()
    {
        Intent intent = new Intent(this, Hybridization.class);
        startActivity(intent);
    }
}
