package com.iqoption.gl;

import com.iqoption.app.IQApp;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.gl.NativeHandler.n;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NativeHandler$CR2WLMhPVncLP1I9asa8RRVniqU implements Runnable {
    private final /* synthetic */ String f$0;

    public /* synthetic */ -$$Lambda$NativeHandler$CR2WLMhPVncLP1I9asa8RRVniqU(String str) {
        this.f$0 = str;
    }

    public final void run() {
        IQApp.Ex().bd(new n().setValue((Long) Position.parsePositionSplitId(this.f$0)[0]));
    }
}
