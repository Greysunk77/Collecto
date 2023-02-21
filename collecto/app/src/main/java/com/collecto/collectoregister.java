package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class collectoregister extends AppCompatActivity {
Button btnreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectoregister);
        btnreg = findViewById(R.id.button2);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myint = new Intent(collectoregister.this,collectologin.class);
                startActivity(myint);
            }
        });
    }
}