package com.iqoption.charttools.e;

import android.view.ViewGroup;
import com.iqoption.charttools.e.a.b;
import com.iqoption.charttools.e.a.d;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0012B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/templates/InstrumentItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/charttools/templates/InstrumentAdapterItem;", "Lcom/iqoption/charttools/templates/InstrumentItemsDecoration$ViewTypeProvider;", "callback", "Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;", "(Lcom/iqoption/charttools/templates/viewholder/ViewHolderCallback;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "techtools_release"})
/* compiled from: InstrumentItemsAdapter.kt */
public final class e extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, d> implements com.iqoption.charttools.e.f.a {
    public static final a aKm = new a();
    private final d aKl;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/charttools/templates/InstrumentItemsAdapter$Companion;", "", "()V", "VIEW_TYPE_FIGURE", "", "VIEW_TYPE_INDICATOR", "VIEW_TYPE_TITLE", "techtools_release"})
    /* compiled from: InstrumentItemsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public e(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "callback");
        this.aKl = dVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == 1) {
            return new com.iqoption.charttools.e.a.c(viewGroup);
        }
        if (i == 2) {
            return new b(this.aKl, viewGroup, this);
        }
        if (i == 3) {
            return new com.iqoption.charttools.e.a.a(this.aKl, viewGroup, this);
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
            com.iqoption.charttools.e.a.c cVar2 = (com.iqoption.charttools.e.a.c) cVar;
            fp = fp(i);
            if (fp != null) {
                cVar2.bV((q) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.templates.TitleItem");
        } else if (itemViewType == 2) {
            b bVar = (b) cVar;
            fp = fp(i);
            if (fp != null) {
                bVar.bV((c) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.templates.IndicatorItem");
        } else if (itemViewType == 3) {
            com.iqoption.charttools.e.a.a aVar = (com.iqoption.charttools.e.a.a) cVar;
            fp = fp(i);
            if (fp != null) {
                aVar.bV((b) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.templates.FigureItem");
        }
    }

    public int getItemViewType(int i) {
        d dVar = (d) fp(i);
        if (dVar instanceof q) {
            return 1;
        }
        if (dVar instanceof c) {
            return 2;
        }
        if (dVar instanceof b) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
