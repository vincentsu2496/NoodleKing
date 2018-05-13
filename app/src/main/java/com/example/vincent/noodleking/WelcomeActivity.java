package com.example.vincent.noodleking;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Handler handler = new Handler();
        handler.postDelayed(runnable,3000);
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intentFunction = new Intent(WelcomeActivity.this,MenuActivity.class);
            startActivity(intentFunction);
            WelcomeActivity.this.finish();

            //handler.removeCallbacks(runnable);
            setContentView(R.layout.activity_menu);
            //finish();
        }

    };


}
