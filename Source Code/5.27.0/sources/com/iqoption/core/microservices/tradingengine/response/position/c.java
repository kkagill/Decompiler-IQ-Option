package com.iqoption.core.microservices.tradingengine.response.position;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/PositionsResult;", "", "()V", "total", "", "positions", "", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "(ILjava/util/List;)V", "getPositions", "()Ljava/util/List;", "getTotal", "()I", "core_release"})
/* compiled from: PositionsResult.kt */
public final class c {
    @SerializedName("positions")
    private final List<TradingPosition> bwQ;
    @SerializedName("total")
    private final int total;

    public c(int i, List<TradingPosition> list) {
        kotlin.jvm.internal.i.f(list, "positions");
        this.total = i;
        this.bwQ = list;
    }

    public /* synthetic */ c(int i, List list, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = m.emptyList();
        }
        this(i, list);
    }

    public final List<TradingPosition> agl() {
        return this.bwQ;
    }

    public c() {
        this(0, null, 2, null);
    }
}
