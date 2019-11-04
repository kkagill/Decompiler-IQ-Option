package com.iqoption.welcome.d;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.manager.aa;
import com.iqoption.core.manager.ab;
import com.iqoption.core.manager.af;
import com.iqoption.core.manager.d;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import com.iqoption.welcome.k;
import com.iqoption.welcome.n;
import com.iqoption.welcome.o;
import io.reactivex.b.f;
import io.reactivex.b.g;
import io.reactivex.p;
import io.reactivex.t;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJB\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0004J\b\u0010&\u001a\u00020'H$J&\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006,"}, bng = {"Lcom/iqoption/welcome/social/BaseSocialAuthViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableAndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "isProgressShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isProgressShownData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "()Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "route", "Lcom/iqoption/welcome/WelcomeScreen;", "getRoute", "routeData", "Landroidx/lifecycle/MutableLiveData;", "toastMessage", "", "getToastMessage", "toastMessageData", "welcomeStateViewModel", "Lcom/iqoption/welcome/WelcomeStateViewModel;", "init", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "removeObservers", "owner", "Landroidx/lifecycle/LifecycleOwner;", "sendTokenToServer", "name", "surname", "email", "userSocialId", "appKey", "accessToken", "imageUrl", "socialId", "Lcom/iqoption/core/microservices/core/register/SocialTypeId;", "socialLoginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "Companion", "welcome_release"})
/* compiled from: BaseSocialAuthViewModel.kt */
public abstract class a extends com.iqoption.core.ui.f.c {
    private static final String TAG = a.class.getSimpleName();
    public static final a enf = new a();
    private o dUI;
    private final com.iqoption.core.data.b.c<Boolean> elK = new com.iqoption.core.data.b.c(Boolean.valueOf(false));
    private final LiveData<Boolean> elL = this.elK;
    private final MutableLiveData<String> elM = new MutableLiveData();
    private final LiveData<String> elN = this.elM;
    private final MutableLiveData<n> elO = new MutableLiveData();
    private final LiveData<n> elP = this.elO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/welcome/social/BaseSocialAuthViewModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "welcome_release"})
    /* compiled from: BaseSocialAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "response", "apply"})
    /* compiled from: BaseSocialAuthViewModel.kt */
    static final class b<T, R> implements g<T, t<? extends R>> {
        public static final b eng = new b();

        b() {
        }

        /* renamed from: b */
        public final p<? extends l> apply(l lVar) {
            kotlin.jvm.internal.i.f(lVar, "response");
            if (lVar instanceof m) {
                p<? extends l> cC = com.iqoption.core.manager.i.bjd.Yn().cC(lVar);
                kotlin.jvm.internal.i.e(cC, "AuthManager.refreshAutoL…toSingleDefault(response)");
                return cC;
            }
            p cI = p.cI(lVar);
            kotlin.jvm.internal.i.e(cI, "Single.just(response)");
            return cI;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: BaseSocialAuthViewModel.kt */
    static final class c<T> implements f<l> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $appKey;
        final /* synthetic */ String $name;
        final /* synthetic */ String bkf;
        final /* synthetic */ a enh;
        final /* synthetic */ String eni;
        final /* synthetic */ String enj;
        final /* synthetic */ String enk;

        c(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.enh = aVar;
            this.eni = str;
            this.$appKey = str2;
            this.$accessToken = str3;
            this.bkf = str4;
            this.$name = str5;
            this.enj = str6;
            this.enk = str7;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            l lVar2 = lVar;
            boolean z = lVar2 instanceof m;
            if (!z) {
                this.enh.baI().setValue(Boolean.valueOf(false));
            }
            if (z) {
                a.a(this.enh).aZz();
            } else if (lVar2 instanceof com.iqoption.core.manager.b) {
                com.iqoption.core.manager.b bVar = (com.iqoption.core.manager.b) lVar2;
                com.iqoption.core.ext.a.c(this.enh.elO, new k(new af(bVar.Yf(), bVar.Ye(), bVar.getToken(), bVar.Yd(), null, 16, null)));
            } else if (lVar2 instanceof ab) {
                MutableLiveData b = this.enh.elO;
                aa aaVar = r3;
                aa aaVar2 = new aa(this.enh.bby(), this.eni, this.$appKey, this.$accessToken, this.bkf, this.$name, this.enj, this.enk, false, null, null, null, 3840, null);
                com.iqoption.core.ext.a.c(b, new com.iqoption.welcome.i(aaVar));
            } else if (lVar2 instanceof d) {
                MutableLiveData c = this.enh.elM;
                d dVar = (d) lVar2;
                Object message = dVar.getMessage();
                if (message == null) {
                    message = com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred);
                }
                com.iqoption.core.ext.a.c(c, message);
                String Yg = dVar.Yg();
            } else {
                com.iqoption.core.ext.a.c(this.enh.elM, com.iqoption.core.d.getString(com.iqoption.core.i.k.unknown_error_occurred));
            }
        }
    }

    public abstract SocialTypeId bby();

    public a(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public static final /* synthetic */ o a(a aVar) {
        o oVar = aVar.dUI;
        if (oVar == null) {
            kotlin.jvm.internal.i.lG("welcomeStateViewModel");
        }
        return oVar;
    }

    public final void O(FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        this.dUI = o.ekt.N(fragmentActivity);
    }

    public final void removeObservers(LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.i.f(lifecycleOwner, "owner");
        this.elK.removeObservers(lifecycleOwner);
        this.elM.removeObservers(lifecycleOwner);
        this.elO.removeObservers(lifecycleOwner);
    }

    /* Access modifiers changed, original: protected|final */
    public final com.iqoption.core.data.b.c<Boolean> baI() {
        return this.elK;
    }

    public final LiveData<Boolean> bab() {
        return this.elL;
    }

    public final LiveData<String> bac() {
        return this.elN;
    }

    public final LiveData<n> bad() {
        return this.elP;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str4;
        String str9 = str5;
        String str10 = str6;
        String str11 = str;
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        String str12 = str2;
        kotlin.jvm.internal.i.f(str2, "surname");
        String str13 = str3;
        kotlin.jvm.internal.i.f(str3, "email");
        kotlin.jvm.internal.i.f(str8, "userSocialId");
        kotlin.jvm.internal.i.f(str9, "appKey");
        kotlin.jvm.internal.i.f(str10, "accessToken");
        io.reactivex.disposables.b e = r(str8, str9, str10).q(b.eng).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).e((f) new c(this, str8, str9, str10, str13, str11, str12, str7));
        kotlin.jvm.internal.i.e(e, "socialLoginSingle(userSo…     }\n                })");
        b(e);
    }

    /* Access modifiers changed, original: protected */
    public p<l> r(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "userSocialId");
        kotlin.jvm.internal.i.f(str2, "appKey");
        kotlin.jvm.internal.i.f(str3, "accessToken");
        return com.iqoption.core.manager.i.bjd.a(new com.iqoption.core.manager.o(bby(), str, str2, str3, null, 16, null));
    }
}
