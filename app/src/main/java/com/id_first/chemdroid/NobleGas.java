package com.id_first.chemdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NobleGas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noble_gas);
    }
    public void btnBack5(View view) {
        Intent intent = new Intent (this, PeriodicTable.class);
        startActivity(intent);
    }
}