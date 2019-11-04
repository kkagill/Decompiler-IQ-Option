package com.iqoption.feed;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$j$pHiyInpRQEdEdHjIuzi1i0B4_ks implements Runnable {
    private final /* synthetic */ RecyclerView f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ -$$Lambda$j$pHiyInpRQEdEdHjIuzi1i0B4_ks(RecyclerView recyclerView, int i) {
        this.f$0 = recyclerView;
        this.f$1 = i;
    }

    public final void run() {
        this.f$0.scrollToPosition(this.f$1);
    }
}
