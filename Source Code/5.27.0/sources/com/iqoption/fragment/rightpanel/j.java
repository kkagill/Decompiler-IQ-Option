package com.iqoption.fragment.rightpanel;

import androidx.annotation.MainThread;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.d;
import com.iqoption.core.features.a.b;
import com.iqoption.core.microservices.features.a.a;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R.\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/rightpanel/LeverageThresoldUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "THRESOLD_DEFAULT", "", "paramsCache", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getActiveLeverage", "leverage", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "leverageInfo", "Lcom/iqoption/core/microservices/tradingengine/response/leverage/LeverageInfo;", "getThresoldLeverage", "getValue", "", "value", "app_optionXRelease"})
/* compiled from: LeverageThresoldUtils.kt */
public final class j {
    private static final String TAG = j.class.getSimpleName();
    private static final int dnR = Integer.MAX_VALUE;
    private static HashMap<String, Integer> dnS;
    public static final j dnT = new j();

    private j() {
    }

    @MainThread
    public static final int Y(InstrumentType instrumentType) {
        a ei = c.Iw().ei("hide-big-leverages");
        if (instrumentType == null || ei == null || kotlin.jvm.internal.i.y(ei.getStatus(), "disabled") || ei.ady().isJsonNull()) {
            return dnR;
        }
        try {
            Integer num;
            if (dnS == null) {
                b bVar = (b) d.b(ei.ady(), b.class, null, 2, null);
                HashMap hashMap = new HashMap();
                for (String put : bVar.Pe()) {
                    hashMap.put(put, Integer.valueOf(bVar.Xn()));
                }
                dnS = hashMap;
            }
            HashMap hashMap2 = dnS;
            if (hashMap2 != null) {
                num = (Integer) hashMap2.get(instrumentType.getServerValue());
                if (num != null) {
                    return num.intValue();
                }
            }
            num = Integer.valueOf(dnR);
            return num.intValue();
        } catch (Exception unused) {
            return dnR;
        }
    }

    public static final int[] a(int[] iArr, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(iArr, ConditionalUserProperty.VALUE);
        int Y = Y(instrumentType);
        if (Y == dnR) {
            return iArr;
        }
        List g;
        for (int o = i.o(iArr); o >= 0; o--) {
            if ((iArr[o] > Y ? 1 : null) == null) {
                g = i.g(iArr, o + 1);
                break;
            }
        }
        g = m.emptyList();
        return u.H(g);
    }

    public static final int a(int i, InstrumentType instrumentType, com.iqoption.core.microservices.tradingengine.response.b.a aVar) {
        return (i >= Y(instrumentType) && aVar != null) ? i.l(a(aVar.cB(com.iqoption.app.b.DG().Er()), instrumentType)) : i;
    }
}
