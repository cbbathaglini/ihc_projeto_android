package com.example.ihc_projetos;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5Activity extends AppCompatActivity {

    SensorManager sensor_manager;
    Sensor sensor_giroscopio;

    EditText edt_eixo_X;
    EditText edt_eixo_Y;
    EditText edt_eixo_Z;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio5_layout);

        edt_eixo_X = findViewById(R.id.editText_eixoXG);
        edt_eixo_Y = findViewById(R.id.editText_eixoYG);
        edt_eixo_Z = findViewById(R.id.editText_eixoZG);


        context = this.getApplicationContext();
        sensor_manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor_giroscopio = sensor_manager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        if(sensor_giroscopio != null){
            sensor_manager.registerListener(new SensorEventListener() {
                @Override
                public void onSensorChanged(SensorEvent event) {

                    float x =  event.values[0];
                    float y =  event.values[1];
                    float z =  event.values[2];

                    edt_eixo_X.setText(Float.toString(x));
                    edt_eixo_Y.setText(Float.toString(y));
                    edt_eixo_Z.setText(Float.toString(z));

                }

                @Override
                public void onAccuracyChanged(Sensor sensor, int accuracy) {
                    Log.d("DominandoAndroid", "Precisão mudou");
                }
            },sensor_giroscopio, SensorManager.SENSOR_DELAY_NORMAL);
        }

    }


}
