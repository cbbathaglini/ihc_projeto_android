package com.example.ihc_projetos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio2Tela1Activity extends AppCompatActivity {

    EditText edt_texto;
    Button btn_enviar_texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio2_tela1_layout);


        btn_enviar_texto = findViewById(R.id.button_exercicio2);

        btn_enviar_texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_texto = findViewById(R.id.editText_texto);
                String text = edt_texto.getText().toString();

                Intent intent = new Intent(v.getContext(),Exercicio2Tela2Activity.class);
                intent.putExtra("textoEnviado",text);
                startActivity(intent);
            }
        });

    }
}
