package com.iqoption.fragment.leftmenu;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.common.base.Optional;
import com.iqoption.core.microservices.billing.verification.response.CardStatus;
import com.iqoption.core.microservices.kyc.response.j;
import com.iqoption.microservice.regulators.response.StatusType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J6\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u000eJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u0006J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/fragment/leftmenu/LeftMenuViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isOpened", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isOpenedData", "Landroidx/lifecycle/MutableLiveData;", "verificationStateLiveData", "Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "cardsFlowable", "Lio/reactivex/Flowable;", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "close", "", "composeVerifyWarning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "hasAuthAmount", "kycData", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "notVerifiedCards", "hasInvoices", "createVerifyWarningFlowable", "getPreferences", "Landroid/content/SharedPreferences;", "getProTraderApplicationStatus", "Lcom/google/common/base/Optional;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "getVerificationState", "hasAuthAmountFlowable", "open", "setProTraderLeftMenuHidden", "toggle", "Companion", "app_optionXRelease"})
/* compiled from: LeftMenuViewModel.kt */
public final class f extends AndroidViewModel {
    public static final a diW = new a();
    private final MutableLiveData<Boolean> diU;
    private LiveData<g> diV;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/leftmenu/LeftMenuViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/fragment/leftmenu/LeftMenuViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: LeftMenuViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f q(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…enuViewModel::class.java]");
            return (f) viewModel;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "kotlin.jvm.PlatformType", "it", "apply"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class b<T, R> implements io.reactivex.b.g<T, R> {
        public static final b diY = new b();

        b() {
        }

        /* renamed from: a */
        public final Optional<j> apply(j jVar) {
            kotlin.jvm.internal.i.f(jVar, "it");
            return Optional.an(jVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0003H\n¢\u0006\u0004\b\f\u0010\r"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "hasAuthAmount", "", "kycData", "Lcom/google/common/base/Optional;", "Lcom/iqoption/core/microservices/kyc/response/VerificationInitData;", "kotlin.jvm.PlatformType", "cards", "", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "hasInvoices", "apply", "(Ljava/lang/Boolean;Lcom/google/common/base/Optional;Ljava/util/List;Ljava/lang/Boolean;)Lcom/iqoption/fragment/leftmenu/MenuVerificationState;"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class c<T1, T2, T3, T4, R> implements io.reactivex.b.i<Boolean, Optional<j>, List<? extends com.iqoption.core.microservices.billing.verification.response.c>, Boolean, g> {
        final /* synthetic */ f diZ;

        c(f fVar) {
            this.diZ = fVar;
        }

        public final g a(Boolean bool, Optional<j> optional, List<com.iqoption.core.microservices.billing.verification.response.c> list, Boolean bool2) {
            kotlin.jvm.internal.i.f(bool, "hasAuthAmount");
            kotlin.jvm.internal.i.f(optional, "kycData");
            kotlin.jvm.internal.i.f(list, "cards");
            kotlin.jvm.internal.i.f(bool2, "hasInvoices");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((com.iqoption.core.microservices.billing.verification.response.c) next).Lq() != CardStatus.VERIFIED ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return new g((j) optional.pN(), this.diZ.a(bool.booleanValue(), (j) optional.pN(), (List) arrayList, bool2.booleanValue()), bool2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lcom/google/common/base/Optional;", "Lcom/iqoption/microservice/regulators/response/StatusType;", "kotlin.jvm.PlatformType", "status", "Lcom/iqoption/microservice/regulators/response/ProTraderApplicationStatus;", "apply"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ Application $context;
        final /* synthetic */ boolean dja;

        d(Application application, boolean z) {
            this.$context = application;
            this.dja = z;
        }

        /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            if (com.iqoption.core.ext.c.b(r5, com.iqoption.microservice.regulators.response.StatusType.PENDING, com.iqoption.microservice.regulators.response.StatusType.DECLINED) == true) goto L_0x0034;
     */
        /* renamed from: a */
        public final com.google.common.base.Optional<com.iqoption.microservice.regulators.response.StatusType> apply(com.iqoption.microservice.regulators.response.a r5) {
            /*
            r4 = this;
            r0 = "status";
            kotlin.jvm.internal.i.f(r5, r0);
            r5 = r5.aOy();
            r0 = com.iqoption.microservice.regulators.response.StatusType.APPROVED;
            r1 = 0;
            if (r5 != r0) goto L_0x000f;
        L_0x000e:
            goto L_0x0035;
        L_0x000f:
            r0 = r4.$context;
            r0 = (android.content.Context) r0;
            r0 = com.iqoption.protrader.f.a(r0, r5);
            if (r0 == 0) goto L_0x001a;
        L_0x0019:
            goto L_0x0034;
        L_0x001a:
            r0 = r4.dja;
            if (r0 == 0) goto L_0x001f;
        L_0x001e:
            goto L_0x0035;
        L_0x001f:
            if (r5 == 0) goto L_0x0035;
        L_0x0021:
            r0 = 2;
            r0 = new com.iqoption.microservice.regulators.response.StatusType[r0];
            r2 = 0;
            r3 = com.iqoption.microservice.regulators.response.StatusType.PENDING;
            r0[r2] = r3;
            r2 = com.iqoption.microservice.regulators.response.StatusType.DECLINED;
            r3 = 1;
            r0[r3] = r2;
            r0 = com.iqoption.core.ext.c.b(r5, r0);
            if (r0 != r3) goto L_0x0035;
        L_0x0034:
            r1 = r5;
        L_0x0035:
            if (r1 == 0) goto L_0x003e;
        L_0x0037:
            r5 = com.google.common.base.Optional.am(r1);
            if (r5 == 0) goto L_0x003e;
        L_0x003d:
            goto L_0x0047;
        L_0x003e:
            r5 = com.google.common.base.Optional.pW();
            r0 = "Optional.absent()";
            kotlin.jvm.internal.i.e(r5, r0);
        L_0x0047:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.leftmenu.f$d.apply(com.iqoption.microservice.regulators.response.a):com.google.common.base.Optional");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/fragment/leftmenu/MenuVerificationState;", "it", "", "apply"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class e<T, R> implements io.reactivex.b.g<Throwable, g> {
        public static final e djb = new e();

        e() {
        }

        /* renamed from: H */
        public final g apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return new g(null, null, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/IQAccount;", "apply"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f djc = new f();

        f() {
        }

        /* renamed from: f */
        public final String apply(com.iqoption.core.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return "";
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "", "apply"})
    /* compiled from: LeftMenuViewModel.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        public static final g djd = new g();

        g() {
        }

        /* renamed from: iw */
        public final io.reactivex.e<Boolean> apply(String str) {
            kotlin.jvm.internal.i.f(str, "it");
            return com.iqoption.core.data.repository.a.bds.WN().g(AnonymousClass1.dje);
        }
    }

    public static final f q(FragmentActivity fragmentActivity) {
        return diW.q(fragmentActivity);
    }

    public f(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.valueOf(false));
        this.diU = mutableLiveData;
    }

    public final LiveData<Boolean> aEm() {
        return this.diU;
    }

    public final void close() {
        this.diU.setValue(Boolean.valueOf(false));
    }

    public final void toggle() {
        MutableLiveData mutableLiveData = this.diU;
        mutableLiveData.setValue(Boolean.valueOf(kotlin.jvm.internal.i.y((Boolean) mutableLiveData.getValue(), Boolean.valueOf(true)) ^ 1));
    }

    public final io.reactivex.e<Optional<StatusType>> aEn() {
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication<Application>()");
        com.iqoption.app.b aK = com.iqoption.app.b.aK(application);
        io.reactivex.e bkQ;
        if (aK.Ef()) {
            bkQ = io.reactivex.e.bkQ();
            kotlin.jvm.internal.i.e(bkQ, "Flowable.empty()");
            return bkQ;
        }
        bkQ = com.iqoption.protrader.g.dQt.cc(aK.getUserId()).g(new d(application, aEq().getBoolean("pro_trader_left_menu_hidden", false))).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj());
        kotlin.jvm.internal.i.e(bkQ, "RegulatorsRepository.get…           .observeOn(ui)");
        return bkQ;
    }

    public final LiveData<g> aEo() {
        if (this.diV == null) {
            this.diV = LiveDataReactiveStreams.fromPublisher(aEr().h(e.djb).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()));
        }
        LiveData liveData = this.diV;
        if (liveData == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return liveData;
    }

    public final void aEp() {
        aEq().edit().putBoolean("pro_trader_left_menu_hidden", true).apply();
    }

    private final SharedPreferences aEq() {
        SharedPreferences W = com.iqoption.app.d.aP(getApplication()).W(com.iqoption.app.b.DG().getUserId());
        kotlin.jvm.internal.i.e(W, "Preferences.getInstance(…utUserPreferences(userId)");
        return W;
    }

    private final io.reactivex.e<g> aEr() {
        io.reactivex.e cF = aEt().cF(Boolean.valueOf(false));
        kotlin.jvm.internal.i.e(cF, "hasAuthAmountFlowable().onErrorReturnItem(false)");
        io.reactivex.e cF2 = com.iqoption.core.data.repository.d.bdF.WT().g(b.diY).cF(Optional.pW());
        kotlin.jvm.internal.i.e(cF2, "KycRepository.observeVer…rnItem(Optional.absent())");
        io.reactivex.e cF3 = aEs().cF(m.emptyList());
        kotlin.jvm.internal.i.e(cF3, "cardsFlowable().onErrorReturnItem(emptyList())");
        return com.iqoption.core.rx.g.a(cF, cF2, cF3, com.iqoption.billing.repository.b.azj.KA(), new c(this));
    }

    private final io.reactivex.e<List<com.iqoption.core.microservices.billing.verification.response.c>> aEs() {
        if (com.iqoption.core.d.EH().ej("jumio-card-verification")) {
            return com.iqoption.cardsverification.repository.a.aBI.Lo();
        }
        io.reactivex.e cD = io.reactivex.e.cD(m.emptyList());
        kotlin.jvm.internal.i.e(cD, "Flowable.just(emptyList())");
        return cD;
    }

    private final io.reactivex.e<Boolean> aEt() {
        io.reactivex.e d = com.iqoption.core.manager.i.bjd.Ys().g(f.djc).cG("").d((io.reactivex.b.g) g.djd);
        kotlin.jvm.internal.i.e(d, "AuthManager.regulationAn…      }\n                }");
        return d;
    }

    private final com.iqoption.deposit.verification.e<?> a(boolean z, j jVar, List<com.iqoption.core.microservices.billing.verification.response.c> list, boolean z2) {
        com.iqoption.deposit.verification.e<?> eVar = null;
        if (com.iqoption.core.d.EA().Ej()) {
            return null;
        }
        Application application = getApplication();
        kotlin.jvm.internal.i.e(application, "getApplication<Application>()");
        if (jVar != null) {
            eVar = com.iqoption.deposit.verification.f.a(jVar, z2);
        }
        com.iqoption.deposit.verification.a aVar = (com.iqoption.deposit.verification.a) n.d(n.a(n.b(n.f(n.b(u.Z(list), (kotlin.jvm.a.b) new LeftMenuViewModel$composeVerifyWarning$importantCardWarning$1(z)), new LeftMenuViewModel$composeVerifyWarning$importantCardWarning$2(application, list)), (kotlin.jvm.a.b) LeftMenuViewModel$composeVerifyWarning$importantCardWarning$3.diX), com.iqoption.deposit.verification.f.atk()));
        return (com.iqoption.deposit.verification.e) n.d(n.a(u.Z(m.listOf(eVar, aVar)), com.iqoption.deposit.verification.f.atk()));
    }
}
