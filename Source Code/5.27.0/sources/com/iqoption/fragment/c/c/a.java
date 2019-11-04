package com.iqoption.fragment.c.c;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.e.iy;
import com.iqoption.fragment.c.a.b.c;
import com.iqoption.fragment.c.a.b.f;
import com.iqoption.fragment.c.a.b.h;
import com.iqoption.fragment.c.a.b.j;
import com.iqoption.fragment.leftpanel.LeftPanelSection;
import com.iqoption.fragment.rightpanel.n;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/fragment/infoasset/main/InfoAssetMainFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/databinding/FragmentInfoAssetMainInfoBinding;", "viewModel", "Lcom/iqoption/fragment/infoasset/main/InfoAssetMainViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFullStatisticsClick", "item", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsFull;", "onItemAlertButtonClick", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetTitle;", "onItemFavoriteButtonClick", "onItemToggled", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPrice;", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetPriceFull;", "onLinkClick", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetInfo;", "onMoreStatisticsClick", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetStatisticsMore;", "onViewCreated", "view", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetMainFragment.kt */
public final class a extends d implements com.iqoption.fragment.c.a.b.a.a {
    public static final a dhI = new a();
    private HashMap apm;
    private iy dhG;
    private b dhH;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/infoasset/main/InfoAssetMainFragment$Companion;", "", "()V", "newInstance", "Lcom/iqoption/fragment/infoasset/main/InfoAssetMainFragment;", "app_optionXRelease"})
    /* compiled from: InfoAssetMainFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a aDT() {
            return new a();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/fragment/infoasset/adapters/info/InfoAssetAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: InfoAssetMainFragment.kt */
    static final class b<T> implements Observer<List<? extends com.iqoption.fragment.c.a.b.b>> {
        final /* synthetic */ com.iqoption.fragment.c.a.b.a dhJ;

        b(com.iqoption.fragment.c.a.b.a aVar) {
            this.dhJ = aVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends com.iqoption.fragment.c.a.b.b> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.dhJ, list, null, 2, null);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dhH = b.dhQ.ad(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dhG = (iy) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_info_asset_main_info, viewGroup, false, 4, null);
        iy iyVar = this.dhG;
        if (iyVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iyVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.fragment.c.a.b.a aVar = new com.iqoption.fragment.c.a.b.a(this);
        iy iyVar = this.dhG;
        if (iyVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        iyVar.aIq.setHasFixedSize(true);
        RecyclerView recyclerView = iyVar.aIq;
        kotlin.jvm.internal.i.e(recyclerView, "list");
        recyclerView.setAdapter(aVar);
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aDU().observe(this, new b(aVar));
    }

    public void a(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.a(jVar);
    }

    public void b(j jVar) {
        kotlin.jvm.internal.i.f(jVar, "item");
        com.iqoption.fragment.leftpanel.i.dkm.r(com.iqoption.core.ext.a.r(this)).b(LeftPanelSection.ASSET_INFO);
        n.doT.s(com.iqoption.core.ext.a.r(this)).aHI();
    }

    public void a(com.iqoption.fragment.c.a.b.i iVar) {
        kotlin.jvm.internal.i.f(iVar, "item");
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.a(iVar);
    }

    public void a(com.iqoption.fragment.c.a.b.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "item");
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.a(dVar);
    }

    public void a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.a(fVar);
    }

    public void a(h hVar) {
        kotlin.jvm.internal.i.f(hVar, "item");
        b bVar = this.dhH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.a(hVar);
    }

    public void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "item");
        CharSequence adX = cVar.adX();
        Object obj = (adX == null || adX.length() == 0) ? 1 : null;
        if (obj == null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(com.iqoption.core.data.config.b.ad(com.iqoption.core.d.EE().Va(), cVar.adX())));
            intent.addFlags(268435456);
            com.iqoption.core.util.a.a(com.iqoption.core.ext.a.r(this), intent);
        }
        com.iqoption.fragment.c.a.dgs.aDf();
    }
}
