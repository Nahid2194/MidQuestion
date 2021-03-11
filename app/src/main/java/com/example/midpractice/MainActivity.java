package com.example.midpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String markExtraData = "com.example.midpractice";
    public static String name = "",phone="",id="";
    TextView myTextView,countText;
    public EditText myName,studentId,PhoneNumber;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.countShow);
        studentId = findViewById(R.id.studentId);
        countText = findViewById(R.id.countShow);
        myName = findViewById(R.id.name);
        PhoneNumber = findViewById(R.id.phoneId);
    }

    public void CountFunction(View view) {
        count++;
        myTextView.setText(""+count);

    }

    public void NextActivityFunction(View view) {
        String nameValue = myName.getText().toString();
        String textCount = countText.getText().toString();
        String studentID = studentId.getText().toString();
        String phoneNo = PhoneNumber.getText().toString();
        Intent myIntent = new Intent(MainActivity.this,NextActivity.class);
//        Bundle extras = new Bundle();
//        extras.putString("count",textCount);
//        extras.putString("name",nameValue);
//        extras.putString("ID",studentID);
//        extras.putString("Phone",phoneNo);
        myIntent.putExtra(name,nameValue);
         myIntent.putExtra(phone,phoneNo);
        myIntent.putExtra(id,studentID);
        // myIntent.putExtras(extras);
        startActivity(myIntent);
    }
}