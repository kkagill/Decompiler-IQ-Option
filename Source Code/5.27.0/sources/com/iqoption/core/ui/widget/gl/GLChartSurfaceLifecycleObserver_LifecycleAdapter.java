package com.iqoption.core.ui.widget.gl;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class GLChartSurfaceLifecycleObserver_LifecycleAdapter implements GeneratedAdapter {
    final GLChartSurfaceLifecycleObserver bNU;

    GLChartSurfaceLifecycleObserver_LifecycleAdapter(GLChartSurfaceLifecycleObserver gLChartSurfaceLifecycleObserver) {
        this.bNU = gLChartSurfaceLifecycleObserver;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z) {
            if (event == Event.ON_START) {
                if (obj == null || methodCallsLogger.approveCall("resume", 1)) {
                    this.bNU.resume();
                }
                return;
            }
            if (event == Event.ON_STOP && (obj == null || methodCallsLogger.approveCall("pause", 1))) {
                this.bNU.pause();
            }
        }
    }
}
