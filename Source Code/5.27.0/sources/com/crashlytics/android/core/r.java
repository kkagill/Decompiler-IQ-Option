package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.services.settings.s;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler */
class r implements UncaughtExceptionHandler {
    private final a rc;
    private final b rd;
    private final boolean re;
    private final UncaughtExceptionHandler rf;
    private final AtomicBoolean rg = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface a {
        void b(b bVar, Thread thread, Throwable th, boolean z);
    }

    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    interface b {
        s fa();
    }

    public r(a aVar, b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.rc = aVar;
        this.rd = bVar;
        this.re = z;
        this.rf = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str = "Crashlytics completed exception processing. Invoking default exception handler.";
        String str2 = "CrashlyticsCore";
        this.rg.set(true);
        try {
            this.rc.b(this.rd, thread, th, this.re);
        } catch (Exception e) {
            c.biX().e(str2, "An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            c.biX().d(str2, str);
            this.rf.uncaughtException(thread, th);
            this.rg.set(false);
        }
        c.biX().d(str2, str);
        this.rf.uncaughtException(thread, th);
        this.rg.set(false);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean eS() {
        return this.rg.get();
    }
}
