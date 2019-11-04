package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ExceptionBuilder;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzch;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

@VisibleForTesting
public class ExceptionReporter implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler zzrk;
    private final Tracker zzrl;
    private final Context zzrm;
    private ExceptionParser zzrn;
    private GoogleAnalytics zzro;

    public ExceptionReporter(Tracker tracker, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (context != null) {
            Object obj;
            this.zzrk = uncaughtExceptionHandler;
            this.zzrl = tracker;
            this.zzrn = new StandardExceptionParser(context, new ArrayList());
            this.zzrm = context.getApplicationContext();
            String str = "ExceptionReporter created, original handler is ";
            if (uncaughtExceptionHandler == null) {
                obj = "null";
            } else {
                obj = uncaughtExceptionHandler.getClass().getName();
            }
            String valueOf = String.valueOf(obj);
            zzch.zzab(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else {
            throw new NullPointerException("context cannot be null");
        }
    }

    public ExceptionParser getExceptionParser() {
        return this.zzrn;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzrn = exceptionParser;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Object description;
        if (this.zzrn != null) {
            description = this.zzrn.getDescription(thread != null ? thread.getName() : null, th);
        } else {
            description = "UncaughtException";
        }
        String str = "Reporting uncaught exception: ";
        String valueOf = String.valueOf(description);
        zzch.zzab(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.zzrl.send(new ExceptionBuilder().setDescription(description).setFatal(true).build());
        if (this.zzro == null) {
            this.zzro = GoogleAnalytics.getInstance(this.zzrm);
        }
        GoogleAnalytics googleAnalytics = this.zzro;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.zzab().zzcs().zzcj();
        if (this.zzrk != null) {
            zzch.zzab("Passing exception to the original handler");
            this.zzrk.uncaughtException(thread, th);
        }
    }

    /* Access modifiers changed, original: final */
    public final UncaughtExceptionHandler zzaf() {
        return this.zzrk;
    }
}
