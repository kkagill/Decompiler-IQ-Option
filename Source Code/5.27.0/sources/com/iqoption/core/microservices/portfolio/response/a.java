package com.iqoption.core.microservices.portfolio.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/microservices/portfolio/response/HistoryPositions;", "", "()V", "offset", "", "limit", "positions", "", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "(IILjava/util/List;)V", "getLimit", "()I", "getOffset", "getPositions", "()Ljava/util/List;", "core_release"})
/* compiled from: HistoryPositions.kt */
public final class a {
    @SerializedName("positions")
    private final List<PortfolioPosition> bwQ;
    @SerializedName("limit")
    private final int limit;
    @SerializedName("offset")
    private final int offset;

    public a(int i, int i2, List<PortfolioPosition> list) {
        kotlin.jvm.internal.i.f(list, "positions");
        this.offset = i;
        this.limit = i2;
        this.bwQ = list;
    }

    public final int getOffset() {
        return this.offset;
    }

    public /* synthetic */ a(int i, int i2, List list, int i3, f fVar) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            list = m.emptyList();
        }
        this(i, i2, list);
    }

    public final List<PortfolioPosition> agl() {
        return this.bwQ;
    }

    public a() {
        this(0, 0, null, 6, null);
    }
}
