package com.iqoption.tradinghistory.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ext.g;
import com.iqoption.tradinghistory.g.f;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0011\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryListFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter;", "getAdapter", "()Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentTradingHistoryBinding;", "currentlyLoading", "", "hasMore", "isCustomTransitionsEnabled", "()Z", "listListener", "com/iqoption/tradinghistory/list/TradingHistoryListFragment$listListener$1", "Lcom/iqoption/tradinghistory/list/TradingHistoryListFragment$listListener$1;", "positionsCount", "", "viewModel", "Lcom/iqoption/tradinghistory/list/TradingHistoryViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryListFragment.kt */
public final class h extends com.iqoption.core.ui.fragment.d {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "adapter", "getAdapter()Lcom/iqoption/tradinghistory/list/TradingHistoryAdapter;"))};
    public static final a dYM = new a();
    private HashMap apm;
    private final boolean bIM = true;
    private boolean btw = true;
    private boolean cPi;
    private com.iqoption.tradinghistory.a.e dYH;
    private l dYI;
    private int dYJ;
    private final kotlin.d dYK = g.c(new TradingHistoryListFragment$adapter$2(this));
    private final b dYL = new b(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/tradinghistory/list/TradingHistoryListFragment$Companion;", "", "()V", "STATE_IS_INITIAL_SEARCH_DONE", "", "VISIBLE_THREAD_HOLD", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: TradingHistoryListFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return com.iqoption.core.ui.d.c.bJi.a(h.class, (Bundle) null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, bng = {"com/iqoption/tradinghistory/list/TradingHistoryListFragment$listListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "tradinghistory_release"})
    /* compiled from: TradingHistoryListFragment.kt */
    public static final class b extends OnScrollListener {
        final /* synthetic */ h this$0;

        b(h hVar) {
            this.this$0 = hVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
            i = recyclerView.getChildCount();
            if (i != 0 && recyclerView.getAdapter() != null && this.this$0.btw) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i - 1));
                if (!this.this$0.cPi && childAdapterPosition > this.this$0.aWg().getItemCount() - 15) {
                    h.e(this.this$0).hf(this.this$0.dYJ);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/tradinghistory/list/TradingHistoryResult;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/tradinghistory/list/TradingHistoryListFragment$onViewCreated$1$1"})
    /* compiled from: TradingHistoryListFragment.kt */
    static final class c<T> implements Observer<j> {
        final /* synthetic */ com.iqoption.tradinghistory.a.e dYO;
        final /* synthetic */ h this$0;

        c(com.iqoption.tradinghistory.a.e eVar, h hVar) {
            this.dYO = eVar;
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final void onChanged(j jVar) {
            if (jVar != null) {
                boolean z = false;
                this.this$0.cPi = false;
                this.this$0.btw = jVar.adP();
                this.this$0.dYJ = jVar.aWi();
                TextView textView = this.dYO.dVV;
                kotlin.jvm.internal.i.e(textView, "placeholder");
                View view = textView;
                if (jVar.aWi() == 0) {
                    z = true;
                }
                com.iqoption.core.ext.a.d(view, z);
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.this$0.aWg(), jVar.getItems(), null, 2, null);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/tradinghistory/list/TradingHistoryListFragment$onViewCreated$1$2"})
    /* compiled from: TradingHistoryListFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.tradinghistory.a.e dYO;
        final /* synthetic */ h this$0;

        d(com.iqoption.tradinghistory.a.e eVar, h hVar) {
            this.dYO = eVar;
            this.this$0 = hVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                this.this$0.aWg().clear();
                this.dYO.bYW.show();
                return;
            }
            this.dYO.bYW.hide();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/tradinghistory/list/TradingHistoryListFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends g {
        final /* synthetic */ h this$0;

        public e(h hVar) {
            this.this$0 = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    private final f aWg() {
        kotlin.d dVar = this.dYK;
        j jVar = anY[0];
        return (f) dVar.getValue();
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

    public static final /* synthetic */ l e(h hVar) {
        l lVar = hVar.dYI;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return lVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dYI = l.dYU.bb(this);
        l lVar = this.dYI;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        lVar.init();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dYH = (com.iqoption.tradinghistory.a.e) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.tradinghistory.g.e.fragment_trading_history, viewGroup, false, 4, null);
        com.iqoption.tradinghistory.a.e eVar = this.dYH;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return eVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.tradinghistory.a.e eVar = this.dYH;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        RecyclerView recyclerView = eVar.bYB;
        kotlin.jvm.internal.i.e(recyclerView, "items");
        recyclerView.setAdapter(aWg());
        eVar.bYB.addOnScrollListener(this.dYL);
        l lVar = this.dYI;
        String str = "viewModel";
        if (lVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(lVar.Bo(), new c(eVar, this));
        lVar = this.dYI;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        a(lVar.aJl(), new d(eVar, this));
        ImageView imageView = eVar.dVW.cCu;
        kotlin.jvm.internal.i.e(imageView, "tradingHistoryToolbar.toolbarBack");
        imageView.setOnClickListener(new e(this));
        eVar.dVW.dWz.setText(f.trading_history);
        if (bundle == null || !bundle.getBoolean("STATE_IS_INITIAL_SEARCH_DONE", false)) {
            l lVar2 = this.dYI;
            if (lVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            lVar2.hf(0);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_IS_INITIAL_SEARCH_DONE", this.dYJ != 0);
    }

    public boolean ME() {
        return this.bIM;
    }
}
