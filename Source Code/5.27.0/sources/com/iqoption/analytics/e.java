package com.iqoption.analytics;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.util.u;
import com.iqoption.core.util.u.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0012 \u0006*\b\u0018\u00010\u0004R\u00020\u00050\u0004R\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000e\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0004R\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u0016"}, bng = {"Lcom/iqoption/analytics/ExpirationEventHelper;", "", "()V", "createPopupServed", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "kotlin.jvm.PlatformType", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "sendChooseAutoStrike", "", "enable", "", "sendChooseSpot", "sendPopupServed", "builder", "sendTapAsset", "sendTapStrike", "strike", "", "sendTapTime", "expTime", "app_optionXRelease"})
/* compiled from: ExpirationEventHelper.kt */
public final class e {
    public static final e aqT = new e();

    private e() {
    }

    public final Builder f(a aVar) {
        Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom-panel-expiration_show");
        Object obj = null;
        b o = u.anp().o("asset", aVar != null ? Integer.valueOf(aVar.getActiveId()) : null);
        if (aVar != null) {
            obj = aVar.getInstrumentType();
        }
        b o2 = o.o("instrument_type", obj);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        return Builder.setParameters(o2.o("user_balance_type", Integer.valueOf(DG.DJ())).anr());
    }

    public final void a(Builder builder) {
        kotlin.jvm.internal.i.f(builder, "builder");
        EventManager.BS().a(builder.calcDuration().build());
    }

    public final void g(a aVar) {
        EventManager BS = EventManager.BS();
        Builder Builder = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom-panel-expiration_tap-asset");
        Object obj = null;
        b o = u.anp().o("asset", aVar != null ? Integer.valueOf(aVar.getActiveId()) : null);
        if (aVar != null) {
            obj = aVar.getInstrumentType();
        }
        b o2 = o.o("instrument_type", obj);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        BS.a(Builder.setParameters(o2.o("user_balance_type", Integer.valueOf(DG.DJ())).anr()).build());
    }

    public final void a(double d, a aVar) {
        EventManager BS = EventManager.BS();
        Builder value = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_expiration-options-choose-time").setValue(Double.valueOf(d));
        Object obj = null;
        b o = u.anp().o("asset", aVar != null ? Integer.valueOf(aVar.getActiveId()) : null);
        if (aVar != null) {
            obj = aVar.getInstrumentType();
        }
        o = o.o("instrument_type", obj);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        BS.a(value.setParameters(o.o("user_balance_type", Integer.valueOf(DG.DJ())).anr()).build());
    }

    public final void b(double d, a aVar) {
        EventManager BS = EventManager.BS();
        Builder Builder = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom-panel-expiration_choose-strike");
        Object obj = null;
        b o = u.anp().o("strike_value", Double.valueOf(d)).o("asset", aVar != null ? Integer.valueOf(aVar.getActiveId()) : null);
        if (aVar != null) {
            obj = aVar.getInstrumentType();
        }
        o = o.o("instrument_type", obj);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        BS.a(Builder.setParameters(o.o("user_balance_type", Integer.valueOf(DG.DJ())).anr()).build());
    }

    public final void a(boolean z, a aVar) {
        EventManager BS = EventManager.BS();
        Builder value = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom-panel-expiration_auto-selection").setValue(Double.valueOf(z ? 1.0d : 0.0d));
        Object obj = null;
        b o = u.anp().o("asset", aVar != null ? Integer.valueOf(aVar.getActiveId()) : null);
        if (aVar != null) {
            obj = aVar.getInstrumentType();
        }
        b o2 = o.o("instrument_type", obj);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        BS.a(value.setParameters(o2.o("user_balance_type", Integer.valueOf(DG.DJ())).anr()).build());
    }
}
