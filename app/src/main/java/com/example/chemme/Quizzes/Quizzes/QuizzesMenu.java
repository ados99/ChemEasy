package com.example.chemme.Quizzes.Quizzes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.MainActivity;
import com.example.chemme.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;


public class QuizzesMenu extends AppCompatActivity {
    private Button periodictablequizbutton;
    private Button bondingquizbutton;
    private Button periodictrendsquizbutton;
    private Button imfsquizbutton;
    private Button historyoftheatomquizbutton;
    private Button emradiationquizbutton;
    private Button electronenergylevelsquizbutton;
    private Button hybridizationquizbutton;
    private Button solidstructuresquizbutton;
    private Button gaslawsquizbutton;
    private Button gaspropertiesquizbutton;
    private Button spontaneityquizbutton;
    private Button lotquizbutton;
    private Button acidsandbasesquizbutton;
    private Button solubilityquizbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes_menu);
        periodictablequizbutton = findViewById(R.id.periodictablequizbutton);
        periodictablequizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openPeriodicTableQuiz();
            }
        });
        bondingquizbutton = findViewById(R.id.bondingquizbutton);
        bondingquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openBondingQuiz();
            }
        });
        periodictrendsquizbutton = findViewById(R.id.periodictrendsquizbutton);
        periodictrendsquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openPeriodicTrendsQuiz();
            }
        });
        historyoftheatomquizbutton = findViewById(R.id.historyoftheatombuttonquizbutton);
        historyoftheatomquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHistoryoftheAtomQuiz();
            }
        });
        imfsquizbutton = findViewById(R.id.imfsquizbutton);
        imfsquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openIMFSQuiz();
            }
        });
        emradiationquizbutton = findViewById(R.id.emradiationquizbutton);
        emradiationquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEMRadiationQuiz();
            }
        });
        electronenergylevelsquizbutton = findViewById(R.id.electronenergylevelsquizbutton);
        electronenergylevelsquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openElectronEnergyLevelsQuiz();
            }
        });
        hybridizationquizbutton = findViewById(R.id.hybridizationquizbutton);
        hybridizationquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openHybridizationQuiz();
            }
        });
        solidstructuresquizbutton = findViewById(R.id.solidstructuresquizbutton);
        solidstructuresquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSolidStructuresQuiz();
            }
        });
        gaslawsquizbutton = findViewById(R.id.gaslawsquizbutton);
        gaslawsquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openGasLawsQuiz();
            }
        });
        gaspropertiesquizbutton = findViewById(R.id.gaspropertiesquizbutton);
        gaspropertiesquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openGasPropertiesQuiz();
            }
        });
        spontaneityquizbutton = findViewById(R.id.spontaneityquizbutton);
        spontaneityquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSpontaneityQuiz();
            }
        });
        lotquizbutton = findViewById(R.id.lotquizbutton);
        lotquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openLOTQuiz();
            }
        });

        acidsandbasesquizbutton = findViewById(R.id.acidsandbasesquizbutton);
        acidsandbasesquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAcidsAndBasesQuiz();
            }
        });

        solubilityquizbutton = findViewById(R.id.solubilityquizbutton);
        solubilityquizbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openSolubilityQuiz();
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
                    openMain();
                }
            });
        }

    }
    public void openPeriodicTableQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Periodic Table");
        startActivity(intent);
    }
    public void openBondingQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Bonding");
        startActivity(intent);
    }
    public void openPeriodicTrendsQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Periodic Trends");
        startActivity(intent);
    }
    public void openIMFSQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Intermolecular Forces");
        startActivity(intent);
    }
    public void openHistoryoftheAtomQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","History of the Atom");
        startActivity(intent);
    }
    public void openEMRadiationQuiz()
    {
        finish();
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","EM Radiation");
        startActivity(intent);
    }

   public void openElectronEnergyLevelsQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Electron Energy Levels");
        startActivity(intent);
    }
    public void openHybridizationQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Hybridization");
        startActivity(intent);
    }
    public void openSolidStructuresQuiz()
    {

        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Solid Structures");
        startActivity(intent);
    }
    public void openGasLawsQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Gas Laws");
        startActivity(intent);
    }
    public void openGasPropertiesQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Gas Properties");
        startActivity(intent);
    }
    public void openSpontaneityQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Spontaneity");
        startActivity(intent);
    }
    public void openLOTQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Laws of Thermodynamics");
        startActivity(intent);
    }
    public void openAcidsAndBasesQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Acids and Bases");
        startActivity(intent);
    }
    public void openSolubilityQuiz()
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz","Solubility");
        startActivity(intent);
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
    public void openMain()
    {
        finish();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
