package com.example.perritos2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private static final String USERNAME = "practica";
    private static final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout passwordTextInput = findViewById(R.id.password);
        TextInputLayout userTextInput = findViewById(R.id.username);

        Button aceptar = findViewById(R.id.aceptar);
        Button cancelar = findViewById(R.id.cancelar);

    }
}