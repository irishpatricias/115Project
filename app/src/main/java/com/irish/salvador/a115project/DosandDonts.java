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
            bbb.setText("\u2022 gathering or destroying of active nests, nest trees, host plants and the like\n" +
            "\u2022 dumping of waste products detrimental to the ecosystem\n" +
            "\u2022 burning and/or destroying of crops");
            aaa.setText("\u2022 maintain your environment clean\n" +
            "\u2022 if you see others doing harm to the ecosystem advise and/or report them\n" +
            "\u2022 appreciate the hardwork of farmers and respect them");
        }else if (previousActivity.equals("CR")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Use mooring balls instead of anchoring the boat.\n" +
                    "\u2022Pick up floating trash you see in the water; always leave things better than you found them.\n" +
                    "\u2022Make sure your dive and snorkel equipment is in good working order.\n");
            bbb.setText("\u2022Touch corals with your hands, dive fins or anything else.\n" +
                    "\u2022Never litter in the ocean or leave anything behind that may harm the marine environment.\n" +
                    "\u2022Do not stray too far from your boat while snorkeling or diving");
        }else if (previousActivity.equals("FO")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Always carry back your leftover\n" +
                    "\u2022When out to observe wild life, as a rule Khaki or olive-green or brown clothing would be suitable.\n" +
                    "\u2022Comfortable walking shoes such as sport shoes are advisable.\n");
            bbb.setText("\u2022Smoking and igniting fire in National Parks and sanctuaries and in other forest areas.\n" +
                    "\u2022use of perfumes or strong smelling chemical\n" +
                    "\u2022Littering on forest floor");
        }else if (previousActivity.equals("FW")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Enjoy the scenery and be friendly with the animals you'll encounter\n" +
                    "\u2022Keep the water clean\n" +
                    "\u2022Bring garbage bag to be used for any kind of waste");
            bbb.setText("\u2022Use dynamites when fishing\n" +
                    "\u2022Throw any kind of garbage into the water\n" +
                    "\u2022Make unnecessary disturbance to marine life");
        }else if (previousActivity.equals("ME")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Enjoy the scenery and be friendly with the animals you'll encounter\n" +
                    "\u2022Always carry back your leftover\n" +
                    "\u2022Comfortable walking shoes such as sport shoes are advisable.\n");
            bbb.setText("\u2022Smoking and igniting fire\n" +
                    "\u2022use of perfumes or strong smelling chemical\n" +
                    "\u2022Littering");
        }else if (previousActivity.equals("ML")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Enjoy the scenery and be friendly with the animals you'll encounter\n" +
                    "\u2022Keep your environment clean\n" +
                    "\u2022Make use of designated trash cans/trash bins");
            bbb.setText("\u2022Littering in anywhere you go\n" +
                    "\u2022Make unnecessary disturbance to animals\n" +
                    "\u2022Smoking and/or burning of trash");
        }else if (previousActivity.equals("SG")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Enjoy the scenery and be friendly with the animals you'll encounter\n" +
                    "\u2022Pick up floating trash you see in the water; always leave things better than you found them.\n" +
                    "\u2022Make sure your dive and snorkel equipment is in good working order.\n");
            bbb.setText("\u2022Touch corals with your hands, dive fins or anything else.\n" +
                    "\u2022Never litter in the ocean or leave anything behind that may harm the marine environment.\n" +
                    "\u2022Do not stray too far from your boat while snorkeling or diving");
        }else if (previousActivity.equals("UR")){
            TextView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setText("\u2022Practice segregating your trash\n" +
                    "\u2022Learn ways to be more eco friendly\n" +
                    "\u2022Clean as you go");
            bbb.setText("\u2022Use of plastics\n" +
                    "\u2022Littering in any where you go\n" +
                    "\u2022Smoking and burning of trash");
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
