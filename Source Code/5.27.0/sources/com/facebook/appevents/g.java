package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.facebook.a;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.f;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: InternalAppEventsLogger */
public class g {
    private e vq;

    public g(Context context) {
        this.vq = new e(context, null, null);
    }

    public g(Context context, String str) {
        this.vq = new e(context, str, null);
    }

    public g(String str, String str2, a aVar) {
        this.vq = new e(str, str2, aVar);
    }

    public void logEvent(String str, Bundle bundle) {
        if (f.gZ()) {
            this.vq.logEvent(str, bundle);
        }
    }

    public void a(String str, double d, Bundle bundle) {
        if (f.gZ()) {
            this.vq.a(str, d, bundle);
        }
    }

    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (f.gZ()) {
            this.vq.a(bigDecimal, currency, bundle);
        }
    }

    public void a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (f.gZ()) {
            this.vq.a(str, bigDecimal, currency, bundle);
        }
    }

    public void aR(String str) {
        if (f.gZ()) {
            this.vq.a(str, null, null);
        }
    }

    public void a(String str, Double d, Bundle bundle) {
        if (f.gZ()) {
            this.vq.a(str, d, bundle);
        }
    }

    public void d(String str, Bundle bundle) {
        if (f.gZ()) {
            this.vq.a(str, null, bundle);
        }
    }

    public static FlushBehavior iq() {
        return e.iq();
    }

    public void flush() {
        this.vq.flush();
    }

    static Executor iw() {
        return e.iw();
    }

    static String it() {
        return e.it();
    }
}
