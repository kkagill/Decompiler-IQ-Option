package com.iqoption.core;

import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.i.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, bng = {"getName", "", "Lcom/iqoption/core/data/model/InstrumentType;", "core_release"})
/* compiled from: InstrumentTypeExtensions.kt */
public final class g {
    public static final String C(InstrumentType instrumentType) {
        int i;
        kotlin.jvm.internal.i.f(instrumentType, "$this$getName");
        switch (h.aob[instrumentType.ordinal()]) {
            case 1:
            case 2:
                i = k.binary;
                break;
            case 3:
                i = k.digital;
                break;
            case 4:
                i = k.fx;
                break;
            case 5:
                i = k.forex;
                break;
            case 6:
                i = k.cfd;
                break;
            case 7:
                i = k.categories_crypto;
                break;
            case 8:
                i = k.multy;
                break;
            case 9:
                i = k.unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return d.getString(i);
    }
}
