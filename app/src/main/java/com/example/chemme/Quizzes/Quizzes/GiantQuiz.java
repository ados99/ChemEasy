package com.example.chemme.Quizzes.Quizzes;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chemme.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Atharva on 11/14/2019.
 */

public class GiantQuiz extends AppCompatActivity {
    private  GiantQuizLibrary mQuestionLibrary = new GiantQuizLibrary();

    private TextView scoreView;
    private TextView questionView;
    private TextView quizView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private boolean ending = false;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        final String s = intent.getStringExtra("Quiz");
        Map<String, List<Integer>> colors = getColors();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        Toast x = new Toast( GiantQuiz.this);
        quizView = (TextView) findViewById(R.id.periodictablequiz);
        quizView.setBackgroundColor(Color.parseColor(getResources().getString((colors.get(s)).get(0))));
        quizView.setText(s + " Quiz");
        quizView.setTextSize(30);
        final int q = (colors.get(s)).get(1);

        scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText("Score: 0" + "/" + mQuestionLibrary.getLength(q));
        questionView = (TextView) findViewById(R.id.question);
        questionView.setTextSize(25);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "fonts/iceland.regular.ttf");
        choice1.setTypeface(myTypeFace);
        choice2.setTypeface(myTypeFace);
        choice3.setTypeface(myTypeFace);
        choice4.setTypeface(myTypeFace);
        scoreView.setTypeface(myTypeFace);
        questionView.setTypeface(myTypeFace);
        quizView.setTypeface(myTypeFace);
        updateQuestion(q,s);

        //Start of Button Listener for Button1
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in hereif(ending)
                if (choice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    scoreView.setText("Score:" + mScore + "/" + mQuestionLibrary.getLength(q));
                    //This line of code is optiona
                    correctAnswer();
                } else {
                    showRightAnswer();

                }
                updateQuestion(q, s);
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here
                boolean wrong = false;
                if (choice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    scoreView.setText("Score:" + mScore + "/" + mQuestionLibrary.getLength(q));
                    //This line of code is optiona
                    correctAnswer();
                } else {
                    showRightAnswer();

                }
                updateQuestion(q, s);
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here
                if (choice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    scoreView.setText("Score:" + mScore + "/" + mQuestionLibrary.getLength(q));
                    //This line of code is optiona
                    correctAnswer();
                } else {
                    showRightAnswer();

                }
                    updateQuestion(q, s);
            }

        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in hereb
                if (choice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    scoreView.setText("Score:" + mScore + "/" + mQuestionLibrary.getLength(q));
                    //This line of code is optiona
                    correctAnswer();
                } else {
                    showRightAnswer();

                }
                updateQuestion(q, s);
            }
        });

        //End of Button Listener for Button3

    }

    public void correctAnswer()
    {
        Toast.makeText( GiantQuiz.this, "Correct!", Toast.LENGTH_SHORT).show();
    }

    public void showRightAnswer()
    {
        Toast.makeText( GiantQuiz.this, "Wrong: Correct answer was " + mAnswer, Toast.LENGTH_SHORT).show();
    }


    private void updateScore(int point) {
        scoreView.setText("Score: " + mScore + "/4");
    }

    private void updateQuestion(int q, final String s) {
        if (mQuestionNumber < mQuestionLibrary.getLength(q)) {
            questionView.setText(mQuestionLibrary.getQuestion(q,mQuestionNumber));
            choice1.setText(mQuestionLibrary.getChoice1(q,mQuestionNumber));
            choice2.setText(mQuestionLibrary.getChoice2(q,mQuestionNumber));
            choice3.setText(mQuestionLibrary.getChoice3(q,mQuestionNumber));
            choice4.setText(mQuestionLibrary.getChoice4(q,mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(q,mQuestionNumber);
            mQuestionNumber++;
        } else {
            ending = true;
            questionView.setText("Test is over\nYou scored " + mScore + "/"+ mQuestionLibrary.getLength(q) +"\nTry again?");
            choice1.setText("Yes");
            choice1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V)
                {
                    openQuiz(s);
                }
            });
            choice2.setText("No");
            choice2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View V)
                {
                    openQuizzes();
                }
            });
            choice3.setVisibility(View.INVISIBLE);
            choice4.setVisibility(View.INVISIBLE);
            scoreView.setVisibility(View.INVISIBLE);
        }
    }
    public void openQuizzes()
    {
        Intent intent = new Intent(this, QuizzesMenu.class);
        startActivity(intent);
    }
    public void openQuiz(String s)
    {
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz", s);
        startActivity(intent);
    }

    public Map<String, List<Integer>> getColors()
    {
        Map<String, List<Integer>> colors = new HashMap<>();
        colors.put("History of the Atom", new ArrayList<Integer>(){{add(R.color.historyoftheatom); add(0);}});
        colors.put("EM Radiation",new ArrayList<Integer>(){{add(R.color.emradiation); add(1);}});
        colors.put("Periodic Table", new ArrayList<Integer>(){{add(R.color.periodictable); add(2);}});
        colors.put("Periodic Trends",new ArrayList<Integer>(){{add(R.color.periodictrends); add(3);}});
        colors.put("Electron Energy Levels",new ArrayList<Integer>(){{add(R.color.electronenergylevels); add(4);}});
        colors.put("Bonding",new ArrayList<Integer>(){{add(R.color.bonding); add(5);}});
        colors.put("Hybridization",new ArrayList<Integer>(){{add(R.color.hybridization); add(6);}});
        colors.put("Intermolecular Forces",new ArrayList<Integer>(){{add(R.color.imfs); add(7);}});
        colors.put("Solid Structures",new ArrayList<Integer>(){{add(R.color.solidstructures); add(8);}});
        colors.put("Gas Laws",new ArrayList<Integer>(){{add(R.color.gaslaws); add(9);}});
        colors.put("Gas Properties",new ArrayList<Integer>(){{add(R.color.gasproperties); add(10);}});
        colors.put("Laws of Thermodynamics",new ArrayList<Integer>(){{add(R.color.lot); add(11);}});
        colors.put("Spontaneity",new ArrayList<Integer>(){{add(R.color.spontaneity); add(12);}});
        colors.put("Acids and Bases",new ArrayList<Integer>(){{add(R.color.acidsandbases); add(13);}});
        colors.put("Solubility",new ArrayList<Integer>(){{add(R.color.solubility); add(14);}});
        return colors;
    }

}
