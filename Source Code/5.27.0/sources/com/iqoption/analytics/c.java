package com.iqoption.analytics;

import com.iqoption.core.util.u.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: DialogCongratEmissionEventHelper */
public class c {
    public static void BQ() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_receive-tokens-info-calculated").build());
    }

    public static Builder BR() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "otn_receive-tokens");
    }

    public static void a(Builder builder, double d, double d2) {
        if (builder != null) {
            builder.calcDuration();
            builder.setValue(Double.valueOf(d));
            builder.setParameters(b.anq().o("turnover_value", Double.valueOf(d2)).anr());
            EventManager.BS().a(builder.build());
        }
    }
}
