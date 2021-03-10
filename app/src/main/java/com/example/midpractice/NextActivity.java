package com.example.midpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
public TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        myText = findViewById(R.id.countShowNext);
//        Intent myoutputIntent = getIntent();
//        Bundle extras = myoutputIntent.getExtras();
        // String name = myoutputIntent.getStringExtra(MainActivity.name);
        //int count = myoutputIntent.getIntExtra(MainActivity.markExtraData,0);
//        String name = extras.getString("name");
//        String count = extras.getString("count");
//        String id = extras.getString("ID");
//        char lastChar = id.charAt(id.length() - 1);


    }

    public void processInfo(View view) {
        Intent myoutputIntent = getIntent();
        Bundle extras = myoutputIntent.getExtras();
        String name = extras.getString("name");
        String count = extras.getString("count");
        String id = extras.getString("ID");
        char lastChar = id.charAt(id.length() - 1);
        int  lastDigit = Integer.parseInt(String.valueOf(lastChar));
        if(lastDigit == 0){
            lastDigit= 3;
        }
        int intCount = Integer.parseInt(count);
        int reminder = intCount % lastDigit;
        myText.setText("Your Name: "+name+"\n"+"Total Count: "+count+"\n last digit: "+ lastDigit+"\nRemainder: "+reminder);
    }

    public void lastId(View view) {
    }
}