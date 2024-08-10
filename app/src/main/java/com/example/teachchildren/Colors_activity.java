package com.example.teachchildren;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colors_activity extends AppCompatActivity {
    Button white_btn,black_btn,green_btn,blue_btn,red_btn;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        white_btn=findViewById(R.id.btn_white);
        black_btn=findViewById(R.id.black_btn);
        red_btn=findViewById(R.id.red_btn);
        green_btn=findViewById(R.id.green_btn);
        blue_btn=findViewById(R.id.blue_btn);
        white_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(Colors_activity.this,R.raw.white);
                mp.start();

            }
        });
        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(Colors_activity.this,R.raw.red);
                mp.start();

            }
        }); blue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(Colors_activity.this,R.raw.blue);
                mp.start();

            }
        }); green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(Colors_activity.this,R.raw.green);
                mp.start();

            }
        }); black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(Colors_activity.this,R.raw.black);
                mp.start();

            }
        });







    }
}