package com.iqoption.core.util;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class KeyboardStateTracker_LifecycleAdapter implements GeneratedAdapter {
    final KeyboardStateTracker bQR;

    KeyboardStateTracker_LifecycleAdapter(KeyboardStateTracker keyboardStateTracker) {
        this.bQR = keyboardStateTracker;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z) {
            if (event == Event.ON_RESUME) {
                if (obj == null || methodCallsLogger.approveCall("registerListener", 1)) {
                    this.bQR.registerListener();
                }
                return;
            }
            if (event == Event.ON_PAUSE && (obj == null || methodCallsLogger.approveCall("unregisterListener", 1))) {
                this.bQR.unregisterListener();
            }
        }
    }
}
