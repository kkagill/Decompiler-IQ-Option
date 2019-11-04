package com.iqoption.fragment.rightpanel;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import java.util.Map;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR)\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, bng = {"Lcom/iqoption/fragment/rightpanel/PipsSpreadUtils;", "", "()V", "CFD_PIPS", "", "DEFAULT", "", "TAG", "kotlin.jvm.PlatformType", "_defaultPips", "Ljava/lang/Integer;", "defaultPips", "getDefaultPips", "()I", "spreadInPips", "", "getSpreadInPips", "()Ljava/util/Map;", "spreadInPips$delegate", "Lkotlin/Lazy;", "isAvailable", "", "spreadToPips", "", "spread", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "app_optionXRelease"})
/* compiled from: PipsSpreadUtils.kt */
public final class m {
    private static final String TAG = m.class.getSimpleName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(m.class), "spreadInPips", "getSpreadInPips()Ljava/util/Map;"))};
    private static volatile Integer doA;
    private static final d doB = g.c(PipsSpreadUtils$spreadInPips$2.doD);
    public static final m doC = new m();

    private final Map<String, Integer> aHx() {
        d dVar = doB;
        j jVar = anY[0];
        return (Map) dVar.getValue();
    }

    private m() {
    }

    private final int aHw() {
        Integer num;
        if (doA == null) {
            int intValue;
            Map aHx = aHx();
            if (aHx != null) {
                num = (Integer) aHx.get("DEFAULT");
                if (num != null) {
                    intValue = num.intValue();
                    doA = Integer.valueOf(intValue);
                }
            }
            intValue = 5;
            doA = Integer.valueOf(intValue);
        }
        num = doA;
        if (num == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return num.intValue();
    }

    public final double c(double d, a aVar) {
        int intValue;
        kotlin.jvm.internal.i.f(aVar, "asset");
        Map aHx = aHx();
        if (aHx != null) {
            Object adZ = aVar.adZ();
            if (adZ == null) {
                adZ = "DEFAULT";
            }
            Integer num = (Integer) aHx.get(adZ);
            if (num != null) {
                intValue = num.intValue();
                return d * Math.pow(10.0d, (double) (intValue - 1));
            }
        }
        intValue = aHw();
        return d * Math.pow(10.0d, (double) (intValue - 1));
    }

    public final boolean isAvailable() {
        Map aHx = aHx();
        return aHx != null ? aHx.isEmpty() ^ 1 : false;
    }
}
