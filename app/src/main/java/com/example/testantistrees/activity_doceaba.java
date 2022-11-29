package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_doceaba extends AppCompatActivity {
    private RadioButton rb1,rb2,rb3,rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doceaba);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton4);
    }
    public void Siguiente(View view) {

        int resultadoIntensidad = getIntent().getIntExtra("resultadoIntensidad",0);
        int preguntaTrabajo = getIntent().getIntExtra("preguntaTrabajo",0);
        int preguntaCasa = getIntent().getIntExtra("preguntaCasa",0);
        int preguntaEscuela = getIntent().getIntExtra("preguntaEscuela",0);

        if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked()){

            int preguntaEscuela3 = 0;

            if(rb1.isChecked()){
                preguntaEscuela3 = preguntaEscuela + 1;
            }
            if(rb2.isChecked()){
                preguntaEscuela3 = preguntaEscuela + 2;
            }
            if(rb3.isChecked()){
                preguntaEscuela3 = preguntaEscuela + 3;
            }
            Intent sig = new Intent(this, activity_treceabo.class);
            sig.putExtra("resultadoIntensidad", resultadoIntensidad);
            sig.putExtra("preguntaTrabajo", preguntaTrabajo);
            sig.putExtra("preguntaCasa", preguntaCasa);
            sig.putExtra("preguntaEscuela", preguntaEscuela3);
            startActivity(sig);
        }
        else{
            Toast.makeText(getApplicationContext(), "Elige una opción, por favor!", Toast.LENGTH_LONG).show();
        }

    }
}