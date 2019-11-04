package com.iqoption.core.ui.country;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH\u0002J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bR:\u0010\u0003\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/ui/country/CountryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "countriesHttpSupplier", "Lcom/iqoption/core/rx/livestream/RxLiveStreamSupplier;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "Lcom/iqoption/core/rx/livestream/SimpleLiveStreamSupplier;", "getCountries", "Lio/reactivex/Single;", "useSocket", "", "filter", "", "getCountriesHttp", "getMyCountry", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "getMyCountryCode", "Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "getMyCountrySingle", "loadCountries", "Lio/reactivex/Completable;", "Companion", "core_release"})
/* compiled from: CountryViewModel.kt */
public final class f extends ViewModel {
    public static final a bIy = new a();
    private com.iqoption.core.rx.a.a<List<com.iqoption.core.microservices.configuration.a.c>, List<com.iqoption.core.microservices.configuration.a.c>> bIx;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/ui/country/CountryViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/core/ui/country/CountryViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "core_release"})
    /* compiled from: CountryViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f A(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tryViewModel::class.java)");
            return (f) viewModel;
        }

        public final f l(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…tryViewModel::class.java)");
            return (f) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "countries", "apply"})
    /* compiled from: CountryViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ String bIz;

        b(String str) {
            this.bIz = str;
        }

        public final List<com.iqoption.core.microservices.configuration.a.c> apply(List<com.iqoption.core.microservices.configuration.a.c> list) {
            kotlin.jvm.internal.i.f(list, "countries");
            return com.iqoption.core.microservices.configuration.a.b.bru.b(list, this.bIz);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "it", "apply"})
    /* compiled from: CountryViewModel.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c bIA = new c();

        c() {
        }

        /* renamed from: d */
        public final Optional<com.iqoption.core.microservices.configuration.a.c> apply(com.iqoption.core.microservices.configuration.a.c cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            return Optional.am(cVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/configuration/response/Country;", "countries", "", "countryCode", "Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "apply"})
    /* compiled from: CountryViewModel.kt */
    static final class d<T1, T2, R> implements io.reactivex.b.c<List<? extends com.iqoption.core.microservices.configuration.a.c>, com.iqoption.core.microservices.core.response.f, com.iqoption.core.microservices.configuration.a.c> {
        public static final d bIB = new d();

        d() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.configuration.a.c apply(List<com.iqoption.core.microservices.configuration.a.c> list, com.iqoption.core.microservices.core.response.f fVar) {
            kotlin.jvm.internal.i.f(list, "countries");
            kotlin.jvm.internal.i.f(fVar, "countryCode");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.configuration.a.c) next).acN(), fVar.adh())) {
                    break;
                }
            }
            Object next2 = null;
            if (next2 == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            return (com.iqoption.core.microservices.configuration.a.c) next2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: CountryViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.microservices.configuration.a.c> {
        public static final e bIC = new e();

        e() {
        }

        /* renamed from: e */
        public final void accept(com.iqoption.core.microservices.configuration.a.c cVar) {
            com.iqoption.core.d.Um().EC().a("geo-ip", (double) cVar.getId().longValue(), false);
        }
    }

    private final p<List<com.iqoption.core.microservices.configuration.a.c>> WP() {
        com.iqoption.core.rx.a.a aVar = this.bIx;
        if (aVar != null) {
            p<List<com.iqoption.core.microservices.configuration.a.c>> bkV = aVar.ako().bkV();
            kotlin.jvm.internal.i.e(bkV, "countriesHttpCacheLocal.get().firstOrError()");
            return bkV;
        }
        io.reactivex.e bkO = com.iqoption.core.data.repository.c.bdy.WP().bkO();
        com.iqoption.core.rx.a.a.a aVar2 = com.iqoption.core.rx.a.a.bFI;
        kotlin.jvm.internal.i.e(bkO, "stream");
        this.bIx = com.iqoption.core.rx.a.a.a.a(aVar2, "HTTP Countries", bkO, 0, null, 12, null);
        aVar = this.bIx;
        if (aVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        p bkV2 = aVar.ako().bkV();
        kotlin.jvm.internal.i.e(bkV2, "countriesHttpSupplier!!.get().firstOrError()");
        return bkV2;
    }

    public static /* synthetic */ p a(f fVar, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = (String) null;
        }
        return fVar.g(z, str);
    }

    public final p<List<com.iqoption.core.microservices.configuration.a.c>> g(boolean z, String str) {
        p bkV;
        if (z) {
            bkV = com.iqoption.core.data.repository.c.bdy.WQ().bkV();
        } else {
            bkV = WP();
        }
        bkV = bkV.t(new b(str));
        kotlin.jvm.internal.i.e(bkV, "countriesSingle.map { co…lter(countries, filter) }");
        return bkV;
    }

    public final LiveData<Optional<com.iqoption.core.microservices.configuration.a.c>> cE(boolean z) {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(cF(z).t(c.bIA).cJ(Optional.pW()).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…           .toFlowable())");
        return fromPublisher;
    }

    private final p<com.iqoption.core.microservices.configuration.a.c> cF(boolean z) {
        p h = p.a(a(this, z, null, 2, null), alq(), d.bIB).h((io.reactivex.b.f) e.bIC);
        kotlin.jvm.internal.i.e(h, "Single.zip<List<Country>…ouble(), false)\n        }");
        return h;
    }

    private final p<com.iqoption.core.microservices.core.response.f> alq() {
        return com.iqoption.core.data.repository.b.a(com.iqoption.core.data.repository.b.bdv, null, 1, null);
    }
}
