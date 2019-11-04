package com.crashlytics.android.answers;

import android.os.Bundle;

/* compiled from: FirebaseAnalyticsEvent */
public class q {
    private final String eventName;
    private final Bundle oC;

    q(String str, Bundle bundle) {
        this.eventName = str;
        this.oC = bundle;
    }

    public String getEventName() {
        return this.eventName;
    }

    public Bundle ev() {
        return this.oC;
    }
}
