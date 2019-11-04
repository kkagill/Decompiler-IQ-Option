package com.iqoption.analytics;

import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: PendingOrderChangedEventHelper */
public class j {
    public Builder ajf;

    public void aB(boolean z) {
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, z ? "traderoom_order-executed" : "traderoom_order-created");
    }

    public void onStop() {
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    public void Ce() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_order-view").build());
    }
}
