package com.iqoption.kyc.fragment.b;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.kyc.response.document.j;
import io.reactivex.b.g;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¨\u0006\b"}, bng = {"Lcom/iqoption/kyc/fragment/jumio/KycDocumentAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "getPoaDocumentTypes", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "Companion", "app_optionXRelease"})
/* compiled from: KycDocumentAddressViewModel.kt */
public final class d extends ViewModel {
    public static final a dyu = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/fragment/jumio/KycDocumentAddressViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/kyc/fragment/jumio/KycDocumentAddressViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "app_optionXRelease"})
    /* compiled from: KycDocumentAddressViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d as(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(d.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…essViewModel::class.java)");
            return (d) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "it", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentTypesResult;", "apply"})
    /* compiled from: KycDocumentAddressViewModel.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b dyv = new b();

        b() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.kyc.response.document.i> apply(j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            return jVar.getTypes();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentType;", "it", "", "apply"})
    /* compiled from: KycDocumentAddressViewModel.kt */
    static final class c<T, R> implements g<Throwable, List<? extends com.iqoption.core.microservices.kyc.response.document.i>> {
        public static final c dyw = new c();

        c() {
        }

        /* renamed from: r */
        public final List<com.iqoption.core.microservices.kyc.response.document.i> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return m.emptyList();
        }
    }

    public static final d as(Fragment fragment) {
        return dyu.as(fragment);
    }

    public final LiveData<List<com.iqoption.core.microservices.kyc.response.document.i>> aLk() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(com.iqoption.core.microservices.kyc.a.aeu().t(b.dyv).u(c.dyw).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).bkO());
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…  .toFlowable()\n        )");
        return fromPublisher;
    }
}
