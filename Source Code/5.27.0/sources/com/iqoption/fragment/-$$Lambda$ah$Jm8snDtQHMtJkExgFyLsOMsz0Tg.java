package com.iqoption.fragment;

import com.iqoption.core.microservices.popupserver.response.a;
import java.lang.ref.WeakReference;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ah$Jm8snDtQHMtJkExgFyLsOMsz0Tg implements Runnable {
    private final /* synthetic */ WeakReference f$0;
    private final /* synthetic */ a f$1;

    public /* synthetic */ -$$Lambda$ah$Jm8snDtQHMtJkExgFyLsOMsz0Tg(WeakReference weakReference, a aVar) {
        this.f$0 = weakReference;
        this.f$1 = aVar;
    }

    public final void run() {
        ah.a(this.f$0, this.f$1);
    }
}
