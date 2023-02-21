package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class collectologin extends AppCompatActivity {
Button login;
Button register;
EditText PersonName, Password;
TextView forgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectologin);
        login = findViewById(R.id.button);
        register = findViewById(R.id.button5);
        PersonName = findViewById(R.id.editTextTextPersonName6);
        Password = findViewById(R.id.editTextTextPersonName7);
        forgotPassword = findViewById(R.id.textView2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = PersonName.getText().toString();
                String password = Password.getText().toString();

                if(username.equals("")){
                    Toast.makeText(collectologin.this, "Please enter username!", Toast.LENGTH_SHORT);
                    forgotPassword.setText("Please enter username!");
                }
                else if (password.equals("")){
                    Toast.makeText(collectologin.this, "Please enter password!", Toast.LENGTH_SHORT);
                    forgotPassword.setText("Please enter password!");
                }
                else {
                    Toast.makeText(collectologin.this, "Login Succes!", Toast.LENGTH_SHORT);
                    Intent myint = new Intent(collectologin.this,collectocategories.class);
                    myint.putExtra("Username", username) ;
                    startActivity(myint);

                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myint = new Intent(collectologin.this,collectoregister.class);
                startActivity(myint);
            }
        });

    }



}