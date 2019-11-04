package com.iqoption.charttools.constructor;

import android.view.ViewGroup;
import com.iqoption.charttools.constructor.a.d;
import com.iqoption.charttools.constructor.a.e;
import com.iqoption.charttools.constructor.a.g;
import com.iqoption.charttools.constructor.a.h;
import com.iqoption.charttools.constructor.a.j;
import com.iqoption.charttools.constructor.a.k;
import com.iqoption.charttools.constructor.a.l;
import com.iqoption.charttools.constructor.a.m;
import com.iqoption.charttools.constructor.a.o;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/charttools/constructor/InputItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "Lcom/iqoption/charttools/constructor/InputItemsDecoration$ViewTypeProvider;", "callbacks", "Lcom/iqoption/charttools/constructor/InputItemsAdapter$Callbacks;", "(Lcom/iqoption/charttools/constructor/InputItemsAdapter$Callbacks;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "techtools_release"})
/* compiled from: InputItemsAdapter.kt */
public final class r extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, f> implements com.iqoption.charttools.constructor.s.a {
    public static final b aFH = new b();
    private final a aFG;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/charttools/constructor/InputItemsAdapter$Companion;", "", "()V", "VIEW_TYPE_ERROR", "", "VIEW_TYPE_GROUP_DESCRIPTION", "VIEW_TYPE_GROUP_TITLE", "VIEW_TYPE_INPUT_BOOL", "VIEW_TYPE_INPUT_COLOR", "VIEW_TYPE_INPUT_FIELD", "VIEW_TYPE_INPUT_HOST", "VIEW_TYPE_INPUT_LINE_WIDTH", "VIEW_TYPE_INPUT_SELECT", "VIEW_TYPE_INPUT_STEP_FIELD", "VIEW_TYPE_LOADING", "techtools_release"})
    /* compiled from: InputItemsAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/charttools/constructor/InputItemsAdapter$Callbacks;", "Lcom/iqoption/charttools/constructor/viewholder/GroupTitleViewHolder$Callback;", "Lcom/iqoption/charttools/constructor/viewholder/InputSelectViewHolder$Callback;", "Lcom/iqoption/charttools/constructor/viewholder/InputHostViewHolder$Callback;", "techtools_release"})
    /* compiled from: InputItemsAdapter.kt */
    public interface a extends com.iqoption.charttools.constructor.a.e.a, com.iqoption.charttools.constructor.a.k.a, com.iqoption.charttools.constructor.a.m.a {
    }

    public r(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.aFG = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        switch (i) {
            case -2:
                return new com.iqoption.charttools.constructor.a.c(viewGroup);
            case -1:
                return new com.iqoption.core.ui.c(viewGroup);
            case 1:
                return new e(this.aFG, viewGroup, this);
            case 2:
                return new d(viewGroup);
            case 3:
                return new g(viewGroup, this);
            case 4:
                return new o(viewGroup, this);
            case 5:
                return new j(viewGroup, this);
            case 6:
                return new m(this.aFG, viewGroup, this);
            case 7:
                return new h(viewGroup, this);
            case 8:
                return new l(viewGroup, this);
            case 9:
                return new k(this.aFG, viewGroup, this);
            default:
                com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
                throw null;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        switch (cVar.getItemViewType()) {
            case 1:
                e eVar = (e) cVar;
                fp = fp(i);
                if (fp != null) {
                    eVar.bV((n) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputGroupTitle");
            case 2:
                d dVar = (d) cVar;
                fp = fp(i);
                if (fp != null) {
                    dVar.bV((m) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputGroupDescription");
            case 3:
                g gVar = (g) cVar;
                fp = fp(i);
                if (fp != null) {
                    gVar.bV((i) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputBool");
            case 4:
                o oVar = (o) cVar;
                fp = fp(i);
                if (fp != null) {
                    oVar.bV((x) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputStepField");
            case 5:
                j jVar = (j) cVar;
                fp = fp(i);
                if (fp != null) {
                    jVar.bV((l) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputField");
            case 6:
                m mVar = (m) cVar;
                fp = fp(i);
                if (fp != null) {
                    mVar.bV((u) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputSelect");
            case 7:
                h hVar = (h) cVar;
                fp = fp(i);
                if (fp != null) {
                    hVar.bV((k) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputColor");
            case 8:
                l lVar = (l) cVar;
                fp = fp(i);
                if (fp != null) {
                    lVar.bV((t) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputLineWidth");
            case 9:
                k kVar = (k) cVar;
                fp = fp(i);
                if (fp != null) {
                    kVar.bV((o) fp);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.charttools.constructor.InputHost");
            default:
                return;
        }
    }

    public int getItemViewType(int i) {
        f fVar = (f) fp(i);
        if (fVar instanceof aa) {
            return -1;
        }
        if (fVar instanceof a) {
            return -2;
        }
        if (fVar instanceof n) {
            return 1;
        }
        if (fVar instanceof m) {
            return 2;
        }
        if (fVar instanceof i) {
            return 3;
        }
        if (fVar instanceof x) {
            return 4;
        }
        if (fVar instanceof l) {
            return 5;
        }
        if (fVar instanceof u) {
            return 6;
        }
        if (fVar instanceof k) {
            return 7;
        }
        if (fVar instanceof t) {
            return 8;
        }
        if (fVar instanceof o) {
            return 9;
        }
        throw new NoWhenBranchMatchedException();
    }
}
