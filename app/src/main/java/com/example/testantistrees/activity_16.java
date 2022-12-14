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
        TextView resultado = (TextView) findViewById(R.id.resultadoEstres);
        TextView resultado2 = (TextView) findViewById(R.id.resultado2);


        int intensidad = getIntent().getIntExtra("resultadoIntensidad",0);
        int trabajo = getIntent().getIntExtra("preguntaTrabajo",0);
        int casa = getIntent().getIntExtra("preguntaCasa",0);
        int escuela = getIntent().getIntExtra("preguntaEscuela",0);

        int rIntensidad = intensidad * 16;
        txt.setText("" + rIntensidad + "%");
        txt2.setText("" + trabajo);
        txt3.setText("" + casa);
        txt4.setText("" + escuela);

        if(trabajo > (casa & escuela)){
            resultado.setText("Trabajo");
        }else if(casa > (trabajo & escuela)){
            resultado.setText("Casa");
        }else if(escuela > (trabajo & casa)){
            resultado.setText("Escuela");
        }

        if(trabajo == casa && trabajo == escuela){
            resultado.setText("Trabajo, Casa y Escuela ");
        }else if(trabajo == escuela){
            resultado2.setText(" y Escuela");
        }else if(trabajo == casa){
            resultado2.setText(" y Casa");
        }
    }


}