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
    public static String name = "";
    TextView myTextView,countText;
    public EditText myName,studentId;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.countShow);
        studentId = findViewById(R.id.studentId);
        countText = findViewById(R.id.countShow);
        myName = findViewById(R.id.name);
    }

    public void CountFunction(View view) {
        count++;
        myTextView.setText(""+count);

    }

    public void NextActivityFunction(View view) {
        String nameValue = myName.getText().toString();
        String textCount = countText.getText().toString();
        String studentID = studentId.getText().toString();
        Intent myIntent = new Intent(MainActivity.this,NextActivity.class);
        Bundle extras = new Bundle();
        extras.putString("count",textCount);
        extras.putString("name",nameValue);
        extras.putString("ID",studentID);
         //myIntent.putExtra(markExtraData,count);
         myIntent.putExtras(extras);
        startActivity(myIntent);
    }
}