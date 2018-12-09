package com.irish.salvador.a115project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.net.Uri;


public class Explore extends AppCompatActivity {
    String asd = "lol";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent mIntent = getIntent();
        String previousActivity= mIntent.getStringExtra("FROM_ACTIVITY");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        ImageButton aaa = findViewById(R.id.aaa);
        TextView bbb = findViewById(R.id.bbb);
        if (previousActivity.equals("AG"))   {
            aaa.setImageResource(R.drawable.e1);
            bbb.setText("Banaue\n"+"Please click the photo to view in maps");
            asd = "1";
        }else if (previousActivity.equals("CR")){
            aaa.setImageResource(R.drawable.e6);
            bbb.setText("Dakit Dakit Coral Reefs\n"+"Please click the photo to view in maps");
            asd = "2";
        }else if (previousActivity.equals("FO")){
            aaa.setImageResource(R.drawable.e2);
            bbb.setText("Pamulaklakin Forest Trail\n"+"Please click the photo to view in maps");
            asd = "3";
        }else if (previousActivity.equals("FW")){
            aaa.setImageResource(R.drawable.e5);
            bbb.setText("Calibato\n"+"Please click the photo to view in maps");
            asd = "4";
        }else if (previousActivity.equals("ME")){
            aaa.setImageResource(R.drawable.e4);
            bbb.setText("Sabang\n"+"Please click the photo to view in maps");
            asd = "5";
        }else if (previousActivity.equals("ML")){
            aaa.setImageResource(R.drawable.e7);
            bbb.setText("Bontoc Mountain Province\n"+"Please click the photo to view in maps");
            asd = "6";
        }else if (previousActivity.equals("SG")){
            aaa.setImageResource(R.drawable.e8);
            bbb.setText("Malapascua\n"+"Please click the photo to view in maps");
            asd = "7";
        }else if (previousActivity.equals("UR")){
            aaa.setImageResource(R.drawable.e3);
            bbb.setText("Makati\n"+"Please click the photo to view in maps");
            asd = "8";
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
    public void MapPress(View v){
        if (asd.equals("1"))   {
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:16.924045, 121.055621"));
            startActivity(i);
        }else if (asd.equals("2")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:11.322315, 124.107286"));
            startActivity(i);
        }else if (asd.equals("3")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:14.804605, 120.332751"));
            startActivity(i);
        }else if (asd.equals("4")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:14.103250, 121.377114"));
            startActivity(i);
        }else if (asd.equals("5")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:10.192958, 118.904974"));
            startActivity(i);
        }else if (asd.equals("6")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:17.084625, 120.983757"));
            startActivity(i);
        }else if (asd.equals("7")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:11.3497362,124.118165"));
            startActivity(i);
        }else if (asd.equals("8")){
            Intent i = new Intent(Intent.ACTION_VIEW,  Uri.parse("geo:14.564891, 121.019629"));
            startActivity(i);
        }
    }
}
