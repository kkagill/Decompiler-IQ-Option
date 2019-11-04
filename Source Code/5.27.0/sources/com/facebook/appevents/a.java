package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.f;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: AnalyticsUserIDStore */
class a {
    private static final String TAG = "a";
    private static volatile boolean initialized = false;
    private static ReentrantReadWriteLock vc = new ReentrantReadWriteLock();
    private static String vd;

    a() {
    }

    public static void ib() {
        if (!initialized) {
            g.iw().execute(new Runnable() {
                public void run() {
                    a.ie();
                }
            });
        }
    }

    public static String ic() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            ie();
        }
        vc.readLock().lock();
        try {
            String str = vd;
            return str;
        } finally {
            vc.readLock().unlock();
        }
    }

    private static void ie() {
        if (!initialized) {
            vc.writeLock().lock();
            try {
                if (!initialized) {
                    vd = PreferenceManager.getDefaultSharedPreferences(f.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    initialized = true;
                    vc.writeLock().unlock();
                }
            } finally {
                vc.writeLock().unlock();
            }
        }
    }
}
