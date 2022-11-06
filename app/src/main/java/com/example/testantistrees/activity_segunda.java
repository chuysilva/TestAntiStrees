package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_segunda extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12;
    private RadioGroup rg1,rg2,rg3,rg4,rg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        rb1 = (RadioButton) findViewById(R.id.radioButton32);
        rb2 = (RadioButton) findViewById(R.id.radioButton33);
        rb3 = (RadioButton) findViewById(R.id.radioButton40);
        //rb4 = (RadioButton) findViewById(R.id.radioButton41);
        rb5 = (RadioButton) findViewById(R.id.radioButton38);
        //rb6 = (RadioButton) findViewById(R.id.radioButton39);
        rb7 = (RadioButton) findViewById(R.id.radioButton36);
        //rb8 = (RadioButton) findViewById(R.id.radioButton37);
        rb9 = (RadioButton) findViewById(R.id.radioButton34);
        //rb10 = (RadioButton) findViewById(R.id.radioButton35);
        rb11 = (RadioButton) findViewById(R.id.radioButton30);
        //rb12 = (RadioButton) findViewById(R.id.radioButton31);

    }

    public void Siguiente(View view) {

        int intensidad = 0;

        if(rb1.isChecked() || rb2.isChecked() )//|| rb3.isChecked() || rb4.isChecked() || rb5.isChecked() || rb6.isChecked() || rb7.isChecked() || rb8.isChecked() || rb9.isChecked() || rb10.isChecked() || rb11.isChecked() || rb12.isChecked())
        {
            /*Nadamas tomar en cuenta cuando pongan que si
            if (rb1.isChecked()){
                intensidad += 1;
            }
            if(rb3.isChecked()){
                intensidad += 1;
            }
            if(rb5.isChecked()) {
                intensidad += 1;
            }
            if(rb7.isChecked()){
                intensidad += 1;
            }
            if(rb9.isChecked()){
                intensidad += 1;
            }
            if(rb11.isChecked()) {
                intensidad += 1;
            }*/
            Toast.makeText(getApplicationContext(), "Smn", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Todos los campos deben estar llenos!", Toast.LENGTH_SHORT).show();
        }
            /*
        if(rb2.isChecked() && rb4.isChecked() && rb6.isChecked() && rb8.isChecked() && rb10.isChecked() && rb12.isChecked())
        {
            Toast.makeText(getApplicationContext(), "Todos puso que no!", Toast.LENGTH_SHORT).show();
        }
         else
         {
             Toast.makeText(getApplicationContext(), "Todos los campos deben estar llenos!", Toast.LENGTH_SHORT).show();
         }*/

    }
}