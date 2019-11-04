package com.iqoption.feed;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.data.model.InstrumentType;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\rJ\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/feed/FeedViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "initialFeed", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/feed/FeedRepository$FeedItemsHolder;", "force", "", "loadMore", "from", "", "onFeedItemClicked", "", "url", "", "feedItem", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "openActive", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "openActiveAndLog", "item", "fromList", "smallScreen", "removeFromFeed", "Ljava/lang/Void;", "adapterItem", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "sendClick", "id", "sendScroll", "toggleLike", "toggleLikeFeed", "Companion", "feed_release"})
/* compiled from: FeedViewModel.kt */
public final class f extends com.iqoption.core.ui.f.d {
    public static final a cOG = new a();
    private com.iqoption.core.marketanalysis.f cNr;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/feed/FeedViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/feed/FeedViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "feed_release"})
    /* compiled from: FeedViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f X(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…eedViewModel::class.java)");
            f fVar = (f) viewModel;
            fVar.cNr = com.iqoption.core.marketanalysis.f.blw.k(com.iqoption.core.ext.a.r(fragment));
            return fVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedViewModel.kt */
    static final class b implements io.reactivex.b.a {
        final /* synthetic */ MutableLiveData $liveData;
        final /* synthetic */ com.iqoption.feed.feedlist.d cOH;

        b(com.iqoption.feed.feedlist.d dVar, MutableLiveData mutableLiveData) {
            this.cOH = dVar;
            this.$liveData = mutableLiveData;
        }

        public final void run() {
            e.cOv.e(this.cOH);
            this.$liveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, 1, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        c(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th.getMessage(), null, 4, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedViewModel.kt */
    static final class d implements io.reactivex.b.a {
        public static final d cOI = new d();

        d() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        public static final e cOJ = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedViewModel.kt */
    static final class f implements io.reactivex.b.a {
        public static final f cOK = new f();

        f() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<Throwable> {
        public static final g cOL = new g();

        g() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedViewModel.kt */
    static final class h implements io.reactivex.b.a {
        final /* synthetic */ MutableLiveData $liveData;
        final /* synthetic */ f cOM;
        final /* synthetic */ com.iqoption.core.microservices.feed.response.a cON;

        h(f fVar, com.iqoption.core.microservices.feed.response.a aVar, MutableLiveData mutableLiveData) {
            this.cOM = fVar;
            this.cON = aVar;
            this.$liveData = mutableLiveData;
        }

        public final void run() {
            this.cOM.b(this.cON);
            this.$liveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, 1, null));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedViewModel.kt */
    static final class i<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        i(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.$liveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th.getMessage(), null, 4, null));
        }
    }

    public final LiveData<com.iqoption.core.ui.d<com.iqoption.feed.e.a>> dg(boolean z) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.cOv.a(mutableLiveData, z);
        return mutableLiveData;
    }

    public final LiveData<com.iqoption.core.ui.d<com.iqoption.feed.e.a>> fJ(int i) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.postValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        e.cOv.a(mutableLiveData, i);
        return mutableLiveData;
    }

    public final void fK(int i) {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.feed.b.btf.an(i, 0).b(com.iqoption.core.rx.i.aki()).a(d.cOI, e.cOJ);
        kotlin.jvm.internal.i.e(a, "FeedRequests.sendFeedBac…      }\n                )");
        b(a);
    }

    public final LiveData<com.iqoption.core.ui.d<Void>> a(com.iqoption.core.microservices.feed.response.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "feedItem");
        int i = aVar.adM() ? 2 : 1;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        io.reactivex.disposables.b a = com.iqoption.core.microservices.feed.b.btf.an(aVar.getId(), i).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new h(this, aVar, mutableLiveData), new i(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "FeedRequests.sendFeedBac…      }\n                )");
        b(a);
        return mutableLiveData;
    }

    public final void fL(int i) {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.feed.b.btf.an(i, 4).b(com.iqoption.core.rx.i.aki()).a(f.cOK, g.cOL);
        kotlin.jvm.internal.i.e(a, "FeedRequests.sendFeedBac…      }\n                )");
        b(a);
    }

    public final LiveData<com.iqoption.core.ui.d<Void>> f(com.iqoption.feed.feedlist.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "adapterItem");
        com.iqoption.core.microservices.feed.response.a YQ = dVar.YQ();
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        io.reactivex.disposables.b a = com.iqoption.core.microservices.feed.b.btf.an(YQ.getId(), 3).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new b(dVar, mutableLiveData), new c(mutableLiveData));
        kotlin.jvm.internal.i.e(a, "FeedRequests.sendFeedBac…      }\n                )");
        b(a);
        return mutableLiveData;
    }

    private final void b(com.iqoption.core.microservices.feed.response.a aVar) {
        boolean adM = aVar.adM();
        aVar.cA(adM ^ 1);
        new FeedViewModel$toggleLikeFeed$ratingChange$1(adM).invoke(aVar);
    }

    public final void a(com.iqoption.core.microservices.feed.response.a aVar, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(aVar, "item");
        com.iqoption.core.marketanalysis.f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.a(aVar, z, z2);
    }

    public final void b(InstrumentType instrumentType, int i) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        com.iqoption.core.marketanalysis.f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.b(instrumentType, i);
    }

    public final void a(String str, com.iqoption.core.microservices.feed.response.a aVar) {
        kotlin.jvm.internal.i.f(str, "url");
        kotlin.jvm.internal.i.f(aVar, "feedItem");
        com.iqoption.core.marketanalysis.f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.a(new com.iqoption.core.marketanalysis.c(str, aVar));
    }
}
