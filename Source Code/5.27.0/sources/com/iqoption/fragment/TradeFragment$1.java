package com.iqoption.fragment;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.charttools.f;
import com.iqoption.core.rx.i;

class TradeFragment$1 implements LifecycleObserver {
    final /* synthetic */ ah cYa;

    TradeFragment$1(ah ahVar) {
        this.cYa = ahVar;
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public void saveIndicators() {
        f.aCQ.Mb().b(i.aki()).bkN();
    }
}
