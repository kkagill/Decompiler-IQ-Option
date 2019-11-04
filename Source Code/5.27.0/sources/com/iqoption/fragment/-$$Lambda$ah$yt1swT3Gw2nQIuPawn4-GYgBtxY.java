package com.iqoption.fragment;

import androidx.lifecycle.Observer;
import com.iqoption.signals.f;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ah$yt1swT3Gw2nQIuPawn4-GYgBtxY implements Observer {
    private final /* synthetic */ AtomicLong f$0;

    public /* synthetic */ -$$Lambda$ah$yt1swT3Gw2nQIuPawn4-GYgBtxY(AtomicLong atomicLong) {
        this.f$0 = atomicLong;
    }

    public final void onChanged(Object obj) {
        ah.a(this.f$0, (f) obj);
    }
}
