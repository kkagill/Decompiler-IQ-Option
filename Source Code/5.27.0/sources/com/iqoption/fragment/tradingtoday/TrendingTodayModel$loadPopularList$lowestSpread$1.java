package com.iqoption.fragment.tradingtoday;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.Pair;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "it", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "Lcom/iqoption/core/microservices/topassets/response/spread/SpreadData;", "invoke"})
/* compiled from: TrendingTodayModel.kt */
final class TrendingTodayModel$loadPopularList$lowestSpread$1 extends Lambda implements b<Pair<? extends a, ? extends com.iqoption.core.microservices.f.a.a.a>, d> {
    final /* synthetic */ com.iqoption.app.helpers.a $activeSettingHelper;
    final /* synthetic */ boolean $isRegulated;

    TrendingTodayModel$loadPopularList$lowestSpread$1(com.iqoption.app.helpers.a aVar, boolean z) {
        this.$activeSettingHelper = aVar;
        this.$isRegulated = z;
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    /* renamed from: f */
    public final com.iqoption.fragment.tradingtoday.d invoke(kotlin.Pair<? extends com.iqoption.core.microservices.tradingengine.response.active.a, com.iqoption.core.microservices.f.a.a.a> r13) {
        /*
        r12 = this;
        r0 = "it";
        kotlin.jvm.internal.i.f(r13, r0);
        r0 = r13.getFirst();
        r0 = (com.iqoption.core.microservices.tradingengine.response.active.a) r0;
        r0 = r0.getInstrumentType();
        r1 = r13.getFirst();
        r1 = (com.iqoption.core.microservices.tradingengine.response.active.a) r1;
        r1 = r1.getActiveId();
        r2 = r13.getFirst();
        r2 = (com.iqoption.core.microservices.tradingengine.response.active.a) r2;
        r4 = r2.getPrecision();
        r2 = r12.$activeSettingHelper;
        r2 = r2.a(r0, r1);
        r11 = 0;
        if (r2 == 0) goto L_0x0044;
    L_0x002c:
        r3 = r12.$isRegulated;
        r2 = r2.cB(r3);
        r2 = com.iqoption.fragment.rightpanel.j.a(r2, r0);
        r3 = r2.length;
        if (r3 != 0) goto L_0x003b;
    L_0x0039:
        r3 = 1;
        goto L_0x003c;
    L_0x003b:
        r3 = 0;
    L_0x003c:
        if (r3 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0044;
    L_0x003f:
        r2 = kotlin.collections.i.r(r2);
        goto L_0x0045;
    L_0x0044:
        r2 = r11;
    L_0x0045:
        r3 = com.iqoption.core.microservices.f.a.a.a.bzg;
        r5 = r13.bni();
        r5 = (com.iqoption.core.microservices.f.a.a.a) r5;
        r3 = r3.g(r5);
        r5 = com.iqoption.core.microservices.f.a.a.a.bzg;
        r6 = r13.bni();
        r6 = (com.iqoption.core.microservices.f.a.a.a) r6;
        r5 = r5.d(r6);
        if (r5 == 0) goto L_0x008c;
    L_0x005f:
        if (r3 != 0) goto L_0x0062;
    L_0x0061:
        goto L_0x008c;
    L_0x0062:
        if (r2 != 0) goto L_0x0069;
    L_0x0064:
        r0 = com.iqoption.util.ab.e(r3, r5);
        goto L_0x008a;
    L_0x0069:
        r6 = com.iqoption.asset.c.b.axz;
        r2 = r2.intValue();
        r0 = r6.b(r1, r0, r2);
        r1 = com.iqoption.asset.c.a.axy;
        r5 = r5.doubleValue();
        r7 = r3.doubleValue();
        r9 = r0.getValue();
        r3 = r1;
        r0 = r3.a(r4, r5, r7, r9);
        r0 = java.lang.Double.valueOf(r0);
    L_0x008a:
        r4 = r0;
        goto L_0x008d;
    L_0x008c:
        r4 = r11;
    L_0x008d:
        if (r4 != 0) goto L_0x0091;
    L_0x008f:
        r0 = r11;
        goto L_0x00a4;
    L_0x0091:
        r0 = new com.iqoption.fragment.tradingtoday.d;
        r2 = com.iqoption.fragment.tradingtoday.PopularType.LOWEST_SPREAD;
        r13 = r13.getFirst();
        r3 = r13;
        r3 = (com.iqoption.core.microservices.tradingengine.response.active.a) r3;
        r5 = 0;
        r6 = 8;
        r7 = 0;
        r1 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7);
    L_0x00a4:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.tradingtoday.TrendingTodayModel$loadPopularList$lowestSpread$1.invoke(kotlin.Pair):com.iqoption.fragment.tradingtoday.d");
    }
}
