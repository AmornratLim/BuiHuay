package com.example.buihuay.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.buihuay.R;

import java.util.Random;


public class Huay {
    public String getRandomTwoDigits(){
        Random ran1=new Random();
        int n2;
        n2=ran1.nextInt(100);
        String aString = Integer.toString(n2);
        if(n2<10)
            aString="0"+aString;
        return  aString;
    }
    public String getRandomThreeDigits(){
        Random ran1=new Random();
        int n3;
        n3=ran1.nextInt(1000);
        String aString = Integer.toString(n3);
        if(n3<10)
            aString= "00" +aString;
        else if (n3<100)
            aString="0"+aString;
        return  aString;
    }
}
