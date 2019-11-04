package com.iqoption.chat.component;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/chat/component/ReadPermissionTracker;", "Landroidx/lifecycle/LifecycleObserver;", "callback", "Lcom/iqoption/chat/component/ReadPermissionTracker$Callback;", "(Lcom/iqoption/chat/component/ReadPermissionTracker$Callback;)V", "checkPermission", "", "Callback", "chat_release"})
/* compiled from: ReadPermissionTracker.kt */
public final class ReadPermissionTracker implements LifecycleObserver {
    private final a aPV;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, bng = {"Lcom/iqoption/chat/component/ReadPermissionTracker$Callback;", "", "onDenied", "", "onGranted", "chat_release"})
    /* compiled from: ReadPermissionTracker.kt */
    public interface a {
        void RB();

        void RC();
    }

    public ReadPermissionTracker(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        this.aPV = aVar;
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void checkPermission() {
        if (com.iqoption.core.ext.a.fP("android.permission.READ_EXTERNAL_STORAGE")) {
            this.aPV.RB();
        } else {
            this.aPV.RC();
        }
    }
}
