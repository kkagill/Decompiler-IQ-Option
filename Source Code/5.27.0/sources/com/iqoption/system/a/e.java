package com.iqoption.system.a;

import com.iqoption.app.IQApp;
import java.lang.ref.WeakReference;

/* compiled from: EventHandlerBaseT */
public class e<T> {
    private boolean dUn;
    protected final WeakReference<T> dUo;

    public e(T t) {
        this.dUo = new WeakReference(t);
    }

    public void register() {
        if (!this.dUn) {
            IQApp.Ex().bb(this);
            this.dUn = true;
        }
    }

    public void unregister() {
        if (this.dUn) {
            IQApp.bs(this);
            this.dUn = false;
        }
    }
}
