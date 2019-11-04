package com.iqoption.cardsverification.status;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.billing.verification.response.VerifyInitResult;
import com.jumio.MobileSDK;
import com.jumio.core.enums.JumioDataCenter;
import com.jumio.dv.DocumentVerificationSDK;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, bng = {"Lcom/iqoption/cardsverification/status/PerformVerifyViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "initLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/cardsverification/status/PerformVerifyData;", "jumioSdk", "Lcom/jumio/dv/DocumentVerificationSDK;", "pendingScreenLiveData", "", "pendingScreenStream", "Landroidx/lifecycle/LiveData;", "getPendingScreenStream", "()Landroidx/lifecycle/LiveData;", "destroySdk", "", "getJumioSDK", "activity", "Landroid/app/Activity;", "verifyState", "Lcom/iqoption/cardsverification/status/VerifyState;", "loadPerformVerifyData", "userId", "", "cardId", "setVerifyCardUploaded", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "uuid", "", "Companion", "cardsverification_release"})
/* compiled from: PerformVerifyViewModel.kt */
public final class g extends com.iqoption.core.ui.f.c {
    private static final String TAG;
    public static final a aCs = new a();
    private MutableLiveData<d> aCn = new MutableLiveData();
    private DocumentVerificationSDK aCo;
    private final MutableLiveData<Object> aCp = new MutableLiveData();
    private final LiveData<Object> aCq = this.aCp;
    private final Application aCr;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/cardsverification/status/PerformVerifyViewModel$Companion;", "", "()V", "TAG", "", "create", "Lcom/iqoption/cardsverification/status/PerformVerifyViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "cardsverification_release"})
    /* compiled from: PerformVerifyViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g d(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(g.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ifyViewModel::class.java]");
            return (g) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/iqoption/cardsverification/status/PerformVerifyData;", "initResult", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyInitResult;", "country", "Lcom/iqoption/core/microservices/configuration/response/Country;", "apply"})
    /* compiled from: PerformVerifyViewModel.kt */
    static final class b<T1, T2, R> implements io.reactivex.b.c<VerifyInitResult, com.iqoption.core.microservices.configuration.a.c, d> {
        public static final b aCt = new b();

        b() {
        }

        /* renamed from: a */
        public final d apply(VerifyInitResult verifyInitResult, com.iqoption.core.microservices.configuration.a.c cVar) {
            kotlin.jvm.internal.i.f(verifyInitResult, "initResult");
            kotlin.jvm.internal.i.f(cVar, "country");
            return new d(verifyInitResult, cVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "performVerifyData", "Lcom/iqoption/cardsverification/status/PerformVerifyData;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PerformVerifyViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<d> {
        final /* synthetic */ g aCu;

        c(g gVar) {
            this.aCu = gVar;
        }

        /* renamed from: b */
        public final void accept(d dVar) {
            this.aCu.aCn.postValue(dVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PerformVerifyViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ g aCu;

        d(g gVar) {
            this.aCu = gVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aCu.aCn.postValue(null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: PerformVerifyViewModel.kt */
    static final class e implements io.reactivex.b.a {
        final /* synthetic */ g aCu;

        e(g gVar) {
            this.aCu = gVar;
        }

        public final void run() {
            com.iqoption.core.ext.a.d(this.aCu.aCp, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PerformVerifyViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ g aCu;

        f(g gVar) {
            this.aCu = gVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            com.iqoption.core.ext.a.d(this.aCu.aCp, null);
        }
    }

    public g(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        this.aCr = application;
    }

    static {
        String name = g.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public final LiveData<Object> LK() {
        return this.aCq;
    }

    public final LiveData<d> k(long j, long j2) {
        if (this.aCn.getValue() == null) {
            io.reactivex.disposables.b a = p.a(com.iqoption.core.microservices.billing.verification.a.boJ.q(j, j2), com.iqoption.core.data.repository.c.bdy.aJ(com.iqoption.core.d.EA().El()).blg(), b.aCt).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new c(this), (io.reactivex.b.f) new d(this));
            kotlin.jvm.internal.i.e(a, "Single.zip<VerifyInitRes…) }\n                    )");
            b(a);
        }
        return this.aCn;
    }

    public final DocumentVerificationSDK a(Activity activity, k kVar) {
        kotlin.jvm.internal.i.f(activity, "activity");
        kotlin.jvm.internal.i.f(kVar, "verifyState");
        DocumentVerificationSDK documentVerificationSDK = this.aCo;
        if (documentVerificationSDK != null) {
            return documentVerificationSDK;
        }
        try {
            DocumentVerificationSDK.isSupportedPlatform(this.aCr);
            MobileSDK.isRooted(this.aCr);
            com.iqoption.core.microservices.billing.verification.response.e abe = kVar.LO().abe();
            if (abe == null) {
                return null;
            }
            DocumentVerificationSDK create = DocumentVerificationSDK.create(activity, abe.getToken(), abe.abd(), JumioDataCenter.EU);
            create.setType("CC");
            create.setCountry(kVar.LP());
            create.setCallbackUrl(abe.getCallbackUrl());
            create.setMerchantScanReference(abe.getUuid());
            create.setCustomerId(String.valueOf(kVar.getUserId()));
            this.aCo = create;
            return create;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Jumio DocumentVerificationSDK initialization error: ");
            stringBuilder.append(e);
            com.crashlytics.android.a.ag(stringBuilder.toString());
            return null;
        }
    }

    public final void LL() {
        DocumentVerificationSDK documentVerificationSDK = this.aCo;
        if (documentVerificationSDK != null) {
            documentVerificationSDK.destroy();
        }
    }

    public final void b(com.iqoption.core.microservices.billing.verification.response.c cVar, String str) {
        kotlin.jvm.internal.i.f(cVar, "card");
        kotlin.jvm.internal.i.f(str, "uuid");
        io.reactivex.disposables.b a = com.iqoption.cardsverification.repository.a.aBI.a(cVar, str).b(com.iqoption.core.rx.i.aki()).a(com.iqoption.core.rx.i.akj()).a(new e(this), new f(this));
        kotlin.jvm.internal.i.e(a, "VerifyCardsRepository.se…null) }\n                )");
        b(a);
    }
}
