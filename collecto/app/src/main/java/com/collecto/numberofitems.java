package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class numberofitems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numberofitems);

        Button save = findViewById(R.id.save);
        EditText numberofitems = findViewById(R.id.numberofitems);

        String numberitems = numberofitems.getText().toString();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(numberofitems.this, "Number of items saved", Toast.LENGTH_SHORT);
                Intent ggg = new Intent(numberofitems.this, MainActivity.class);
                ggg.putExtra("numberGoal", numberitems);
                startActivity(ggg);
            }
        });
    }
}