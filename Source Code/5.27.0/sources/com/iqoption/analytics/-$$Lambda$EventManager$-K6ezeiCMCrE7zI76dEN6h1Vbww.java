package com.iqoption.analytics;

import com.iqoption.dto.Event;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$EventManager$-K6ezeiCMCrE7zI76dEN6h1Vbww implements Runnable {
    private final /* synthetic */ EventManager f$0;
    private final /* synthetic */ Event f$1;

    public /* synthetic */ -$$Lambda$EventManager$-K6ezeiCMCrE7zI76dEN6h1Vbww(EventManager eventManager, Event event) {
        this.f$0 = eventManager;
        this.f$1 = event;
    }

    public final void run() {
        this.f$0.b(this.f$1);
    }
}
