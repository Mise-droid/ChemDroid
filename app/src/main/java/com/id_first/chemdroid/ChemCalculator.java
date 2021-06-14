package com.id_first.chemdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.id_first.chemdroid.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ChemCalculator extends AppCompatActivity {
    ImageView img2;
    EditText editSymbol;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem_calculator);
        img2 = findViewById(R.id.img2);
        Glide.with(this).load(R.drawable.cheme).into(img2);
        editSymbol = findViewById(R.id.editSymbol);
        textResult = findViewById(R.id.textResult);
    }

    public void btnCalc(View view) {
        HashMap<String, Double> elements = new LinkedHashMap<>();
        elements.put("Ac", 227.000);
        elements.put("Al", 26.982);
        elements.put("Am", 243.000);
        elements.put("Sb", 121.760);
        elements.put("Ar", 39.948);
        elements.put("As", 74.922);
        elements.put("At", 210.000);
        elements.put("Ba", 137.327);
        elements.put("Bk", 247.000);
        elements.put("Bi", 208.980);
        elements.put("Be", 9.012);
        elements.put("Bh", 264.000);
        elements.put("B", 10.811);
        elements.put("Br", 79.904);
        elements.put("Cd", 112.411);
        elements.put("Cs", 132.906);
        elements.put("Ca", 40.078);
        elements.put("Cf", 251.000);
        elements.put("C", 12.011);
        elements.put("Ce", 140.116);
        elements.put("Cl", 35.453);
        elements.put("Cr", 51.996);
        elements.put("Co", 58.933);
        elements.put("Cn", 285.000);
        elements.put("Cu", 63.546);
        elements.put("Cm", 247.000);
        elements.put("Ds", 281.000);
        elements.put("Db", 268.000);
        elements.put("Dy", 162.500);
        elements.put("Es", 252.000);
        elements.put("Er", 167.259);
        elements.put("Eu", 	151.964);
        elements.put("Fm", 257.000);
        elements.put("Fl", 289.000);
        elements.put("F", 18.998);
        elements.put("Fr", 223.000);
        elements.put("Gd", 157.250);
        elements.put("Ga", 69.723);
        elements.put("Ge", 72.640);
        elements.put("Au", 196.967);
        elements.put("Hf", 178.490);
        elements.put("Hs", 277.000);
        elements.put("He", 4.003);
        elements.put("Ho", 164.930);
        elements.put("H", 1.008);
        elements.put("In", 114.818);
        elements.put("I", 126.905);
        elements.put("Ir", 192.217);
        elements.put("Fe", 55.845);
        elements.put("Kr", 83.800);
        elements.put("La", 138.906);
        elements.put("Lr", 262.000);
        elements.put("Pb", 207.200);
        elements.put("Li", 6.941);
        elements.put("Lv", 293.000);
        elements.put("Lu", 174.967);
        elements.put("Mg", 24.305);
        elements.put("Mn", 54.938);
        elements.put("Mt", 278.000);
        elements.put("Md", 258.000);
        elements.put("Hg", 200.590);
        elements.put("Mo", 95.940);
        elements.put("Mc", 289.000);
        elements.put("Nd", 144.24);
        elements.put("Ne", 20.180);
        elements.put("Np", 237.0);
        elements.put("Ni", 58.69);
        elements.put("Nh", 286.0);
        elements.put("Nb", 92.91);
        elements.put("N", 14.01);
        elements.put("No", 259.0);
        elements.put("Og", 294.0);
        elements.put("Os", 190.23);
        elements.put("O", 15.999);
        elements.put("Pd", 106.42);
        elements.put("P", 30.97);
        elements.put("Pt", 195.08);
        elements.put("Pu", 244.0);
        elements.put("Po", 209.0);
        elements.put("K", 39.098);
        elements.put("Pr", 140.91);
        elements.put("Pm", 145.0);
        elements.put("Pa", 231.04);
        elements.put("Ra", 226.0);
        elements.put("Rn", 222.0);
        elements.put("Re", 186.21);
        elements.put("Rh", 102.91);
        elements.put("Rg", 281.0);
        elements.put("Rb", 85.47);
        elements.put("Ru", 101.07);
        elements.put("Rf", 267.0);
        elements.put("Sm", 150.36);
        elements.put("Sc", 44.96);
        elements.put("Sg", 269.0);
        elements.put("Se", 78.96);
        elements.put("Si", 28.09);
        elements.put("Ag", 107.868);
        elements.put("Na", 22.99);
        elements.put("Sr", 87.62);
        elements.put("S", 32.07);
        elements.put("Ta", 180.95);
        elements.put("Tc", 98.0);
        elements.put("Te", 127.6);
        elements.put("Ts", 294.0);
        elements.put("Tb", 158.93);
        elements.put("Tl", 204.38);
        elements.put("Th", 232.04);
        elements.put("Tm", 168.93);
        elements.put("Sn", 118.71);
        elements.put("Ti", 47.87);
        elements.put("W", 183.84);
        elements.put("U", 238.03);
        elements.put("V", 50.94);
        elements.put("Xe", 131.29);
        elements.put("Yb", 173.04);
        elements.put("Y", 88.91);
        elements.put("Zn", 65.390);
        elements.put("Zr", 91.22);

        //thanks to sigmaaldric.com for the values of the elements uwu

        String combinationText = editSymbol.getText().toString();

        if (combinationText.isEmpty()) {
            Toast.makeText(this, "Input cannot be empty.", Toast.LENGTH_SHORT).show();
            return;
        }

        //Array where the elements combination will be inserted
        ArrayList<String> listOfElements = new ArrayList<>();

        //Loop through all letters in edit text
        for (int i = 0; i < combinationText.length(); i++) {
            String elementToBeAddedToArray = "";
            //Get the current letter
            //Check current letter if its uppercase
            //check if i will be greater than the characters length of edit text
            String currentLetter = combinationText.substring(i, i + 1);
            if (isCurrentLetterInUpperCase(currentLetter) || isCurrentLetterInLowerCase(currentLetter)) {
                char nextLetter;
                if (i + 1 >= combinationText.length()) {
                    nextLetter = combinationText.charAt(combinationText.length() - 1);
                } else {
                    nextLetter = combinationText.charAt(i + 1);
                }

                //check if the next letter to the uppercase is in lowercase. (to be added to the uppercase)
                // e.g: He, Li, Be
                //if the next letter is uppercase it will be automatically added to the array list
                char numberCheck;

                if (isCurrentLetterInLowerCase(String.valueOf(nextLetter))) {
                    elementToBeAddedToArray = currentLetter + nextLetter;
                    listOfElements.add(elementToBeAddedToArray);

                    if (i + 2 >= combinationText.length()) {
                        numberCheck = combinationText.charAt(combinationText.length() - 1);
                    } else {
                        numberCheck = combinationText.charAt(i + 2);
                    }

                    if (isNumeric(String.valueOf(numberCheck))) {
                        int intNumberCheck = Integer.parseInt(String.valueOf(numberCheck));
                        for (int k = 1; k < intNumberCheck; k++) {
                            listOfElements.add(elementToBeAddedToArray);
                        }
                    }
                    i++;
                } else{
                    elementToBeAddedToArray = currentLetter;
                    listOfElements.add(elementToBeAddedToArray);

                    if (i + 1 >= combinationText.length()) {
                        numberCheck = combinationText.charAt(combinationText.length() - 1);
                    } else {
                        numberCheck = combinationText.charAt(i + 1);
                    }
                    if (isNumeric(String.valueOf(numberCheck))) {
                        int intNumberCheck = Integer.parseInt(String.valueOf(numberCheck));
                        for (int k = 1; k < intNumberCheck; k++) {
                            listOfElements.add(currentLetter);
                        }
                    }
                }
            }
        }
        //remove all extra spaces and null values in arraylist to be safe.
        listOfElements.removeAll(Arrays.asList(null, ""));
        //loop through all items in arraylist and compare it to the hashmap to find its value and to be added (by double)
        double finalValueOfCombinedElements = 0.00;
        boolean noErrorFound = false;
        textResult.setText("");

        for (String element : listOfElements) {
            //check current element to be compared to list of elements array
            if (elements.containsKey(element)) {
                double valueOfElement = elements.get(element);
                finalValueOfCombinedElements += valueOfElement;
                noErrorFound = true;
            } else {
                textResult.setText(textResult.getText().toString() + "Invalid input! Please check uppercase and lowercase.\n\nWrong element: " + element + "\n");
                noErrorFound = false;
                break;
            }
        }

        if(noErrorFound){
            textResult.setText("Result: " + finalValueOfCombinedElements +"g/mol\n\n");
        }
    }

    public boolean isCurrentLetterInLowerCase(String textToCheck) {
        return !textToCheck.equals(textToCheck.toUpperCase());
    }

    public boolean isCurrentLetterInUpperCase(String textToCheck) {
        return !textToCheck.equals(textToCheck.toLowerCase());
    }

    public boolean isNumeric(String string) {
        int intValue;

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }

    public void btnBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}