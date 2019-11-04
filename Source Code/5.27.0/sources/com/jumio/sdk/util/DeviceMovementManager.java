package com.jumio.sdk.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.jumio.commons.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeviceMovementManager implements SensorEventListener {
    private Sensor accelerometer;
    private final AtomicBoolean deviceSteady = new AtomicBoolean(true);
    private long lastShake;
    private SensorManager sensorManager;
    private float steadyThreshold = 1.2f;
    private int steadyTimeOffset = Callback.DEFAULT_SWIPE_ANIMATION_DURATION;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public DeviceMovementManager(Context context, int i, float f) {
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            this.accelerometer = sensorManager.getDefaultSensor(10);
        }
        this.steadyTimeOffset = i;
        this.steadyThreshold = f;
    }

    public void start() {
        this.lastShake = 0;
        this.deviceSteady.set(true);
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.accelerometer, 3);
        }
    }

    public void stop() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public boolean isDeviceSteady() {
        return this.deviceSteady.get();
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 10) {
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            if (((float) Math.sqrt((double) (((f * f) + (f2 * f2)) + (f3 * f3)))) > this.steadyThreshold) {
                this.lastShake = System.currentTimeMillis();
                this.deviceSteady.set(false);
                Log.v("Device shake");
            } else if (System.currentTimeMillis() > this.lastShake + ((long) this.steadyTimeOffset)) {
                this.deviceSteady.set(true);
                Log.v("Device steady");
            }
        }
    }
}
