package com.alhamdulillahltd.tasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textviewdisplay;
    Button addbutton,demotadebutton,resetbutton;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textviewdisplay = findViewById(R.id.textviewdisplay);
        addbutton = findViewById(R.id.addbutton);
        demotadebutton = findViewById(R.id.demotadebutton);
        resetbutton = findViewById(R.id.resetbutton);


        //*******comment**********

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code here
                count=count+1;

                textviewdisplay.setText(""+count);

            }
        });


        demotadebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code here
                count=count-1;

                textviewdisplay.setText(""+count);


            }
        });

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code here
                count=0;

                textviewdisplay.setText(""+count);


            }
        });



    }
}