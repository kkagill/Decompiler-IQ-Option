package com.iqoption.core.ui.country;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.configuration.a.c;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u00112\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/core/ui/country/CountrySearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "countryViewModel", "Lcom/iqoption/core/ui/country/CountryViewModel;", "getCountries", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "kotlin.jvm.PlatformType", "authorized", "", "filter", "", "allowUnregulated", "allowRestricted", "getMyCountry", "Landroidx/lifecycle/LiveData;", "Lcom/google/common/base/Optional;", "Companion", "core_release"})
/* compiled from: CountrySearchViewModel.kt */
public final class e extends ViewModel {
    public static final a bIu = new a();
    private f bIt;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/ui/country/CountrySearchViewModel$Companion;", "", "()V", "create", "Lcom/iqoption/core/ui/country/CountrySearchViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "core_release"})
    /* compiled from: CountrySearchViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final e z(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(e.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…rchViewModel::class.java)");
            e eVar = (e) viewModel;
            eVar.bIt = f.bIy.l(com.iqoption.core.ext.a.r(fragment));
            return eVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "countries", "apply"})
    /* compiled from: CountrySearchViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        final /* synthetic */ boolean bIv;
        final /* synthetic */ boolean bIw;

        b(boolean z, boolean z2) {
            this.bIv = z;
            this.bIw = z2;
        }

        public final List<c> apply(List<c> list) {
            kotlin.jvm.internal.i.f(list, "countries");
            if (this.bIv && this.bIw) {
                return list;
            }
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                c cVar = (c) next;
                Object obj = ((this.bIv || cVar.Er()) && (this.bIw || !cVar.acP())) ? 1 : null;
                if (obj != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    public final p<List<c>> a(boolean z, String str, boolean z2, boolean z3) {
        f fVar = this.bIt;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("countryViewModel");
        }
        p t = fVar.g(z, str).t(new b(z2, z3));
        kotlin.jvm.internal.i.e(t, "countryViewModel.getCoun…          }\n            }");
        return t;
    }

    public final LiveData<Optional<c>> cE(boolean z) {
        f fVar = this.bIt;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG("countryViewModel");
        }
        return fVar.cE(z);
    }
}
