package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: ViewIndexingTrigger */
public class e implements SensorEventListener {
    private a wn;

    /* compiled from: ViewIndexingTrigger */
    public interface a {
        void iI();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void a(a aVar) {
        this.wn = aVar;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.wn != null) {
            float f = sensorEvent.values[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (sensorEvent.values[1] / 9.80665f);
            double d3 = (double) (sensorEvent.values[2] / 9.80665f);
            Double.isNaN(d);
            Double.isNaN(d);
            d *= d;
            Double.isNaN(d2);
            Double.isNaN(d2);
            d += d2 * d2;
            Double.isNaN(d3);
            Double.isNaN(d3);
            if (Math.sqrt(d + (d3 * d3)) > 2.299999952316284d) {
                this.wn.iI();
            }
        }
    }
}
