package com.example.ihc_projetos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Tela2Activity extends AppCompatActivity {

    TextView txt_textoEnviado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio2_tela2_layout);

        txt_textoEnviado = findViewById(R.id.textView_textoEnviado);
        txt_textoEnviado.setText(getIntent().getStringExtra("textoEnviado"));
    }
}
