package com.example.pamo1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Author: Sebastian Mackiewicz s22615

public class MainActivity extends AppCompatActivity {

    //Fields declaration
    EditText editTextWeight, editTextHeight;
    Button buttonCalculate;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the user interface view defined in content_main.xml
        setContentView(R.layout.content_main);

        // Initialize fields, button and textbox
        editTextWeight = findViewById(R.id.weightTextField);
        editTextHeight = findViewById(R.id.heightTextField);
        buttonCalculate = findViewById(R.id.calculateButton);
        textViewResult = findViewById(R.id.resultInfoBox);

        // Set click listener to call calculateBMI on click
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        // Get values from fields
        String weightString = editTextWeight.getText().toString();
        String heightString = editTextHeight.getText().toString();

        // Check if weight and height fields are not empty
        if (weightString.isEmpty() || heightString.isEmpty()) {
            textViewResult.setText("Enter your weight and height.");
            return;
        }

        // Convert values to float
        float weight = Float.parseFloat(weightString);
        float height = Float.parseFloat(heightString) / 100;

        // Calculate BMI
        float bmi = weight / (height * height);

        // Display BMI result and label
        textViewResult.setText(String.format("Your BMI: %.2f", bmi));
    }
}