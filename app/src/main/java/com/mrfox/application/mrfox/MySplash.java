package com.mrfox.application.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    private ImageView imgLogo;
    private TextView myTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        imgLogo = (ImageView) findViewById(R.id.imgFox);
        myTitle = (TextView)findViewById(R.id.tvName);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);

        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);
        myTitle.startAnimation(miAnimacion);


        openApp();
    }

    private void openApp() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash.this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
