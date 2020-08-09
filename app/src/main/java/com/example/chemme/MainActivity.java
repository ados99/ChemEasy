package com.example.chemme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnQueryTextListener;
import androidx.appcompat.widget.Toolbar;

import com.example.chemme.About.About;
import com.example.chemme.AtomicTheory.AtomicTheory;
import com.example.chemme.AtomicTheory.EMRadiation.EMRadiation;
import com.example.chemme.AtomicTheory.ElectronEnergyLevels.ElectronEnergyLevels;
import com.example.chemme.AtomicTheory.HistoryOfTheAtom.HistoryOfTheAtom;
import com.example.chemme.AtomicTheory.PeriodicTable.PeriodicTable;
import com.example.chemme.AtomicTheory.PeriodicTrends.PeriodicTrends;
import com.example.chemme.Equilibria.AcidsAndBases.AcidsAndBases;
import com.example.chemme.Equilibria.Equilibria;
import com.example.chemme.Equilibria.Kinetics.Kinetics;
import com.example.chemme.Equilibria.Solubility.Solubility;
import com.example.chemme.Equilibria.TitrationCurves.TitrationCurves;
import com.example.chemme.MolecularStructure.Bonding.Bonding;
import com.example.chemme.MolecularStructure.Hybridization.Hybridization;
import com.example.chemme.MolecularStructure.IMFs.IMFs;
import com.example.chemme.MolecularStructure.MolecularStructure;
import com.example.chemme.MolecularStructure.VSEPR.VSEPR;
import com.example.chemme.Quizzes.Quizzes.QuizzesMenu;
import com.example.chemme.StatesOfMatter.GasLaws.GasLaws;
import com.example.chemme.StatesOfMatter.GasProperties.GasProperties;
import com.example.chemme.StatesOfMatter.PhaseChanges.PhaseChanges;
import com.example.chemme.StatesOfMatter.SolidStructure.SolidStructure;
import com.example.chemme.StatesOfMatter.StatesOfMatter;
import com.example.chemme.Thermodynamics.EnergyEnthalpyAndEntropy.EnergyEnthalpyAndEntropy;
import com.example.chemme.Thermodynamics.HeatingCurves.HeatingCurves;
import com.example.chemme.Thermodynamics.LawsOfThermodynamics.LawsOfThermodynamics;
import com.example.chemme.Thermodynamics.Spontaneity.Spontaneity;
import com.example.chemme.Thermodynamics.Thermodynamics;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Toolbar toolbar;
    private TextView noRes;
    ListView lv_listView;
    RelativeLayout r;
    SearchView searchView;
    MenuItem search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Map<String, Entry<Class, Integer>> topics = new HashMap<>();
        topics.put("History of the Atom", new SimpleEntry(new SimpleEntry(HistoryOfTheAtom.class, 0)));
        topics.put("John Dalton", new SimpleEntry(HistoryOfTheAtom.class, 1));
        topics.put("J.J. Thomson", new SimpleEntry(HistoryOfTheAtom.class, 2));
        topics.put("Ernst Rutherford", new SimpleEntry(HistoryOfTheAtom.class, 3));
        topics.put("Niels Bohr", new SimpleEntry(HistoryOfTheAtom.class, 4));
        topics.put("Erwin Schrodinger", new SimpleEntry(HistoryOfTheAtom.class, 5));
        topics.put("Parts of an Atom", new SimpleEntry(HistoryOfTheAtom.class, 6));
        topics.put("Electromagnetic Spectrum", new SimpleEntry(EMRadiation.class,0));
        topics.put("Parts of a Wave", new SimpleEntry(EMRadiation.class,1));
        topics.put("Photons", new SimpleEntry(EMRadiation.class,2));
        topics.put("The Periodic Table", new SimpleEntry(PeriodicTable.class,0));
        topics.put("Element Square", new SimpleEntry(PeriodicTable.class,1));
        topics.put("Metals and Nonmetals", new SimpleEntry(PeriodicTable.class,2));
        topics.put("Groups and Periods", new SimpleEntry(PeriodicTable.class,3));
        topics.put("Alkali Metals", new SimpleEntry(PeriodicTable.class,4));
        topics.put("Alkaline Earth Metals", new SimpleEntry(PeriodicTable.class,5));
        topics.put("Transition Metals", new SimpleEntry(PeriodicTable.class,6));
        topics.put("Halogens", new SimpleEntry(PeriodicTable.class,7));
        topics.put("Noble Gasses", new SimpleEntry(PeriodicTable.class,8));
        topics.put("Atomic Radius", new SimpleEntry(PeriodicTrends.class, 0));
        topics.put("Electronegativity", new SimpleEntry(PeriodicTrends.class, 1));
        topics.put("Ionization Energy", new SimpleEntry(PeriodicTrends.class, 2));
        topics.put("Electron Affinity", new SimpleEntry(PeriodicTrends.class, 3));
        topics.put("Energy Levels", new SimpleEntry(ElectronEnergyLevels.class,0));
        topics.put("Periodic Table Blocks", new SimpleEntry(ElectronEnergyLevels.class,1));
        topics.put("Electron Configuration", new SimpleEntry(ElectronEnergyLevels.class,2));
        topics.put("Quantum Numbers", new SimpleEntry(ElectronEnergyLevels.class,3));
        topics.put("Chemical Bonds", new SimpleEntry(Bonding.class,0));
        topics.put("Ionic Bonding", new SimpleEntry(Bonding.class,1));
        topics.put("Covalent Bonding", new SimpleEntry(Bonding.class,2));
        topics.put("Polar Covalent Bonding", new SimpleEntry(Bonding.class,3));
        topics.put("VSEPR Theory", new SimpleEntry(VSEPR.class,0));
        topics.put("VSEPR Table", new SimpleEntry(VSEPR.class,1));
        topics.put("Hybrid Orbitals", new SimpleEntry(Hybridization.class,0));
        topics.put("Sigma Bonds", new SimpleEntry(Hybridization.class,1));
        topics.put("Pi Bonds", new SimpleEntry(Hybridization.class,2));
        topics.put("Intermolecular Forces",new SimpleEntry(IMFs.class,0));
        topics.put("London Dispersion Forces", new SimpleEntry(IMFs.class,1));
        topics.put("Dipole-Dipole Forces", new SimpleEntry(IMFs.class,2));
        topics.put("Hydrogen Bonding",  new SimpleEntry(IMFs.class,3));
        topics.put("Ion-Dipole Forces", new SimpleEntry(IMFs.class,4));
        topics.put("Solids", new SimpleEntry(SolidStructure.class,0));
        topics.put("Ionic Solids", new SimpleEntry(SolidStructure.class,1));
        topics.put("Molecular Solids", new SimpleEntry(SolidStructure.class,2));
        topics.put("Metallic Solids", new SimpleEntry(SolidStructure.class,3));
        topics.put("Network Solids", new SimpleEntry(SolidStructure.class,4));
        topics.put("Phase Diagrams", new SimpleEntry(PhaseChanges.class,0));
        topics.put("Phase Changes", new SimpleEntry(PhaseChanges.class,1));
        topics.put("Triple Point", new SimpleEntry(PhaseChanges.class,2));
        topics.put("Critical Point",  new SimpleEntry(PhaseChanges.class,3));
        topics.put("Gasses", new SimpleEntry(GasLaws.class,0));
        topics.put("Charles's Law", new SimpleEntry(GasLaws.class,1));
        topics.put("Boyle's Law", new SimpleEntry(GasLaws.class,2));
        topics.put("Avogadro's Law",new SimpleEntry(GasLaws.class,3));
        topics.put("Ideal Gas Law", new SimpleEntry(GasProperties.class,0));
        topics.put("Kinetic Molecular Theory", new SimpleEntry(GasProperties.class,1));
        topics.put("Diffusion", new SimpleEntry(GasProperties.class,1));
        topics.put("Effusion", new SimpleEntry(GasProperties.class,1));
        topics.put("Graham's Law", new SimpleEntry(GasProperties.class,2));
        topics.put("Heating Curves", new SimpleEntry(HeatingCurves.class,0));
        topics.put("Cooling Curves", new SimpleEntry(HeatingCurves.class,1));
        topics.put("Specific Heat", new SimpleEntry(HeatingCurves.class,2));
        topics.put("System and Surroundings", new SimpleEntry(EnergyEnthalpyAndEntropy.class,0));
        topics.put("Energy", new SimpleEntry(EnergyEnthalpyAndEntropy.class,1));
        topics.put("Enthalpy", new SimpleEntry(EnergyEnthalpyAndEntropy.class,2));
        topics.put("Entropy", new SimpleEntry(EnergyEnthalpyAndEntropy.class,3));
        topics.put("Zeroth Law of Thermodynamics", new SimpleEntry(LawsOfThermodynamics.class,0));
        topics.put("First Law of Thermodynamics", new SimpleEntry(LawsOfThermodynamics.class,1));
        topics.put("Second Law of Thermodynamics", new SimpleEntry(LawsOfThermodynamics.class,2));
        topics.put("Third Law of Thermodynamics", new SimpleEntry(LawsOfThermodynamics.class,3));
        topics.put("Spontaneous Processes", new SimpleEntry(Spontaneity.class,0));
        topics.put("Gibbs Free Energy", new SimpleEntry(Spontaneity.class,1));
        topics.put("Negative Delta G", new SimpleEntry(Spontaneity.class,2));
        topics.put("Kinetics", new SimpleEntry(Kinetics.class,0));
        topics.put("Reaction Rates", new SimpleEntry(Kinetics.class,1));
        topics.put("Rate Laws", new SimpleEntry(Kinetics.class,2));
        topics.put("Zero Order", new SimpleEntry(Kinetics.class,3));
        topics.put("First Order", new SimpleEntry(Kinetics.class,4));
        topics.put("Second Order", new SimpleEntry(Kinetics.class,5));
        topics.put("Arrhenius Theory", new SimpleEntry(AcidsAndBases.class,0));
        topics.put("Bronsted-Lowry Definition", new SimpleEntry(AcidsAndBases.class,1));
        topics.put("pH Scale", new SimpleEntry(AcidsAndBases.class,2));
        topics.put("Strong Acid", new SimpleEntry(AcidsAndBases.class,3));
        topics.put("Weak Acid", new SimpleEntry(AcidsAndBases.class,3));
        topics.put("Strong Base", new SimpleEntry(AcidsAndBases.class,4));
        topics.put("Weak Base", new SimpleEntry(AcidsAndBases.class,4));
        topics.put("Neutralization", new SimpleEntry(AcidsAndBases.class,5));
        topics.put("Le Chatlier's Principle", new SimpleEntry(Solubility.class,0));
        topics.put("Solute Solvent Interactions", new SimpleEntry(Solubility.class,1));
        topics.put("Common Ion Effect", new SimpleEntry(Solubility.class,2));
        topics.put("Temperature Effects on Solubility", new SimpleEntry(Solubility.class,3));
        topics.put("Pressure Effects on Solubility", new SimpleEntry(Solubility.class,4));
        topics.put("Titrations", new SimpleEntry(TitrationCurves.class,0));
        topics.put("Titration Curves", new SimpleEntry(TitrationCurves.class,1));
        topics.put("Strong acid - Strong base titration", new SimpleEntry(TitrationCurves.class,2));
        topics.put("Weak base - Strong acid titration", new SimpleEntry(TitrationCurves.class,3));
        topics.put("Weak acid - Strong base titration", new SimpleEntry(TitrationCurves.class,4));


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.topics));
        lv_listView = findViewById(R.id.lv_listView);
        lv_listView.setAdapter(adapter);

        lv_listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(MainActivity.this, topics.get(parent.getItemAtPosition(position).toString()).getKey());
                        intent.putExtra("viewpager_position", topics.get(parent.getItemAtPosition(position).toString()).getValue());
                        startActivity(intent);

                    }
                }

        );
        noRes = findViewById(R.id.tv_emptyTextView);
        lv_listView.setEmptyView(noRes);


        button = findViewById(R.id.atomictheorybutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAtomicTheory();
            }
        });



        button2 = findViewById(R.id.molecularstructurebutton);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openMolecularStructure();
            }
        });


        button3 = findViewById(R.id.quizzesbutton);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openQuizzes();
            }
        });

        button4 = findViewById(R.id.statesofmatterbutton);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openStatesOfMatter();
            }
        });


        button5 = findViewById(R.id.thermochemistrybutton);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openThermodynamics();
            }
        });


        button7 = findViewById(R.id.aboutbutton);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openAbout();
            }
        });


        button6 = findViewById(R.id.equilibriabutton);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V)
            {
                openEquilibria();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        search = menu.findItem(R.id.nav_search);
        searchView = (SearchView) search.getActionView();

        RelativeLayout r = findViewById(R.id.searchView);

        EditText searchEditText = (EditText) searchView.findViewById(R.id.search_src_text);
        searchEditText.setTextSize(30);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.topics));
        lv_listView = findViewById(R.id.lv_listView);
        lv_listView.setAdapter(adapter);

        ImageView closeButton = (ImageView)searchView.findViewById(R.id.search_close_btn);
        searchView.setOnSearchClickListener(new OnClickListener() {
            @Override public void onClick(View v) {
                button.setVisibility(View.GONE);
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                button6.setVisibility(View.GONE);
                button7.setVisibility(View.GONE);
                r.setVisibility(View.VISIBLE);
            } });
        closeButton.setOnClickListener(new OnClickListener() {
            @Override public void onClick(View v) {
                if(searchEditText.length()==0)
                {
                    button.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                    button5.setVisibility(View.VISIBLE);
                    button6.setVisibility(View.VISIBLE);
                    button7.setVisibility(View.VISIBLE);
                    r.setVisibility(View.GONE);
                    searchView.onActionViewCollapsed();
                    search.collapseActionView();
                }
                else{
                    searchEditText.setText("");
                }
            } });


        searchEditText.setTextColor(getResources().getColor(R.color.white));
        searchEditText.setHintTextColor(getResources().getColor(R.color.white));
        searchView.setQueryHint("Search for a topic!");
        // Capture Text in EditText
        searchView.setOnQueryTextListener(new OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;

            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed()
    {
        RelativeLayout r = findViewById(R.id.searchView);
        if(r.getVisibility() == View.VISIBLE){
            button.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);
            button7.setVisibility(View.VISIBLE);
            r.setVisibility(View.GONE);
            searchView.onActionViewCollapsed();
            search.collapseActionView();
        }
        else
        {
            finish();
        }

    }


    public void openAtomicTheory()
    {
        Intent intent = new Intent(this, AtomicTheory.class);
        startActivity(intent);
    }
    public void openMolecularStructure()
    {
        Intent intent = new Intent(this, MolecularStructure.class);
        startActivity(intent);
    }


    public void openQuizzes()
    {
        Intent intent = new Intent(this, QuizzesMenu.class);
        startActivity(intent);
    }
    public void openStatesOfMatter()
    {
        Intent intent = new Intent(this, StatesOfMatter.class);
        startActivity(intent);
    }
    public void openThermodynamics()
    {
        Intent intent = new Intent(this, Thermodynamics.class);
        startActivity(intent);
    }
    public void openEquilibria()
    {
        Intent intent = new Intent(this, Equilibria.class);
        startActivity(intent);
    }

    public void openAbout()
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
