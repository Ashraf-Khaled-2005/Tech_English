package com.example.teachchildren;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class family_activity extends AppCompatActivity {
ImageButton father,mother,gfather,gmother;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        father=findViewById(R.id.father_btn);
        gfather=findViewById(R.id.gfather_btn);
        mother=findViewById(R.id.mother_btn);
        gmother=findViewById(R.id.gmother_btn);

        father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(family_activity.this,R.raw.father);
                mp.start();
            }
        });
        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(family_activity.this,R.raw.mother);mp.start();
            }
        });    gfather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(family_activity.this,R.raw.grand_father);mp.start();
            }
        });    gmother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp=MediaPlayer.create(family_activity.this,R.raw.grand_mother);mp.start();
            }
        });

    }
}