package com.iqoption.tradinghistory.filter.d;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, bng = {"isAll", "", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "tradinghistory_release"})
/* compiled from: InstrumentFilterViewModel.kt */
public final class f {
    private static final boolean b(d dVar) {
        return dVar.aWa() == com.iqoption.tradinghistory.g.f.all_instruments;
    }
}
