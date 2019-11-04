package org.threeten.bp.format;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeTextProvider */
public abstract class e {
    private static final AtomicReference<e> fIO = new AtomicReference();

    /* compiled from: DateTimeTextProvider */
    static class a {
        static final e fIP = bTN();

        static e bTN() {
            e.fIO.compareAndSet(null, new g());
            return (e) e.fIO.get();
        }
    }

    public abstract String a(org.threeten.bp.temporal.e eVar, long j, TextStyle textStyle, Locale locale);

    static e bTL() {
        return a.fIP;
    }
}
