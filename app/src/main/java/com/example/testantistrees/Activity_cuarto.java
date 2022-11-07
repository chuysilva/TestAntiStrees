package com.example.testantistrees;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Activity_cuarto extends AppCompatActivity {

    private TextView resultado1;
    private RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton4);
        rb4 = (RadioButton) findViewById(R.id.radioButton3);

    }

    public void Siguiente(View view) {

        //Valor de intensidad
        int resultadoIntensidad = getIntent().getIntExtra("intensidad",0);


        if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){

            Intent sig = new Intent(this, activity_quinto.class);
            sig.putExtra("resultadoIntensidad", resultadoIntensidad);
            startActivity(sig);
        }
        else{
            Toast.makeText(getApplicationContext(), "Elige una opción, por favor!", Toast.LENGTH_LONG).show();
        }

    }
}