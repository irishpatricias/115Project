package com.irish.salvador.a115project;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);

        }
    };
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish();
            moveTaskToBack(true); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
    public void ForestActivity(View v){
        Intent i = new Intent(getApplicationContext(), Forest.class);
        startActivity(i);
    }
    public void MangroveActivity(View v){
        Intent i = new Intent(getApplicationContext(), Mangrove.class);
        startActivity(i);
    }
    public void FreshWaterActivity(View v){
        Intent i = new Intent(getApplicationContext(), FreshWater.class);
        startActivity(i);
    }
    public void UrbanActivity(View v){
        Intent i = new Intent(getApplicationContext(), Urban.class);
        startActivity(i);
    }
    public void CoralReefActivity(View v){
        Intent i = new Intent(getApplicationContext(), CoralReef.class);
        startActivity(i);
    }
    public void AgriculturalActivity(View v){
        Intent i = new Intent(getApplicationContext(), Agricultural.class);
        startActivity(i);
    }
    public void SeagrassActivity(View v){
        Intent i = new Intent(getApplicationContext(), Seagrass.class);
        startActivity(i);
    }
    public void MarginalActivity(View v){
        Intent i = new Intent(getApplicationContext(), Marginal.class);
        startActivity(i);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = findViewById(R.id.rellay1);
        rellay2 = findViewById(R.id.rellay2);
        handler.postDelayed(runnable, 3000); //2000 is the timeout for the splash
    }
}
