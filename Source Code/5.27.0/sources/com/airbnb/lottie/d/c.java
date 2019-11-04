package com.airbnb.lottie.d;

import android.util.Log;
import com.airbnb.lottie.d;
import com.airbnb.lottie.j;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LogcatLogger */
public class c implements j {
    private static final Set<String> jV = new HashSet();

    public void q(String str) {
        b(str, null);
    }

    public void b(String str, Throwable th) {
        if (d.DBG) {
            Log.d("LOTTIE", str, th);
        }
    }

    public void warning(String str) {
        a(str, null);
    }

    public void a(String str, Throwable th) {
        if (!jV.contains(str)) {
            Log.w("LOTTIE", str, th);
            jV.add(str);
        }
    }
}
