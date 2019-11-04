package com.iqoption.util.c;

import androidx.annotation.StringRes;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.c;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.core.microservices.tradingengine.response.active.j;
import com.iqoption.core.microservices.tradingengine.response.active.n;
import com.iqoption.core.util.ae;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.util.aa;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0006\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0006\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0006\u001a\u0014\u0010\u000f\u001a\u00020\n*\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, bng = {"getActiveTitle", "", "type", "Lcom/iqoption/core/data/model/ActiveType;", "Lcom/iqoption/core/data/model/InstrumentType;", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getActiveTitleResId", "", "isEnabledNow", "", "getNameForSort", "getPhase", "getShortName", "getTickerName", "isTradingAvailable", "timeSync", "", "app_optionXRelease"})
/* compiled from: ActiveUtils.kt */
public final class a {
    public static final String ai(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        String string = IQApp.Eu().getString(aj(aVar));
        kotlin.jvm.internal.i.e(string, "context.getString(getActiveTitleResId(active))");
        return string;
    }

    @StringRes
    public static final int aj(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar == null ? R.string.n_a : ag(aVar.getInstrumentType());
    }

    public static final String af(InstrumentType instrumentType) {
        return d.U(instrumentType);
    }

    @StringRes
    public static final int ag(InstrumentType instrumentType) {
        return d.V(instrumentType);
    }

    public static final String d(ActiveType activeType) {
        String string = IQApp.Eu().getString(e(activeType));
        kotlin.jvm.internal.i.e(string, "context.getString(getActiveTitleResId(type))");
        return string;
    }

    @StringRes
    public static final int e(ActiveType activeType) {
        int i = R.string.n_a;
        if (activeType == null) {
            return R.string.n_a;
        }
        switch (b.aob[activeType.ordinal()]) {
            case 1:
            case 2:
                i = ae.anE();
                break;
            case 3:
                i = R.string.multy;
                break;
            case 4:
                i = R.string.digital;
                break;
            case 5:
            case 6:
                i = R.string.forex;
                break;
            case 7:
                i = R.string.crypto;
                break;
            case 8:
                i = R.string.fx;
                break;
            case 9:
                i = R.string.commodities_abbr;
                break;
            case 10:
                i = R.string.stocks;
                break;
            case 11:
                i = R.string.etf;
                break;
            case 12:
                i = R.string.Indices;
                break;
            case 13:
                i = R.string.bonds;
                break;
        }
        return i;
    }

    public static final boolean z(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        return aVar != null ? a(aVar, 0, 1, null) : false;
    }

    public static /* synthetic */ boolean a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = l.HZ().If();
        }
        return d(aVar, j);
    }

    public static final boolean d(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        kotlin.jvm.internal.i.f(aVar, "$this$isTradingAvailable");
        if (aVar.aX(j)) {
            if (kotlin.jvm.internal.i.y(ActiveQuote.PHASE_TRADING, ak(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static final String ak(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getPhase");
        boolean ef = com.iqoption.app.managers.feature.a.ef("trading-phases");
        String str = ActiveQuote.PHASE_TRADING;
        if (!ef) {
            return str;
        }
        ActiveQuote dY = c.GS().dY(aVar.getActiveId());
        if (dY == null) {
            return str;
        }
        String phase = dY.getPhase();
        return phase != null ? phase : str;
    }

    public static final String al(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$getNameForSort");
        String B = d.B(aVar);
        if ((((CharSequence) B).length() > 0 ? 1 : null) != null) {
            return B;
        }
        if (aVar instanceof j) {
            return aVar.agB();
        }
        if (aVar instanceof n) {
            return ((n) aVar).adZ();
        }
        aa.cq(aVar);
        throw null;
    }

    public static final String C(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
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
        return d.B(aVar);
    }
}
