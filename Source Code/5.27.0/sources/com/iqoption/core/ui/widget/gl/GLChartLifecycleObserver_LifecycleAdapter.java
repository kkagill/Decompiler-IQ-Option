package com.iqoption.core.ui.widget.gl;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class GLChartLifecycleObserver_LifecycleAdapter implements GeneratedAdapter {
    final GLChartLifecycleObserver bNS;

    GLChartLifecycleObserver_LifecycleAdapter(GLChartLifecycleObserver gLChartLifecycleObserver) {
        this.bNS = gLChartLifecycleObserver;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z) {
            if (event == Event.ON_START) {
                if (obj == null || methodCallsLogger.approveCall("resume", 1)) {
                    this.bNS.resume();
                }
            } else if (event == Event.ON_STOP) {
                if (obj == null || methodCallsLogger.approveCall("pause", 1)) {
                    this.bNS.pause();
                }
            } else {
                if (event == Event.ON_DESTROY && (obj == null || methodCallsLogger.approveCall("destroy", 1))) {
                    this.bNS.destroy();
                }
            }
        }
    }
}
