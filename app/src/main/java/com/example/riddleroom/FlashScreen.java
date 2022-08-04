package com.example.riddleroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FlashScreen extends AppCompatActivity {

    ImageView flashLogoImage;
    Animation flashScreenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

        ImageView flashLogo = findViewById(R.id.flashLogo);
        flashLogo.animate().rotation(2000).setDuration(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent nextScreen = new Intent(FlashScreen.this,MainActivity.class);
                startActivity(nextScreen);

                finish();

            }
        },3300);

       flashLogoImage = findViewById(R.id.flashLogo);
       flashScreenAnimation = AnimationUtils.loadAnimation(this,R.anim.flashscreenanim);
       flashLogoImage.setAnimation(flashScreenAnimation);

    }
}