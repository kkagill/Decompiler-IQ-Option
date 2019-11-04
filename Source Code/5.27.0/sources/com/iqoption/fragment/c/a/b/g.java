package com.iqoption.fragment.c.a.b;

import com.iqoption.core.microservices.quoteshistory.response.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatistics;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "precision", "", "fiveMin", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "oneHour", "oneDay", "(ILcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;)V", "getFiveMin", "()Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "getOneDay", "getOneHour", "getPrecision", "()I", "app_optionXRelease"})
/* compiled from: InfoAssetAdapterItems.kt */
public final class g extends b {
    private final int akR;
    private final a dhd;
    private final a dhe;
    private final a dhf;

    public final int getPrecision() {
        return this.akR;
    }

    public final a aDD() {
        return this.dhd;
    }

    public final a aDE() {
        return this.dhe;
    }

    public final a aDF() {
        return this.dhf;
    }

    public g(int i, a aVar, a aVar2, a aVar3) {
        kotlin.jvm.internal.i.f(aVar, "fiveMin");
        kotlin.jvm.internal.i.f(aVar2, "oneHour");
        kotlin.jvm.internal.i.f(aVar3, "oneDay");
        super(6, null);
        this.akR = i;
        this.dhd = aVar;
        this.dhe = aVar2;
        this.dhf = aVar3;
    }
}
