package com.example.buihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.buihuay.model.Huay;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   Huay BuiHuay = new Huay();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bui2 = (Button)findViewById(R.id.button_buihuay2);
        Bui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,random.class);
                    intent.putExtra("text","เลขท้าย 2ตัว");
                    intent.putExtra("เลขท้าย",BuiHuay.getRandomTwoDigits());
                    startActivity(intent);
                }

        });
        Button Bui3 = (Button)findViewById(R.id.button_baihuay3);
        Bui3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,random.class);
                intent.putExtra("text","เลขท้าย 3ตัว");
                intent.putExtra("เลขท้าย",BuiHuay.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
}
