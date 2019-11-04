package com.iqoption.core.ui.widget.recyclerview.adapter;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 '*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006:\u0001'B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0016J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\tJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J^\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\t2F\b\u0002\u0010 \u001a@\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\t¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\t¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0013\u0018\u00010!H\u0007J\u0014\u0010&\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u000e¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Item", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/AdapterData;", "()V", "data", "", "diffCallback", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "getDiffCallback", "()Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;", "diffCallback$delegate", "Lkotlin/Lazy;", "diffRequest", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "clear", "", "createDiffCallback", "get", "", "position", "", "getItem", "(I)Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "getItemCount", "getItems", "notifyChanged", "setItems", "newItems", "onSet", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "setItemsBlocking", "Companion", "core_release"})
/* compiled from: IQAdapter.kt */
public abstract class a<VH extends ViewHolder, Item extends d<?>> extends Adapter<VH> implements com.iqoption.core.ui.widget.recyclerview.a.a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "diffCallback", "getDiffCallback()Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffCallback;"))};
    public static final a bPk = new a();
    private com.iqoption.core.ui.widget.recyclerview.adapter.a.b<Item> bPi;
    private final kotlin.d bPj = g.c(new IQAdapter$diffCallback$2(this));
    private volatile List<? extends Item> bxW = m.emptyList();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0005¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter$Companion;", "", "()V", "unsupportedViewType", "", "viewType", "", "core_release"})
    /* compiled from: IQAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Item", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "run"})
    /* compiled from: IQAdapter.kt */
    static final class b implements Runnable {
        final /* synthetic */ com.iqoption.core.ui.widget.recyclerview.adapter.a.b bPl;
        final /* synthetic */ m bPm;
        final /* synthetic */ a this$0;

        b(a aVar, com.iqoption.core.ui.widget.recyclerview.adapter.a.b bVar, m mVar) {
            this.this$0 = aVar;
            this.bPl = bVar;
            this.bPm = mVar;
        }

        public final void run() {
            final c a = this.bPl.a(this.this$0.amV());
            com.iqoption.core.rx.i.akj().m(new Runnable(this) {
                final /* synthetic */ b bPn;

                public final void run() {
                    if (kotlin.jvm.internal.i.y(this.bPn.this$0.bPi, a.ana())) {
                        this.bPn.this$0.bxW = a.ana().amZ();
                        a.anb().dispatchUpdatesTo((Adapter) this.bPn.this$0);
                        m mVar = this.bPn.bPm;
                        if (mVar != null) {
                            l lVar = (l) mVar.w(a.ana().amY(), this.bPn.this$0.bxW);
                        }
                    }
                }
            });
        }
    }

    private final com.iqoption.core.ui.widget.recyclerview.adapter.a.a<Item> amV() {
        kotlin.d dVar = this.bPj;
        j jVar = anY[0];
        return (com.iqoption.core.ui.widget.recyclerview.adapter.a.a) dVar.getValue();
    }

    public final void w(List<? extends Item> list) {
        a(this, list, null, 2, null);
    }

    public final Object get(int i) {
        return u.h(this.bxW, i);
    }

    public final Item fp(int i) {
        return (d) this.bxW.get(i);
    }

    public final List<Item> getItems() {
        return this.bxW;
    }

    public static /* synthetic */ void a(a aVar, List list, m mVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                mVar = (m) null;
            }
            aVar.a(list, mVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItems");
    }

    public final void a(List<? extends Item> list, m<? super List<? extends Item>, ? super List<? extends Item>, l> mVar) {
        kotlin.jvm.internal.i.f(list, "newItems");
        com.iqoption.core.ui.widget.recyclerview.adapter.a.b bVar = new com.iqoption.core.ui.widget.recyclerview.adapter.a.b(this.bxW, list);
        this.bPi = bVar;
        com.iqoption.core.rx.i.akk().m(new b(this, bVar, mVar));
    }

    public final void clear() {
        this.bxW = m.emptyList();
        notifyDataSetChanged();
    }

    public final void aG(List<? extends Item> list) {
        kotlin.jvm.internal.i.f(list, "newItems");
        c a = new com.iqoption.core.ui.widget.recyclerview.adapter.a.b(this.bxW, list).a(amV());
        this.bxW = a.ana().amZ();
        a.anb().dispatchUpdatesTo((Adapter) this);
    }

    public int getItemCount() {
        return this.bxW.size();
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.widget.recyclerview.adapter.a.a<Item> amW() {
        return new com.iqoption.core.ui.widget.recyclerview.adapter.a.a();
    }
}
