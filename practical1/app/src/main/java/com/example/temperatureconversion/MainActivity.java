package com.example.temperatureconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText inputCelsius;
    private Button convertButton;
    private TextView resultFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        inputCelsius = findViewById(R.id.inputCelsius);
        convertButton = findViewById(R.id.convertButton);
        resultFahrenheit = findViewById(R.id.resultFahrenheit);

        // Set up the convert button listener
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Convert Celsius to Fahrenheit
                double celsius = Double.parseDouble(inputCelsius.getText().toString());
                double fahrenheit = celsius * 9/5 + 32;

                // Display the result
                resultFahrenheit.setText(String.format("%.1f°F", fahrenheit));
            }
        });


    }
}