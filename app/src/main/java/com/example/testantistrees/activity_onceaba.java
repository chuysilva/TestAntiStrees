package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class activity_onceaba extends AppCompatActivity {
    private TextView resultado1;
    private RadioButton rb1,rb2,rb3,rb4;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onceaba);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton4);
        rb4 = (RadioButton) findViewById(R.id.radioButton3);
    }
    public void Siguiente(View view) {

        int resultadoIntensidad = getIntent().getIntExtra("resultadoIntensidad",0);
        int preguntaTrabajo = getIntent().getIntExtra("preguntaTrabajo",0);
        int preguntaCasa = getIntent().getIntExtra("preguntaCasa",0);
        int preguntaEscuela = getIntent().getIntExtra("preguntaEscuela",0);

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {

            int preguntaTrabajo3 = 0;

            if(rb1.isChecked()){
                preguntaTrabajo3 = preguntaTrabajo + 1;
            }
            if(rb2.isChecked()){
                preguntaTrabajo3 = preguntaTrabajo + 2;
            }
            if(rb3.isChecked()){
                preguntaTrabajo3 = preguntaTrabajo + 3;
            }
            if(rb4.isChecked()){
                preguntaTrabajo3 = preguntaTrabajo + 0;
            }
            Intent sig = new Intent(this, activity_doceaba.class);
            sig.putExtra("resultadoIntensidad", resultadoIntensidad);
            sig.putExtra("preguntaTrabajo", preguntaTrabajo3);
            sig.putExtra("preguntaCasa", preguntaCasa);
            sig.putExtra("preguntaEscuela", preguntaEscuela);
            startActivity(sig);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Elige una opción, por favor!", Toast.LENGTH_LONG).show();
        }
    }
}