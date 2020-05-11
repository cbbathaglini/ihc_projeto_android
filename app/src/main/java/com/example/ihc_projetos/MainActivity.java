package com.example.ihc_projetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_ex1;
    Button btn_ex2;
    Button btn_ex3;
    Button btn_ex4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ex1 = findViewById(R.id.button_exercicio1);
        btn_ex2 = findViewById(R.id.button_exercicio2);
        btn_ex3 = findViewById(R.id.button_exercicio3);
        btn_ex4 = findViewById(R.id.button_exercicio4);

        //botão para o exercício 1
        btn_ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio1Activity.class));
            }
        });

        //botão para o exercício 2
        btn_ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio2Tela1Activity.class));
            }
        });

        //botão para o exercício 3 - acelerometro
        btn_ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio3Tela1Activity.class));
            }
        });

        //botão para o exercício 4 - luminosidade
        btn_ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Exercicio4Activity.class));
            }
        });

    }
}
