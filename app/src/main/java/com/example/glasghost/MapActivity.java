package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        LinearLayout questListViewLayout = (LinearLayout) findViewById(R.id.questListViewLayout);


        String[] questsArray = {"Quest #1: Boyd Orr Building (D1) 100XP", "Quest #2: Mathematics Building (D4) 50XP", "Quest #3: Bower Building (D1) 800XP"};
        for( int i = 0; i < questsArray.length; i++ ) {
            TextView textView = new TextView(this);
            textView.setText(questsArray[i]);
            questListViewLayout.addView(textView);
        }
    }
}
