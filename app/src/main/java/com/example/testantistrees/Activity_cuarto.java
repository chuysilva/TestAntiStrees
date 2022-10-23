package com.example.testantistrees;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
}