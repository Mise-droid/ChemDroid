package com.id_first.chemdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlkaliGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkali_group);
    }

    public void btnBack3(View view) {
        Intent intent = new Intent (this, PeriodicTable.class);
        startActivity(intent);
    }
}