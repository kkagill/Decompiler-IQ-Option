package com.iqoption.tradinghistory.list;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/tradinghistory/list/TradingHistoryViewHolder;", "Lcom/iqoption/tradinghistory/list/TradingHistoryListItem;", "callback", "Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter$Callback;", "(Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter$Callback;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callback", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryAdapter.kt */
public final class f extends com.iqoption.core.ui.widget.recyclerview.adapter.a<k<?, ?>, i> {
    public static final b dYC = new b();
    private final a dYB;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_SPACE", "VIEW_TYPE_TITLE", "tradinghistory_release"})
    /* compiled from: TradingHistoryAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter$Callback;", "Lcom/iqoption/tradinghistory/list/ItemViewHolder$Callback;", "tradinghistory_release"})
    /* compiled from: TradingHistoryAdapter.kt */
    public interface a extends com.iqoption.tradinghistory.list.a.a {
    }

    public f(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callback");
        this.dYB = aVar;
    }

    /* renamed from: U */
    public k<?, ?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 1) {
            return new e(viewGroup);
        }
        if (i == 2) {
            return new a(this.dYB, viewGroup, this);
        }
        if (i == 3) {
            return new c(viewGroup);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(k<?, ?> kVar, int i) {
        kotlin.jvm.internal.i.f(kVar, "holder");
        int itemViewType = kVar.getItemViewType();
        d fp;
        if (itemViewType == 1) {
            e eVar = (e) kVar;
            fp = fp(i);
            if (fp != null) {
                eVar.bV((d) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.tradinghistory.list.TitleItem");
        } else if (itemViewType == 2) {
            a aVar = (a) kVar;
            fp = fp(i);
            if (fp != null) {
                aVar.bV((g) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.tradinghistory.list.TradingHistoryItem");
        } else if (itemViewType == 3) {
            c cVar = (c) kVar;
            fp = fp(i);
            if (fp != null) {
                cVar.bV((b) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.tradinghistory.list.SpaceItem");
        }
    }

    public int getItemViewType(int i) {
        i iVar = (i) fp(i);
        if (iVar instanceof d) {
            return 1;
        }
        if (iVar instanceof g) {
            return 2;
        }
        if (iVar instanceof b) {
            return 3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported itemViewType ");
        stringBuilder.append(k.G(fp(i).getClass()).getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
