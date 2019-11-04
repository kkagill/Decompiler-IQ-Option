package com.iqoption.analytics;

import com.iqoption.core.util.u;
import com.iqoption.dto.Event;

/* compiled from: OtnEventHelper */
public final class h {
    public static void a(boolean z, String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_expected-otn-amount-info").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(u.anp().o("field_name", str).anr()).build());
    }
}
