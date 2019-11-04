package com.iqoption.kyc.commonphone;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import io.reactivex.processors.BehaviorProcessor;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.n;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0014J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0011H\u0002J\u0006\u0010(\u001a\u00020$J\b\u0010)\u001a\u00020$H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/kyc/commonphone/PhoneConfirmViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "confirmProgress", "Landroidx/lifecycle/LiveData;", "", "getConfirmProgress", "()Landroidx/lifecycle/LiveData;", "confirmProgressLiveData", "Landroidx/lifecycle/MutableLiveData;", "confirmSuccess", "Lkotlin/Pair;", "getConfirmSuccess", "confirmSuccessLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "expireFinishTimeProcessor", "Lio/reactivex/processors/FlowableProcessor;", "", "kotlin.jvm.PlatformType", "expireTime", "", "getExpireTime", "expireTimeLiveData", "isConfirmPhone", "()Z", "setConfirmPhone", "(Z)V", "isEnableTwoFactor", "setEnableTwoFactor", "resendAllowed", "getResendAllowed", "resendAllowedLiveData", "responseMessage", "getResponseMessage", "responseMessageLiveData", "confirmCode", "", "code", "formatExpiryTime", "millisSource", "resendCode", "updateExpirationFinishTime", "Companion", "kyc_release"})
/* compiled from: PhoneConfirmViewModel.kt */
public final class b extends com.iqoption.core.ui.f.d {
    public static final a dui = new a();
    private final MutableLiveData<String> czl = new MutableLiveData();
    private final LiveData<String> czm = this.czl;
    private final io.reactivex.processors.a<Long> dtX;
    private final MutableLiveData<Boolean> dtY = new MutableLiveData();
    private final LiveData<Boolean> dtZ = this.dtY;
    private final com.iqoption.core.data.b.b<String> dua = new com.iqoption.core.data.b.b();
    private final LiveData<String> dub = this.dua;
    private final MutableLiveData<Boolean> duc = new MutableLiveData();
    private final LiveData<Boolean> dud = this.duc;
    private final com.iqoption.core.data.b.b<Pair<Boolean, Boolean>> due = new com.iqoption.core.data.b.b();
    private final LiveData<Pair<Boolean, Boolean>> duf = this.due;
    private boolean dug = true;
    private boolean duh = true;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/kyc/commonphone/PhoneConfirmViewModel$Companion;", "", "()V", "EXPIRATION_FORMAT", "", "get", "Lcom/iqoption/kyc/commonphone/PhoneConfirmViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "kyc_release"})
    /* compiled from: PhoneConfirmViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b ao(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…irmViewModel::class.java)");
            return (b) viewModel;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"})
    /* compiled from: PhoneConfirmViewModel.kt */
    /* renamed from: com.iqoption.kyc.commonphone.b$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<Long> {
        final /* synthetic */ b dul;

        AnonymousClass2(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: o */
        public final void accept(Long l) {
            this.dul.dtY.postValue(Boolean.valueOf(l.longValue() <= 0));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "leftMillis", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"})
    /* compiled from: PhoneConfirmViewModel.kt */
    /* renamed from: com.iqoption.kyc.commonphone.b$3 */
    static final class AnonymousClass3<T> implements io.reactivex.b.f<Long> {
        final /* synthetic */ b dul;

        AnonymousClass3(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: o */
        public final void accept(Long l) {
            MutableLiveData f = this.dul.czl;
            b bVar = this.dul;
            kotlin.jvm.internal.i.e(l, "leftMillis");
            f.postValue(bVar.bs(l.longValue()));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/ConfirmPhoneResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.a> {
        final /* synthetic */ b dul;

        b(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.a aVar) {
            this.dul.due.postValue(kotlin.j.x(Boolean.valueOf(this.dul.aKz()), Boolean.valueOf(this.dul.aKA())));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b dul;

        c(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            boolean z = false;
            this.dul.duc.postValue(Boolean.valueOf(false));
            String K = com.iqoption.kyc.h.dsg.aIX().K(th);
            if (K != null) {
                if (K.length() > 0) {
                    z = true;
                }
                if (z) {
                    this.dul.dua.postValue(K);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.g> {
        public static final d dun = new d();

        d() {
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.g gVar) {
            com.iqoption.core.data.d.b.bdk.WB().aG(0);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.g> {
        final /* synthetic */ b dul;

        e(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.g gVar) {
            boolean z = false;
            this.dul.duc.postValue(Boolean.valueOf(false));
            if ((kotlin.jvm.internal.i.y(gVar.ZD(), Boolean.valueOf(true)) ^ 1) != 0) {
                String message = gVar.getMessage();
                if (message != null) {
                    if (message.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        this.dul.dua.postValue(gVar.getMessage());
                        return;
                    }
                }
            }
            this.dul.due.postValue(kotlin.j.x(Boolean.valueOf(this.dul.aKz()), Boolean.valueOf(this.dul.aKA())));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b dul;

        f(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            boolean z = false;
            this.dul.duc.postValue(Boolean.valueOf(false));
            String K = com.iqoption.kyc.h.dsg.aIX().K(th);
            if (K != null) {
                if (K.length() > 0) {
                    z = true;
                }
                if (z) {
                    this.dul.dua.postValue(K);
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/ResponseStatus;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<com.iqoption.core.microservices.c> {
        final /* synthetic */ b dul;

        g(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: c */
        public final void accept(com.iqoption.core.microservices.c cVar) {
            this.dul.aKC();
            if (!cVar.isSuccessful()) {
                if ((((CharSequence) cVar.getMessage()).length() > 0 ? 1 : null) != null) {
                    this.dul.dua.postValue(cVar.getMessage());
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h duo = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/kyc/response/TwoFactorResponse;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class i<T> implements io.reactivex.b.f<com.iqoption.core.microservices.kyc.response.g> {
        final /* synthetic */ b dul;

        i(b bVar) {
            this.dul = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.microservices.kyc.response.g gVar) {
            this.dul.aKC();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: PhoneConfirmViewModel.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        public static final j dup = new j();

        j() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public b() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create<Long>().toSerialized()");
        this.dtX = bmJ;
        io.reactivex.disposables.b a = this.dtX.c(com.iqoption.core.rx.i.aki()).k(AnonymousClass1.duj).c((io.reactivex.b.f) new AnonymousClass2(this)).bkT().a((io.reactivex.b.f) new AnonymousClass3(this), (io.reactivex.b.f) AnonymousClass4.dum);
        kotlin.jvm.internal.i.e(a, "expireFinishTimeProcesso…      }\n                )");
        b(a);
        aKC();
    }

    public final LiveData<String> aqE() {
        return this.czm;
    }

    public final LiveData<Boolean> aKv() {
        return this.dtZ;
    }

    public final LiveData<String> aKw() {
        return this.dub;
    }

    public final LiveData<Boolean> aKx() {
        return this.dud;
    }

    public final LiveData<Pair<Boolean, Boolean>> aKy() {
        return this.duf;
    }

    public final boolean aKz() {
        return this.dug;
    }

    public final void eC(boolean z) {
        this.dug = z;
    }

    public final boolean aKA() {
        return this.duh;
    }

    public final void eD(boolean z) {
        this.duh = z;
    }

    public final void aKB() {
        this.dtY.postValue(Boolean.valueOf(false));
        io.reactivex.disposables.b a;
        if (this.dug) {
            a = com.iqoption.core.e.c.bEr.ajW().h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new g(this), (io.reactivex.b.f) h.duo);
            kotlin.jvm.internal.i.e(a, "PhoneManager.resendPhone…  }\n                    )");
            b(a);
            return;
        }
        a = com.iqoption.core.microservices.kyc.d.a(this.duh, null, 2, null).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new i(this), (io.reactivex.b.f) j.dup);
        kotlin.jvm.internal.i.e(a, "PhoneRequests.twoFactorA…  }\n                    )");
        b(a);
    }

    public final void iN(String str) {
        kotlin.jvm.internal.i.f(str, "code");
        this.duc.postValue(Boolean.valueOf(true));
        io.reactivex.disposables.b a;
        if (this.dug) {
            a = com.iqoption.core.e.c.bEr.gH(str).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new b(this), (io.reactivex.b.f) new c(this));
            kotlin.jvm.internal.i.e(a, "PhoneManager.confirmPhon…  }\n                    )");
            b(a);
            return;
        }
        a = com.iqoption.core.microservices.kyc.d.f(this.duh, str).h((io.reactivex.b.f) d.dun).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) new f(this));
        kotlin.jvm.internal.i.e(a, "PhoneRequests.twoFactorA…  }\n                    )");
        b(a);
    }

    private final void aKC() {
        this.dtX.onNext(Long.valueOf(com.iqoption.core.data.d.b.bdk.WB().Wz()));
    }

    private final String bs(long j) {
        j = TimeUnit.MILLISECONDS.toSeconds(j - TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(j)));
        n nVar = n.eWf;
        Object[] objArr = new Object[]{Long.valueOf(r0), Long.valueOf(j)};
        String format = String.format("%02d:%02d", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
