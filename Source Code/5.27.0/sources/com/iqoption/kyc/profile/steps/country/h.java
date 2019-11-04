package com.iqoption.kyc.profile.steps.country;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.kyc.j;
import io.reactivex.b.g;
import io.reactivex.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "selectionViewModel", "Lcom/iqoption/kyc/KycSelectionViewModel;", "getCountries", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "allowRestricted", "", "updateRegulation", "", "isRegulated", "Companion", "kyc_release"})
/* compiled from: KycCountryViewModel.kt */
public final class h extends ViewModel {
    public static final a dCc = new a();
    private j drN;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/profile/steps/country/KycCountryViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/profile/steps/country/KycCountryViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: KycCountryViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h aG(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…tryViewModel::class.java)");
            h hVar = (h) viewModel;
            hVar.drN = j.dsW.am(fragment);
            return hVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "filter", "", "apply"})
    /* compiled from: KycCountryViewModel.kt */
    static final class b<T, R> implements g<T, org.a.b<? extends R>> {
        final /* synthetic */ boolean bIw;

        b(boolean z) {
            this.bIw = z;
        }

        /* renamed from: iw */
        public final e<List<com.iqoption.core.microservices.configuration.a.c>> apply(final String str) {
            kotlin.jvm.internal.i.f(str, "filter");
            return com.iqoption.core.data.repository.c.bdy.WQ().g(new g<T, R>(this) {
                final /* synthetic */ b dCd;

                public final List<com.iqoption.core.microservices.configuration.a.c> apply(List<com.iqoption.core.microservices.configuration.a.c> list) {
                    kotlin.jvm.internal.i.f(list, "countries");
                    Collection arrayList = new ArrayList();
                    for (Object next : com.iqoption.core.microservices.configuration.a.b.bru.b(list, str)) {
                        Object obj = (this.dCd.bIw || !((com.iqoption.core.microservices.configuration.a.c) next).acP()) ? 1 : null;
                        if (obj != null) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            }).d(com.iqoption.core.rx.i.aki());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "it", "", "apply"})
    /* compiled from: KycCountryViewModel.kt */
    static final class c<T, R> implements g<Throwable, List<? extends com.iqoption.core.microservices.configuration.a.c>> {
        public static final c dCe = new c();

        c() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.configuration.a.c> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    public final LiveData<List<com.iqoption.core.microservices.configuration.a.c>> eO(boolean z) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(jVar.aJo().cG("").d((g) new b(z)).c(com.iqoption.core.rx.i.akj()).h(c.dCe));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…{ emptyList() }\n        )");
        return fromPublisher;
    }

    public final void eP(boolean z) {
        j jVar = this.drN;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("selectionViewModel");
        }
        jVar.t(Boolean.valueOf(z));
    }
}
