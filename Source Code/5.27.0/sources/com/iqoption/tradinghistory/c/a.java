package com.iqoption.tradinghistory.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.iqoption.core.microservices.portfolio.response.PortfolioPosition;
import com.iqoption.core.ui.d.b;
import com.iqoption.core.ui.d.c;
import com.iqoption.core.ui.d.g;
import com.iqoption.tradinghistory.filter.b.d;
import com.iqoption.tradinghistory.g.e;
import com.iqoption.tradinghistory.list.h;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, bng = {"Lcom/iqoption/tradinghistory/navigator/TradingHistoryNavigatorFragment;", "Lcom/iqoption/core/ui/navigation/BaseStackNavigatorFragment;", "()V", "getContainerId", "", "getInitialEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "tradinghistory_release"})
/* compiled from: TradingHistoryNavigatorFragment.kt */
public final class a extends b {
    private static final String TAG;
    public static final a eaP = new a();
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/tradinghistory/navigator/TradingHistoryNavigatorFragment$Companion;", "", "()V", "TAG", "", "getNavigator", "Lcom/iqoption/tradinghistory/navigator/TradingHistoryNavigatorFragment;", "current", "Landroidx/fragment/app/Fragment;", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "openActiveFilter", "", "openBalanceFilter", "openDateFilter", "openInstrumentFilter", "openList", "openPositionDetails", "position", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "tradinghistory_release"})
    /* compiled from: TradingHistoryNavigatorFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c Lj() {
            return new c(a.TAG, a.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }

        public final void bc(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bh(fragment).alE(), h.dYM.Lj(), false, 2, null);
        }

        public final void a(Fragment fragment, PortfolioPosition portfolioPosition) {
            kotlin.jvm.internal.i.f(fragment, "current");
            kotlin.jvm.internal.i.f(portfolioPosition, "position");
            a bh = bh(fragment);
            com.iqoption.tradinghistory.b.h.dWW.G(com.iqoption.core.ext.a.r(fragment)).a(portfolioPosition);
            g.a(bh.alE(), com.iqoption.tradinghistory.b.g.dWN.asc(), false, 2, null);
        }

        public final void bd(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bh(fragment).alE(), com.iqoption.tradinghistory.filter.d.c.dYq.Lj(), false, 2, null);
        }

        public final void be(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bh(fragment).alE(), d.dXJ.Lj(), false, 2, null);
        }

        public final void bf(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bh(fragment).alE(), com.iqoption.tradinghistory.filter.a.c.dXp.Lj(), false, 2, null);
        }

        public final void bg(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "current");
            g.a(bh(fragment).alE(), com.iqoption.tradinghistory.filter.c.a.dYh.Lj(), false, 2, null);
        }

        private final a bh(Fragment fragment) {
            return (a) com.iqoption.core.ext.a.a(fragment, a.class);
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

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return ((com.iqoption.tradinghistory.a.i) com.iqoption.core.ext.a.a((Fragment) this, e.fragment_trading_history_navigator, viewGroup, false, 4, null)).getRoot();
    }

    public int KW() {
        return com.iqoption.tradinghistory.g.d.tradingHistoryNavigatorContainer;
    }

    public c KX() {
        return com.iqoption.tradinghistory.filter.container.a.dXW.Lj();
    }
}
