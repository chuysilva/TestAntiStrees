package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_quinto extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto);

    }

    public void Siguiente(View view){

        int resultadoIntensidad = getIntent().getIntExtra("resultadoIntensidad",0);

        Intent sig = new Intent(this, activity_sexto.class);
        startActivity(sig);
    }
}