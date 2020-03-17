package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DailyQuestsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_quests);
    }

    public void moveToMapActivity(View view) {
        startActivity(new Intent(DailyQuestsActivity.this, MapActivity.class));
    }
}
