package com.iqoption.tradinghistory.b;

import com.iqoption.core.data.model.InstrumentType;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, bng = {"Lcom/iqoption/tradinghistory/details/MultiData;", "Lcom/iqoption/tradinghistory/details/Data;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "closeReason", "", "items", "", "Lcom/iqoption/tradinghistory/details/MultiItemData;", "(Lcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/util/List;)V", "getCloseReason", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getItems", "()Ljava/util/List;", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
public final class e extends c {
    private final String closeReason;
    private final List<f> iA;
    private final InstrumentType instrumentType;

    public String getCloseReason() {
        return this.closeReason;
    }

    public final List<f> getItems() {
        return this.iA;
    }

    public e(InstrumentType instrumentType, String str, List<f> list) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(str, "closeReason");
        kotlin.jvm.internal.i.f(list, "items");
        super();
        this.instrumentType = instrumentType;
        this.closeReason = str;
        this.iA = list;
    }
}
