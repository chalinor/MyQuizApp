package com.example.chalinorbaliuag.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    
    HashMap<String, Integer> hm = new HashMap<>();
    String[] choices = {"True", "False"};
    String[] choices2 = {"thread", "socket", "network", "protocol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        

        hm.put("Q1", R.string.question1);
        hm.put("Q2", R.string.question2);
        hm.put("Q3", R.string.question3);

        Button btnQ1 = findViewById(R.id.btnQ1);
        btnQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btnQ1");

                //when btnQ1 is clicked, add the task
             Intent intent = new Intent(MainActivity.this, Q1Activity.class);
             startActivity(intent);

            }
        });

        Button btnQ2 = findViewById(R.id.btnQ2);
        btnQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btnQ2");

                Intent intent = new Intent(MainActivity.this, Q2Activity.class);
                startActivity(intent);
                //when btnQ2 is clicked, add the task

            }
        });

        Button btnQ3 = findViewById(R.id.btnQ3);
        btnQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btnQ3");
                Intent intent = new Intent(MainActivity.this, Q3Activity.class);
                startActivity(intent);
                //when btnQ3 is clicked, add the task

            }
        });

    }

   }
