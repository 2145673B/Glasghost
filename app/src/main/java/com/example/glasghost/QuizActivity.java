package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        nextSpeechBubble();
    }

    private void nextSpeechBubble() {
        final TextView speechBubble = findViewById(R.id.speech_bubble);
        ImageButton nextBubble = findViewById(R.id.nextSpeech);

        final String[] strings = {"he Kelvin Building, originally known as the Natural Philosophy Building, was named after Lord Kelvin and was designed by Scottish architect James Miller.",
                "The building was completed in 1906 and was formally opened by the Prince and Princess of Wales on 23 April 1907.",
                "The Kelvin Building was also the first building at Gilmorehill to be equipped with the American Electric Utilities Company's 'Metaphone' system, an internal telephone network that could operate without a central switchboard."};

        nextBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < strings.length) {
                    speechBubble.setText(strings[i]);
                    i++;
                } else {
                    speechBubble.setText("Please attempt the quiz know to win 80XP");
                }
            }
        });
    }
}
