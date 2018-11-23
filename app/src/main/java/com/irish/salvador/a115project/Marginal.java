package com.irish.salvador.a115project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
public class Marginal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView3 =  findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.icture8);
        TextView tv1 = findViewById(R.id.tv_login);
        tv1.setText("MARGINAL");
    }


    public void Activity1Press(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void Prev(View v){
        Intent i = new Intent(getApplicationContext(), Seagrass.class);
        startActivity(i);
    }
    public void Next(View v){
        Intent i = new Intent(getApplicationContext(), Forest.class);
        startActivity(i);
    }
}
