package com.example.testantistrees;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Activity_cuarto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        dialogo.setTitle("Antes de comenzar...");
        dialogo.setMessage("Contesta de manera honesta y sincera y listo");
        dialogo.setNeutralButton("Ok", null);
    }

    public void Siguiente(View view) {
        Intent sig = new Intent(this, activity_quinto.class);
        startActivity(sig);
    }
}