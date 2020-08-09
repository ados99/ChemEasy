package com.example.chemme.Quizzes.Quizzes;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chemme.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

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
    private Button[] buttons;
    private boolean ending = false;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    final String RED = "#ad1100";
    final String GREEN = "#33a813";

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

        buttons = new Button[4];
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);

        buttons[0] = choice1;
        buttons[1] = choice2;
        buttons[2] = choice3;
        buttons[3] = choice4;


        updateQuestion(q,s);

        for(Button b: buttons)
        {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //My logic for Button goes in hereif(ending)
                    b.setTextColor(Color.WHITE);
                    if (b.getText() == mAnswer) {
                        b.setBackgroundColor(Color.parseColor(GREEN));
                        mScore = mScore + 1;
                        updateScore(mScore);
                        scoreView.setText("Score: " + mScore + "/" + mQuestionLibrary.getLength(q));
                        //This line of code is optiona
                        correctAnswer();
                    } else {
                        b.setBackgroundColor(Color.parseColor(RED));
                        showRightAnswer();
                    }
                    for(Button c:buttons)
                    {
                        if(c.getText() == mAnswer)
                        {
                            c.setBackgroundColor(Color.parseColor(GREEN));
                            c.setTextColor(Color.WHITE);
                        }
                        c.setEnabled(false);
                    }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        for(Button c:buttons)
                        {
                            c.setEnabled(true);
                            c.setBackgroundColor(Color.WHITE);
                            c.setTextColor(Color.BLACK);
                        }
                        updateQuestion(q, s);
                    }
                },2000);

                }
            });
        }

    }

    public void correctAnswer()
    {

        Toast toast = Toast.makeText( GiantQuiz.this, "Correct!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextColor(Color.GREEN);
        handleToast(toast);
    }

    public void showRightAnswer()
    {
        Toast toast = Toast.makeText( GiantQuiz.this, "Wrong: Correct answer was " + mAnswer, Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextColor(Color.RED);
        handleToast(toast);
    }


    private void updateScore(int point) {
        scoreView.setText("Score:  " + mScore + "/4");
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
        finish();
        Intent intent = new Intent(this, QuizzesMenu.class);
        startActivity(intent);
    }
    public void openQuiz(String s)
    {
        finish();
        Intent intent = new Intent(this, GiantQuiz.class);
        intent.putExtra("Quiz", s);
        startActivity(intent);
    }

    public void handleToast(Toast toast)
    {
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        View view = toast.getView();
        view.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
        toastTV.setTextSize(25);
        toast.setGravity(Gravity.BOTTOM, 0, 95);
        toast.show();
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

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
    @Override
    public void onBackPressed() {
        finish();
    }

}
