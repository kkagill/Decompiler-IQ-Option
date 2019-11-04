package com.iqoption.tradinghistory.filter.d;

import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.tradinghistory.a.aa;
import com.iqoption.tradinghistory.g.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentTypeViewHolder;", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;", "listener", "Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;", "(Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;)V", "getListener", "()Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "tradinghistory_release"})
/* compiled from: InstrumentFilterAdapter.kt */
public final class a extends com.iqoption.core.ui.widget.recyclerview.adapter.a<g, b> {
    private final h dYl;

    public a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, CastExtraArgs.LISTENER);
        this.dYl = hVar;
    }

    /* renamed from: T */
    public g onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        return new g((aa) com.iqoption.core.ext.a.a(viewGroup, e.trading_history_multi_selection, null, false, 6, null), this.dYl, this);
    }

    /* renamed from: a */
    public void onBindViewHolder(g gVar, int i) {
        kotlin.jvm.internal.i.f(gVar, "holder");
        gVar.bV(fp(i));
    }
}
