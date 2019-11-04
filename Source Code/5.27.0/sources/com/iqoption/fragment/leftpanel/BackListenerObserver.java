package com.iqoption.fragment.leftpanel;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.view.b;
import com.iqoption.view.b.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/leftpanel/BackListenerObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/iqoption/view/BackController$OnBackListener;", "controller", "Lcom/iqoption/view/BackController;", "onBackClick", "Lkotlin/Function0;", "", "(Lcom/iqoption/view/BackController;Lkotlin/jvm/functions/Function0;)V", "onBackPressed", "registerListener", "", "unregisterListener", "app_optionXRelease"})
/* compiled from: BackListenerObserver.kt */
public final class BackListenerObserver implements LifecycleObserver, a {
    private final b djA;
    private final kotlin.jvm.a.a<Boolean> djB;

    public BackListenerObserver(b bVar, kotlin.jvm.a.a<Boolean> aVar) {
        kotlin.jvm.internal.i.f(bVar, "controller");
        kotlin.jvm.internal.i.f(aVar, "onBackClick");
        this.djA = bVar;
        this.djB = aVar;
    }

    public boolean onBackPressed() {
        return ((Boolean) this.djB.invoke()).booleanValue();
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void registerListener() {
        this.djA.a(this);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void unregisterListener() {
        this.djA.b(this);
    }
}
