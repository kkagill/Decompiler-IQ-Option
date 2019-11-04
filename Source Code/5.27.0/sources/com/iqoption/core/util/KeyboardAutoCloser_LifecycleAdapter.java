package com.iqoption.core.util;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class KeyboardAutoCloser_LifecycleAdapter implements GeneratedAdapter {
    final KeyboardAutoCloser bQP;

    KeyboardAutoCloser_LifecycleAdapter(KeyboardAutoCloser keyboardAutoCloser) {
        this.bQP = keyboardAutoCloser;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z && event == Event.ON_DESTROY && (obj == null || methodCallsLogger.approveCall("closeKeyboard", 1))) {
            this.bQP.closeKeyboard();
        }
    }
}
