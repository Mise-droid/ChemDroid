 package com.id_first.chemdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

 public class MainActivity extends AppCompatActivity {
     ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.lab);
        Glide.with(this).load(R.drawable.chemlab).into(img);
    }

    public void btnElem(View view) {
        Intent intent = new Intent (this, ChemCalculator.class);
        startActivity(intent);
    }

    public void btnPT(View view) {
        Intent intent = new Intent (this, PeriodicTable.class);
        startActivity(intent);
    }
}