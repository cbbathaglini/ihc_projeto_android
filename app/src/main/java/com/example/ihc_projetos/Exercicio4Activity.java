package com.example.ihc_projetos;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    SensorManager sensor_manager;
    Sensor sensor_luminosidade;

    TextView txtLuz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio4_layout);

        txtLuz = findViewById(R.id.textView_valorLuz);

        sensor_manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor_luminosidade = sensor_manager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if(sensor_luminosidade != null) {
            sensor_manager.registerListener(new SensorEventListener() {
                @Override
                public void onSensorChanged(SensorEvent event) {
                    Sensor sensor = event.sensor;
                    if(sensor.getType() == Sensor.TYPE_LIGHT)
                    {
                        txtLuz.setText("Light Intensity: " + event.values[0]);
                    }
                }

                @Override
                public void onAccuracyChanged(Sensor sensor, int accuracy) {

                }
            },sensor_luminosidade, SensorManager.SENSOR_DELAY_NORMAL);
        }else{
            txtLuz.setText("Light sensor not supported");
        }
    }
}
