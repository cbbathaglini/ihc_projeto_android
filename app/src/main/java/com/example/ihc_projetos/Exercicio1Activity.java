package com.example.ihc_projetos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity {

    TextView txt_resultado;
    EditText num1;
    EditText num2;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio1_layout);

        btn_calcular = findViewById(R.id.button_calcular);
        num1 = findViewById(R.id.editText_num1);
        num2 = findViewById(R.id.editText_num2);
        txt_resultado = findViewById(R.id.textView_resultado);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double numero2 = Double.parseDouble(num2.getText().toString());

                double soma = numero1 + numero2;
                txt_resultado.setVisibility(View.VISIBLE);
                txt_resultado.setText(Double.toString(soma));
            }

        });


    }
}
