package com.iqoption.fragment.c.a.b;

import com.iqoption.core.microservices.quoteshistory.response.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "activeId", "", "precision", "oneWeek", "Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "oneMounth", "(IILcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;)V", "getActiveId", "()I", "getOneMounth", "()Lcom/iqoption/core/microservices/quoteshistory/response/CandlesCompact;", "getOneWeek", "getPrecision", "app_optionXRelease"})
/* compiled from: InfoAssetAdapterItems.kt */
public final class h extends b {
    private final int activeId;
    private final int akR;
    private final a dhg;
    private final a dhh;

    public final int getActiveId() {
        return this.activeId;
    }

    public final int getPrecision() {
        return this.akR;
    }

    public final a aDG() {
        return this.dhg;
    }

    public final a aDH() {
        return this.dhh;
    }

    public h(int i, int i2, a aVar, a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "oneWeek");
        kotlin.jvm.internal.i.f(aVar2, "oneMounth");
        super(8, null);
        this.activeId = i;
        this.akR = i2;
        this.dhg = aVar;
        this.dhh = aVar2;
    }
}
