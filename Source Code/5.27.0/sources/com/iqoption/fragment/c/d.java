package com.iqoption.fragment.c;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.ext.c;
import com.iqoption.core.marketanalysis.MarketAnalysisTab;
import io.reactivex.b.f;
import io.reactivex.disposables.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/fragment/infoasset/InfoAssetViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "activeMarketAnalysisTab", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "getActiveMarketAnalysisTab", "()Landroidx/lifecycle/LiveData;", "activeTabLiveData", "Landroidx/lifecycle/MutableLiveData;", "tabsInitialized", "", "Companion", "app_optionXRelease"})
/* compiled from: InfoAssetViewModel.kt */
public final class d extends com.iqoption.core.ui.f.d {
    public static final a dgD = new a();
    private final MutableLiveData<MarketAnalysisTab> dgA = new MutableLiveData();
    private final LiveData<MarketAnalysisTab> dgB = this.dgA;
    private boolean dgC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/infoasset/InfoAssetViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/fragment/infoasset/InfoAssetViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: InfoAssetViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d ab(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…setViewModel::class.java)");
            return (d) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: InfoAssetViewModel.kt */
    /* renamed from: com.iqoption.fragment.c.d$1 */
    static final class AnonymousClass1<T> implements f<com.iqoption.core.microservices.tradingengine.response.active.a> {
        final /* synthetic */ d dgE;

        AnonymousClass1(d dVar) {
            this.dgE = dVar;
        }

        /* renamed from: K */
        public final void accept(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            MarketAnalysisTab marketAnalysisTab;
            if (c.b(aVar.getActiveType(), ActiveType.STOCK_ACTIVE, ActiveType.COMMODITY_ACTIVE, ActiveType.ETF_ACTIVE, ActiveType.INDEX_ACTIVE, ActiveType.BOND_ACTIVE) && com.iqoption.core.d.EH().ej("economic-calendar")) {
                marketAnalysisTab = MarketAnalysisTab.EARNINGS;
            } else {
                marketAnalysisTab = (c.b(aVar.getActiveType(), ActiveType.FOREX_ACTIVE, ActiveType.INTRADAY_ACTIVE) && com.iqoption.core.d.EH().ej("earnings-calendar")) ? MarketAnalysisTab.FOREX : null;
            }
            if (!this.dgE.dgC || ((MarketAnalysisTab) this.dgE.dgA.getValue()) != marketAnalysisTab) {
                this.dgE.dgC = true;
                this.dgE.dgA.postValue(marketAnalysisTab);
            }
        }
    }

    public d() {
        TabHelper IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, "TabHelper.instance()");
        b e = IM.IP().e((f) new AnonymousClass1(this));
        kotlin.jvm.internal.i.e(e, "TabHelper.instance().cur…      }\n                }");
        b(e);
    }

    public final LiveData<MarketAnalysisTab> aDj() {
        return this.dgB;
    }
}
