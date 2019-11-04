package com.iqoption.system.a;

import com.iqoption.app.IQApp;

/* compiled from: EventHandlerBase */
public class d {
    private boolean dUn;

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
