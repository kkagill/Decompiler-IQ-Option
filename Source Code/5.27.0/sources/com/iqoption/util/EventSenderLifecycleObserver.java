package com.iqoption.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\u0010\nB-\u0012\n\u0010\u000b\u001a\u00060\u0007R\u00020\b\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\tH\u0007R\u0012\u0010\u000b\u001a\u00060\u0007R\u00020\bX\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/util/EventSenderLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "eventName", "", "(Ljava/lang/String;)V", "onBeforeSend", "Lkotlin/Function1;", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "builder", "(Lcom/iqoption/dto/Event$Builder;Lkotlin/jvm/functions/Function1;)V", "onSend", "app_optionXRelease"})
/* compiled from: EventSenderLifecycleObserver.kt */
public final class EventSenderLifecycleObserver implements LifecycleObserver {
    private final b<Builder, l> bQd;
    private final Builder ebb;

    public EventSenderLifecycleObserver(Builder builder, b<? super Builder, l> bVar) {
        kotlin.jvm.internal.i.f(builder, "builder");
        this.ebb = builder;
        this.bQd = bVar;
    }

    public /* synthetic */ EventSenderLifecycleObserver(Builder builder, b bVar, int i, f fVar) {
        if ((i & 2) != 0) {
            bVar = (b) null;
        }
        this(builder, bVar);
    }

    public EventSenderLifecycleObserver(String str, b<? super Builder, l> bVar) {
        kotlin.jvm.internal.i.f(str, "eventName");
        kotlin.jvm.internal.i.f(bVar, "onBeforeSend");
        Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, str);
        kotlin.jvm.internal.i.e(Builder, "Event.Builder(Event.CATE…_POPUP_SERVED, eventName)");
        this(Builder, (b) bVar);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onSend() {
        EventManager BS = EventManager.BS();
        Builder calcDuration = this.ebb.calcDuration();
        b bVar = this.bQd;
        if (bVar != null) {
            kotlin.jvm.internal.i.e(calcDuration, "it");
            l lVar = (l) bVar.invoke(calcDuration);
        }
        BS.a(calcDuration.build());
    }
}
