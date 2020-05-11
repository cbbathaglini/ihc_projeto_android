package com.example.ihc_projetos;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio3Tela1Activity extends AppCompatActivity {

    SensorManager sensor_manager;
    Sensor sensor_acelerometro;

    EditText edt_eixo_X;
    EditText edt_eixo_Y;
    EditText edt_eixo_Z;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio3_tela1_layout);

        edt_eixo_X = findViewById(R.id.editText_eixoX);
        edt_eixo_Y = findViewById(R.id.editText_eixoY);
        edt_eixo_Z = findViewById(R.id.editText_eixoZ);

        context = this.getApplicationContext();

        sensor_manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor_acelerometro = sensor_manager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        if(sensor_acelerometro != null){
            sensor_manager.registerListener(new SensorEventListener() {
                @Override
                public void onSensorChanged(SensorEvent event) {

                    float x =  event.values[0];
                    float y =  event.values[1];
                    float z =  event.values[2];

                    edt_eixo_X.setText(Float.toString(x));
                    edt_eixo_Y.setText(Float.toString(y));
                    edt_eixo_Z.setText(Float.toString(z));

                    if(x > 1.0){
                        System.out.println("valor x:" + x);
                        Intent intent = new Intent(context,Exercicio3Tela2Activity.class);
                        intent.putExtra("textoEnviado","POSIÇÃO CORRETA");
                        startActivity(intent);
                    }
                }

                @Override
                public void onAccuracyChanged(Sensor sensor, int accuracy) {
                    Log.d("DominandoAndroid", "Precisão mudou");
                }
            },sensor_acelerometro, SensorManager.SENSOR_DELAY_NORMAL);
        }

    }


}
