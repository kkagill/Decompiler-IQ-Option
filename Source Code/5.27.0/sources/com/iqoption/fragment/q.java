package com.iqoption.fragment;

import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/InstrumentTab;", "Lcom/iqoption/fragment/AssetTab;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeType", "Lcom/iqoption/core/data/model/ActiveType;", "(Lcom/iqoption/core/data/model/InstrumentType;Lcom/iqoption/core/data/model/ActiveType;)V", "getActiveType", "()Lcom/iqoption/core/data/model/ActiveType;", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "app_optionXRelease"})
/* compiled from: TabTypes.kt */
public final class q extends b {
    private final ActiveType activeType;
    private final InstrumentType instrumentType;

    public q(InstrumentType instrumentType, ActiveType activeType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        kotlin.jvm.internal.i.f(activeType, "activeType");
        super(TabType.ACTIVE_TAB, null);
        this.instrumentType = instrumentType;
        this.activeType = activeType;
    }

    public final ActiveType getActiveType() {
        return this.activeType;
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
