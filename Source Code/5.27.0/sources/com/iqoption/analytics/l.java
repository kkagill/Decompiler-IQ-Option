package com.iqoption.analytics;

import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: RateUsDialogEventHelper */
public class l {
    public Builder ajf;

    public void onStart() {
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "rate-app_show-popup");
    }

    public void aD(boolean z) {
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().setParameters(u.anp().o("is_user_loyalty", Boolean.valueOf(z)).anr()).build());
        }
    }

    public void Cn() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "rate-app_cancel").build());
    }

    public void Co() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "rate-app_rate").setValue(Double.valueOf(5.0d)).build());
    }

    public void i(double d) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "rate-app_suggest").setValue(Double.valueOf(d)).build());
    }
}
