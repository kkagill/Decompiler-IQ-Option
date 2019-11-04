package com.iqoption.fragment.assets;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, bng = {"com/iqoption/fragment/assets/AssetsFragment$onCreateView$3", "Landroidx/lifecycle/LifecycleObserver;", "notifyClosed", "", "notifyOpened", "app_optionXRelease"})
/* compiled from: AssetsFragment.kt */
public final class AssetsFragment$onCreateView$3 implements LifecycleObserver {
    final /* synthetic */ d dbg;

    AssetsFragment$onCreateView$3(d dVar) {
        this.dbg = dVar;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void notifyOpened() {
        this.dbg.aAw();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void notifyClosed() {
        this.dbg.aAx();
    }
}
