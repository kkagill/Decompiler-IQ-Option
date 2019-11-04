package com.iqoption.fragment.c.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.e.iw;
import com.iqoption.fragment.c.a.a.j;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/InfoAssetConditionsFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapter$Callbacks;", "()V", "binding", "Lcom/iqoption/databinding/FragmentInfoAssetConditionsBinding;", "viewModel", "Lcom/iqoption/fragment/infoasset/conditions/ConditionsAssetViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onTodayOvernightClick", "onViewCreated", "view", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetConditionsFragment.kt */
public final class c extends d implements com.iqoption.fragment.c.a.a.i.a {
    public static final a dhE = new a();
    private HashMap apm;
    private iw dhC;
    private a dhD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/infoasset/conditions/InfoAssetConditionsFragment$Companion;", "", "()V", "newInstance", "Lcom/iqoption/fragment/infoasset/conditions/InfoAssetConditionsFragment;", "app_optionXRelease"})
    /* compiled from: InfoAssetConditionsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c aDS() {
            return new c();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: InfoAssetConditionsFragment.kt */
    static final class b<T> implements Observer<List<? extends j>> {
        final /* synthetic */ com.iqoption.fragment.c.a.a.i dhF;

        b(com.iqoption.fragment.c.a.a.i iVar) {
            this.dhF = iVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends j> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.dhF, list, null, 2, null);
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
        this.dhD = a.dht.ac(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dhC = (iw) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_info_asset_conditions, viewGroup, false, 4, null);
        iw iwVar = this.dhC;
        if (iwVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return iwVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.fragment.c.a.a.i iVar = new com.iqoption.fragment.c.a.a.i(this);
        iw iwVar = this.dhC;
        if (iwVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        iwVar.aIq.setHasFixedSize(true);
        RecyclerView recyclerView = iwVar.aIq;
        kotlin.jvm.internal.i.e(recyclerView, "list");
        recyclerView.setAdapter(iVar);
        a aVar = this.dhD;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        aVar.aDM().observe(this, new b(iVar));
    }

    public void aDR() {
        a aVar = this.dhD;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        int aDN = aVar.aDN();
        if (aDN != -1) {
            iw iwVar = this.dhC;
            if (iwVar == null) {
                kotlin.jvm.internal.i.lG("binding");
            }
            RecyclerView recyclerView = iwVar.aIq;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aDN);
            }
        }
    }
}
