package com.iqoption.system.c;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.o;

/* compiled from: CheckFutureCallback */
public abstract class a<V> implements o<V> {
    public void U(Throwable th) {
    }

    public void cl(@NonNull V v) {
    }

    public void onSuccess(V v) {
        if (v == null) {
            try {
                U(new NullPointerException("not parse"));
                return;
            } catch (Throwable th) {
                U(th);
                return;
            }
        }
        cl(v);
    }

    public void l(Throwable th) {
        U(th);
    }
}
