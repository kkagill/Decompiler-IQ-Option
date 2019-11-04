package com.iqoption.tradinghistory.list;

import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter;", "invoke"})
/* compiled from: TradingHistoryListFragment.kt */
final class TradingHistoryListFragment$adapter$2 extends Lambda implements a<f> {
    final /* synthetic */ h this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/tradinghistory/list/TradingHistoryListFragment$adapter$2$1", "Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter$Callback;", "onItemClick", "", "item", "Lcom/iqoption/tradinghistory/list/TradingHistoryItem;", "tradinghistory_release"})
    /* compiled from: TradingHistoryListFragment.kt */
    /* renamed from: com.iqoption.tradinghistory.list.TradingHistoryListFragment$adapter$2$1 */
    public static final class AnonymousClass1 implements f.a {
        final /* synthetic */ TradingHistoryListFragment$adapter$2 dYN;

        AnonymousClass1(TradingHistoryListFragment$adapter$2 tradingHistoryListFragment$adapter$2) {
            this.dYN = tradingHistoryListFragment$adapter$2;
        }

        public void a(g gVar) {
            kotlin.jvm.internal.i.f(gVar, "item");
            com.iqoption.tradinghistory.c.a.eaP.a(this.dYN.this$0, gVar.aVG());
        }
    }

    TradingHistoryListFragment$adapter$2(h hVar) {
        this.this$0 = hVar;
        super(0);
    }

    /* renamed from: aWh */
    public final f invoke() {
        return new f(new AnonymousClass1(this));
    }
}
