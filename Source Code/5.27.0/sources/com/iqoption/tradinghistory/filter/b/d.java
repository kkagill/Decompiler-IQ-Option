package com.iqoption.tradinghistory.filter.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.tradinghistory.a.k;
import com.iqoption.tradinghistory.g.e;
import com.iqoption.tradinghistory.g.f;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapter;", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentTradingHistoryOptionsBinding;", "listener", "com/iqoption/tradinghistory/filter/balance/BalanceFilterFragment$listener$1", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterFragment$listener$1;", "viewModel", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "tradinghistory_release"})
/* compiled from: BalanceFilterFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a dXJ = new a();
    private HashMap apm;
    private f dXG;
    private b dXH;
    private final b dXI = new b(this);
    private k dXk;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterFragment$Companion;", "", "()V", "TAG", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: BalanceFilterFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(d.TAG, d.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/tradinghistory/filter/balance/BalanceFilterFragment$listener$1", "Lcom/iqoption/tradinghistory/filter/balance/OnBalanceCheckListener;", "onChecked", "", "adapterItem", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapterItem;", "checked", "", "tradinghistory_release"})
    /* compiled from: BalanceFilterFragment.kt */
    public static final class b implements g {
        final /* synthetic */ d dXK;

        b(d dVar) {
            this.dXK = dVar;
        }

        public void a(c cVar, boolean z) {
            kotlin.jvm.internal.i.f(cVar, "adapterItem");
            d.b(this.dXK).b(cVar, z);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ d dXK;

        public c(d dVar) {
            this.dXK = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentActivity activity = this.dXK.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/tradinghistory/filter/balance/BalanceFilterAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: BalanceFilterFragment.kt */
    static final class d<T> implements Observer<List<? extends c>> {
        final /* synthetic */ d dXK;

        d(d dVar) {
            this.dXK = dVar;
        }

        /* renamed from: u */
        public final void onChanged(List<c> list) {
            b a = d.a(this.dXK);
            kotlin.jvm.internal.i.e(list, "it");
            com.iqoption.core.ui.widget.recyclerview.adapter.a.a(a, list, null, 2, null);
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

    public static final /* synthetic */ b a(d dVar) {
        b bVar = dVar.dXH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return bVar;
    }

    public static final /* synthetic */ f b(d dVar) {
        f fVar = dVar.dXG;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return fVar;
    }

    static {
        String name = d.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dXG = f.dXO.aX(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dXk = (k) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_trading_history_options, viewGroup, false, 4, null);
        k kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return kVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        k kVar = this.dXk;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = kVar.dWj.cCu;
        kotlin.jvm.internal.i.e(imageView, "binding.tradingHistoryOptionsToolbar.toolbarBack");
        imageView.setOnClickListener(new c(this));
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        kVar.dWj.dWz.setText(f.balance);
        this.dXH = new b(this.dXI);
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = kVar.dWi;
        String str2 = "binding.tradingHistoryOptionsList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        b bVar = this.dXH;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(bVar);
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView = kVar.dWi;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        recyclerView = kVar.dWi;
        kotlin.jvm.internal.i.e(recyclerView, str2);
        com.iqoption.core.ext.a.b(recyclerView);
        f fVar = this.dXG;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        fVar.Bo().observe(this, new d(this));
    }
}
