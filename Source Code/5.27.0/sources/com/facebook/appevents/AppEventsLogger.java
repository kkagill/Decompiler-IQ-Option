package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import com.facebook.a;

public class AppEventsLogger {
    private static final String TAG = "com.facebook.appevents.AppEventsLogger";
    private e vq;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    public static void b(Application application, String str) {
        e.b(application, str);
    }

    public static void s(Context context, String str) {
        e.s(context, str);
    }

    public static AppEventsLogger O(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    private AppEventsLogger(Context context, String str, a aVar) {
        this.vq = new e(context, str, aVar);
    }

    public static FlushBehavior iq() {
        return e.iq();
    }

    public void aO(String str) {
        this.vq.aO(str);
    }

    public void logEvent(String str, Bundle bundle) {
        this.vq.logEvent(str, bundle);
    }

    public void flush() {
        this.vq.flush();
    }

    public static void ir() {
        e.ir();
    }

    public static String ic() {
        return a.ic();
    }

    public static String is() {
        return i.iz();
    }

    public static String P(Context context) {
        return e.P(context);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static void aP(String str) {
        e.aP(str);
    }
}
