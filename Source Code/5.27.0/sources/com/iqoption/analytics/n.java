package com.iqoption.analytics;

import com.iqoption.core.util.u;
import com.iqoption.dto.Event;

/* compiled from: TokenBalanceFragmentEventHelper */
public class n {
    public static void aG(boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_pay-commissions-balance-container").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }

    public static void Cw() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_expected-turnover-info").build());
    }

    public static void a(double d, String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "otn_withdraw-crypto-balance-container").setValue(Double.valueOf(d)).setParameters(u.anp().o("crypto_name", str).anr()).build());
    }
}
