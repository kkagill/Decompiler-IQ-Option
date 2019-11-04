package com.iqoption.kyc.pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.core.microservices.kyc.response.KycVerificationContext;
import com.iqoption.core.microservices.kyc.response.step.KycStepType;
import com.iqoption.core.splash.d;
import com.iqoption.e.af;
import com.iqoption.kyc.KycCaller;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\b\u0010\u001e\u001a\u00020\u0011H\u0014J\u0006\u0010\u001f\u001a\u00020\u0011R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/kyc/pro/ProKycActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "<set-?>", "Lcom/iqoption/databinding/ActivityProKycBinding;", "binding", "getBinding", "()Lcom/iqoption/databinding/ActivityProKycBinding;", "setBinding", "(Lcom/iqoption/databinding/ActivityProKycBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "showSplashRunnable", "Ljava/lang/Runnable;", "splash", "Lcom/iqoption/core/splash/SplashFragment;", "hideSplash", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onStart", "onStop", "showSplash", "Companion", "OpenConnectionCallback", "app_optionXRelease"})
/* compiled from: KycProActivity.kt */
public final class ProKycActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG = ProKycActivity.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(ProKycActivity.class), "binding", "getBinding()Lcom/iqoption/databinding/ActivityProKycBinding;"))};
    public static final a dBh = new a();
    private d ajo;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final Runnable cGy = new c(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/kyc/pro/ProKycActivity$Companion;", "", "()V", "ARG_KYC_CALLER", "", "TAG", "kotlin.jvm.PlatformType", "app_optionXRelease"})
    /* compiled from: KycProActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: KycProActivity.kt */
    static final class c implements Runnable {
        final /* synthetic */ ProKycActivity dBi;

        c(ProKycActivity proKycActivity) {
            this.dBi = proKycActivity;
        }

        public final void run() {
            this.dBi.Aq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/kyc/pro/ProKycActivity$OpenConnectionCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/kyc/pro/ProKycActivity;", "", "activity", "(Lcom/iqoption/kyc/pro/ProKycActivity;)V", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: KycProActivity.kt */
    private static final class b extends com.iqoption.system.c.b<ProKycActivity, Object> {
        public b(ProKycActivity proKycActivity) {
            kotlin.jvm.internal.i.f(proKycActivity, "activity");
            super(proKycActivity, Object.class);
        }

        /* renamed from: a */
        public void v(ProKycActivity proKycActivity, Object obj) {
            kotlin.jvm.internal.i.f(proKycActivity, "activity");
            com.iqoption.core.c.a.biN.removeCallbacks(proKycActivity.cGy);
            proKycActivity.Ar();
        }

        /* renamed from: a */
        public void c(ProKycActivity proKycActivity, Throwable th) {
            kotlin.jvm.internal.i.f(proKycActivity, "activity");
            kotlin.jvm.internal.i.f(th, "t");
            com.iqoption.core.c.a.biN.removeCallbacks(proKycActivity.cGy);
            proKycActivity.Ar();
        }
    }

    private final void a(af afVar) {
        this.bIb.a(this, anY[0], afVar);
    }

    private final af aLO() {
        return (af) this.bIb.b(this, anY[0]);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_pro_kyc);
        kotlin.jvm.internal.i.e(contentView, "DataBindingUtil.setConte….layout.activity_pro_kyc)");
        a((af) contentView);
        if (bundle == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("ARG_KYC_CALLER");
            if (serializableExtra != null) {
                com.iqoption.core.ui.d.c a = b.dBj.a((KycCaller) serializableExtra, (KycStepType) getIntent().getSerializableExtra("ARG_ONLY_SCREEN"), (ArrayList) getIntent().getSerializableExtra("ARG_KYC_START_STEPS"), getIntent().getBooleanExtra("ARG_SHOW_DEPOSIT_AFTER_FINISH", false), getIntent().getBooleanExtra("ARG_RETURN_TO_PARENT", false), (KycVerificationContext) getIntent().getSerializableExtra("ARG_VERIFICATION_CONTEXT"));
                getSupportFragmentManager().beginTransaction().add(R.id.proKycContainer, a.bh(this), a.getName()).commitAllowingStateLoss();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.kyc.KycCaller");
            }
        }
        com.iqoption.core.splash.d.a aVar = d.bGp;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "supportFragmentManager");
        this.ajo = aVar.a(supportFragmentManager, R.id.splashContainer, false);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        t cj = WebSocketHandler.aTn().cj(TAG);
        com.iqoption.core.c.a.biN.postDelayed(this.cGy, 1000);
        v.a(cj, (o) new b(this));
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        super.onNewIntent(intent);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "supportFragmentManager");
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if ((fragment instanceof com.iqoption.core.ui.fragment.c) && ((com.iqoption.core.ui.fragment.c) fragment).o(intent)) {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onStop();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(com.iqoption.kyc.navigator.a.dAF.Bx());
        com.iqoption.kyc.j.a aVar = com.iqoption.kyc.j.dsW;
        if (findFragmentByTag == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        aVar.am(findFragmentByTag).b(new com.iqoption.core.ui.fragment.a(i, i2, intent));
    }

    public final void Aq() {
        View findFocus = aLO().getRoot().findFocus();
        if (findFocus != null) {
            findFocus.clearFocus();
        }
        d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.show();
    }

    public final void Ar() {
        d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.hide();
    }
}
