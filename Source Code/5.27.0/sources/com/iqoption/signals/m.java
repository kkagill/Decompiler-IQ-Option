package com.iqoption.signals;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, bng = {"Lcom/iqoption/signals/SignalsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onClick", "Lkotlin/Function1;", "Lcom/iqoption/signals/SignalItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "diffCallback", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "Lcom/iqoption/signals/AdapterItem;", "diffRequest", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "signals_release"})
/* compiled from: SignalsAdapter.kt */
public final class m extends Adapter<ViewHolder> {
    public static final a dTm = new a();
    private final kotlin.jvm.a.b<f, l> aFA;
    private com.iqoption.core.ui.widget.recyclerview.adapter.a.b<a> bPi;
    private final com.iqoption.core.ui.widget.recyclerview.adapter.a.a<a> dTl = new com.iqoption.core.ui.widget.recyclerview.adapter.a.a();
    private List<? extends a> iA = m.emptyList();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/signals/SignalsAdapter$Companion;", "", "()V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "VIEW_TYPE_TITLE", "signals_release"})
    /* compiled from: SignalsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: SignalsAdapter.kt */
    static final class b implements Runnable {
        final /* synthetic */ com.iqoption.core.ui.widget.recyclerview.adapter.a.b bPl;
        final /* synthetic */ m dTn;

        b(m mVar, com.iqoption.core.ui.widget.recyclerview.adapter.a.b bVar) {
            this.dTn = mVar;
            this.bPl = bVar;
        }

        public final void run() {
            final c a = this.bPl.a(this.dTn.dTl);
            com.iqoption.core.c.a.biN.execute(new Runnable(this) {
                final /* synthetic */ b dTo;

                public final void run() {
                    if (kotlin.jvm.internal.i.y(this.dTo.dTn.bPi, a.ana())) {
                        this.dTo.dTn.iA = a.ana().amZ();
                        a.anb().dispatchUpdatesTo((Adapter) this.dTo.dTn);
                    }
                }
            });
        }
    }

    public m(kotlin.jvm.a.b<? super f, l> bVar) {
        kotlin.jvm.internal.i.f(bVar, "onClick");
        this.aFA = bVar;
    }

    public final void w(List<? extends a> list) {
        kotlin.jvm.internal.i.f(list, ConditionalUserProperty.VALUE);
        com.iqoption.core.ui.widget.recyclerview.adapter.a.b bVar = new com.iqoption.core.ui.widget.recyclerview.adapter.a.b(this.iA, list);
        this.bPi = bVar;
        com.iqoption.core.c.a.biL.execute(new b(this, bVar));
    }

    public int getItemCount() {
        return this.iA.size();
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -1) {
            return new i(viewGroup);
        }
        if (i == 0) {
            return new l(new k(viewGroup));
        }
        if (i == 2) {
            return new h(new g(viewGroup), this.aFA);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported viewType: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        int itemViewType = viewHolder.getItemViewType();
        Object obj;
        if (itemViewType == 0) {
            l lVar = (l) viewHolder;
            obj = this.iA.get(i);
            if (obj != null) {
                lVar.a((j) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.signals.SignalTitleItem");
        } else if (itemViewType == 2) {
            h hVar = (h) viewHolder;
            obj = this.iA.get(i);
            if (obj != null) {
                hVar.a((f) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.signals.SignalItem");
        }
    }

    public int getItemViewType(int i) {
        a aVar = (a) this.iA.get(i);
        if (kotlin.jvm.internal.i.y(aVar, c.dTd)) {
            return -1;
        }
        if (aVar instanceof j) {
            return 0;
        }
        if (aVar instanceof f) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
