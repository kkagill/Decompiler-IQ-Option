package com.iqoption.analytics;

import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: PendingKeyboardEventHelper */
public class i {
    public Builder ajf;

    public void onStart() {
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_show-current-price-keyboard");
    }

    public void onStop() {
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().build());
        }
    }

    public void h(double d) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_press-price-keyboard").setValue(Double.valueOf(d)).build());
    }
}
