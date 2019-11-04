package com.facebook.internal;

import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.f;
import java.util.HashMap;
import java.util.Map.Entry;

/* compiled from: Logger */
public class s {
    private static final HashMap<String, String> zp = new HashMap();
    private int priority = 3;
    private final String tag;
    private final LoggingBehavior zq;
    private StringBuilder zr;

    public static synchronized void D(String str, String str2) {
        synchronized (s.class) {
            zp.put(str, str2);
        }
    }

    public static synchronized void bk(String str) {
        synchronized (s.class) {
            if (!f.a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                D(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public static void a(LoggingBehavior loggingBehavior, String str, String str2) {
        a(loggingBehavior, 3, str, str2);
    }

    public static void a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (f.a(loggingBehavior)) {
            a(loggingBehavior, 3, str, String.format(str2, objArr));
        }
    }

    public static void a(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        if (f.a(loggingBehavior)) {
            a(loggingBehavior, i, str, String.format(str2, objArr));
        }
    }

    public static void a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (f.a(loggingBehavior)) {
            str2 = bl(str2);
            String str3 = "FacebookSDK.";
            if (!str.startsWith(str3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            Log.println(i, str, str2);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    private static synchronized String bl(String str) {
        synchronized (s.class) {
            for (Entry entry : zp.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public s(LoggingBehavior loggingBehavior, String str) {
        aa.H(str, "tag");
        this.zq = loggingBehavior;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FacebookSDK.");
        stringBuilder.append(str);
        this.tag = stringBuilder.toString();
        this.zr = new StringBuilder();
    }

    public void log() {
        bm(this.zr.toString());
        this.zr = new StringBuilder();
    }

    public void bm(String str) {
        a(this.zq, this.priority, this.tag, str);
    }

    public void append(String str) {
        if (ku()) {
            this.zr.append(str);
        }
    }

    public void c(String str, Object... objArr) {
        if (ku()) {
            this.zr.append(String.format(str, objArr));
        }
    }

    public void a(String str, Object obj) {
        c("  %s:\t%s\n", str, obj);
    }

    private boolean ku() {
        return f.a(this.zq);
    }
}
