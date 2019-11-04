package com.iqoption.system.a;

import com.iqoption.app.IQApp;
import java.lang.ref.WeakReference;

/* compiled from: SocketEventHandlerBaseT */
public class g<T> {
    private boolean dUn;
    protected final WeakReference<T> dUo;

    public g(T t) {
        this.dUo = new WeakReference(t);
    }

    public void register() {
        if (!this.dUn) {
            IQApp.Ew().bb(this);
            this.dUn = true;
        }
    }

    public void unregister() {
        if (this.dUn) {
            IQApp.br(this);
            this.dUn = false;
        }
    }
}
