package com.example.teachchildren;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton colorimage_btn,familyimage_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorimage_btn=findViewById(R.id.colorsid);
        familyimage_btn=findViewById(R.id.familyid);
        colorimage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getBaseContext(),Colors_activity.class);
                startActivity(i);
            }
        });
        familyimage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getBaseContext(),family_activity.class);
                startActivity(i);
            }
        });




    }
}