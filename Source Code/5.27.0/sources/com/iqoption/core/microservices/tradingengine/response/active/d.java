package com.iqoption.core.microservices.tradingengine.response.active;

import androidx.annotation.StringRes;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.ext.c;
import com.iqoption.core.i.k;
import com.iqoption.core.manager.ad;
import com.iqoption.core.util.ae;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0003\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\u0003\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u0003\u001a\f\u0010\u000b\u001a\u00020\u0007*\u0004\u0018\u00010\f\u001a\u000e\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\fH\u0007\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0003¨\u0006\u0011"}, bng = {"isEnabledNow", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "canMktOnOpen", "detectActiveAvailableOnOpen", "getName", "", "getNameForSort", "getShortName", "getTickerName", "getTitle", "Lcom/iqoption/core/data/model/InstrumentType;", "getTitleResId", "", "nextScheduleForNow", "", "core_release"})
/* compiled from: ActiveExtentions.kt */
public final class d {
    public static final boolean z(a aVar) {
        return aVar != null && aVar.aX(ad.bkC.If());
    }

    public static final long A(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$nextScheduleForNow");
        return aVar.aY(ad.bkC.If());
    }

    public static final String B(a aVar) {
        String aic;
        kotlin.jvm.internal.i.f(aVar, "$this$getName");
        if (aVar instanceof j) {
            aic = ((j) aVar).aic();
        } else if (aVar instanceof n) {
            aic = ((n) aVar).adZ();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected case ");
            stringBuilder.append(aVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return c.af(aic, aVar.ahP());
    }

    public static final String C(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getShortName");
        if ((aVar instanceof j) && aVar.getActiveType() == ActiveType.CRYPTO_ACTIVE) {
            String instrumentId = aVar.getInstrumentId();
            int a = v.a((CharSequence) instrumentId, "USD", 0, false, 6, null);
            if (a != -1) {
                if (instrumentId != null) {
                    String substring = instrumentId.substring(0, a);
                    kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return substring;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return B(aVar);
    }

    public static final String U(InstrumentType instrumentType) {
        return com.iqoption.core.d.getString(V(instrumentType));
    }

    @StringRes
    public static final int V(InstrumentType instrumentType) {
        if (instrumentType == null) {
            return k.n_a;
        }
        int anE;
        switch (e.aob[instrumentType.ordinal()]) {
            case 1:
            case 2:
                anE = ae.anE();
                break;
            case 3:
                anE = k.multy;
                break;
            case 4:
                anE = k.digital;
                break;
            case 5:
                anE = k.forex;
                break;
            case 6:
                anE = k.crypto;
                break;
            case 7:
                anE = k.fx;
                break;
            case 8:
                anE = k.cfd;
                break;
            default:
                anE = k.n_a;
                break;
        }
        return anE;
    }
}
