package com.iqoption.core.util;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class SoftInputModeSubstitute_LifecycleAdapter implements GeneratedAdapter {
    final SoftInputModeSubstitute bRj;

    SoftInputModeSubstitute_LifecycleAdapter(SoftInputModeSubstitute softInputModeSubstitute) {
        this.bRj = softInputModeSubstitute;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z) {
            if (event == Event.ON_CREATE) {
                if (obj == null || methodCallsLogger.approveCall("saveAndClearSoftInputMode", 1)) {
                    this.bRj.saveAndClearSoftInputMode();
                }
                return;
            }
            if (event == Event.ON_DESTROY && (obj == null || methodCallsLogger.approveCall("restoreSoftInputMode", 1))) {
                this.bRj.restoreSoftInputMode();
            }
        }
    }
}
