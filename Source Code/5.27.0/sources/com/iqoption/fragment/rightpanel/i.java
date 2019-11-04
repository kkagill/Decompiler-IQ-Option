package com.iqoption.fragment.rightpanel;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.b;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.b.a;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/rightpanel/LeverageActiveProvider;", "", "()V", "DEFAULT_LEVERAGE", "", "getActiveLeverage", "leverageInfo", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "getActiveLeverageInfo", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "app_optionXRelease"})
/* compiled from: LeverageActiveProvider.kt */
public final class i {
    public static final i dnQ = new i();

    private i() {
    }

    public static final a U(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, ConditionalUserProperty.ACTIVE);
        return com.iqoption.app.helpers.a.Gs().a(aVar.getInstrumentType(), aVar.getActiveId());
    }

    public static final int b(a aVar, InstrumentType instrumentType) {
        int a;
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        com.iqoption.app.managers.tab.TabHelper.i Jh = IM.Jh();
        Integer num = null;
        Number number = null;
        if (Jh != null) {
            number = Jh.er("tabSetting.multiplier");
        }
        if (aVar != null) {
            boolean Er = b.DG().Er();
            if (number != null) {
                num = Integer.valueOf(number.intValue());
            }
            a = aVar.a(Er, num);
        } else {
            a = 1;
        }
        return j.a(a, instrumentType, aVar);
    }
}
