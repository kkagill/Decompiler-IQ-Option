package com.iqoption.tradinghistory.list;

import android.view.View;
import android.view.ViewGroup;
import com.iqoption.core.ext.g;
import com.iqoption.tradinghistory.a.q;
import com.iqoption.tradinghistory.g.e;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, bng = {"Lcom/iqoption/tradinghistory/list/ItemViewHolder;", "Lcom/iqoption/tradinghistory/list/TradingHistoryViewHolder;", "Lcom/iqoption/tradinghistory/databinding/ItemTradingHistoryBinding;", "Lcom/iqoption/tradinghistory/list/TradingHistoryItem;", "callback", "Lcom/iqoption/tradinghistory/list/ItemViewHolder$Callback;", "parent", "Landroid/view/ViewGroup;", "data", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "(Lcom/iqoption/tradinghistory/list/ItemViewHolder$Callback;Landroid/view/ViewGroup;Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;)V", "getCallback", "()Lcom/iqoption/tradinghistory/list/ItemViewHolder$Callback;", "bind", "", "item", "Callback", "tradinghistory_release"})
/* compiled from: TradingHistoryViewHolder.kt */
public final class a extends k<q, g> {
    private final a dYz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/tradinghistory/list/ItemViewHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/tradinghistory/list/TradingHistoryItem;", "tradinghistory_release"})
    /* compiled from: TradingHistoryViewHolder.kt */
    public interface a {
        void a(g gVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/tradinghistory/list/ItemViewHolder$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "tradinghistory_release"})
    /* compiled from: TradingHistoryViewHolder.kt */
    /* renamed from: com.iqoption.tradinghistory.list.a$1 */
    public static final class AnonymousClass1 extends g {
        final /* synthetic */ a dYA;

        AnonymousClass1(a aVar) {
            this.dYA = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            g gVar = (g) this.dYA.and();
            if (gVar != null) {
                this.dYA.aWc().a(gVar);
            }
        }
    }

    public final a aWc() {
        return this.dYz;
    }

    public a(a aVar, ViewGroup viewGroup, com.iqoption.core.ui.widget.recyclerview.a.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        kotlin.jvm.internal.i.f(aVar2, "data");
        super(e.item_trading_history, viewGroup, aVar2);
        this.dYz = aVar;
        this.itemView.setOnClickListener(new AnonymousClass1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0098  */
    public void a(com.iqoption.tradinghistory.a.q r4, com.iqoption.tradinghistory.list.g r5) {
        /*
        r3 = this;
        r0 = "$this$bind";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "item";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = r5.aWd();
        if (r0 == 0) goto L_0x0046;
    L_0x0010:
        r0 = r5.aWd();
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x001e;
    L_0x001c:
        r0 = 1;
        goto L_0x001f;
    L_0x001e:
        r0 = 0;
    L_0x001f:
        if (r0 == 0) goto L_0x0046;
    L_0x0021:
        r0 = r3.getBinding();
        r0 = (com.iqoption.tradinghistory.a.q) r0;
        r0 = r0.getRoot();
        r1 = "binding.root";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = r0.getContext();
        r0 = com.squareup.picasso.Picasso.with(r0);
        r1 = r5.aWd();
        r0 = r0.load(r1);
        r1 = r4.aRh;
        r0.into(r1);
        goto L_0x004c;
    L_0x0046:
        r0 = r4.aRh;
        r1 = 0;
        r0.setImageDrawable(r1);
    L_0x004c:
        r0 = r4.alH;
        r1 = "title";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.OZ();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r4.aRu;
        r1 = "subtitle";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.Be();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r4.alW;
        r1 = "profit";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.aDt();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r4.ctH;
        r1 = "profitPercent";
        kotlin.jvm.internal.i.e(r0, r1);
        r1 = r5.aWe();
        r1 = (java.lang.CharSequence) r1;
        r0.setText(r1);
        r0 = r4.ctH;
        r5 = r5.aWf();
        r1 = "root.context";
        r2 = "root";
        if (r5 == 0) goto L_0x00a9;
    L_0x0098:
        r4 = r4.getRoot();
        kotlin.jvm.internal.i.e(r4, r2);
        r4 = r4.getContext();
        kotlin.jvm.internal.i.e(r4, r1);
        r5 = com.iqoption.tradinghistory.g.a.green;
        goto L_0x00b9;
    L_0x00a9:
        r4 = r4.getRoot();
        kotlin.jvm.internal.i.e(r4, r2);
        r4 = r4.getContext();
        kotlin.jvm.internal.i.e(r4, r1);
        r5 = com.iqoption.tradinghistory.g.a.red;
    L_0x00b9:
        r4 = com.iqoption.core.ext.a.k(r4, r5);
        r0.setTextColor(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.list.a.a(com.iqoption.tradinghistory.a.q, com.iqoption.tradinghistory.list.g):void");
    }
}
