package com.iqoption.fragment.assets.a;

import android.view.ViewGroup;
import com.iqoption.core.ui.widget.recyclerview.a.d;
import com.iqoption.fragment.assets.b.e;
import com.iqoption.fragment.assets.b.f;
import com.iqoption.fragment.assets.b.g;
import com.iqoption.fragment.assets.b.k;
import com.iqoption.fragment.assets.model.h;
import com.iqoption.fragment.assets.model.j;
import com.iqoption.fragment.assets.model.n;
import com.iqoption.fragment.assets.model.s;
import com.iqoption.fragment.assets.model.u;
import com.iqoption.x.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u001c\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, bng = {"Lcom/iqoption/fragment/assets/adapter/AssetItemsAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/IQAdapter;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "Lcom/iqoption/fragment/assets/adapter/AdapterContext;", "positiveColor", "", "negativeColor", "neutralColor", "callback", "Lcom/iqoption/fragment/assets/viewholder/AssetItemCallback;", "(IIILcom/iqoption/fragment/assets/viewholder/AssetItemCallback;)V", "getNegativeColor", "()I", "getNeutralColor", "getPositiveColor", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_optionXRelease"})
/* compiled from: AssetItemsAdapter.kt */
public final class c extends com.iqoption.core.ui.widget.recyclerview.adapter.a<com.iqoption.core.ui.widget.recyclerview.a.c<?>, com.iqoption.fragment.assets.model.a> implements a {
    public static final a dbK = new a();
    private final int dbG;
    private final int dbH;
    private final int dbI;
    private final g dbJ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/fragment/assets/adapter/AssetItemsAdapter$Companion;", "", "()V", "VIEW_TYPE_BO", "", "VIEW_TYPE_CFD", "VIEW_TYPE_CLOSED", "VIEW_TYPE_DO", "VIEW_TYPE_FX", "VIEW_TYPE_MULTI", "VIEW_TYPE_MULTI_WARNING", "VIEW_TYPE_SPREAD_WARNING", "app_optionXRelease"})
    /* compiled from: AssetItemsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public int aAE() {
        return this.dbG;
    }

    public int aAF() {
        return this.dbH;
    }

    public int aAG() {
        return this.dbI;
    }

    public c(int i, int i2, int i3, g gVar) {
        kotlin.jvm.internal.i.f(gVar, "callback");
        this.dbG = i;
        this.dbH = i2;
        this.dbI = i3;
        this.dbJ = gVar;
    }

    /* renamed from: f */
    public com.iqoption.core.ui.widget.recyclerview.a.c<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        switch (i) {
            case -2:
                return new k(viewGroup);
            case -1:
                return new d(R.layout.assets_spread_warning, viewGroup, null, null, 12, null);
            case 1:
                return new com.iqoption.fragment.assets.b.a(this.dbJ, viewGroup, this);
            case 2:
                return new e(this.dbJ, viewGroup, this);
            case 3:
                return new f(this.dbJ, viewGroup, this);
            case 4:
                return new com.iqoption.fragment.assets.b.i(this.dbJ, viewGroup, this);
            case 5:
                return new com.iqoption.fragment.assets.b.c(this.dbJ, viewGroup, this);
            case 6:
                return new com.iqoption.fragment.assets.b.d(this.dbJ, viewGroup, this);
            default:
                com.iqoption.core.ui.widget.recyclerview.adapter.a.bPk.unsupportedViewType(i);
                throw null;
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(com.iqoption.core.ui.widget.recyclerview.a.c<?> cVar, int i) {
        kotlin.jvm.internal.i.f(cVar, "holder");
        int itemViewType = cVar.getItemViewType();
        com.iqoption.core.ui.widget.recyclerview.adapter.a.d fp;
        if (itemViewType != -2) {
            switch (itemViewType) {
                case 1:
                    com.iqoption.fragment.assets.b.a aVar = (com.iqoption.fragment.assets.b.a) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        aVar.bB((com.iqoption.fragment.assets.model.d) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetBo");
                case 2:
                    e eVar = (e) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        eVar.bB((com.iqoption.fragment.assets.model.i) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetDo");
                case 3:
                    f fVar = (f) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        fVar.bB((j) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetFx");
                case 4:
                    com.iqoption.fragment.assets.b.i iVar = (com.iqoption.fragment.assets.b.i) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        iVar.bB((n) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetMulti");
                case 5:
                    com.iqoption.fragment.assets.b.c cVar2 = (com.iqoption.fragment.assets.b.c) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        cVar2.bB((com.iqoption.fragment.assets.model.g) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetCfd");
                case 6:
                    com.iqoption.fragment.assets.b.d dVar = (com.iqoption.fragment.assets.b.d) cVar;
                    fp = fp(i);
                    if (fp != null) {
                        dVar.bB((h) fp);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetClosed");
                default:
                    return;
            }
        }
        k kVar = (k) cVar;
        fp = fp(i);
        if (fp != null) {
            kVar.bB((s) fp);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.MultiWarning");
    }

    public int getItemViewType(int i) {
        com.iqoption.fragment.assets.model.a aVar = (com.iqoption.fragment.assets.model.a) fp(i);
        if (aVar instanceof com.iqoption.fragment.assets.model.d) {
            return 1;
        }
        if (aVar instanceof com.iqoption.fragment.assets.model.i) {
            return 2;
        }
        if (aVar instanceof j) {
            return 3;
        }
        if (aVar instanceof n) {
            return 4;
        }
        if (aVar instanceof com.iqoption.fragment.assets.model.g) {
            return 5;
        }
        if (aVar instanceof h) {
            return 6;
        }
        if (aVar instanceof u) {
            return -1;
        }
        if (aVar instanceof s) {
            return -2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
