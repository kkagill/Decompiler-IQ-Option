package com.iqoption.analytics.sla;

import com.google.common.cache.RemovalNotification;
import com.google.common.cache.h;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Sla$t-qSxIoCWPAC14NbMxhiuN0_sjQ implements h {
    public static final /* synthetic */ -$$Lambda$Sla$t-qSxIoCWPAC14NbMxhiuN0_sjQ INSTANCE = new -$$Lambda$Sla$t-qSxIoCWPAC14NbMxhiuN0_sjQ();

    private /* synthetic */ -$$Lambda$Sla$t-qSxIoCWPAC14NbMxhiuN0_sjQ() {
    }

    public final void onRemoval(RemovalNotification removalNotification) {
        Sla.a(removalNotification);
    }
}
