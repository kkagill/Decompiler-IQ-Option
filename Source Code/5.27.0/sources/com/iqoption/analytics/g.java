package com.iqoption.analytics;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.portfolio.component.b.j;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007¨\u0006\n"}, bng = {"Lcom/iqoption/analytics/OpenItemAnalyticsHelper;", "", "()V", "analyticsName", "", "activeType", "Lcom/iqoption/core/data/model/ActiveType;", "getAnalyticsName", "item", "Lcom/iqoption/portfolio/component/data/OpenItem;", "app_optionXRelease"})
/* compiled from: OpenItemAnalyticsHelper.kt */
public final class g {
    public static final g aqV = new g();

    private g() {
    }

    public static final String a(j<?> jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        a Jt = jVar.Jt();
        if (Jt != null) {
            InstrumentType instrumentType = Jt.getInstrumentType();
            if (instrumentType != null) {
                String serverValue = instrumentType.getServerValue();
                if (serverValue != null) {
                    return serverValue;
                }
            }
        }
        g gVar = aqV;
        c aRJ = jVar.aRJ();
        kotlin.jvm.internal.i.e(aRJ, "item.position");
        return gVar.a(aRJ.getActiveType());
    }

    /* JADX WARNING: Missing block: B:6:0x000f, code skipped:
            if (r0 != null) goto L_0x0016;
     */
    private final java.lang.String a(com.iqoption.core.data.model.ActiveType r2) {
        /*
        r1 = this;
        if (r2 != 0) goto L_0x0005;
    L_0x0002:
        r2 = "null";
        return r2;
    L_0x0005:
        r0 = r2.toInstrumentType();
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r0.getServerValue();
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0016;
    L_0x0012:
        r0 = r2.getServerValue();
    L_0x0016:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.analytics.g.a(com.iqoption.core.data.model.ActiveType):java.lang.String");
    }
}
