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
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022 gathering or destroying of active nests, nest trees, host plants and the like\n" +
            "\u2022 dumping of waste products detrimental to the ecosystem\n" +
            "\u2022 burning");
            bbb.setText("\u2022 maintain your environment clean\n" +
            "\u2022 if you see others doing harm to the ecosystem advise and/or report them\n" +
            "\u2022 appreciate the hardwork of farmers and respect them");
        }else if (previousActivity.equals("CR")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("FO")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("FW")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("ME")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("ML")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("SG")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
        }else if (previousActivity.equals("UR")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("");
            bbb.setText("");
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
