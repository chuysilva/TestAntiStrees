package com.example.testantistrees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        rb1 = (RadioButton)findViewById(R.id.radioButton22);
        rb2 = (RadioButton)findViewById(R.id.radioButton13);
        rb3 = (RadioButton)findViewById(R.id.radioButton14);
        rb4 = (RadioButton)findViewById(R.id.radioButton15);
        rb5 = (RadioButton)findViewById(R.id.radioButton16);
        rb6 = (RadioButton)findViewById(R.id.radioButton17);
        rb7 = (RadioButton)findViewById(R.id.radioButton18);
        rb8 = (RadioButton)findViewById(R.id.radioButton12);
        rb9 = (RadioButton)findViewById(R.id.radioButton20);
        rb10 = (RadioButton)findViewById(R.id.radioButton19);
        rb11 = (RadioButton)findViewById(R.id.radioButton21);
        rb12 = (RadioButton)findViewById(R.id.radioButton23);
    }

    public void Siguiente(View view)
    {
        if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked() || rb6.isChecked() || rb7.isChecked() || rb8.isChecked() || rb9.isChecked() || rb10.isChecked() || rb11.isChecked() || rb12.isChecked())
        {
            /*
            if (rb1.isChecked() == true) {
                resultado1 = resultado1 + 5;
            } else if (rb2.isChecked() == true) {
                resultado1 = resultado1 + 4;
            } else if (rb3.isChecked() == true) {
                resultado1 = resultado1 + 3;
            } else if (rb4.isChecked() == true) {
                resultado1 = resultado1 + 2;
            } else if (rb5.isChecked() == true) {
                resultado1 = resultado1 + 1;
            }*/
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Selecciona una opción por favor!", Toast.LENGTH_SHORT).show();
        }
    }

}