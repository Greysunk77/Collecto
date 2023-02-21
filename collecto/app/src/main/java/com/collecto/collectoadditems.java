package com.collecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class collectoadditems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectoadditems);

        Button Submit = findViewById(R.id.Submit);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText itemname= findViewById(R.id.itemname);
                EditText itemcategory= findViewById(R.id.itemcategory);
                EditText itemdescription= findViewById(R.id.itemdescription);
                EditText dateofacquistion= findViewById(R.id.dateofacquistion);

                String iName = itemname.getText().toString();
                String iCategory = itemcategory.getText().toString();
                String iDescription = itemdescription.getText().toString();
                String iDate = dateofacquistion.getText().toString();

                Intent my = new Intent(collectoadditems.this, collectoview.class);
                my.putExtra("itemname", iName);
                my.putExtra("itemCategory", iCategory);
                my.putExtra("itemDescription", iDescription);
                my.putExtra("itemDate", iDate);
                startActivity(my);
            }
        });
    }
}