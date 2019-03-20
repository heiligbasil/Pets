package com.example.pets;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linear_layout);
        linearLayout.addView(addTextView("Big dog"));
        linearLayout.addView(addTextView("Small dog"));
        linearLayout.addView(addTextView("Goldfish"));
        linearLayout.addView(addTextView("Turtle"));
        linearLayout.addView(addTextView("Owl"));
        linearLayout.addView(addTextView("Orange cat"));
        linearLayout.addView(addTextView("Monkey"));
        linearLayout.addView(addTextView("Falcon"));
        linearLayout.addView(addTextView("Squirrel"));
        linearLayout.addView(addTextView("Woodpecker"));
        linearLayout.addView(addTextView("Whale"));
        linearLayout.addView(addTextView("Anteater"));
        linearLayout.addView(addTextView("Butterfly"));
        linearLayout.addView(addTextView("Weevils"));
        linearLayout.addView(addTextView("Crow"));
        linearLayout.addView(addTextView("Cats and dogs"));
        linearLayout.addView(addTextView("Zebra"));
        linearLayout.addView(addTextView("Calico"));
        linearLayout.addView(addTextView("Beagle"));
        linearLayout.addView(addTextView("German shepherd"));
        linearLayout.addView(addTextView("Poodle"));
        linearLayout.addView(addTextView("Sparrow"));
        linearLayout.addView(addTextView("Pteradactyl"));
        linearLayout.addView(addTextView("Hippopatamus"));
        linearLayout.addView(addTextView("Phoenix"));
        linearLayout.addView(addTextView("Hamster"));
        linearLayout.addView(addTextView("Panther"));
        linearLayout.addView(addTextView("Giraffe"));
        linearLayout.addView(addTextView("Rabbit"));

    }

    private TextView addTextView(String text) {
        TextView newTextView = new TextView(this);
        newTextView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        newTextView.setTextSize(20);
        newTextView.setTypeface(Typeface.DEFAULT_BOLD);
        newTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        newTextView.setText(text);

        return newTextView;
    }

}
