package com.iqoption.tradinghistory.filter.d;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.tradinghistory.a.aa;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, bng = {"Lcom/iqoption/tradinghistory/filter/instrument/InstrumentTypeViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/tradinghistory/filter/instrument/InstrumentFilterAdapterItem;", "binding", "Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;", "listener", "Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Lcom/iqoption/tradinghistory/databinding/TradingHistoryMultiSelectionBinding;", "getListener", "()Lcom/iqoption/tradinghistory/filter/instrument/OnInstrumentTypeClickListener;", "bind", "", "item", "tradinghistory_release"})
/* compiled from: InstrumentTypeViewHolder.kt */
public final class g extends c<b> {
    private final aa dXt;
    private final h dYl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: InstrumentTypeViewHolder.kt */
    static final class a implements OnClickListener {
        final /* synthetic */ g dYx;
        final /* synthetic */ b dYy;

        a(g gVar, b bVar) {
            this.dYx = gVar;
            this.dYy = bVar;
        }

        public final void onClick(View view) {
            h aWb = this.dYx.aWb();
            b bVar = this.dYy;
            CheckBox checkBox = this.dYx.aVQ().dKh;
            kotlin.jvm.internal.i.e(checkBox, "binding.checker");
            aWb.a(bVar, checkBox.isChecked() ^ 1);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "selected", "", "onCheckedChanged"})
    /* compiled from: InstrumentTypeViewHolder.kt */
    static final class b implements OnCheckedChangeListener {
        final /* synthetic */ g dYx;
        final /* synthetic */ b dYy;

        b(g gVar, b bVar) {
            this.dYx = gVar;
            this.dYy = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.dYx.aWb().a(this.dYy, z);
        }
    }

    public final aa aVQ() {
        return this.dXt;
    }

    public final h aWb() {
        return this.dYl;
    }

    public g(aa aaVar, h hVar, com.iqoption.core.ui.widget.recyclerview.a.a aVar) {
        kotlin.jvm.internal.i.f(aaVar, "binding");
        kotlin.jvm.internal.i.f(hVar, CastExtraArgs.LISTENER);
        View root = aaVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar);
        this.dXt = aaVar;
        this.dYl = hVar;
    }

    /* renamed from: a */
    public void bB(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "item");
        this.dXt.dKi.setText(bVar.aVZ().aWa());
        this.dXt.getRoot().setOnClickListener(new a(this, bVar));
        this.dXt.dKh.setOnCheckedChangeListener(null);
        CheckBox checkBox = this.dXt.dKh;
        kotlin.jvm.internal.i.e(checkBox, "binding.checker");
        checkBox.setChecked(bVar.asM());
        this.dXt.dKh.setOnCheckedChangeListener(new b(this, bVar));
    }
}
