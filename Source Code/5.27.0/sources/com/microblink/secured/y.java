package com.microblink.secured;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.microblink.hardware.a.a;
import com.microblink.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: line */
public final class y implements SensorEventListener {
    private static float exF = 0.47f;
    private static float exG = 0.2f;
    private static float exH = 0.66f;
    private s exI;
    public a exJ;
    public AtomicBoolean exK;
    private int exL;
    private long exM;

    private float ben() {
        float x = this.exI.getX();
        float y = this.exI.getY();
        float z = this.exI.getZ();
        return (float) Math.sqrt((double) (((x * x) + (y * y)) + (z * z)));
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        Log.f(this, "Accelerometer accuracy has changed", new Object[0]);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        c(sensorEvent.values);
    }

    private void c(float[] fArr) {
        if (this.exM >= 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.exM;
            if (currentTimeMillis > 0) {
                float f = (float) this.exL;
                float f2 = exH;
                this.exL = (int) ((f * f2) + (((float) (currentTimeMillis * 1000)) * (1.0f - f2)));
                this.exI.ai((((float) this.exL) / 1000.0f) / 1000.0f);
            }
        }
        int i = 1;
        this.exI.j(fArr[0], fArr[1], fArr[2]);
        Object obj = (this.exK.get() || ben() <= exF) ? null : 1;
        if (obj != null) {
            this.exK.set(true);
            this.exJ.bdo();
        } else {
            if (!this.exK.get() || ben() >= exG) {
                i = 0;
            }
            if (i != 0) {
                this.exK.set(false);
                this.exJ.bdp();
            }
        }
        this.exM = System.currentTimeMillis();
    }
}
