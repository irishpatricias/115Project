package com.irish.salvador.a115project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.*;
import android.view.View;
import java.io.*;
import java.nio.charset.Charset;
import android.content.Intent;

public class Facts extends AppCompatActivity {
    private final Charset charset = Charset.forName("UTF-8");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        Intent mIntent = getIntent();
        String previousActivity= mIntent.getStringExtra("FROM_ACTIVITY");
        if (previousActivity.equals("AG"))   {
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts1.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("CR")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts2.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("FO")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts3.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("FW")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts4.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("ME")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts5.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("ML")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts6.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("SG")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts7.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }else if (previousActivity.equals("UR")){
            TextView aaa = findViewById(R.id.aaa);
            try {
                InputStream one = getApplicationContext().getAssets().open("facts8.txt");
                aaa.setText(convert(one, charset));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
    private String convert(InputStream inputStream, Charset charset) {

        try {
            Scanner scanner = new Scanner(inputStream, charset.name());
            return scanner.useDelimiter("\\A").next();
        }catch(Exception e){
            e.printStackTrace();
            return "error";
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
