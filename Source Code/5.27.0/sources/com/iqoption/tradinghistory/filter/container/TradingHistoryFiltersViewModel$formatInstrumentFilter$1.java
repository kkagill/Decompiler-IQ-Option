package com.iqoption.tradinghistory.filter.container;

import android.app.Application;
import com.iqoption.tradinghistory.filter.d.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterItem;", "invoke"})
/* compiled from: TradingHistoryFiltersViewModel.kt */
final class TradingHistoryFiltersViewModel$formatInstrumentFilter$1 extends Lambda implements b<d, String> {
    final /* synthetic */ Application $context;

    TradingHistoryFiltersViewModel$formatInstrumentFilter$1(Application application) {
        this.$context = application;
        super(1);
    }

    /* renamed from: a */
    public final String invoke(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "it");
        String string = this.$context.getString(dVar.aWa());
        kotlin.jvm.internal.i.e(string, "context.getString(it.textResId)");
        return string;
    }
}
