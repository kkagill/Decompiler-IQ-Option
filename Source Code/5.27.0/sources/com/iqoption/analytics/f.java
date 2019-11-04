package com.iqoption.analytics;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.core.util.u.b;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0012 \u0006*\b\u0018\u00010\u0004R\u00020\u00050\u0004R\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0004R\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000f"}, bng = {"Lcom/iqoption/analytics/FxToastEventHelper;", "", "()V", "createPopupServed", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "kotlin.jvm.PlatformType", "elapsedInMin", "", "assetId", "", "sendPopupServed", "", "builder", "sendTap", "app_optionXRelease"})
/* compiled from: FxToastEventHelper.kt */
public final class f {
    public static final f aqU = new f();

    private f() {
    }

    public final Builder a(double d, int i) {
        Builder value = Event.Builder(Event.CATEGORY_POPUP_SERVED, "traderoom_nearest-exp-time-show").setValue(Double.valueOf(d));
        String str = "instrument_type";
        b o = u.anp().o("asset", Integer.valueOf(i)).o(str, InstrumentType.FX_INSTRUMENT);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        return value.setParameters(o.o("user_balance_type", Integer.valueOf(DG.DJ())).anr());
    }

    public final void a(Builder builder) {
        kotlin.jvm.internal.i.f(builder, "builder");
        EventManager.BS().a(builder.calcDuration().build());
    }

    public final void b(double d, int i) {
        EventManager BS = EventManager.BS();
        Builder value = Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_nearest-exp-time-tap").setValue(Double.valueOf(d));
        String str = "instrument_type";
        b o = u.anp().o("asset", Integer.valueOf(i)).o(str, InstrumentType.FX_INSTRUMENT);
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        BS.a(value.setParameters(o.o("user_balance_type", Integer.valueOf(DG.DJ())).anr()).build());
    }
}
