package com.example.chemme.About;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chemme.MolecularStructure.MolecularStructure;
import com.example.chemme.R;

import org.w3c.dom.Text;

public class About extends AppCompatActivity {
    private TextView about;
    private Button abouttheappbutton;
    private Button disclaimerbutton;
    private Button referencesbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");

        abouttheappbutton = findViewById(R.id.abouttheapp);
        disclaimerbutton = findViewById(R.id.disclaimer);
        referencesbutton = findViewById(R.id.references);
        about = findViewById(R.id.abouttext);
        abouttheappbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAboutTheApp();
            }
        });
        disclaimerbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openDisclaimer();
            }
        });
        referencesbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openReferences();
            }
        });
        abouttheappbutton.setTypeface(myTypeFace);
        disclaimerbutton.setTypeface(myTypeFace);
        referencesbutton.setTypeface(myTypeFace);
        about.setTypeface(myTypeFace);

    }

    public void openAboutTheApp()
    {
        Intent intent = new Intent(this, AboutTheApp.class);
        startActivity(intent);
    }

    public void openDisclaimer()
    {
        Intent intent = new Intent(this, Disclaimer.class);
        startActivity(intent);
    }

    public void openReferences()
    {
        Intent intent = new Intent(this, References.class);
        startActivity(intent);
    }
}
