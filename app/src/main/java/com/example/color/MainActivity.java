package com.example.color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.text.method.ScrollingMovementMethod;
import android.view.View;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView txvR, txvG,txvB,txv;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvR =findViewById(R.id.textView);
        txvG =findViewById(R.id.textView2);
        txvB =findViewById(R.id.textView3);
        txv =findViewById(R.id.textView4);
    }

    public void changecolor(View v){
        Random x = new Random();

        int red = x.nextInt(bound: 256);
        txvR.setText("RED:" + red);
        txvR.setTextColor(Color.rgb(red, green: 0 , blue: 0));

        int green = x.nextInt(bound: 256);
        txvR.setText("RED:" + red);
        txvR.setTextColor(Color.rgb(red, green: 0 , blue: 0));

        int blue = x.nextInt(bound: 256);
        txvR.setText("RED:" + red);
        txvR.setTextColor(Color.rgb(red, green: 0 , blue: 0));


    }
}
