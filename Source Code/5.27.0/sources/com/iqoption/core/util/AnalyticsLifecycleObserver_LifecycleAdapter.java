package com.iqoption.core.util;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class AnalyticsLifecycleObserver_LifecycleAdapter implements GeneratedAdapter {
    final AnalyticsLifecycleObserver bQe;

    AnalyticsLifecycleObserver_LifecycleAdapter(AnalyticsLifecycleObserver analyticsLifecycleObserver) {
        this.bQe = analyticsLifecycleObserver;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z && event == Event.ON_DESTROY && (obj == null || methodCallsLogger.approveCall("send", 1))) {
            this.bQe.send();
        }
    }
}
