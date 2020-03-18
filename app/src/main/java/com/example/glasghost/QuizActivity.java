package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class QuizActivity extends AppCompatActivity {
    static int i = 0;
    final String[] strings = {"The Hunterian houses one of the most important collections of the work of Scottish architect,....","designer and artist, Charles Rennie Mackintosh (1868-1928) and his wife, the artist Margaret Macdonald Mackintosh (1864-1933).",
            "The Mackintosh House is the house of the couple who lived there from 1906 to 1914","The house was demolished in the early 1960s but the original fixtures were preserved and reassembled, complete with the contents, as an integral part of the Hunterian Art Gallery.", "The architects took pains to ensure that the sequence of rooms exactly reflected the original. Virtually the same views and effects of natural light are enjoyed as 78 Southpark Avenue stood only some 100 metres away.","Other areas of the original house - cloakroom, kitchen, bathroom, and secondary bedrooms - have not been incorporated.",
            "The interiors, completed in 1981, have been furnished with the Mackintoshes' own furniture - all to Mackintosh's design - and decorated as closely as possible to the original."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        nextSpeechBubble();
    }

    private void nextSpeechBubble() {
        final TextView speechBubble = findViewById(R.id.speech_bubbleHistory);
        ImageButton nextBubble = findViewById(R.id.nextSpeech);


        nextBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < strings.length) {
                    speechBubble.setText(strings[i]);
                    i++;
                } else {
                    speechBubble.setText("Please attempt the quiz know to win 70XP");
                }
            }
        });

    }

    public void correctAnswer(View view) {
        final TextView speechBubble = findViewById(R.id.speech_bubbleHistory);
        ImageButton nextBubble = findViewById(R.id.nextSpeech);
        speechBubble.setText("Correct. You have earned 70XP");
        //TextView level=findViewById(R.id.level);
        //level.setText("Level 1: 90/100 XP");
        MapActivity.setFlagVisibility();
        DailyQuestsActivity.setXP();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                returnToMap();
            }
        }, 1500);
    }

    public void wrongAnswer(View view) {
        final TextView speechBubble = findViewById(R.id.speech_bubbleHistory);
        ImageButton nextBubble = findViewById(R.id.nextSpeech);
        speechBubble.setText("Wrong. The correct answer is A");
    }


    public void returnToMap(View view) {
        startActivity(new Intent(QuizActivity.this, MapActivity.class));
    }

    public void returnToMap() {
        startActivity(new Intent(QuizActivity.this, MapActivity.class));
    }
}
