package com.iqoption.alerts.ui.pricepicker;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, bng = {"com/iqoption/alerts/ui/pricepicker/AlertsPricePickerFragment$onViewCreated$1", "Landroidx/lifecycle/LifecycleObserver;", "notifyHide", "", "notifyShow", "alerts_release"})
/* compiled from: AlertsPricePickerFragment.kt */
public final class AlertsPricePickerFragment$onViewCreated$1 implements LifecycleObserver {
    final /* synthetic */ a this$0;

    AlertsPricePickerFragment$onViewCreated$1(a aVar) {
        this.this$0 = aVar;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void notifyShow() {
        this.this$0.BE().nv();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void notifyHide() {
        this.this$0.BE().onHide();
    }
}
