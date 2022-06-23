package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BSuma, BResta, BDivide, BMulti;
        EditText op1, op2;

        BSuma = findViewById(R.id.Suma);
        BResta = findViewById(R.id.Resta);
        BDivide = findViewById(R.id.Divide);
        BMulti = findViewById(R.id.Multi);
    }

    @Override
    public void onClick(View view){

    }
}