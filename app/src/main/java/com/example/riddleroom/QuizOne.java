package com.example.riddleroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class QuizOne extends AppCompatActivity {

    TextView questionNumber;
    TextView questionTextOne;
    TextView scoreTextOne;
    ProgressBar progressBarViewOne;

    int mIndex;
    int mQuestion;

    // Track our score
    int mScore;

    // variable to track question number
    int mQuestionNumber=1;

    private QuesAns[] mQuestionBank = new QuesAns[]{new QuesAns(R.string.Question_1,true),
            new QuesAns(R.string.Question_2,false),
            new QuesAns(R.string.Question_3,true),
            new QuesAns(R.string.Question_4,true),
            new QuesAns(R.string.Question_5,true),
            new QuesAns(R.string.Question_6,true),
            new QuesAns(R.string.Question_7,false),
            new QuesAns(R.string.Question_8,true),
            new QuesAns(R.string.Question_9,true),
            new QuesAns(R.string.Question_10,false)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        questionTextOne = findViewById(R.id.questionTextOne);
        mQuestion = mQuestionBank[mIndex].getmQuestionID();
        questionTextOne.setText(mQuestion);

        questionNumber = findViewById(R.id.questionNumber);
        questionNumber.setText("Q : 1/10");
    }

    public void trueButtonOne(View view){

        checkAnswer(true);
        updateQuestion();

    }

    public void falseButtonOne(View view){

        checkAnswer(false);
        updateQuestion();

    }

    private void updateQuestion(){

        scoreTextOne = findViewById(R.id.scoreTextOne);

        questionNumber = findViewById(R.id.questionNumber);
        mQuestionNumber = mQuestionNumber + 1;
        questionNumber.setText("Q : " + mQuestionNumber + "/10");

        mIndex = (mIndex + 1)%10 ;
        mQuestion = mQuestionBank[mIndex].getmQuestionID();
        questionTextOne.setText(mQuestion);

        progressBarViewOne = findViewById(R.id.progressBarOne);
        progressBarViewOne.incrementProgressBy(10);

        scoreTextOne.setText("Score "+mScore+"/10");

        if (mIndex==0){

            AlertDialog.Builder myAlertBox = new AlertDialog.Builder(this);
            myAlertBox.setTitle("Quiz Ended!");
            myAlertBox.setCancelable(false);
            myAlertBox.setMessage("Congratulations You scored "+mScore+" points.");
            myAlertBox.setPositiveButton("Play Next Quiz", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    finish();

                }
            });

            myAlertBox.show();

        }

    }

    private void checkAnswer(boolean userSelection){

        boolean correctAnswer = mQuestionBank[mIndex].ismAnswer();

        if(userSelection==correctAnswer){

            mScore = mScore + 1;

        }else {



        }

    }
}