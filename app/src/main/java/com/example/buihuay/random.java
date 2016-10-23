package com.example.buihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class random extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);


        Intent intent = getIntent();

        String num = intent.getStringExtra("เลขท้าย");
        String num2 = intent.getStringExtra("text");

        TextView Bui2 = (TextView) findViewById(R.id.text_view_name);
        Bui2.setText(num2);

        TextView Bui3 = (TextView) findViewById(R.id.text_view_random);
        Bui3.setText(num);
    }
}


