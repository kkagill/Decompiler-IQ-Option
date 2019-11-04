package com.iqoption.core.util;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class SystemUiSubstitude_LifecycleAdapter implements GeneratedAdapter {
    final SystemUiSubstitude bRp;

    SystemUiSubstitude_LifecycleAdapter(SystemUiSubstitude systemUiSubstitude) {
        this.bRp = systemUiSubstitude;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        Object obj = methodCallsLogger != null ? 1 : null;
        if (!z) {
            if (event == Event.ON_CREATE) {
                if (obj == null || methodCallsLogger.approveCall("saveAndClearSoftInputMode", 1)) {
                    this.bRp.saveAndClearSoftInputMode();
                }
                return;
            }
            if (event == Event.ON_DESTROY && (obj == null || methodCallsLogger.approveCall("restoreSoftInputMode", 1))) {
                this.bRp.restoreSoftInputMode();
            }
        }
    }
}
