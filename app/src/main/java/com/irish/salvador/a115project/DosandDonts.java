package com.irish.salvador.a115project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class DosandDonts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosand_donts);
        Intent mIntent = getIntent();
        String previousActivity= mIntent.getStringExtra("FROM_ACTIVITY");
        if (previousActivity.equals("AG"))   {
            //DOSOMETHING
        }else if (previousActivity.equals("CR")){
            //DOSOMETHING
        }else if (previousActivity.equals("FO")){
            //DOSOMETHING
        }else if (previousActivity.equals("FW")){
            //DOSOMETHING
        }else if (previousActivity.equals("ME")){
            //DOSOMETHING
        }else if (previousActivity.equals("ML")){
            //DOSOMETHING
        }else if (previousActivity.equals("SG")){
            //DOSOMETHING
        }else if (previousActivity.equals("UR")){
            //DOSOMETHING
        }
    }
    public void Activity1Press(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
    }
    public void ActivityBack(View v) {
        finish();
        overridePendingTransition(R.transition.fadein, R.transition.fadeout);
    }
}
