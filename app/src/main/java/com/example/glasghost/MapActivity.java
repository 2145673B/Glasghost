package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    static float vis = (float) 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void moveToQuiz(View view) {
        startActivity(new Intent(MapActivity.this, QuizActivity.class));
    }

    public void moveToDailyQuests(View view){
        startActivity(new Intent(MapActivity.this, DailyQuestsActivity.class));
    }

    public static void setFlagVisibility(){
        vis = (float) 0.0;
    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView v = (ImageView) findViewById(R.id.questCheckpoint);
        v.setAlpha(vis);
        TextView t = (TextView) findViewById(R.id.mackintosh);
        t.setAlpha(vis);
    }
}
