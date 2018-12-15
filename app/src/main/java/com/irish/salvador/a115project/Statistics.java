package com.irish.salvador.a115project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        Intent mIntent = getIntent();
        String previousActivity= mIntent.getStringExtra("FROM_ACTIVITY");
        if (previousActivity.equals("AG"))   {
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c3);
            bbb.setText("Covering 7% of land cover, it can be said that agricultural ecosystems are both threatened and serve as a threat to other ecosystems as well, despite their unquestionable socio-economic importance. On one hand, continuous urban development for residential and commercial land use is encroaching on agricultural lands. In turn, farmers are forced to move upland, harming forest ecosystems in the process.");
        }else if (previousActivity.equals("CR")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c5);
            bbb.setText("Coral reef damage is a serious concern. As of 2006, only 5% of Philippine coral reefs are in excellent condition, while 32% are already severely damaged (Haribon, 2006).");
        }else if (previousActivity.equals("FO")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c1);
            bbb.setText("It is estimated that from having 70% forest cover at the start of the 1900s, only about 24% remain, based on 2001-03 satellite imagery, according to the DENR’s Forest Management Bureau. Meanwhile, according to the Philippine Tropical Forest Conservation Foundation, “deforestation continues at an average of 100,000 hectares per year or 273 hectares per day.”");
        }else if (previousActivity.equals("FW")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c6);
            bbb.setText("The Philippines has 34% of endemic freshwater in SouthEast Asia");
        }else if (previousActivity.equals("ME")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c2);
            bbb.setText("Almost 2.11% of the protected areas covering land are Mangroves");
        }else if (previousActivity.equals("ML")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c4);
            bbb.setText("Marginal lands now comprise about 70% (over 11 million hectares) of declared forest area in the Philippines.");
        }else if (previousActivity.equals("SG")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c7);
            bbb.setText("50% of Seagrass in the Philippines are now endangered.");
        }else if (previousActivity.equals("UR")){
            ImageView aaa = findViewById(R.id.aaa);
            TextView bbb = findViewById(R.id.bbb);
            aaa.setImageResource(R.drawable.c8);
            bbb.setText("Urban ecosystem covers 14.6% of land cover according to the Biodiversity Management Bureau");
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
