package com.irish.salvador.a115project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class Facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        Intent mIntent = getIntent();
        String previousActivity= mIntent.getStringExtra("FROM_ACTIVITY");
        if (previousActivity.equals("AG"))   {
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Agricultural ecosystems are artificial ecosystems created in the process of developing land and coastal/aquatic areas for farming, animal husbandry, and fishing.");
        }else if (previousActivity.equals("CR")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Coral reefs are comprised of massive deposits of calcium carbonate that take centuries to produce and develop. Because of such a long process, coral reefs are very delicate ecosystems and are due extensive protective measures.");
        }else if (previousActivity.equals("FO")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Forests are inherently diverse ecosystems, as conditions found within them are ideal for supporting symbiotic ecological relationships. ");
        }else if (previousActivity.equals("FW")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Freshwater ecosystems occur in in-land bodies of water and may either be flowing, standing, or man-made. Rivers and streams, lakes and reservoirs, and artificial fishponds are examples that fall into the three respective categories.");
        }else if (previousActivity.equals("ME")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Mangroves are medium-size and highly tolerant flora that can survive in brackish water (water which is more saline than freshwater, but not as much as seawater).");
        }else if (previousActivity.equals("ML")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Marginal ecosystems are those that are located between two ecosystems. These can be either natural or artificial, such as areas adapted or reappropriated for agricultural use. ");
        }else if (previousActivity.equals("SG")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Seagrass ecosystems comprise of aquatic flowering plants that can live in seawater. These types of ecosystems occur in shallow water environments. ");
        }else if (previousActivity.equals("UR")){
            TextView aaa = findViewById(R.id.aaa);
            aaa.setText("Urban ecosystems are the product of modernized, industrialized human society. These function as the base of human settlements, as well as economic development.");
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
