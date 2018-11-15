package com.irish.salvador.a115project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Mangrove extends AppCompatActivity {
    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.icture2);
        TextView tv1 = (TextView)findViewById(R.id.tv_login);
        tv1.setText("Mangrove");
    }


    public void Activity1Press(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void Prev(View v){
        Intent i = new Intent(getApplicationContext(), Forest.class);
        startActivity(i);
    }
    public void Next(View v){
        Intent i = new Intent(getApplicationContext(), FreshWater.class);
        startActivity(i);
    }
}
