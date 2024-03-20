package com.example.calculator;

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

    private EditText number1Input, number2Input;
    private Button addButton, subtractButton, multiplyButton, divideButton, calculateButton;
    private TextView resultText;
    private String operation = "+";  // Default operation
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

        number1Input = findViewById(R.id.number1Input);
        number2Input = findViewById(R.id.number2Input);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        // Set listeners for operation buttons
        addButton.setOnClickListener(v -> operation = "+");
        subtractButton.setOnClickListener(v -> operation = "-");
        multiplyButton.setOnClickListener(v -> operation = "*");
        divideButton.setOnClickListener(v -> operation = "/");

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });

    }
    private void calculateResult() {
        double num1 = Double.parseDouble(number1Input.getText().toString());
        double num2 = Double.parseDouble(number2Input.getText().toString());
        double result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    resultText.setText("Error: Division by zero");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                result = 0;
                break;
        }

        resultText.setText(String.valueOf(result));
    }
}