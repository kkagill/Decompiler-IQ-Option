package com.iqoption.gl;

import com.iqoption.app.IQApp;
import com.iqoption.gl.NativeHandler.g;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$TQqLi7IPCK3SadHY83axyu4evqE implements Runnable {
    private final /* synthetic */ double f$0;

    public /* synthetic */ -$$Lambda$NativeHandler$TQqLi7IPCK3SadHY83axyu4evqE(double d) {
        this.f$0 = d;
    }

    public final void run() {
        IQApp.Ex().bd(new g().setValue(Double.valueOf(this.f$0)));
    }
}
