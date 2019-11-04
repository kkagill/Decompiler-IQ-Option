package com.iqoption.feed;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.marketanalysis.f;
import io.reactivex.b.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/feed/FeedWebViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "marketAnalysisViewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "clearFeedSelection", "", "getAssetData", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "activeId", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "openActiveAndLog", "item", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "fromList", "", "smallScreen", "Companion", "feed_release"})
/* compiled from: FeedWebViewModel.kt */
public final class h extends ViewModel {
    public static final a cOY = new a();
    private f cNr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/feed/FeedWebViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/feed/FeedWebViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "feed_release"})
    /* compiled from: FeedWebViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h Y(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…WebViewModel::class.java)");
            h hVar = (h) viewModel;
            hVar.cNr = f.blw.k(com.iqoption.core.ext.a.r(fragment));
            return hVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "kotlin.jvm.PlatformType", "assets", "", "apply"})
    /* compiled from: FeedWebViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ int $activeId;

        b(int i) {
            this.$activeId = i;
        }

        /* renamed from: aI */
        public final Optional<com.iqoption.asset.mediators.a> apply(List<com.iqoption.asset.mediators.a> list) {
            kotlin.jvm.internal.i.f(list, "assets");
            for (Object next : list) {
                Object obj;
                if (((com.iqoption.asset.mediators.a) next).Jt().getActiveId() == this.$activeId) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            return Optional.an((com.iqoption.asset.mediators.a) next2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: FeedWebViewModel.kt */
    static final class c<T, R> implements g<Throwable, Optional<com.iqoption.asset.mediators.a>> {
        public static final c cOZ = new c();

        c() {
        }

        /* renamed from: x */
        public final Optional<com.iqoption.asset.mediators.a> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return Optional.pW();
        }
    }

    public final LiveData<Optional<com.iqoption.asset.mediators.a>> f(int i, InstrumentType instrumentType) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.asset.mediators.b.axN.a(new com.iqoption.asset.mediators.c(instrumentType, null, false, 6, null)).g(new b(i)).h(c.cOZ).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…          .observeOn(ui))");
        return fromPublisher;
    }

    public final void a(com.iqoption.core.microservices.feed.response.a aVar, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(aVar, "item");
        f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.a(aVar, z, z2);
    }

    public final void avv() {
        f fVar = this.cNr;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("marketAnalysisViewModel");
        }
        fVar.a(null);
    }
}
