package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import com.iqoption.dto.entity.ActiveQuote;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {
    private static long la = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        /* renamed from: ॱ */
        private int f2;

        private LogLevel(int i) {
            this.f2 = i;
        }

        public final int getLevel() {
            return this.f2;
        }
    }

    public static void a(String str, boolean z) {
        if ((LogLevel.INFO.getLevel() <= m.dw().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : null) != null) {
            Log.i("AppsFlyer_4.9.0", b(str, false));
        }
        if (z) {
            ag.dT().m(ActiveQuote.PHASE_INTRADAY_AUCTION, b(str, true));
        }
    }

    public static void dn() {
        la = System.currentTimeMillis();
    }

    @NonNull
    private static String b(String str, boolean z) {
        if (!z) {
            if (LogLevel.VERBOSE.getLevel() > m.dw().getInt("logLevel", LogLevel.NONE.getLevel())) {
                return str;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(c(System.currentTimeMillis() - la));
        stringBuilder.append(") [");
        stringBuilder.append(Thread.currentThread().getName());
        stringBuilder.append("] ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private static void a(String str, Throwable th, boolean z) {
        if ((LogLevel.ERROR.getLevel() <= m.dw().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : null) != null && z) {
            Log.e("AppsFlyer_4.9.0", b(str, false), th);
        }
        ag.dT().c(th);
    }

    static void F(String str) {
        if ((LogLevel.WARNING.getLevel() <= m.dw().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : null) != null) {
            Log.w("AppsFlyer_4.9.0", b(str, false));
        }
        ag.dT().m("W", b(str, true));
    }

    public static void G(String str) {
        if ((LogLevel.VERBOSE.getLevel() <= m.dw().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : null) != null) {
            Log.v("AppsFlyer_4.9.0", b(str, false));
        }
        ag.dT().m("V", b(str, true));
    }

    public static void J(String str) {
        a(str, true);
    }

    public static void c(String str, Throwable th) {
        a(str, th, false);
    }

    public static void K(String str) {
        F(str);
    }

    private static String c(long j) {
        j -= TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
        j -= TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(j));
        j = TimeUnit.MILLISECONDS.toMillis(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(r0), Long.valueOf(r2), Long.valueOf(r4), Long.valueOf(j)});
    }

    static void H(String str) {
        if (!m.dw().dA()) {
            Log.d("AppsFlyer_4.9.0", b(str, false));
        }
        ag.dT().m("F", str);
    }

    public static void I(String str) {
        if ((LogLevel.DEBUG.getLevel() <= m.dw().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : null) != null) {
            Log.d("AppsFlyer_4.9.0", b(str, false));
        }
        ag.dT().m("D", b(str, true));
    }
}
