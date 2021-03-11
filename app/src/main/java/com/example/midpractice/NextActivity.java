package com.example.midpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
//        Bundle extras = myoutputIntent.getExtras();
//        String name = extras.getString("name");
//        String count = extras.getString("count");
//        String id = extras.getString("ID");
//        String phone = extras.getString("Phone");
        String name = myoutputIntent.getStringExtra(MainActivity.name);
        String id = myoutputIntent.getStringExtra(MainActivity.id);
        String phone = myoutputIntent.getStringExtra(MainActivity.phone);
        char lastChar = phone.charAt(phone.length() - 1);
        String batch = id.substring(0, 3);
        String department = id.substring(4, 6);

        int  lastDigit = Integer.parseInt(String.valueOf(lastChar));
        int modulus = lastDigit % 2 ;
        if(modulus == 0){
            Toast.makeText(this, "Even", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "ODD", Toast.LENGTH_SHORT).show();
        }
        //int intCount = Integer.parseInt(count);
       // int reminder = intCount % lastDigit;
        myText.setText("Your Name: "+name+"\nPhone Number: "+phone+"\n First Two: "+batch+"\nlast digit: "+modulus);
    }

    public void lastId(View view) {
    }
}