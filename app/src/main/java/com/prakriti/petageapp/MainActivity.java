package com.prakriti.petageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText edtYears;
    TextView txtResponse;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtYears = findViewById(R.id.edtYears);
        txtResponse = findViewById(R.id.txtResponse);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = Integer.parseInt(edtYears.getText().toString());
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int age = currentYear - year;
                txtResponse.setText("Your pet's age is: " + age);
            }
        });
    }
}