package com.iqoption.core.util;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.core.analytics.b;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/util/AnalyticsLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "eventName", "", "(Ljava/lang/String;)V", "event", "Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;", "onBeforeSend", "Lkotlin/Function1;", "", "(Lcom/iqoption/core/analytics/AnalyticsPropertyEvent;Lkotlin/jvm/functions/Function1;)V", "send", "core_release"})
/* compiled from: AnalyticsLifecycleObserver.kt */
public final class AnalyticsLifecycleObserver implements LifecycleObserver {
    private final b aZM;
    private final kotlin.jvm.a.b<b, l> bQd;

    public AnalyticsLifecycleObserver(b bVar, kotlin.jvm.a.b<? super b, l> bVar2) {
        kotlin.jvm.internal.i.f(bVar, "event");
        this.aZM = bVar;
        this.bQd = bVar2;
    }

    public /* synthetic */ AnalyticsLifecycleObserver(b bVar, kotlin.jvm.a.b bVar2, int i, f fVar) {
        if ((i & 2) != 0) {
            bVar2 = (kotlin.jvm.a.b) null;
        }
        this(bVar, bVar2);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void send() {
        kotlin.jvm.a.b bVar = this.bQd;
        if (bVar != null) {
            l lVar = (l) bVar.invoke(this.aZM);
        }
        this.aZM.Cc();
    }
}
