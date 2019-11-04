package com.iqoption.welcome.twostepauth;

import android.os.CountDownTimer;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.PeriodicWorkRequest;
import com.iqoption.core.i.k;
import com.iqoption.core.manager.aa;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.g;
import com.iqoption.core.manager.m;
import com.iqoption.core.manager.n;
import com.iqoption.core.manager.p;
import com.iqoption.core.manager.q;
import com.iqoption.core.manager.y;
import com.iqoption.core.manager.z;
import com.iqoption.welcome.o;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "isProgressShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isProgressShownData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "resendTimeout", "", "getResendTimeout", "resendTimeoutData", "Landroidx/lifecycle/MutableLiveData;", "resendTimeoutTimer", "Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel$ResendTimeoutTimer;", "toastMessage", "getToastMessage", "toastMessageData", "verifyCancel", "", "getVerifyCancel", "verifyCancelLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "welcomeStateViewModel", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "init", "activity", "Landroidx/fragment/app/FragmentActivity;", "login", "verifyInfo", "Lcom/iqoption/core/manager/VerifyInfo;", "loginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "resendCode", "Companion", "ResendTimeoutTimer", "welcome_release"})
/* compiled from: VerifyAuthViewModel.kt */
public class b extends com.iqoption.core.ui.f.d {
    private static final String TAG = b.class.getSimpleName();
    private static final long enI = (com.iqoption.core.d.Un().Ds() ? 5000 : PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final a enJ = new a();
    private o dUI;
    private final com.iqoption.core.data.b.c<Boolean> elK = new com.iqoption.core.data.b.c(Boolean.valueOf(false));
    private final LiveData<Boolean> elL = this.elK;
    private final MutableLiveData<String> elM = new MutableLiveData();
    private final LiveData<String> elN = this.elM;
    private final MutableLiveData<String> enD = new MutableLiveData();
    private final LiveData<String> enE = this.enD;
    private final com.iqoption.core.data.b.b<l> enF = new com.iqoption.core.data.b.b();
    private final LiveData<l> enG = this.enF;
    private b enH = new b(this.enD);

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel$Companion;", "", "()V", "CONFIRM_CODE_LENGTH", "", "RESEND_TIMEOUT", "", "TAG", "", "kotlin.jvm.PlatformType", "getResentTimeout", "welcome_release"})
    /* compiled from: VerifyAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final long bbH() {
            long Wa = com.iqoption.core.data.d.a.bdi.Wa();
            if (Wa == 0) {
                return 0;
            }
            return Math.max((Wa + b.enI) - System.currentTimeMillis(), 0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, bng = {"Lcom/iqoption/welcome/twostepauth/VerifyAuthViewModel$ResendTimeoutTimer;", "Landroid/os/CountDownTimer;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "", "(Landroidx/lifecycle/MutableLiveData;)V", "formatter", "Ljava/text/SimpleDateFormat;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onFinish", "", "onTick", "millisUntilFinished", "", "welcome_release"})
    /* compiled from: VerifyAuthViewModel.kt */
    private static final class b extends CountDownTimer {
        private final SimpleDateFormat enK = new SimpleDateFormat("mm:ss", Locale.getDefault());
        private final MutableLiveData<String> enL;

        public b(MutableLiveData<String> mutableLiveData) {
            kotlin.jvm.internal.i.f(mutableLiveData, "liveData");
            super(b.enJ.bbH(), 1000);
            this.enL = mutableLiveData;
        }

        public void onFinish() {
            this.enL.setValue(null);
        }

        public void onTick(long j) {
            this.enL.setValue(this.enK.format(Long.valueOf(j)));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyAuthViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<com.iqoption.core.manager.l> {
        final /* synthetic */ b enM;
        final /* synthetic */ af enN;

        c(b bVar, af afVar) {
            this.enM = bVar;
            this.enN = afVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.manager.l lVar) {
            boolean z = lVar instanceof m;
            if (!z) {
                this.enM.elK.setValue(Boolean.valueOf(false));
            }
            MutableLiveData c;
            Object message;
            if (z) {
                com.iqoption.core.manager.e Yf = this.enN.Yf();
                if (Yf instanceof q) {
                    b.b(this.enM).aZz();
                } else if (Yf instanceof z) {
                    b.b(this.enM).aZA();
                } else if (Yf instanceof p) {
                    b.b(this.enM).aZA();
                } else if (Yf instanceof aa) {
                    b.b(this.enM).aZA();
                } else if (Yf instanceof com.iqoption.core.manager.o) {
                    b.b(this.enM).aZz();
                } else if (Yf instanceof y) {
                    b.b(this.enM).aZC();
                } else if (Yf instanceof n) {
                    b.b(this.enM).aZD();
                }
            } else if (lVar instanceof com.iqoption.core.manager.a) {
                c = this.enM.elM;
                message = ((com.iqoption.core.manager.a) lVar).getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(k.invalid_code);
                }
                com.iqoption.core.ext.a.c(c, message);
            } else if (lVar instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.please_enter_verification_code));
            } else if (lVar instanceof com.iqoption.core.manager.c) {
                com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.sms_limit_exceeded));
            } else if (lVar instanceof g) {
                c = this.enM.elM;
                message = ((g) lVar).getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                this.enM.enF.setValue(l.eVB);
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                c = this.enM.elM;
                com.iqoption.core.manager.d dVar = (com.iqoption.core.manager.d) lVar;
                Object message2 = dVar.getMessage();
                if (message2 == null) {
                    message2 = com.iqoption.core.d.getString(k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message2);
                this.enM.enF.setValue(l.eVB);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.unknown_error_occurred));
                this.enM.enF.setValue(l.eVB);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyAuthViewModel.kt */
    static final class d<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b enM;

        d(b bVar) {
            this.enM = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.unknown_error_occurred));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyAuthViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<com.iqoption.core.manager.l> {
        final /* synthetic */ b enM;

        e(b bVar) {
            this.enM = bVar;
        }

        /* renamed from: a */
        public final void accept(com.iqoption.core.manager.l lVar) {
            if ((lVar instanceof m) || (lVar instanceof com.iqoption.core.manager.b)) {
                com.iqoption.core.data.d.a.bdi.aC(System.currentTimeMillis());
                this.enM.enH.cancel();
                b bVar = this.enM;
                bVar.enH = new b(bVar.enD);
                this.enM.enH.start();
            } else if (lVar instanceof com.iqoption.core.manager.c) {
                com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.sms_limit_exceeded));
            } else if (lVar instanceof com.iqoption.core.manager.d) {
                MutableLiveData c = this.enM.elM;
                com.iqoption.core.manager.d dVar = (com.iqoption.core.manager.d) lVar;
                Object message = dVar.getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.unknown_error_occurred));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VerifyAuthViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ b enM;

        f(b bVar) {
            this.enM = bVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            com.iqoption.core.ext.a.c(this.enM.elM, com.iqoption.core.d.getString(k.unknown_error_occurred));
        }
    }

    public b() {
        this.enH.start();
    }

    public static final /* synthetic */ o b(b bVar) {
        o oVar = bVar.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar;
    }

    public final void O(FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        this.dUI = o.ekt.N(fragmentActivity);
    }

    public final LiveData<String> bbE() {
        return this.enE;
    }

    public final LiveData<Boolean> bab() {
        return this.elL;
    }

    public final LiveData<String> bac() {
        return this.elN;
    }

    public final LiveData<l> bbF() {
        return this.enG;
    }

    public final void e(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        CharSequence code = afVar.getCode();
        Object obj = (code == null || code.length() == 0) ? 1 : null;
        if (obj != null) {
            com.iqoption.core.ext.a.c(this.elM, com.iqoption.core.d.getString(k.please_enter_verification_code));
            return;
        }
        this.elK.setValue(Boolean.valueOf(true));
        io.reactivex.disposables.b a = f(afVar).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new c(this, afVar), (io.reactivex.b.f) new d(this));
        kotlin.jvm.internal.i.e(a, "loginSingle(verifyInfo)\n…rred))\n                })");
        b(a);
    }

    /* Access modifiers changed, original: protected */
    public io.reactivex.p<com.iqoption.core.manager.l> f(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        return com.iqoption.core.manager.i.bjd.b(afVar);
    }

    public final void g(af afVar) {
        kotlin.jvm.internal.i.f(afVar, "verifyInfo");
        io.reactivex.disposables.b a = com.iqoption.core.manager.i.bjd.a(afVar).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new e(this), (io.reactivex.b.f) new f(this));
        kotlin.jvm.internal.i.e(a, "AuthManager\n            …rred))\n                })");
        b(a);
    }
}
