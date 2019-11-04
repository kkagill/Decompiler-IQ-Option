package com.iqoption.system.a;

import com.iqoption.app.IQApp;

/* compiled from: SocketEventHandlerBase */
public class f {
    private boolean dUn;

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
