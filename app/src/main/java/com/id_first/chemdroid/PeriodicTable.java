package com.id_first.chemdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PeriodicTable extends AppCompatActivity  {
    ImageView img;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table);

        img= findViewById(R.id.nyan);
        Glide.with(this).load(R.drawable.nyancat).into(img);
        spinner = findViewById(R.id.spinner);

        List<String> categories = new ArrayList<>();
        categories.add(0, "Choose Category");
        categories.add("Alkali Metals & Alkaline Metals");
        categories.add("Other Non-metals & Metals");
        categories.add("Noble Gases & Halogens");


        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose Category")) {
                    //do nothing kasi dili ko nilagyan sa loob HAHAHHA
                } else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected: " +item, Toast.LENGTH_SHORT).show();

                    if (parent.getItemAtPosition(position).equals("Alkali Metals & Alkaline Metals")) {
                        Intent intent = new Intent(PeriodicTable.this, AlkaliGroup.class);
                        startActivity(intent);
                    }
                    if (parent.getItemAtPosition(position).equals("Other Non-metals & Metals")) {
                        Intent intent = new Intent(PeriodicTable.this, OtherMetals.class);
                        startActivity(intent);
                    }
                    if (parent.getItemAtPosition(position).equals("Noble Gases & Halogens")) {
                        Intent intent = new Intent(PeriodicTable.this, NobleGas.class);
                        startActivity(intent);
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void btnBack2(View view) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}