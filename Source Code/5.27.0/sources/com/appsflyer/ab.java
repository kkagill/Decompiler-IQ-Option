package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ab {
    private static final BitSet mE = new BitSet(6);
    private static final Handler mF = new Handler(Looper.getMainLooper());
    private static volatile ab mG;
    boolean lU;
    final Handler mH;
    final Object mI = new Object();
    private final Map<z, z> mJ = new HashMap(mE.size());
    private final Map<z, Map<String, Object>> mK = new HashMap(mE.size());
    private final SensorManager mL;
    private boolean mM;
    final Runnable mN = new Runnable() {
        public final void run() {
            synchronized (ab.this.mI) {
                ab.this.m0do();
                ab.this.mH.postDelayed(ab.this.mO, 1800000);
            }
        }
    };
    final Runnable mO = new Runnable() {
        public final void run() {
            synchronized (ab.this.mI) {
                ab.this.dp();
                ab.this.mH.postDelayed(ab.this.mN, 500);
                ab.this.lU = true;
            }
        }
    };
    final Runnable mP = new Runnable() {
        public final void run() {
            synchronized (ab.this.mI) {
                if (ab.this.lU) {
                    ab.this.mH.removeCallbacks(ab.this.mO);
                    ab.this.mH.removeCallbacks(ab.this.mN);
                    ab.this.m0do();
                    ab.this.lU = false;
                }
            }
        }
    };

    static {
        mE.set(1);
        mE.set(2);
        mE.set(4);
    }

    private ab(@NonNull SensorManager sensorManager, Handler handler) {
        this.mL = sensorManager;
        this.mH = handler;
    }

    static ab D(Context context) {
        return a((SensorManager) context.getApplicationContext().getSystemService("sensor"), mF);
    }

    private static ab a(SensorManager sensorManager, Handler handler) {
        if (mG == null) {
            synchronized (ab.class) {
                if (mG == null) {
                    mG = new ab(sensorManager, handler);
                }
            }
        }
        return mG;
    }

    /* Access modifiers changed, original: final */
    public final void dp() {
        try {
            for (Sensor sensor : this.mL.getSensorList(-1)) {
                int type = sensor.getType();
                Object obj = (type < 0 || !mE.get(type)) ? null : 1;
                if (obj != null) {
                    z a = z.a(sensor);
                    if (!this.mJ.containsKey(a)) {
                        this.mJ.put(a, a);
                    }
                    this.mL.registerListener((SensorEventListener) this.mJ.get(a), sensor, 0);
                }
            }
        } catch (Throwable unused) {
        }
        this.mM = true;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: do */
    public final void m0do() {
        try {
            if (!this.mJ.isEmpty()) {
                for (z zVar : this.mJ.values()) {
                    this.mL.unregisterListener(zVar);
                    zVar.g(this.mK);
                }
            }
        } catch (Throwable unused) {
        }
        this.mM = false;
    }

    /* Access modifiers changed, original: final */
    @NonNull
    public final List<Map<String, Object>> dP() {
        synchronized (this.mI) {
            if (!this.mJ.isEmpty() && this.mM) {
                for (z i : this.mJ.values()) {
                    i.i(this.mK);
                }
            }
            if (this.mK.isEmpty()) {
                List emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(this.mK.values());
            return arrayList;
        }
    }
}
