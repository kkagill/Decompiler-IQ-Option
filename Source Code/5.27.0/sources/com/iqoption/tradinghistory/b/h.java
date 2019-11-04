package com.iqoption.tradinghistory.b;

import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.portfolio.response.PortfolioPosition;
import com.iqoption.core.microservices.tradingengine.response.position.CloseReason;
import com.iqoption.core.microservices.tradingengine.response.position.MultiPositionItem;
import com.iqoption.core.microservices.tradingengine.response.position.TradingPosition;
import com.iqoption.core.util.ad;
import io.reactivex.p;
import io.reactivex.t;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref.DoubleRef;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020!H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020!H\u0002J\"\u0010*\u001a\u00020+2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010,\u001a\u00020&H\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0002J\"\u00100\u001a\u00020+2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0002J\u0006\u0010\u0006\u001a\u000202J\u0010\u0010\u0006\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\"\u00105\u001a\b\u0012\u0004\u0012\u000204062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f08H\u0002J\u0006\u00109\u001a\u00020:J\f\u0010;\u001a\u00020\u001a*\u00020<H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R%\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\"\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\tX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, bng = {"Lcom/iqoption/tradinghistory/details/PositionDetailsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "data", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/tradinghistory/details/Data;", "getData", "()Landroidx/lifecycle/LiveData;", "dataData", "Landroidx/lifecycle/MutableLiveData;", "invest", "Lcom/iqoption/tradinghistory/details/InvestData;", "getInvest", "investData", "<set-?>", "Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "position", "getPosition", "()Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;", "setPosition", "(Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;)V", "position$delegate", "Lkotlin/properties/ReadWriteProperty;", "tickInfo", "Lkotlin/Pair;", "Lcom/iqoption/core/util/link/Link;", "", "getTickInfo", "tickInfoData", "buildTickInfoLink", "asset", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "createTime", "", "formatAmount", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "amount", "", "formatDateTime", "timestamp", "formatDateTimeMs", "formatFee", "", "fee", "formatLeverage", "value", "", "formatProfit", "profit", "", "assetData", "Lcom/iqoption/tradinghistory/details/AssetData;", "getSubActivesIfNeeded", "Lio/reactivex/Single;", "assets", "", "isMultioption", "", "localizedText", "Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "Companion", "tradinghistory_release"})
/* compiled from: PositionDetailsViewModel.kt */
public final class h extends com.iqoption.core.ui.f.d {
    private static final String TAG;
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(h.class), "position", "getPosition()Lcom/iqoption/core/microservices/portfolio/response/PortfolioPosition;"))};
    public static final a dWW = new a();
    private final MutableLiveData<c> dWP = new MutableLiveData();
    private final LiveData<c> dWQ = this.dWP;
    private final MutableLiveData<d> dWR = new MutableLiveData();
    private final LiveData<d> dWS = this.dWR;
    private final MutableLiveData<Pair<com.iqoption.core.util.b.a, String>> dWT = new MutableLiveData();
    private final LiveData<Pair<com.iqoption.core.util.b.a, String>> dWU = this.dWT;
    private final kotlin.f.d dWV = kotlin.f.a.eWg.bnQ();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, bng = {"Lcom/iqoption/tradinghistory/details/PositionDetailsViewModel$Companion;", "", "()V", "FEATURE_TICK_DEALS", "", "TAG", "getTAG", "()Ljava/lang/String;", "get", "Lcom/iqoption/tradinghistory/details/PositionDetailsViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "tradinghistory_release"})
    /* compiled from: PositionDetailsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h G(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            Factory factory = (Factory) null;
            ViewModelProvider of = ViewModelProviders.of(fragmentActivity);
            kotlin.jvm.internal.i.e(of, "ViewModelProviders.of(a)");
            ViewModel viewModel = of.get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "if (factory != null) {\n …f(a)\n    }[T::class.java]");
            return (h) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/tradinghistory/details/AssetData;", "assets", "", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "apply"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ h dWX;

        b(h hVar) {
            this.dWX = hVar;
        }

        /* renamed from: M */
        public final p<a> apply(Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map) {
            kotlin.jvm.internal.i.f(map, "assets");
            return this.dWX.L(map);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "assetInfo", "Lcom/iqoption/tradinghistory/details/AssetData;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<a> {
        final /* synthetic */ h dWX;

        c(h hVar) {
            this.dWX = hVar;
        }

        /* renamed from: b */
        public final void accept(a aVar) {
            h hVar = this.dWX;
            kotlin.jvm.internal.i.e(aVar, "assetInfo");
            hVar.a(aVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        public static final d dWY = new d();

        d() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/tradinghistory/details/InvestData;", "it", "", "Lcom/iqoption/core/data/mediators/BalanceData;", "apply"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ h dWX;
        final /* synthetic */ DoubleRef dWZ;
        final /* synthetic */ DoubleRef dXa;
        final /* synthetic */ DoubleRef dXb;

        e(h hVar, DoubleRef doubleRef, DoubleRef doubleRef2, DoubleRef doubleRef3) {
            this.dWX = hVar;
            this.dWZ = doubleRef;
            this.dXa = doubleRef2;
            this.dXb = doubleRef3;
        }

        /* renamed from: bt */
        public final d apply(List<com.iqoption.core.data.c.a> list) {
            com.iqoption.core.microservices.configuration.a.d dVar;
            Object obj;
            kotlin.jvm.internal.i.f(list, "it");
            Iterator it = list.iterator();
            Object obj2;
            do {
                dVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.iqoption.core.data.c.a) obj).VL().getId() == this.dWX.aVG().getUserBalanceId()) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
            } while (obj2 == null);
            com.iqoption.core.data.c.a aVar = (com.iqoption.core.data.c.a) obj;
            String a = this.dWX.a(aVar != null ? aVar.VM() : null, this.dWX.aVG().getInvest());
            CharSequence a2 = this.dWX.a(aVar != null ? aVar.VM() : null, this.dWX.aVG().getInvest(), this.dWZ.element + this.dXa.element);
            CharSequence a3 = this.dWX.a(aVar != null ? aVar.VM() : null, this.dWX.aVG().getInvest(), this.dXb.element);
            h hVar = this.dWX;
            if (aVar != null) {
                dVar = aVar.VM();
            }
            return new d(a, a2, a3, hVar.b(dVar, this.dWX.aVG().getInvest(), this.dWX.aVG().agr()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/tradinghistory/details/InvestData;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<d> {
        final /* synthetic */ h dWX;

        f(h hVar) {
            this.dWX = hVar;
        }

        /* renamed from: b */
        public final void accept(d dVar) {
            this.dWX.dWR.postValue(dVar);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g dXc = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/tradinghistory/details/AssetData;", "subActives", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive;", "apply"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        h(com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dhw = aVar;
        }

        /* renamed from: bu */
        public final a apply(List<com.iqoption.core.microservices.tradingengine.response.active.j> list) {
            kotlin.jvm.internal.i.f(list, "subActives");
            return new a(this.dhw, list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/InstrumentActive;", "it", "Landroid/util/SparseArray;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "apply"})
    /* compiled from: PositionDetailsViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ List dXd;
        final /* synthetic */ com.iqoption.core.microservices.tradingengine.response.active.a dhw;

        i(List list, com.iqoption.core.microservices.tradingengine.response.active.a aVar) {
            this.dXd = list;
            this.dhw = aVar;
        }

        /* renamed from: b */
        public final List<com.iqoption.core.microservices.tradingengine.response.active.j> apply(SparseArray<com.iqoption.core.microservices.tradingengine.response.active.a> sparseArray) {
            kotlin.jvm.internal.i.f(sparseArray, "it");
            Collection arrayList = new ArrayList();
            for (MultiPositionItem Bs : this.dXd) {
                com.iqoption.core.microservices.tradingengine.response.active.j fa = ((com.iqoption.core.microservices.tradingengine.response.active.j) this.dhw).fa(Bs.Bs());
                if (fa != null) {
                    arrayList.add(fa);
                }
            }
            return (List) arrayList;
        }
    }

    public final void a(PortfolioPosition portfolioPosition) {
        kotlin.jvm.internal.i.f(portfolioPosition, "<set-?>");
        this.dWV.a(this, anY[0], portfolioPosition);
    }

    public final PortfolioPosition aVG() {
        return (PortfolioPosition) this.dWV.b(this, anY[0]);
    }

    static {
        String simpleName = h.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "PositionDetailsViewModel::class.java.simpleName");
        TAG = simpleName;
    }

    public final LiveData<c> aVD() {
        return this.dWQ;
    }

    public final LiveData<d> aVE() {
        return this.dWS;
    }

    public final LiveData<Pair<com.iqoption.core.util.b.a, String>> aVF() {
        return this.dWU;
    }

    public final void aVH() {
        io.reactivex.disposables.b a = com.iqoption.asset.b.a.awZ.n(aVG().getInstrumentType()).f((io.reactivex.b.g) new b(this)).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new c(this), (io.reactivex.b.f) d.dWY);
        kotlin.jvm.internal.i.e(a, "AssetManager.getAssetsMa…      \n                })");
        b(a);
        DoubleRef doubleRef = new DoubleRef();
        doubleRef.element = 0.0d;
        DoubleRef doubleRef2 = new DoubleRef();
        doubleRef2.element = 0.0d;
        DoubleRef doubleRef3 = new DoubleRef();
        doubleRef3.element = 0.0d;
        TradingPosition agn = aVG().agn();
        if (agn != null) {
            doubleRef.element = agn.aiU();
            doubleRef2.element = agn.aiV();
            doubleRef3.element = agn.getCustodial();
        }
        a = com.iqoption.core.data.c.b.bcS.VQ().bkV().t(new e(this, doubleRef2, doubleRef, doubleRef3)).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new f(this), (io.reactivex.b.f) g.dXc);
        kotlin.jvm.internal.i.e(a, "BalanceMediator.observeB…      \n                })");
        b(a);
    }

    private final p<a> L(Map<Integer, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map) {
        p bkV;
        com.iqoption.core.microservices.tradingengine.response.active.a aVar = (com.iqoption.core.microservices.tradingengine.response.active.a) map.get(Integer.valueOf(aVG().getActiveId()));
        TradingPosition agn = aVG().agn();
        List items = agn != null ? agn.getItems() : null;
        if ((aVar instanceof com.iqoption.core.microservices.tradingengine.response.active.j) && items != null && (items.isEmpty() ^ 1) == 1) {
            bkV = com.iqoption.asset.mediators.b.b(com.iqoption.asset.mediators.b.axN, null, 1, null).g(new i(items, aVar)).bkV();
        } else {
            bkV = p.cI(m.emptyList());
        }
        p t = bkV.t(new h(aVar));
        kotlin.jvm.internal.i.e(t, "subActivesSingle.map { s…ata(active, subActives) }");
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    private final void a(com.iqoption.tradinghistory.b.a r28) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28.Jt();
        r2 = r28.aVq();
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x0049;
    L_0x000e:
        r5 = r1.getInstrumentType();
        r5 = r5.isBinary();
        if (r5 == 0) goto L_0x0049;
    L_0x0018:
        r5 = r27.aVG();
        r5 = r5.abl();
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = (long) r7;
        r5 = r5 % r7;
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x0049;
    L_0x002a:
        r5 = com.iqoption.core.d.EH();
        r6 = "tick-deals";
        r5 = r5.ei(r6);
        if (r5 == 0) goto L_0x0049;
    L_0x0036:
        r5 = r5.isEnabled();
        if (r5 != r4) goto L_0x0049;
    L_0x003c:
        r5 = r27.aVG();
        r5 = r5.abl();
        r5 = r0.c(r1, r5);
        goto L_0x004a;
    L_0x0049:
        r5 = r3;
    L_0x004a:
        r6 = r0.dWT;
        r6.postValue(r5);
        r5 = r27.aVG();
        r5 = r5.agn();
        r6 = r27.aVG();
        r6 = r6.getInstrumentType();
        r7 = com.iqoption.tradinghistory.b.i.axg;
        r6 = r6.ordinal();
        r6 = r7[r6];
        r7 = 2;
        r8 = 0;
        if (r6 == r4) goto L_0x009f;
    L_0x006b:
        if (r6 == r7) goto L_0x009f;
    L_0x006d:
        if (r5 == 0) goto L_0x009b;
    L_0x006f:
        r6 = r5.getInstrumentType();
        r9 = com.iqoption.tradinghistory.b.i.aob;
        r6 = r6.ordinal();
        r6 = r9[r6];
        if (r6 == r4) goto L_0x008b;
    L_0x007d:
        if (r6 == r7) goto L_0x008b;
    L_0x007f:
        r6 = r5.aiR();
        r9 = com.iqoption.core.microservices.tradingengine.response.position.TradingPosition.Type.LONG;
        if (r6 != r9) goto L_0x0089;
    L_0x0087:
        r6 = 1;
        goto L_0x0094;
    L_0x0089:
        r6 = 0;
        goto L_0x0094;
    L_0x008b:
        r6 = r5.aiP();
        r9 = com.iqoption.core.data.model.Direction.CALL;
        if (r6 != r9) goto L_0x0089;
    L_0x0093:
        goto L_0x0087;
    L_0x0094:
        r9 = r5.getLeverage();
        r18 = r6;
        goto L_0x00b9;
    L_0x009b:
        r9 = 0;
        r18 = 1;
        goto L_0x00b9;
    L_0x009f:
        r6 = r27.aVG();
        r6 = r6.agm();
        if (r6 == 0) goto L_0x00ae;
    L_0x00a9:
        r6 = r6.abi();
        goto L_0x00af;
    L_0x00ae:
        r6 = r3;
    L_0x00af:
        r9 = com.iqoption.core.data.model.Direction.CALL;
        if (r6 != r9) goto L_0x00b5;
    L_0x00b3:
        r6 = 1;
        goto L_0x00b6;
    L_0x00b5:
        r6 = 0;
    L_0x00b6:
        r18 = r6;
        r9 = 0;
    L_0x00b9:
        r6 = r27.aVI();
        r10 = "";
        if (r6 == 0) goto L_0x01f5;
    L_0x00c1:
        r1 = r27.aVG();
        r1 = r1.getInstrumentType();
        r6 = r27.aVG();
        r6 = r6.agq();
        r6 = r0.a(r6);
        if (r5 != 0) goto L_0x00da;
    L_0x00d7:
        kotlin.jvm.internal.i.bnJ();
    L_0x00da:
        r5 = r5.getItems();
        r5 = (java.lang.Iterable) r5;
        r9 = new java.util.ArrayList;
        r11 = 10;
        r11 = kotlin.collections.n.e(r5, r11);
        r9.<init>(r11);
        r9 = (java.util.Collection) r9;
        r5 = r5.iterator();
    L_0x00f1:
        r11 = r5.hasNext();
        if (r11 == 0) goto L_0x01ea;
    L_0x00f7:
        r11 = r5.next();
        r11 = (com.iqoption.core.microservices.tradingengine.response.position.MultiPositionItem) r11;
        r12 = r11.aiO();
        r13 = com.iqoption.tradinghistory.b.i.aFX;
        r12 = r12.ordinal();
        r12 = r13[r12];
        if (r12 == r4) goto L_0x012f;
    L_0x010b:
        if (r12 == r7) goto L_0x0122;
    L_0x010d:
        r13 = 3;
        if (r12 == r13) goto L_0x0115;
    L_0x0110:
        r12 = r3;
        r12 = (java.lang.Integer) r12;
        r13 = r12;
        goto L_0x013b;
    L_0x0115:
        r12 = com.iqoption.tradinghistory.g.f.sold;
        r12 = java.lang.Integer.valueOf(r12);
        r13 = com.iqoption.tradinghistory.g.a.grey_blur;
        r13 = java.lang.Integer.valueOf(r13);
        goto L_0x013b;
    L_0x0122:
        r12 = com.iqoption.tradinghistory.g.f.status_lose;
        r12 = java.lang.Integer.valueOf(r12);
        r13 = com.iqoption.tradinghistory.g.a.red;
        r13 = java.lang.Integer.valueOf(r13);
        goto L_0x013b;
    L_0x012f:
        r12 = com.iqoption.tradinghistory.g.f.status_profit;
        r12 = java.lang.Integer.valueOf(r12);
        r13 = com.iqoption.tradinghistory.g.a.green;
        r13 = java.lang.Integer.valueOf(r13);
    L_0x013b:
        if (r2 == 0) goto L_0x016a;
    L_0x013d:
        r14 = r2;
        r14 = (java.lang.Iterable) r14;
        r14 = r14.iterator();
    L_0x0144:
        r15 = r14.hasNext();
        if (r15 == 0) goto L_0x0165;
    L_0x014a:
        r15 = r14.next();
        r16 = r15;
        r16 = (com.iqoption.core.microservices.tradingengine.response.active.a) r16;
        r3 = r11.Bs();
        r4 = r16.getActiveId();
        if (r3 != r4) goto L_0x015e;
    L_0x015c:
        r3 = 1;
        goto L_0x015f;
    L_0x015e:
        r3 = 0;
    L_0x015f:
        if (r3 == 0) goto L_0x0162;
    L_0x0161:
        goto L_0x0166;
    L_0x0162:
        r3 = 0;
        r4 = 1;
        goto L_0x0144;
    L_0x0165:
        r15 = 0;
    L_0x0166:
        r3 = r15;
        r3 = (com.iqoption.core.microservices.tradingengine.response.active.a) r3;
        goto L_0x016b;
    L_0x016a:
        r3 = 0;
    L_0x016b:
        if (r3 == 0) goto L_0x0176;
    L_0x016d:
        r3 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r3);
        if (r3 == 0) goto L_0x0176;
    L_0x0173:
        r19 = r3;
        goto L_0x0178;
    L_0x0176:
        r19 = r10;
    L_0x0178:
        r3 = r11.getOpenUnderlyingPrice();
        r20 = java.lang.String.valueOf(r3);
        r3 = r11.aiN();
        r3 = java.lang.Long.valueOf(r3);
        r3 = com.iqoption.core.ext.c.n(r3);
        r21 = r0.ck(r3);
        r3 = r11.getCloseUnderlyingPrice();
        r22 = java.lang.String.valueOf(r3);
        r3 = r27.aVG();
        r3 = r3.getCloseTime();
        r3 = java.lang.Long.valueOf(r3);
        r3 = com.iqoption.core.ext.c.n(r3);
        r23 = r0.ck(r3);
        r24 = r11.isCall();
        if (r12 == 0) goto L_0x01c1;
    L_0x01b2:
        r12 = (java.lang.Number) r12;
        r3 = r12.intValue();
        r3 = com.iqoption.core.d.getString(r3);
        if (r3 == 0) goto L_0x01c1;
    L_0x01be:
        r25 = r3;
        goto L_0x01c3;
    L_0x01c1:
        r25 = r10;
    L_0x01c3:
        if (r13 == 0) goto L_0x01da;
    L_0x01c5:
        r13 = (java.lang.Number) r13;
        r3 = r13.intValue();
        r4 = com.iqoption.core.d.Uo();
        r3 = com.iqoption.core.ext.a.k(r4, r3);
        r3 = java.lang.Integer.valueOf(r3);
        r26 = r3;
        goto L_0x01dc;
    L_0x01da:
        r26 = 0;
    L_0x01dc:
        r3 = new com.iqoption.tradinghistory.b.f;
        r18 = r3;
        r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26);
        r9.add(r3);
        r3 = 0;
        r4 = 1;
        goto L_0x00f1;
    L_0x01ea:
        r9 = (java.util.List) r9;
        r2 = new com.iqoption.tradinghistory.b.e;
        r2.<init>(r1, r6, r9);
        r2 = (com.iqoption.tradinghistory.b.c) r2;
        goto L_0x0281;
    L_0x01f5:
        r2 = new com.iqoption.tradinghistory.b.b;
        r3 = r27.aVG();
        r3 = r3.getInstrumentType();
        if (r1 == 0) goto L_0x0209;
    L_0x0201:
        r1 = com.iqoption.core.microservices.tradingengine.response.active.d.B(r1);
        if (r1 == 0) goto L_0x0209;
    L_0x0207:
        r13 = r1;
        goto L_0x020a;
    L_0x0209:
        r13 = r10;
    L_0x020a:
        r1 = r27.aVG();
        r1 = r1.agq();
        r11 = r0.a(r1);
        r1 = r27.aVG();
        r1 = r1.getInstrumentType();
        r12 = com.iqoption.core.g.C(r1);
        r1 = r27.aVG();
        r4 = r1.ago();
        r14 = java.lang.String.valueOf(r4);
        r1 = r27.aVG();
        r1 = r1.getInstrumentType();
        r1 = r1.isBinary();
        if (r1 == 0) goto L_0x0249;
    L_0x023c:
        r1 = r27.aVG();
        r4 = r1.abl();
        r1 = r0.cl(r4);
        goto L_0x0255;
    L_0x0249:
        r1 = r27.aVG();
        r4 = r1.abl();
        r1 = r0.ck(r4);
    L_0x0255:
        r15 = r1;
        r1 = r27.aVG();
        r4 = r1.agp();
        r16 = java.lang.String.valueOf(r4);
        r1 = r27.aVG();
        r4 = r1.getCloseTime();
        r1 = java.lang.Long.valueOf(r4);
        r4 = com.iqoption.core.ext.c.n(r1);
        r17 = r0.ck(r4);
        r19 = r0.he(r9);
        r9 = r2;
        r10 = r3;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r2 = (com.iqoption.tradinghistory.b.c) r2;
    L_0x0281:
        r1 = r0.dWP;
        r1.postValue(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.b.h.a(com.iqoption.tradinghistory.b.a):void");
    }

    public final boolean aVI() {
        if (aVG().getInstrumentType() == InstrumentType.MULTI_INSTRUMENT) {
            TradingPosition agn = aVG().agn();
            if (agn != null) {
                List items = agn.getItems();
                if (items != null && (items.isEmpty() ^ 1) == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String ck(long j) {
        String format = new SimpleDateFormat("HH:mm, dd MMM yyyy", Locale.getDefault()).format(new Date(j));
        kotlin.jvm.internal.i.e(format, "SimpleDateFormat(\"HH:mm,…).format(Date(timestamp))");
        return format;
    }

    private final String cl(long j) {
        String format = new SimpleDateFormat(j % ((long) 1000) > 0 ? "HH:mm.SSS, dd MMM yyyy" : "HH:mm, dd MMM yyyy", Locale.getDefault()).format(new Date(j));
        kotlin.jvm.internal.i.e(format, "SimpleDateFormat(if (tim…).format(Date(timestamp))");
        return format;
    }

    private final String he(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('X');
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    private final String a(com.iqoption.core.microservices.configuration.a.d dVar, double d) {
        BigDecimal valueOf = BigDecimal.valueOf(d);
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(amount)");
        return com.iqoption.core.util.e.a(valueOf, dVar != null ? dVar.getMinorUnits() : 2, dVar != null ? dVar.getMask() : null, false, false, null, 28, null);
    }

    private final CharSequence a(com.iqoption.core.microservices.configuration.a.d dVar, double d, double d2) {
        double d3 = (double) 0;
        String str = "-";
        String str2 = "+";
        ad hs = new ad().hs(d2 >= d3 ? str : str2);
        StringBuilder stringBuilder = new StringBuilder();
        BigDecimal valueOf = BigDecimal.valueOf((Math.abs(d2) * 100.0d) / (d + d2));
        kotlin.jvm.internal.i.e(valueOf, "BigDecimal.valueOf(Math.…* 100.0 / (amount + fee))");
        stringBuilder.append(com.iqoption.core.util.e.a(valueOf, 0, null, false, false, null, 31, null));
        stringBuilder.append("% ");
        hs = hs.hs(stringBuilder.toString()).bY(new ForegroundColorSpan(com.iqoption.core.ext.a.a(this, com.iqoption.tradinghistory.g.a.red)));
        if (d2 < d3) {
            str = str2;
        }
        hs = hs.hs(str);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append('(');
        stringBuilder2.append(a(dVar, Math.abs(d2)));
        stringBuilder2.append(')');
        CharSequence anA = hs.hs(stringBuilder2.toString()).anA();
        kotlin.jvm.internal.i.e(anA, "Spanner()\n              …\n                .build()");
        return anA;
    }

    private final CharSequence b(com.iqoption.core.microservices.configuration.a.d dVar, double d, double d2) {
        ad adVar = new ad();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a(dVar, d2));
        stringBuilder.append(" ");
        d2 -= d;
        d = (double) 0;
        adVar = adVar.hs(stringBuilder.toString()).bY(new ForegroundColorSpan(com.iqoption.core.ext.a.a((ViewModel) this, d2 >= d ? com.iqoption.tradinghistory.g.a.green : com.iqoption.tradinghistory.g.a.red)));
        stringBuilder = new StringBuilder();
        stringBuilder.append(" (");
        stringBuilder.append(d2 >= d ? "+" : "-");
        stringBuilder.append(a(dVar, Math.abs(d2)));
        stringBuilder.append(')');
        CharSequence anA = adVar.hs(stringBuilder.toString()).anA();
        kotlin.jvm.internal.i.e(anA, "Spanner()\n              …\n                .build()");
        return anA;
    }

    private final Pair<com.iqoption.core.util.b.a, String> c(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j) {
        return kotlin.j.x(new com.iqoption.core.util.b.a(com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.following_this_link), com.iqoption.core.util.b.f.a(com.iqoption.core.d.Uo(), aVar.getActiveId(), j)), com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.executed_tick_by_tick_n1, r0.getText()));
    }

    private final String a(CloseReason closeReason) {
        String string;
        switch (closeReason) {
            case SOLD:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.closed_by_user);
                break;
            case EXPIRED:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.expired);
                break;
            case MARGIN_CALL:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.margin_call);
                break;
            case TAKE_PROFIT:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.take_profit);
                break;
            case STOP_LOSS:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.stop_loss);
                break;
            case OVERNIGHT:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.overnight);
                break;
            case WITHDRAW:
                string = com.iqoption.core.d.getString(com.iqoption.tradinghistory.g.f.withdrawals);
                break;
            default:
                string = "";
                break;
        }
        return u.mY(string);
    }
}
