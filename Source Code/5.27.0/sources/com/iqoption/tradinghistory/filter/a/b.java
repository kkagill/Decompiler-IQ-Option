package com.iqoption.tradinghistory.filter.a;

import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import com.iqoption.tradinghistory.a.aa;
import com.iqoption.tradinghistory.a.o;
import com.iqoption.tradinghistory.g.e;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "listener", "Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;", "(Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;)V", "getListener", "()Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "tradinghistory_release"})
/* compiled from: ActiveFilterAdapter.kt */
public final class b extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, h> {
    public static final a dXi = new a();
    private final i dXh;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterAdapter$Companion;", "", "()V", "VIEW_TYPE_ACTIVE", "", "VIEW_TYPE_TITLE", "tradinghistory_release"})
    /* compiled from: ActiveFilterAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public b(i iVar) {
        kotlin.jvm.internal.i.f(iVar, CastExtraArgs.LISTENER);
        this.dXh = iVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 0) {
            return new g((o) com.iqoption.core.ext.a.a(viewGroup, e.item_trading_history_active_title, null, false, 6, null), this);
        } else if (i == 1) {
            return new d((aa) com.iqoption.core.ext.a.a(viewGroup, e.trading_history_multi_selection, null, false, 6, null), this.dXh, this);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected view type: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        d fp;
        if (itemViewType == 0) {
            g gVar = (g) cVar;
            fp = fp(i);
            if (fp != null) {
                gVar.bV((f) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.tradinghistory.filter.active.ActiveTitleAdapterItem");
        } else if (itemViewType == 1) {
            d dVar = (d) cVar;
            fp = fp(i);
            if (fp != null) {
                dVar.bV((a) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.tradinghistory.filter.active.ActiveAdapterItem");
        }
    }

    public int getItemViewType(int i) {
        return ((h) fp(i)).asd();
    }
}
