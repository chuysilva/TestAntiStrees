package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16);

        TextView txt = (TextView) findViewById(R.id.intensidad);
        TextView txt2 = (TextView) findViewById(R.id.trabajo);
        TextView txt3 = (TextView) findViewById(R.id.casa);
        TextView txt4 = (TextView) findViewById(R.id.escuela);

        int intensidad = getIntent().getIntExtra("resultadoIntensidad",0);
        int trabajo = getIntent().getIntExtra("preguntaTrabajo",0);
        int casa = getIntent().getIntExtra("preguntaCasa",0);
        int escuela = getIntent().getIntExtra("preguntaEscuela",0);

        txt.setText("" + intensidad);
        txt2.setText("" + trabajo);
        txt3.setText("" + casa);
        txt4.setText("" + escuela);
    }


}