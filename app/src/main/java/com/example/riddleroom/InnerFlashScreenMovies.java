package com.example.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class InnerFlashScreenMovies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_flash_screen_movies);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent nextScreen = new Intent(InnerFlashScreenMovies.this,QuizThree.class);
                startActivity(nextScreen);

                finish();

            }
        },3000);


        ImageView ticket = findViewById(R.id.ticketImageView);
        ticket.animate().alpha(1).scaleXBy(0.7f).scaleYBy(0.6f).setDuration(2000);


    }
}