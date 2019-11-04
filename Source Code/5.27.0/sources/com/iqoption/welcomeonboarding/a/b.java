package com.iqoption.welcomeonboarding.a;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.manager.l;
import com.iqoption.core.manager.m;
import com.iqoption.core.microservices.core.register.SocialTypeId;
import com.iqoption.mobbtech.connect.request.h;
import io.reactivex.b.f;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014¨\u0006\r"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQFacebookAuthViewModel;", "Lcom/iqoption/welcome/social/FacebookAuthViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "socialLoginSingle", "Lio/reactivex/Single;", "Lcom/iqoption/core/manager/AuthResult;", "userSocialId", "", "appKey", "accessToken", "Companion", "app_optionXRelease"})
/* compiled from: IQFacebookAuthViewModel.kt */
public final class b extends com.iqoption.welcome.d.b {
    public static final a eoa = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/welcomeonboarding/viewmodels/IQFacebookAuthViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/welcomeonboarding/viewmodels/IQFacebookAuthViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: IQFacebookAuthViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b R(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(b.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…uthViewModel::class.java)");
            b bVar = (b) viewModel;
            bVar.O(fragmentActivity);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/core/manager/AuthResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: IQFacebookAuthViewModel.kt */
    static final class b<T> implements f<l> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String eni;

        b(String str, String str2) {
            this.eni = str;
            this.$accessToken = str2;
        }

        /* renamed from: a */
        public final void accept(l lVar) {
            if (lVar instanceof m) {
                Context Eu = IQApp.Eu();
                com.iqoption.app.b.aK(Eu).Go();
                d Fa = d.Fa();
                Fa.ba(true);
                Fa.h(Boolean.valueOf(true));
                Fa.dM(0);
                Fa.ac(System.currentTimeMillis());
                com.iqoption.app.b DG = com.iqoption.app.b.DG();
                DG.a(SocialTypeId.FACEBOOK);
                kotlin.jvm.internal.i.e(DG, "this");
                DG.dv(this.eni);
                DG.dw(this.$accessToken);
                DG.aM(Eu);
                h.a(Eu, SocialTypeId.FACEBOOK, true, false);
            }
        }
    }

    public b(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application, null, 2, null);
    }

    /* Access modifiers changed, original: protected */
    public p<l> r(String str, String str2, String str3) {
        kotlin.jvm.internal.i.f(str, "userSocialId");
        kotlin.jvm.internal.i.f(str2, "appKey");
        kotlin.jvm.internal.i.f(str3, "accessToken");
        p h = super.r(str, str2, str3).h((f) new b(str, str3));
        kotlin.jvm.internal.i.e(h, "super.socialLoginSingle(…      }\n                }");
        return h;
    }
}
