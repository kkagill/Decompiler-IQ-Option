package com.iqoption.core.ui.widget.gl;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/widget/gl/GLChartLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "view", "Lcom/iqoption/core/ui/widget/gl/GLChartView;", "(Lcom/iqoption/core/ui/widget/gl/GLChartView;)V", "getView", "()Lcom/iqoption/core/ui/widget/gl/GLChartView;", "destroy", "", "pause", "resume", "core_release"})
/* compiled from: GLChartLifecycleObserver.kt */
public final class GLChartLifecycleObserver implements LifecycleObserver {
    private final d bNR;

    @OnLifecycleEvent(Event.ON_START)
    public final void resume() {
        this.bNR.onResume();
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void pause() {
        this.bNR.onPause();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void destroy() {
        this.bNR.onDestroy();
    }
}
