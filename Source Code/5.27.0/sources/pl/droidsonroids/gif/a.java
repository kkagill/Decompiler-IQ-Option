package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: LibraryLoader */
public class a {
    @SuppressLint({"StaticFieldLeak"})
    private static Context fMW;

    private static Context getContext() {
        if (fMW == null) {
            try {
                fMW = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return fMW;
    }

    static void bWg() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            b.cJ(getContext());
        }
    }
}
