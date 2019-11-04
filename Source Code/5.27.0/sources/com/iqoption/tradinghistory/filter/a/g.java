package com.iqoption.tradinghistory.filter.a;

import android.view.View;
import android.widget.TextView;
import com.iqoption.core.ui.widget.recyclerview.a.a;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.tradinghistory.a.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveTitleFilterViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/tradinghistory/filter/active/ActiveTitleAdapterItem;", "binding", "Lcom/iqoption/tradinghistory/databinding/ItemTradingHistoryActiveTitleBinding;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/tradinghistory/databinding/ItemTradingHistoryActiveTitleBinding;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getBinding", "()Lcom/iqoption/tradinghistory/databinding/ItemTradingHistoryActiveTitleBinding;", "bind", "", "item", "tradinghistory_release"})
/* compiled from: ActiveFilterViewHolders.kt */
public final class g extends c<f> {
    private final o dXE;

    public g(o oVar, a aVar) {
        kotlin.jvm.internal.i.f(oVar, "binding");
        View root = oVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        super(root, aVar);
        this.dXE = oVar;
    }

    /* renamed from: a */
    public void bB(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        TextView textView = this.dXE.ala;
        kotlin.jvm.internal.i.e(textView, "binding.activeTitle");
        textView.setText(fVar.getTitle());
    }
}
