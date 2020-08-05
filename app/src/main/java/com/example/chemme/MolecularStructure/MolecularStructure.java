package com.example.chemme.MolecularStructure;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.MolecularStructure.Bonding.Bonding;
import com.example.chemme.MolecularStructure.Hybridization.Hybridization;
import com.example.chemme.MolecularStructure.IMFs.IMFs;
import com.example.chemme.MolecularStructure.VSEPR.VSEPR;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class MolecularStructure extends AppCompatActivity {

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

        TextView myTextView2 = findViewById(R.id.vseprbutton);

        TextView myTextView3 = findViewById(R.id.hybridizationbutton);

        TextView myTextView4 = findViewById(R.id.imfbutton);

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
        }


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

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
    public void openMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
