package com.iqoption.tradinghistory.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.tradinghistory.g.f;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/tradinghistory/details/PositionDetailsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "isCustomTransitionsEnabled", "", "()Z", "viewHolder", "Lcom/iqoption/tradinghistory/details/holder/DealDetailsViewHolder;", "viewModel", "Lcom/iqoption/tradinghistory/details/PositionDetailsViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "tradinghistory_release"})
/* compiled from: PositionDetailsFragment.kt */
public final class g extends com.iqoption.core.ui.fragment.d {
    public static final a dWN = new a();
    private HashMap apm;
    private final boolean bIM = true;
    private com.iqoption.tradinghistory.b.a.b dWL;
    private h dWM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/tradinghistory/details/PositionDetailsFragment$Companion;", "", "()V", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: PositionDetailsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c asc() {
            return com.iqoption.core.ui.d.c.bJi.a(g.class, (Bundle) null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ g dWO;

        public b(g gVar) {
            this.dWO = gVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentActivity activity = this.dWO.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/iqoption/core/util/link/Link;", "", "onChanged"})
    /* compiled from: PositionDetailsFragment.kt */
    static final class c<T> implements Observer<Pair<? extends com.iqoption.core.util.b.a, ? extends String>> {
        final /* synthetic */ g dWO;

        c(g gVar) {
            this.dWO = gVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<com.iqoption.core.util.b.a, String> pair) {
            if (pair != null) {
                com.iqoption.core.ext.a.ak(g.a(this.dWO).aVL());
                com.iqoption.core.ext.a.ak(g.a(this.dWO).aVM());
                com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{(com.iqoption.core.util.b.a) pair.getFirst()};
                com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, g.a(this.dWO).aVM(), (CharSequence) pair.bni(), 0, 0, false, null, 120, null));
                return;
            }
            g gVar = this.dWO;
            com.iqoption.core.ext.a.al(g.a(gVar).aVL());
            com.iqoption.core.ext.a.al(g.a(gVar).aVM());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "data", "Lcom/iqoption/tradinghistory/details/Data;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PositionDetailsFragment.kt */
    static final class d<T> implements Observer<c> {
        final /* synthetic */ g dWO;

        d(g gVar) {
            this.dWO = gVar;
        }

        /* renamed from: a */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                g.a(this.dWO).b(cVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "investData", "Lcom/iqoption/tradinghistory/details/InvestData;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: PositionDetailsFragment.kt */
    static final class e<T> implements Observer<d> {
        final /* synthetic */ g dWO;

        e(g gVar) {
            this.dWO = gVar;
        }

        /* renamed from: a */
        public final void onChanged(d dVar) {
            if (dVar != null) {
                g.a(this.dWO).c(dVar);
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ com.iqoption.tradinghistory.b.a.b a(g gVar) {
        com.iqoption.tradinghistory.b.a.b bVar = gVar.dWL;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewHolder");
        }
        return bVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dWM = h.dWW.G(com.iqoption.core.ext.a.r(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        com.iqoption.tradinghistory.b.a.c cVar = com.iqoption.tradinghistory.b.a.c.dXf;
        h hVar = this.dWM;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        this.dWL = cVar.fk(hVar.aVI());
        com.iqoption.tradinghistory.b.a.b bVar = this.dWL;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewHolder");
        }
        return bVar.f(layoutInflater, viewGroup);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.tradinghistory.b.a.b bVar = this.dWL;
        String str = "viewHolder";
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aVJ().setText(f.deal_details);
        bVar = this.dWL;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        bVar.aVK().setOnClickListener(new b(this));
        h hVar = this.dWM;
        str = "viewModel";
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        hVar.aVH();
        hVar = this.dWM;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(hVar.aVF(), new c(this));
        hVar = this.dWM;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(hVar.aVD(), new d(this));
        hVar = this.dWM;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(hVar.aVE(), new e(this));
    }

    public boolean ME() {
        return this.bIM;
    }
}
