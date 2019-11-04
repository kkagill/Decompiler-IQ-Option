package com.iqoption.portfolio.fragment;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

class PortfolioFragment$4 implements LifecycleObserver {
    final /* synthetic */ k dPY;

    PortfolioFragment$4(k kVar) {
        this.dPY = kVar;
    }

    /* Access modifiers changed, original: 0000 */
    @OnLifecycleEvent(Event.ON_DESTROY)
    public void onHide() {
        if (this.dPY.dPW != null) {
            this.dPY.dPW.set(null);
        }
    }
}
