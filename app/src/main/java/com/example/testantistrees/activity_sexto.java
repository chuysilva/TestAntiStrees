package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_sexto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexto);
    }

    public void Siguiente(View view){
        Intent sig = new Intent(this, activity_septima.class);
        startActivity(sig);
    }
}