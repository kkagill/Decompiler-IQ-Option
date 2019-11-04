package com.iqoption.gl;

import com.iqoption.app.IQApp;
import com.iqoption.gl.NativeHandler.o;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$NJXPPmtSkpPrtkb3MJwFQ2VKgjE implements Runnable {
    private final /* synthetic */ double f$0;
    private final /* synthetic */ double f$1;
    private final /* synthetic */ double f$2;

    public /* synthetic */ -$$Lambda$NativeHandler$NJXPPmtSkpPrtkb3MJwFQ2VKgjE(double d, double d2, double d3) {
        this.f$0 = d;
        this.f$1 = d2;
        this.f$2 = d3;
    }

    public final void run() {
        IQApp.Ex().bd(new o(this.f$0, this.f$1, this.f$2));
    }
}
