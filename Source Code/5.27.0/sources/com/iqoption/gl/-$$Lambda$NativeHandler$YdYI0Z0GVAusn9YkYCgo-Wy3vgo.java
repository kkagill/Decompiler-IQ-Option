package com.iqoption.gl;

import com.iqoption.app.IQApp;
import com.iqoption.gl.NativeHandler.d;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$YdYI0Z0GVAusn9YkYCgo-Wy3vgo implements Runnable {
    private final /* synthetic */ double f$0;

    public /* synthetic */ -$$Lambda$NativeHandler$YdYI0Z0GVAusn9YkYCgo-Wy3vgo(double d) {
        this.f$0 = d;
    }

    public final void run() {
        IQApp.Ex().bd(new d().setValue(Double.valueOf(this.f$0)));
    }
}
