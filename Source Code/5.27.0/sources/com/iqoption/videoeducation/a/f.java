package com.iqoption.videoeducation.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.c;
import com.iqoption.videoeducation.d;
import com.iqoption.videoeducation.e;
import com.iqoption.videoeducation.g;
import com.iqoption.x.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/videoeducation/VideoCatalogAdapterItem;", "callbacks", "Lcom/iqoption/videoeducation/component/VideoCatalogsAdapter$Callbacks;", "(Lcom/iqoption/videoeducation/component/VideoCatalogsAdapter$Callbacks;)V", "imageSize", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callbacks", "Companion", "app_optionXRelease"})
/* compiled from: VideoCatalogsAdapter.kt */
public final class f extends com.iqoption.core.ui.widget.recyclerview.adapter.a<c<?>, d> {
    public static final b edr = new b();
    private final int edp = com.iqoption.core.ext.a.m(com.iqoption.core.d.Uo(), R.dimen.dp26);
    private final a edq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogsAdapter$Companion;", "", "()V", "VIEW_TYPE_ERROR", "", "VIEW_TYPE_ITEM", "VIEW_TYPE_LOADING", "app_optionXRelease"})
    /* compiled from: VideoCatalogsAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, bng = {"Lcom/iqoption/videoeducation/component/VideoCatalogsAdapter$Callbacks;", "Lcom/iqoption/videoeducation/component/VideoCatalogViewHolder$Callback;", "app_optionXRelease"})
    /* compiled from: VideoCatalogsAdapter.kt */
    public interface a extends com.iqoption.videoeducation.a.e.b {
    }

    public f(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.edq = aVar;
    }

    /* renamed from: f */
    public c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        if (i == -2) {
            return new c(viewGroup);
        }
        if (i == -1) {
            return new d(viewGroup);
        }
        if (i == 1) {
            com.iqoption.videoeducation.a.e.b bVar = this.edq;
            int i2 = this.edp;
            return new e(bVar, i2, i2, viewGroup, this);
        }
        com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
        throw null;
    }

    /* renamed from: a */
    public void onBindViewHolder(c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        if (cVar.getItemViewType() == 1) {
            e eVar = (e) cVar;
            com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp = fp(i);
            if (fp != null) {
                eVar.bV((com.iqoption.videoeducation.f) fp);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.videoeducation.VideoCatalogItem");
        }
    }

    public int getItemViewType(int i) {
        d dVar = (d) fp(i);
        if (dVar instanceof g) {
            return -1;
        }
        if (dVar instanceof e) {
            return -2;
        }
        if (dVar instanceof com.iqoption.videoeducation.f) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
