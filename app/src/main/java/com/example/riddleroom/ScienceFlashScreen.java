package com.example.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class ScienceFlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_flash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent nextScreen = new Intent(ScienceFlashScreen.this,QuizTwo.class);
                startActivity(nextScreen);

                finish();

            }
        },3000);


        ImageView ticket = findViewById(R.id.bulbImage);
        ticket.animate().alpha(1).scaleXBy(0.2f).scaleYBy(0.2f).setDuration(2000);
    }
}