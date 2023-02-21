package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class collectocategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectocategories);

        TextView username = findViewById(R.id.txtusername);
        String Username = getIntent().getStringExtra("Username");
        username.setText(Username);
        EditText categoryname= findViewById((R.id.categoryname));
        Button btncategory= findViewById(R.id.btnaddcategoty);
        btncategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(collectocategories.this,MainActivity.class);
               startActivity(intent);
            }
        });
    }

}