package com.iqoption.welcomeonboarding.a;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.k;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.mobbtech.connect.request.h;
import io.reactivex.b.f;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0014¨\u0006\r"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQEmailRegistrationViewModel;", "Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "()V", "anonymRegisterSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "registerSingle", "email", "", "password", "name", "surname", "Companion", "app_optionXRelease"})
/* compiled from: IQEmailRegistrationViewModel.kt */
public final class a extends com.iqoption.welcome.register.email.b {
    public static final a enX = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQEmailRegistrationViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcomeonboarding/viewmodels/IQEmailRegistrationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "isTrialEnding", "", "app_optionXRelease"})
    /* compiled from: IQEmailRegistrationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a h(Fragment fragment, boolean z) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(fragment).get(a.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(fr…ionViewModel::class.java)");
            a aVar = (a) viewModel;
            aVar.f(fragment, z);
            return aVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQEmailRegistrationViewModel.kt */
    static final class b<T> implements f<l> {
        public static final b enY = new b();

        b() {
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                DG.Gn();
                DG.aO(true);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQEmailRegistrationViewModel.kt */
    static final class c<T> implements f<io.reactivex.disposables.b> {
        final /* synthetic */ a enZ;

        c(a aVar) {
            this.enZ = aVar;
        }

        /* renamed from: c */
        public final void accept(io.reactivex.disposables.b bVar) {
            this.enZ.baL();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQEmailRegistrationViewModel.kt */
    static final class d<T> implements f<l> {
        final /* synthetic */ a enZ;

        d(a aVar) {
            this.enZ = aVar;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                Context Eu = IQApp.Eu();
                com.iqoption.app.b.aK(Eu).Go();
                com.iqoption.app.d Fa = com.iqoption.app.d.Fa();
                Fa.h(Boolean.valueOf(true));
                Fa.dM(0);
                Fa.ac(System.currentTimeMillis());
                Fa = com.iqoption.app.d.Fa();
                kotlin.jvm.internal.i.e(Fa, "Preferences.instance()");
                Fa.ba(true);
                if (!com.iqoption.core.data.d.a.bdi.Wh()) {
                    k.f(IQApp.Eu(), 4);
                }
                h.a(Eu, null, false, false);
                this.enZ.baM();
                return;
            }
            this.enZ.baN();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQEmailRegistrationViewModel.kt */
    static final class e<T> implements f<Throwable> {
        final /* synthetic */ a enZ;

        e(a aVar) {
            this.enZ = aVar;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.enZ.baN();
        }
    }

    /* Access modifiers changed, original: protected */
    public p<l> baU() {
        p h = super.baU().h((f) b.enY);
        kotlin.jvm.internal.i.e(h, "super.anonymRegisterSing…      }\n                }");
        return h;
    }

    /* Access modifiers changed, original: protected */
    public p<l> h(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.i.f(str, "email");
        kotlin.jvm.internal.i.f(str2, "password");
        kotlin.jvm.internal.i.f(str3, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str4, "surname");
        p i = super.h(str, str2, str3, str4).g((f) new c(this)).h((f) new d(this)).i((f) new e(this));
        kotlin.jvm.internal.i.e(i, "super.registerSingle(ema…_ -> reportErrorEvent() }");
        return i;
    }
}
