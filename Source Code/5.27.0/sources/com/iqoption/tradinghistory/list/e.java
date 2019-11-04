package com.iqoption.tradinghistory.list;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.tradinghistory.a.u;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, bng = {"Lcom/iqoption/tradinghistory/list/TitleViewHolder;", "Lcom/iqoption/tradinghistory/list/TradingHistoryViewHolder;", "Lcom/iqoption/tradinghistory/databinding/ItemTradingHistoryTitleBinding;", "Lcom/iqoption/tradinghistory/list/TitleItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "tradinghistory_release"})
/* compiled from: TradingHistoryViewHolder.kt */
public final class e extends k<u, d> {
    public e(ViewGroup viewGroup) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        super(com.iqoption.tradinghistory.g.e.item_trading_history_title, viewGroup, null, 4, null);
    }

    public void a(u uVar, d dVar) {
        kotlin.jvm.internal.i.f(uVar, "$this$bind");
        kotlin.jvm.internal.i.f(dVar, "item");
        TextView textView = uVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(dVar.getTitle());
    }
}
