package com.example.chemme.Quizzes.Quizzes;

import android.content.Context;
import android.content.res.Resources;

import com.example.chemme.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Atharva on 5/16/2020.
 */

public class GiantQuizLibrary {

    Map<String, String[]> questions = new HashMap<String, String[]>();
    Map<String, String[]> choices = new HashMap<String, String[]>();
    Map<String, String> answers = new HashMap<String, String>();
    public GiantQuizLibrary()
    {
    }

    private String[] getQuestions(String key)
    {
        return questions.get(key);
    }
    private String mQuestions[][] =
            {
                    {"Who was the first scientist to put forth an atomic model?",
                        "What scientist conducted the gold foil experiment?",
                        "Whose model is the most accurate?",
                        "What is the charge of a proton?"},
                    {
                        "What is the distance between two crests/troughs called?",
                        "Which area of the electromagentic spectrum has the highest frequency?",
                        "What constant represents the speed of light?",
                        "What is the fundamental unit of electromagnetic radiation?"},
                    {
                        "Which of these elements is in the alkali metal group?",
                        "Which period is tin(Sn) in?",
                        "Which element is rarely reactive? (hint: has a full valence shell)",
                        "Which of these elements is a metalloid?"},
                    {
                            "Which of these atoms has the largest atomic radius?",
                            "Where the most electronegative atoms found on the periodic table?",
                            "What is ionization energy? It is the minimum energy required to...",
                            "Which of these atoms has the greatest electron affinity?"},
                    {
                            "What is the electron configuration of Magnesium(Mg)?",
                            "Given that n = 3, which of these is a possible value for l?",
                            "In which block would one find Argon(Ag)?",
                    },
                    {
                            "Which of these are formed by ionic bonding?",
                            "What types of elements are involved in ionic bonding?",
                            "What happens in polar covalent bonding?"
                    },
                    {
                            "Which two bonds are formed through Hybridization?",
                            "What type of bonds have exactly one sigma bond?",
                            "How many pi bonds does a triple bond have?"
                    },
                    {
                            "Which IMF is always present?",
                            "What IMF is the strongest of the following?",
                            "Dipole-dipole forces are stronger than which of the following?",
                            "In pure water, what is the strongest IMF present?"
                    },
                    {
                            "Which of these is an ionic solid?",
                            "Which of these is a molecular solid?",
                            "Which of these is a metallic solid?",
                            "Which of these is a network solid?"
                    },
                    {
                            "In a gas, particles are spread the ____ apart and move the ____",
                            "Charles's Law describes the relationship between?",
                            "Which of these have an inverse relationship with pressure?",
                            "What does the R represent in the ideal gas law?"
                    },
                    {
                            "The temperature of a gas is dependent on ___",
                            "Which of these gasses would diffuse the fastest?",
                            "Which of these gasses would diffuse the slowest?"
                    },
                    {
                            "Which thermodynamic law deals with the conservation of energy?",
                            "Which thermodynamic states that if two systems are in thermodynamic equilibrium with" +
                                    "a third one, they are in thermodynamic equilibrium with each other?",
                            "At which temperature would a system have the highest entropy?",

                    },
                    {
                            "A spontaneous process is a process that...",
                            "If delta G is negative, then...",
                            "Under what circumstances is a reaction not spontanous in the forward direction?",

                    },
                    {
                            "What is the conjugate base of nitric acid (HNO₃)?",
                            "If the pOH of a solution is 9.6, what is the pH?",
                            "Which of these is a strong acid?",
                            "Which of these is not a strong base?"
                    },
                    {
                            "Consider a generic reaction A + B -> 2C. What will happen if more of substance A is added?",
                            "Which of these properties when changed affect a reaction?",
                            "In which state of matter does the temperature have no effect on solubility?",
                            "Which equation deals with pressure effects on solubility?"

                    }
            };

    private String mChoices[][][] = {{
            {"Dalton", "Thomson", "Bohr", "Rutherford"},
            {"Dalton", "Schrodinger", "Bohr", "Rutherford"},
            {"Rutherford", "Bohr", "Schrodinger", "Dalton"},
            {"-1", "0", "+1", "+2"}},
            {{"Amplitude", "Wavelength", "Frequency", "Cycle"},
                    {"Ultraviolet light", "Microwaves", "Radio waves", "Cosmic rays"},
                    {"e", "c", "m", "p"},
                    {"Proton", "Photon", "Neutrino", "Electron"}

            },
            {
                    {"Chlorine(Cl)", "Potassium(K)", "Silver(Ag)", "Magnesium(Mg)"},
                    {"2", "3", "4", "5"},
                    {"Helium(He)", "Oxygen(O)", "Nitrogen(N)","Boron(B)"},
                    {"Chlorine(Cl)", "Cobalt(Co)", "Silicon(Si)","Iodine(I)"}

            },
            {
                    {"Sodium(Na)", "Lithium(Li)", "Magnesium(Mg)", "Potassium(K)"},
                    {"Top-right", "Top-left", "Bottom-left", "Bottom-right"},
                    {"remove a valence electron", "break bonds", "add an electron", "change energy state"},
                    {"Carbon(C)", "Nitrogen(N)", "Oxygen(O)", "Fluorine(F)"},

            },
            {
                    {"1s²2s²2p⁶", "1s²2s²2p⁶3s²", "1s²2s²2p⁶3s²3p²", "1s²2s²2p⁶3s²3p⁶4s²"},
                    {"-1", "4", "2", "3"},
                    {"s", "p", "d", "f"}
            },
            {
                    {"CO₂", "NaCl", "BF₃", "CH₄"},
                    {"A metal and nonmetal", "2 metals", "2 nonmetals", "2 semiconductors"},
                    {"Electrons are shared unevenly", "Electrons are transferred", "Electrons are shared evenly", "Electrons are unaffected"}
            },
            {
                    {"Alpha and Beta", "Sigma and Alpha", "Sigma and Pi", "Pi and Ionic"},
                    {"Single", "Double", "Triple", "All of the above"},
                    {"0", "1", "2", "3"}
            },
            {
                    {"London Dispersion Forces", "H-Bonding", "Dipole-Dipole Forces", "Van der Waal's Forces"},
                    {"London Dispersion Forces", "H-Bonding", "Dipole-Dipole Forces", "Ion-dipole forces"},
                    {"London Dispersion Forces", "H-Bonding", "Dipole-Dipole Forces", "Ion-dipole forces"},
                    {"London Dispersion Forces", "H-Bonding", "Dipole-Dipole Forces", "Ion-dipole forces"}

            },
            {
                    {"C", "NaCl", "HCl", "O₂"},
                    {"CO₂", "KCl", "N₂", "Gold"},
                    {"Copper", "Silicon", "Iodine", "Sodium"},
                    {"I₂", "MgO", "SiO₂", "H₂O"}
            },
            {
                    {"farthest, slowest", "farthest, fastest", "nearest, slowest", "nearest, fastest"},
                    {"pressure and temperature", "pressure and volume", "volume and # of moles", "volume and temperature"},
                    {"Temperature", "# of moles", "Volume", "All of the above"},
                    {"# of moles", "Universal gas constant", "Volume", "Temperature"}
            },
            {
                    {"Average kinetic energy", "Average potential energy", "Average total energy", "None of the above"},
                    {"H₂", "O₂", "N₂", "CO"},
                    {"H₂", "O₂", "N₂", "CO₂"}
            },
            {
                    {"zeroth", "first", "second", "third"},
                    {"zeroth", "first", "second", "third"},
                    {"10 K", "20 K", "100 K","200 K"}

            },
            {
                    {"occurs without an external input of energy", "absorbs heat", "releases heat"
                            , "occurs with an external input of energy"},
                    {"reaction is spontaneous in reverse" +
                            "direction", "reaction is in equilibirum", "reaction is endothermic", "reaction is spontaneous in forward direction"},
                    {"positive ΔH and ΔS", "positive ΔH and negative ΔS", "negative ΔH and positive ΔS","negative ΔH and negative ΔS"}

            },
            {
                    {"HNO", "H₂NO₃⁺", "H₃NO₃⁺²", "NO₃⁻"},
                    {"0.4","2.9", "4.4", "6.9"},
                    {"HF", "HNO₂", "HI","HCN"},
                    {"NaOH", "Ca(OH)₂", "KOH", "NH₃"}

            },
            {
                    {"reaction shifts to right to consume A", "reaction shifts to left to consume A",
                            "reaction shifts to right to produce A", "reaction shifts to left to produce A"},
                    {"Temperature", "Pressure", "Concentration of a reaction", "All of the above"},
                    {"Solid", "Liquid", "Gas","None of the above"},
                    {"Avogadro's Law", "Le Chatlier's Principle", "Henry's Law","Charle's Law"}
            }};



    private String mCorrectAnswers[][] = {
            {"Dalton", "Rutherford", "Schrodinger", "+1"},
            {"Wavelength", "Cosmic rays", "c",  "Photon"},
            {"Potassium(K)","5", "Helium(He)", "Silicon(Si)"},
            {"Potassium(K)", "Top-right", "remove a valence electron", "Fluorine(F)"},
            {"1s²2s²2p⁶3s²", "2", "p"},
            {"NaCl", "A metal and nonmetal", "Electrons are shared unevenly"},
            {"Sigma and Pi", "All of the above", "2"},
            {"London Dispersion Forces", "Ion-dipole forces", "London Dispersion Forces", "H-Bonding"},
            {"NaCl", "CO₂", "Copper","SiO₂"},
            {"farthest, fastest", "volume and temperature", "Volume","Universal gas constant"},
            {"Average kinetic energy", "H₂", "CO₂"},
            {"first","zeroth", "negative ΔH and negative ΔS"},
            {"occurs without an external input of energy","reaction is spontaneous in forward direction", "negative ΔH and negative ΔS"},
            {"NO₃⁻","4.4", "HI", "NH₃"},
            {"reaction shifts to right to consume A","All of the above", "Liquid", "Henry's Law"}
    };




    public String getQuestion(int q, int a) {
        String question = mQuestions[q][a];
        return question;
    }


    public String getChoice1(int q, int a) {
        String choice0 = mChoices[q][a][0];
        return choice0;
    }


    public String getChoice2(int q, int a) {
        String choice1 = mChoices[q][a][1];
        return choice1;
    }

    public String getChoice3(int q, int a) {
        String choice2 = mChoices[q][a][2];
        return choice2;
    }

    public String getChoice4(int q,int a) {
        String choice3 = mChoices[q][a][3];
        return choice3;
    }

    public String getCorrectAnswer(int q, int a) {
        String answer = mCorrectAnswers[q][a];
        return answer;
    }

    public int getLength(int q){return mQuestions[q].length;}
}
