package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      ImageButton imagelibary= findViewById(R.id.imagelibary);
        Button addnumberofitems = findViewById(R.id.addnumberofitems);
      imagelibary.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i = new Intent(MainActivity.this,collectoadditems.class);
              startActivity(i);
          }
      });

        addnumberofitems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,numberofitems.class);
                startActivity(a);
            }
        });

    }
}