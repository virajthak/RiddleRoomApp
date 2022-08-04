package com.example.riddleroom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizTwo extends AppCompatActivity {

    TextView questionNumber;
    TextView questionTextTwo;
    TextView scoreText;
    ProgressBar progressBarView;

    int mIndex;
    int mQuestion;

    // Track our score
    int mScore;

    // variable to track question number
    int mQuestionNumber=1;

    private QuesAns[] mQuestionBank = new QuesAns[]{new QuesAns(R.string.Question_11,true),
            new QuesAns(R.string.Question_12,false),
            new QuesAns(R.string.Question_13,true),
            new QuesAns(R.string.Question_14,true),
            new QuesAns(R.string.Question_15,false),
            new QuesAns(R.string.Question_16,true),
            new QuesAns(R.string.Question_17,true),
            new QuesAns(R.string.Question_18,false),
            new QuesAns(R.string.Question_19,true),
            new QuesAns(R.string.Question_20,false),
            new QuesAns(R.string.Question_21,true),
            new QuesAns(R.string.Question_22,true),
            new QuesAns(R.string.Question_23,false),
            new QuesAns(R.string.Question_24,true),
            new QuesAns(R.string.Question_25,false),
            new QuesAns(R.string.Question_26,true),
            new QuesAns(R.string.Question_27,false),
            new QuesAns(R.string.Question_28,true),
            new QuesAns(R.string.Question_29,true),
            new QuesAns(R.string.Question_30,false),
            new QuesAns(R.string.Question_31,false),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two);

        questionTextTwo = findViewById(R.id.questionTextTwo);
        mQuestion = mQuestionBank[mIndex].getmQuestionID();
        questionTextTwo.setText(mQuestion);

        questionNumber = findViewById(R.id.questionNumberTwo);
        questionNumber.setText("Q : 1/20");
    }

    public void trueButtonTwo(View view){

        checkAnswer(true);
        updateQuestion();
    }

    public void falseButtonTwo(View view){

        checkAnswer(false);
        updateQuestion();
    }

    private void updateQuestion(){

        scoreText = findViewById(R.id.scoreTextTwo);

        questionNumber = findViewById(R.id.questionNumberTwo);
        mQuestionNumber = mQuestionNumber + 1;
        questionNumber.setText("Q : " + mQuestionNumber + "/20");

        mIndex = (mIndex + 1)%20;
        mQuestion = mQuestionBank[mIndex].getmQuestionID();
        questionTextTwo.setText(mQuestion);

        progressBarView = findViewById(R.id.progressBarTwo);
        progressBarView.incrementProgressBy(5);

        scoreText.setText("Score "+mScore+"/20");

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