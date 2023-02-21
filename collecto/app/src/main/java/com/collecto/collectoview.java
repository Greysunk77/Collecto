package com.collecto;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class collectoview extends AppCompatActivity {
    ImageView imageView;
    Button takepicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectoview);

        TextView itemname= findViewById(R.id.itemname);
        TextView itemcat= findViewById(R.id.itemcat);
        TextView itemdes= findViewById(R.id.itemdes);
        TextView date= findViewById(R.id.date);

        String itemName = getIntent().getStringExtra("itemname");
        String itemCat = getIntent().getStringExtra("itemCategory");
        String itemDes = getIntent().getStringExtra("itemDescription");
        String itemdate = getIntent().getStringExtra("itemDate");

        itemname.setText(itemName);
        itemcat.setText(itemCat);
        itemdes.setText(itemDes);
        date.setText(itemdate);

        Button takepicture = findViewById(R.id.takepicture);



        takepicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,100);
            }
        });
        imageView = findViewById(R.id.imageView);
        takepicture = findViewById(R.id.takepicture);
        //Request for Camera runtime Permission

        if(ContextCompat.checkSelfPermission(collectoview.this, Manifest.permission.CAMERA)
        != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(collectoview.this,new String[]{
            Manifest.permission.CAMERA
            },100);
        }

    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==100){
            Bitmap bitmap= (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap((bitmap));
        }
    }
}