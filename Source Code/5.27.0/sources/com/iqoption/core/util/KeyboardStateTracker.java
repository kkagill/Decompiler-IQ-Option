package com.iqoption.core.util;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.core.util.v.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/util/KeyboardStateTracker;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/iqoption/core/util/KeyboardUtil$OnKeyboardVisibilityListener;", "onStateChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isKeyboardVisible", "", "(Lkotlin/jvm/functions/Function1;)V", "onKeyboardVisibilityChanged", "visible", "registerListener", "unregisterListener", "core_release"})
/* compiled from: KeyboardStateTracker.kt */
public final class KeyboardStateTracker implements LifecycleObserver, a {
    private final b<Boolean, l> bQQ;

    public KeyboardStateTracker(b<? super Boolean, l> bVar) {
        kotlin.jvm.internal.i.f(bVar, "onStateChanged");
        this.bQQ = bVar;
    }

    public void onKeyboardVisibilityChanged(boolean z) {
        this.bQQ.invoke(Boolean.valueOf(z));
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void registerListener() {
        v.a(this);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void unregisterListener() {
        v.b(this);
    }
}
