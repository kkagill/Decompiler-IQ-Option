package com.iqoption.tradinghistory.filter.container;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.tradinghistory.a.y;
import java.util.HashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentTradingHistoryFiltersBinding;", "viewModel", "Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryFiltersFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a dXW = new a();
    private HashMap apm;
    private b dXU;
    private com.iqoption.tradinghistory.a.g dXV;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFiltersFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: TradingHistoryFiltersFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(Bx(), a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/tradinghistory/filter/container/TradingHistoryFiltersFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public b(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.r(this.dXX).onBackPressed();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/tradinghistory/filter/container/TradingHistoryFiltersFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public c(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.tradinghistory.c.a.eaP.bc(this.dXX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public d(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.tradinghistory.c.a.eaP.bd(this.dXX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public e(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.tradinghistory.c.a.eaP.be(this.dXX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class f extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public f(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.tradinghistory.c.a.eaP.bf(this.dXX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ a dXX;

        public g(a aVar) {
            this.dXX = aVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.tradinghistory.c.a.eaP.bg(this.dXX);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "filterValues", "", "Lcom/iqoption/tradinghistory/filter/container/TradingHistoryFilterType;", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TradingHistoryFiltersFragment.kt */
    static final class h<T> implements Observer<Map<TradingHistoryFilterType, ? extends String>> {
        final /* synthetic */ a dXX;

        h(a aVar) {
            this.dXX = aVar;
        }

        /* renamed from: N */
        public final void onChanged(Map<TradingHistoryFilterType, String> map) {
            TextView textView = a.a(this.dXX).dWe;
            kotlin.jvm.internal.i.e(textView, "binding.tradingHistoryFilterInstrumentValue");
            textView.setText((CharSequence) map.get(TradingHistoryFilterType.INSTRUMENT));
            textView = a.a(this.dXX).dWa;
            kotlin.jvm.internal.i.e(textView, "binding.tradingHistoryFilterBalanceValue");
            textView.setText((CharSequence) map.get(TradingHistoryFilterType.BALANCE));
            textView = a.a(this.dXX).dVY;
            kotlin.jvm.internal.i.e(textView, "binding.tradingHistoryFilterActiveValue");
            textView.setText((CharSequence) map.get(TradingHistoryFilterType.ACTIVE));
            textView = a.a(this.dXX).dWc;
            kotlin.jvm.internal.i.e(textView, "binding.tradingHistoryFilterDateValue");
            textView.setText((CharSequence) map.get(TradingHistoryFilterType.DATE));
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

    public static final /* synthetic */ com.iqoption.tradinghistory.a.g a(a aVar) {
        com.iqoption.tradinghistory.a.g gVar = aVar.dXV;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar;
    }

    static {
        String name = a.class.getName();
        kotlin.jvm.internal.i.e(name, "TradingHistoryFiltersFragment::class.java.name");
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dXU = b.dXY.aY(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dXV = (com.iqoption.tradinghistory.a.g) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.tradinghistory.g.e.fragment_trading_history_filters, viewGroup, false, 4, null);
        com.iqoption.tradinghistory.a.g gVar = this.dXV;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return gVar.getRoot();
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.tradinghistory.a.g gVar = this.dXV;
        String str = "binding";
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        y yVar = gVar.dWf;
        ImageView imageView = yVar.cCu;
        kotlin.jvm.internal.i.e(imageView, "toolbarBack");
        imageView.setOnClickListener(new b(this));
        yVar.dWz.setText(com.iqoption.tradinghistory.g.f.trading_history);
        TextView textView = yVar.dWv;
        String str2 = "tradingHistoryApply";
        kotlin.jvm.internal.i.e(textView, str2);
        com.iqoption.core.ext.a.ak(textView);
        TextView textView2 = yVar.dWv;
        kotlin.jvm.internal.i.e(textView2, str2);
        textView2.setOnClickListener(new c(this));
        gVar = this.dXV;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LinearLayout linearLayout = gVar.dWd;
        kotlin.jvm.internal.i.e(linearLayout, "binding.tradingHistoryFilterInstrument");
        linearLayout.setOnClickListener(new d(this));
        String str3 = "binding.tradingHistoryFilterBalance";
        if (com.iqoption.core.d.EA().Ej()) {
            gVar = this.dXV;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = gVar.dVZ;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.al(linearLayout);
        } else {
            gVar = this.dXV;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = gVar.dVZ;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            com.iqoption.core.ext.a.ak(linearLayout);
            gVar = this.dXV;
            if (gVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            linearLayout = gVar.dVZ;
            kotlin.jvm.internal.i.e(linearLayout, str3);
            linearLayout.setOnClickListener(new e(this));
        }
        gVar = this.dXV;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gVar.dVX;
        kotlin.jvm.internal.i.e(linearLayout, "binding.tradingHistoryFilterActive");
        linearLayout.setOnClickListener(new f(this));
        gVar = this.dXV;
        if (gVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        linearLayout = gVar.dWb;
        kotlin.jvm.internal.i.e(linearLayout, "binding.tradingHistoryFilterDate");
        linearLayout.setOnClickListener(new g(this));
        b bVar = this.dXU;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        bVar.aVV().observe(this, new h(this));
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.e(this);
    }
}
