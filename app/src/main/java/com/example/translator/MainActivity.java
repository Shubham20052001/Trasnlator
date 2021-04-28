package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find view that shows the number category
        TextView numbers = findViewById(R.id.numbers);
        //Set a clickListener on Numbers View
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Create an intent to open Numbers Activity
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                //Start numbers Activity
                startActivity(numbersIntent);}});

        //Find view that shows the family category
        TextView family = findViewById(R.id.family);
        //Set a clickListener on Family View
        family.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Create an intent to open Family Activity
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                //Start family Activity
                startActivity(familyIntent); }});

        //Find view that shows the colors category
        TextView colors = findViewById(R.id.colors);
        //Set a clickListener on colors View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an intent to open Colors Activity
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                //Start colors Activity
                startActivity(colorsIntent); }});

        //Find view that shows the phrases category
        TextView phrases = findViewById(R.id.phrases);
        //Set a clickListener on phrases View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an intent to open phrases Activity
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                //Start phrases Activity
                startActivity(phrasesIntent);}});

    }

}