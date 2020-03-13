package com.example.glasghost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TutorialActivity extends AppCompatActivity {
    static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        nextSpeechBubble();
    }

    private void nextSpeechBubble(){
        final TextView speechBubble = findViewById(R.id.speech_bubble);
        ImageButton nextBubble = findViewById(R.id.nextSpeech);

        final String[] strings = {"Well technically I am his ghost, hahaha! You must be quite surprised!",
                "You may not see us, but there are a lot of us ghosts around here. All of us have something that does not let us rest in peace...",
                "Anyway, you seem to be lost, and my friends and I could use your assistance. I think we might just be able to help one another!",
                "Let me get you up to speed! The white box on the left behind me here is your quest log. It is currently empty since you do not have any quests yet.",
                "On the right you can see your toolbar. In it you have a backpack with items for quests and badges and a map of the campus.",
                "The little camera icon will let you activate Augmented Reality mode! Of course I know what Augmented Reality is, I've been on this Earth for 300 years!",
                "You can also access your profile in the toolbar as well as the community screen, where you can see your friends and other players.",
                "Now let's get started!"};

        nextBubble.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (i < strings.length) {
                    speechBubble.setText(strings[i]);
                    i++;
                }
                else{
                    i = 0;
                }
            }
        });
    }
}
