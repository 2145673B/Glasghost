package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DailyQuestsActivity extends AppCompatActivity {
    static String xp_string = "Level 1: 20/100XP";
    static int xp_val = 20;
    static float alphas = (float) 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_quests);
    }

    public void moveToMapActivity(View view) {
        startActivity(new Intent(DailyQuestsActivity.this, MapActivity.class));
    }

    public static void setXP(){
        xp_string = "Level 1: 90/100XP";
        xp_val = 90;
        alphas = (float) 0.0;
    }

    @Override
    protected void onResume() {
        super.onResume();
        ProgressBar b = (ProgressBar) findViewById(R.id.levelBar3);
        b.setProgress(xp_val);
        TextView t = (TextView) findViewById(R.id.level3);
        t.setText(xp_string);
        Button m = (Button) findViewById(R.id.MackintoshHouse);
        m.setAlpha(alphas);
        ImageView c = (ImageView) findViewById(R.id.cross5);
        c.setAlpha(alphas);
    }

}
