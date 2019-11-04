package com.iqoption.fragment.rightpanel;

import com.iqoption.core.microservices.tradingengine.response.a;
import com.iqoption.core.microservices.tradingengine.response.instrument.e;
import com.iqoption.gl.c;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$FxRightPanelDelegate$AbGBkbpOLIrMXWjdX668jBsT7xs implements Runnable {
    private final /* synthetic */ e f$0;
    private final /* synthetic */ a f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ -$$Lambda$FxRightPanelDelegate$AbGBkbpOLIrMXWjdX668jBsT7xs(e eVar, a aVar, a aVar2) {
        this.f$0 = eVar;
        this.f$1 = aVar;
        this.f$2 = aVar2;
    }

    public final void run() {
        c.aIy().tabUpdateStrike(this.f$0.aiy(), a.e(this.f$1), a.f(this.f$1), a.e(this.f$2), a.f(this.f$2), a.g(this.f$1), a.g(this.f$2));
    }
}
