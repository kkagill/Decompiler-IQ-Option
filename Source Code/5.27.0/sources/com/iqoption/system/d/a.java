package com.iqoption.system.d;

import android.os.SystemClock;
import java.io.IOException;

/* compiled from: NtpTime */
public class a {
    private static final String TAG = "com.iqoption.system.d.a";
    private static final a dUx = new a();
    private static final b dUy = new b();
    private static final String[] dUz = new String[]{"0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org"};

    public static long ch(long j) {
        if (isInitialized()) {
            return aUI() + (j - aUH());
        }
        throw new IllegalStateException("You need to call init() on NtpTime at least once.");
    }

    public static long ci(long j) {
        if (isInitialized()) {
            return ch(j);
        }
        return System.currentTimeMillis() + (j - SystemClock.elapsedRealtime());
    }

    public static boolean isInitialized() {
        return dUy.aUJ();
    }

    public static a aUF() {
        return dUx;
    }

    public void initialize() {
        if (!isInitialized()) {
            aUG();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public long[] aUG() {
        String[] strArr = dUz;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                strArr = dUy.N(strArr[i], 30000);
                return strArr;
            } catch (Exception unused) {
                i++;
            }
        }
        throw new IOException("SNTP request failed");
    }

    private static long aUH() {
        return dUy.aUL();
    }

    private static long aUI() {
        return dUy.aUK();
    }
}
