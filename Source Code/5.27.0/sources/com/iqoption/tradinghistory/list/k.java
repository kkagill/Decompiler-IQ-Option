package com.iqoption.tradinghistory.list;

import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.recyclerview.a.a;
import com.iqoption.core.ui.widget.recyclerview.a.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B!\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryViewHolder;", "Binding", "Landroidx/databinding/ViewDataBinding;", "Item", "Lcom/iqoption/tradinghistory/list/TradingHistoryListItem;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/VDBindingHolder;", "layout", "", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(ILandroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "tradinghistory_release"})
/* compiled from: TradingHistoryViewHolder.kt */
public abstract class k<Binding extends ViewDataBinding, Item extends i> extends e<Binding, Item> {
    public /* synthetic */ k(int i, ViewGroup viewGroup, a aVar, int i2, f fVar) {
        if ((i2 & 4) != 0) {
            aVar = (a) null;
        }
        this(i, viewGroup, aVar);
    }

    public k(int i, ViewGroup viewGroup, a aVar) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(i, viewGroup, aVar);
    }
}
