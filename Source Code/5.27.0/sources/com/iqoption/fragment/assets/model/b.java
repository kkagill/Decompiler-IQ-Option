package com.iqoption.fragment.assets.model;

import com.iqoption.core.microservices.tradingengine.response.active.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, bng = {"generateId", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "getIdPrefix", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public final class b {
    private static final String H(a aVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(I(aVar));
        stringBuilder.append(':');
        stringBuilder.append(aVar.getActiveId());
        return stringBuilder.toString();
    }

    private static final String I(a aVar) {
        switch (c.aob[aVar.getInstrumentType().ordinal()]) {
            case 1:
            case 2:
                return "binary";
            case 3:
                return "multi";
            case 4:
                return "digital";
            case 5:
                return "fx";
            case 6:
                return "cfd";
            case 7:
                return "forex";
            case 8:
                return "crypto";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported type: ");
                stringBuilder.append(aVar.getInstrumentType());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
