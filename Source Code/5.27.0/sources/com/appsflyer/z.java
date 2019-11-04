package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class z implements SensorEventListener {
    @NonNull
    private final String kZ;
    @NonNull
    private final String lc;
    private long lf;
    private final int mB;
    private double mC;
    private final float[][] my = new float[2][];
    private final long[] mz = new long[2];
    /* renamed from: ॱ */
    private final int f25;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private z(int i, @Nullable String str, @Nullable String str2) {
        this.f25 = i;
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        this.kZ = str;
        if (str2 == null) {
            str2 = str3;
        }
        this.lc = str2;
        this.mB = ((((i + 31) * 31) + this.kZ.hashCode()) * 31) + this.lc.hashCode();
    }

    static z a(Sensor sensor) {
        return new z(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    private static double a(@NonNull float[] fArr, @NonNull float[] fArr2) {
        double d = 0.0d;
        for (int i = 0; i < Math.min(fArr.length, fArr2.length); i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    @NonNull
    private static List<Float> a(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!(sensorEvent == null || sensorEvent.values == null)) {
            Sensor sensor = sensorEvent.sensor;
            Object obj = (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? null : 1;
            if (obj != null) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (b(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[][] fArr2 = this.my;
                    float[] fArr3 = fArr2[0];
                    if (fArr3 == null) {
                        fArr2[0] = Arrays.copyOf(fArr, fArr.length);
                        this.mz[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr4 = fArr2[1];
                    if (fArr4 == null) {
                        fArr = Arrays.copyOf(fArr, fArr.length);
                        this.my[1] = fArr;
                        this.mz[1] = currentTimeMillis;
                        this.mC = a(fArr3, fArr);
                    } else if (50000000 <= j - this.lf) {
                        this.lf = j;
                        if (Arrays.equals(fArr4, fArr)) {
                            this.mz[1] = currentTimeMillis;
                            return;
                        }
                        double a = a(fArr3, fArr);
                        if (a > this.mC) {
                            this.my[1] = Arrays.copyOf(fArr, fArr.length);
                            this.mz[1] = currentTimeMillis;
                            this.mC = a;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void g(@NonNull Map<z, Map<String, Object>> map) {
        a((Map) map, true);
    }

    public final void i(Map<z, Map<String, Object>> map) {
        a((Map) map, false);
    }

    private boolean b(int i, @NonNull String str, @NonNull String str2) {
        return this.f25 == i && this.kZ.equals(str) && this.lc.equals(str2);
    }

    @NonNull
    private Map<String, Object> dO() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f25));
        hashMap.put("sN", this.kZ);
        hashMap.put("sV", this.lc);
        float[] fArr = this.my[0];
        if (fArr != null) {
            hashMap.put("sVS", a(fArr));
        }
        fArr = this.my[1];
        if (fArr != null) {
            hashMap.put("sVE", a(fArr));
        }
        return hashMap;
    }

    /* renamed from: do */
    private void m1do() {
        for (int i = 0; i < 2; i++) {
            this.my[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.mz[i2] = 0;
        }
        this.mC = 0.0d;
        this.lf = 0;
    }

    public final int hashCode() {
        return this.mB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return b(zVar.f25, zVar.kZ, zVar.lc);
    }

    private void a(@NonNull Map<z, Map<String, Object>> map, boolean z) {
        int i = 0;
        if (this.my[0] != null) {
            i = 1;
        }
        if (i != 0) {
            map.put(this, dO());
            if (z) {
                m1do();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, dO());
        }
    }
}
