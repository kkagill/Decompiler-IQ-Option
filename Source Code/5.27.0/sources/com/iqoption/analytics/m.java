package com.iqoption.analytics;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;

/* compiled from: RightPanelEventHelper */
public final class m {
    public static Builder Cp() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "crypto-confirmation_show");
    }

    public static void a(Builder builder, String str, String str2) {
        if (builder != null) {
            builder.calcDuration();
            builder.setParameters(b.anq().o("commission_currency", str).o("direction", str2).anr());
            EventManager.BS().a(builder.build());
        }
    }

    public static void aE(boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "crypto-confirmation_change-commission-currency").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }

    public static void b(boolean z, String str) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "crypto-confirmation_choose-commission-currency").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(b.anq().o("commission_currency", str).anr()).build());
    }

    public static void aF(boolean z) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "crypto-confirmation_confirm").setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
    }

    public static void a(boolean z, InstrumentType instrumentType, int i) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_current-price").setValue(Double.valueOf(z ? 1.0d : 0.0d)).setParameters(b.anq().o("instrument_type", instrumentType).o("balance_type_id", Integer.valueOf(i)).anr()).build());
    }

    public static void Cq() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "pending-order_submit").build());
    }

    public static void Cr() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "pending-order_roll-up-submittion").build());
    }

    public static void Cs() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "confirmation_show-commission").build());
    }

    public static void Ct() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "confirmation_show-limits").build());
    }

    public static void Cu() {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "confirmation_current-price").build());
    }

    public static Builder Cv() {
        return Event.Builder(Event.CATEGORY_POPUP_SERVED, "confirmation_show");
    }

    public static void a(Builder builder, InstrumentType instrumentType, com.iqoption.app.b bVar) {
        if (builder != null) {
            Integer valueOf = Integer.valueOf(bVar.Ej() ? 3 : bVar.DJ());
            builder.calcDuration();
            builder.setParameters(b.anq().o("instrument_type", instrumentType).o("balance_type", valueOf).anr());
            EventManager.BS().a(builder.build());
        }
    }

    public static void a(InstrumentType instrumentType, com.iqoption.app.b bVar) {
        EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "confirmation_confirm").setParameters(b.anq().o("instrument_type", instrumentType).o("balance_type_id", Integer.valueOf(bVar.Ej() ? 3 : bVar.DJ())).anr()).build());
    }
}
