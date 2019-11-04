package com.android.a.a;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

/* compiled from: InstallReferrerClient */
public abstract class a {

    /* compiled from: InstallReferrerClient */
    public static final class a {
        private final Context mContext;

        private a(Context context) {
            this.mContext = context;
        }

        @UiThread
        public a cW() {
            Context context = this.mContext;
            if (context != null) {
                return new b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @UiThread
    public abstract void a(@NonNull c cVar);

    @UiThread
    public abstract void cU();

    @UiThread
    public abstract d cV();

    @UiThread
    public abstract boolean isReady();

    @UiThread
    public static a g(@NonNull Context context) {
        return new a(context);
    }
}
