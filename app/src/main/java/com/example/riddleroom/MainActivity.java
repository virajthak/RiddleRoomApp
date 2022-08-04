package com.example.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   ImageView firstOneClick;
   ImageView secondOneClick;
   ImageView thirdOnClick;
   ImageView startOnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOneClick = findViewById(R.id.imageViewOne);
        firstOneClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTwo();
            }
        });

        secondOneClick = findViewById(R.id.imageViewTwo);
        secondOneClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityThree();
            }
        });

        thirdOnClick = findViewById(R.id.imageViewThree);
        thirdOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityFour();
            }
        });

        startOnClick = findViewById(R.id.startImageView);
        startOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openFirstQuiz();
            }
        });


    }
    public void openActivityTwo(){
        Intent intent = new Intent(this,SuperheroFlashScreen.class);
        startActivity(intent);
    }

    public void openActivityThree(){
        Intent intent = new Intent(this,ScienceFlashScreen.class);
        startActivity(intent);
    }

    public void openActivityFour(){
        Intent intent = new Intent(this,InnerFlashScreenMovies.class);
        startActivity(intent);
    }

    public void openFirstQuiz(){
        Intent intent = new Intent(this,SuperheroFlashScreen.class);
        startActivity(intent);
    }


}