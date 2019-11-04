package com.iqoption.fragment.rightpanel.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapterItem;", "callbacks", "Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "(Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;)V", "uiConfig", "Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;", "getUiConfig", "()Lcom/iqoption/fragment/rightpanel/multiselector/viewholder/UIConfig;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: MultiSelectorAdapter.kt */
public final class d extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, e> {
    public static final b dqd = new b();
    private final com.iqoption.fragment.rightpanel.a.a.c dqb = new com.iqoption.fragment.rightpanel.a.a.c(com.iqoption.core.d.Uo());
    private final a dqc;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Callbacks;", "", "onItemClick", "", "item", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "app_optionXRelease"})
    /* compiled from: MultiSelectorAdapter.kt */
    public interface a {
        void onItemClick(com.iqoption.core.microservices.tradingengine.response.active.a aVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/rightpanel/multiselector/MultiSelectorAdapter$Companion;", "", "()V", "VIEW_TYPE_ACTIVE", "", "VIEW_TYPE_POSITION", "app_optionXRelease"})
    /* compiled from: MultiSelectorAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    public d(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.dqc = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 1) {
            return new com.iqoption.fragment.rightpanel.a.a.a(viewGroup, this.dqc, this);
        }
        if (i == 2) {
            return new com.iqoption.fragment.rightpanel.a.a.b(viewGroup, this.dqc, this.dqb, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        if (itemViewType == 1) {
            com.iqoption.fragment.rightpanel.a.a.a aVar = (com.iqoption.fragment.rightpanel.a.a.a) cVar;
            fp = fp(i);
            if (fp != null) {
                aVar.bB((a) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.rightpanel.multiselector.MultiActiveItem");
        } else if (itemViewType == 2) {
            com.iqoption.fragment.rightpanel.a.a.b bVar = (com.iqoption.fragment.rightpanel.a.a.b) cVar;
            fp = fp(i);
            if (fp != null) {
                bVar.bB((b) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.rightpanel.multiselector.MultiPositionItem");
        }
    }

    public int getItemViewType(int i) {
        e eVar = (e) fp(i);
        if (eVar instanceof a) {
            return 1;
        }
        if (eVar instanceof b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
