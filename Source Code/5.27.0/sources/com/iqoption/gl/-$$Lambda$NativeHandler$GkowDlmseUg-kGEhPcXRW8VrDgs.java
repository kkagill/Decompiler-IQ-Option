package com.iqoption.gl;

import com.iqoption.app.IQApp;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.gl.NativeHandler.i;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$GkowDlmseUg-kGEhPcXRW8VrDgs implements Runnable {
    private final /* synthetic */ String f$0;

    public /* synthetic */ -$$Lambda$NativeHandler$GkowDlmseUg-kGEhPcXRW8VrDgs(String str) {
        this.f$0 = str;
    }

    public final void run() {
        IQApp.Ex().bd(new i().setValue((Long) Position.parsePositionSplitId(this.f$0)[0]));
    }
}
