package com.iqoption.deposit.pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.core.splash.d;
import com.iqoption.deposit.l;
import com.iqoption.e.ad;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0013H$J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u001cH\u0014J\b\u0010&\u001a\u00020\u001cH\u0014J\u0006\u0010'\u001a\u00020\u001cR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048D@DX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006*"}, bng = {"Lcom/iqoption/deposit/pro/ProDepositActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "<set-?>", "Lcom/iqoption/databinding/ActivityProDepositBinding;", "binding", "getBinding", "()Lcom/iqoption/databinding/ActivityProDepositBinding;", "setBinding", "(Lcom/iqoption/databinding/ActivityProDepositBinding;)V", "binding$delegate", "Lkotlin/properties/ReadWriteProperty;", "initSelection", "Lcom/iqoption/deposit/InitSelectOption;", "getInitSelection", "()Lcom/iqoption/deposit/InitSelectOption;", "initSelection$delegate", "Lkotlin/Lazy;", "returnToParent", "", "getReturnToParent", "()Z", "returnToParent$delegate", "showSplashRunnable", "Ljava/lang/Runnable;", "splash", "Lcom/iqoption/core/splash/SplashFragment;", "hideSplash", "", "isFullScreen", "onCloseByBack", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onStart", "onStop", "showSplash", "Companion", "OpenConnectionCallback", "app_optionXRelease"})
/* compiled from: ProDepositActivity.kt */
public abstract class a extends com.iqoption.core.ui.a.a {
    private static final String TAG = a.class.getName();
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(a.class), "binding", "getBinding()Lcom/iqoption/databinding/ActivityProDepositBinding;")), k.a(new PropertyReference1Impl(k.G(a.class), "returnToParent", "getReturnToParent()Z")), k.a(new PropertyReference1Impl(k.G(a.class), "initSelection", "getInitSelection()Lcom/iqoption/deposit/InitSelectOption;"))};
    public static final a cGz = new a();
    private d ajo;
    private final kotlin.f.d bIb = kotlin.f.a.eWg.bnQ();
    private final kotlin.d cGn = g.c(new ProDepositActivity$returnToParent$2(this));
    private final kotlin.d cGo = g.c(new ProDepositActivity$initSelection$2(this));
    private final Runnable cGy = new c(this);

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/deposit/pro/ProDepositActivity$Companion;", "", "()V", "ARG_INIT_SELECTION", "", "ARG_RETURN_TO_PARENT", "TAG", "kotlin.jvm.PlatformType", "app_optionXRelease"})
    /* compiled from: ProDepositActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ProDepositActivity.kt */
    static final class c implements Runnable {
        final /* synthetic */ a this$0;

        c(a aVar) {
            this.this$0 = aVar;
        }

        public final void run() {
            this.this$0.Aq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/deposit/pro/ProDepositActivity$OpenConnectionCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/deposit/pro/ProDepositActivity;", "", "activity", "(Lcom/iqoption/deposit/pro/ProDepositActivity;)V", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: ProDepositActivity.kt */
    private static final class b extends com.iqoption.system.c.b<a, Object> {
        public b(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "activity");
            super(aVar, Object.class);
        }

        /* renamed from: a */
        public void v(a aVar, Object obj) {
            kotlin.jvm.internal.i.f(aVar, "activity");
            com.iqoption.core.c.a.biN.removeCallbacks(aVar.cGy);
            aVar.Ar();
        }

        /* renamed from: a */
        public void c(a aVar, Throwable th) {
            kotlin.jvm.internal.i.f(aVar, "activity");
            kotlin.jvm.internal.i.f(th, "t");
            com.iqoption.core.c.a.biN.removeCallbacks(aVar.cGy);
            aVar.Ar();
        }
    }

    private final boolean asT() {
        kotlin.d dVar = this.cGn;
        j jVar = anY[1];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    private final l asU() {
        kotlin.d dVar = this.cGo;
        j jVar = anY[2];
        return (l) dVar.getValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ad adVar) {
        kotlin.jvm.internal.i.f(adVar, "<set-?>");
        this.bIb.a(this, anY[0], adVar);
    }

    /* Access modifiers changed, original: protected|final */
    public final ad ate() {
        return (ad) this.bIb.b(this, anY[0]);
    }

    public abstract boolean isFullScreen();

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_pro_deposit);
        kotlin.jvm.internal.i.e(contentView, "DataBindingUtil.setConte…out.activity_pro_deposit)");
        a((ad) contentView);
        if (!isFullScreen()) {
            FrameLayout frameLayout = ate().bTt;
            kotlin.jvm.internal.i.e(frameLayout, "binding.proDepositRoot");
            frameLayout.setFitsSystemWindows(true);
        }
        if (bundle == null) {
            com.iqoption.core.ui.d.c b = b.cGA.b(asU(), asT());
            getSupportFragmentManager().beginTransaction().add(R.id.proDepositContainer, b.bh(this), b.getName()).commitAllowingStateLoss();
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

    public final void Aq() {
        View findFocus = ate().getRoot().findFocus();
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

    /* Access modifiers changed, original: protected */
    public void zL() {
        super.zL();
        com.iqoption.core.d.Um().EC().a("deposit-page_back", com.iqoption.deposit.d.a.cGB.atf());
    }
}
