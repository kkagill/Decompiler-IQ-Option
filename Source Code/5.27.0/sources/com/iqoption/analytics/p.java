package com.iqoption.analytics;

import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: TrendingTodayEventHelper */
public final class p {
    public static Builder Cy() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_trending-now-show");
    }

    public static void b(Builder builder) {
        if (builder != null) {
            EventManager.BS().a(builder.calcDuration().build());
        }
    }

    public static void c(double d, int i) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "trending-now_choose-asset").setValue(Double.valueOf(d)).setParameters(u.anp().o("asset_id", Integer.valueOf(i)).anr()).build());
    }

    public static void Cz() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "trending-now_close").build());
    }

    public static void CA() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_SCROLL, "trending-now_scroll-aside").build());
    }
}
