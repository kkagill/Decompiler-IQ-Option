package com.iqoption.verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.BackStackEntry;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.cardsverification.f;
import com.iqoption.core.splash.d;
import com.iqoption.e.aj;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0014J\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/verify/VerifyCardsActivity;", "Lcom/iqoption/core/ui/activity/IQActivity;", "()V", "binding", "Lcom/iqoption/databinding/ActivityVerifyCardsBinding;", "showSplashRunnable", "Ljava/lang/Runnable;", "splash", "Lcom/iqoption/core/splash/SplashFragment;", "hideSplash", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "showSplash", "Companion", "OpenConnectionCallback", "app_optionXRelease"})
/* compiled from: VerifyCardsActivity.kt */
public final class VerifyCardsActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG;
    public static final a ecj = new a();
    private d ajo;
    private final Runnable cGy = new c(this);
    private aj eci;

    @i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/verify/VerifyCardsActivity$Companion;", "", "()V", "ARG_CARD", "", "ARG_REFRESH_DESCRIPTION", "TAG", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "refreshDescription", "", "start", "", "startForResult", "fragment", "Landroidx/fragment/app/Fragment;", "requestCode", "", "app_optionXRelease"})
    /* compiled from: VerifyCardsActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ void a(a aVar, Context context, com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                cVar = (com.iqoption.core.microservices.billing.verification.response.c) null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.a(context, cVar, z);
        }

        public final void a(Context context, com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
            kotlin.jvm.internal.i.f(context, "context");
            context.startActivity(b(context, cVar, z));
        }

        private final Intent b(Context context, com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
            Intent intent = new Intent(context, VerifyCardsActivity.class);
            if (cVar != null) {
                intent.putExtra("ARG_CARD", cVar);
            }
            intent.putExtra("ARG_REFRESH_DESCRIPTION", z);
            return intent;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: VerifyCardsActivity.kt */
    static final class c implements Runnable {
        final /* synthetic */ VerifyCardsActivity eck;

        c(VerifyCardsActivity verifyCardsActivity) {
            this.eck = verifyCardsActivity;
        }

        public final void run() {
            this.eck.Aq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/verify/VerifyCardsActivity$OpenConnectionCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/verify/VerifyCardsActivity;", "", "activity", "(Lcom/iqoption/verify/VerifyCardsActivity;)V", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: VerifyCardsActivity.kt */
    private static final class b extends com.iqoption.system.c.b<VerifyCardsActivity, Object> {
        public b(VerifyCardsActivity verifyCardsActivity) {
            kotlin.jvm.internal.i.f(verifyCardsActivity, "activity");
            super(verifyCardsActivity, Object.class);
        }

        /* renamed from: a */
        public void v(VerifyCardsActivity verifyCardsActivity, Object obj) {
            kotlin.jvm.internal.i.f(verifyCardsActivity, "activity");
            com.iqoption.core.c.a.biN.removeCallbacks(verifyCardsActivity.cGy);
            verifyCardsActivity.Ar();
        }

        /* renamed from: a */
        public void c(VerifyCardsActivity verifyCardsActivity, Throwable th) {
            kotlin.jvm.internal.i.f(verifyCardsActivity, "activity");
            kotlin.jvm.internal.i.f(th, "t");
            com.iqoption.core.c.a.biN.removeCallbacks(verifyCardsActivity.cGy);
            verifyCardsActivity.Ar();
        }
    }

    public static final void a(Context context, com.iqoption.core.microservices.billing.verification.response.c cVar) {
        a.a(ecj, context, cVar, false, 4, null);
    }

    public static final void a(Context context, com.iqoption.core.microservices.billing.verification.response.c cVar, boolean z) {
        ecj.a(context, cVar, z);
    }

    public static final void bA(Context context) {
        a.a(ecj, context, null, false, 6, null);
    }

    static {
        String name = VerifyCardsActivity.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_verify_cards);
        kotlin.jvm.internal.i.e(contentView, "DataBindingUtil.setConte…ut.activity_verify_cards)");
        this.eci = (aj) contentView;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.iqoption.core.splash.d.a aVar = d.bGp;
        kotlin.jvm.internal.i.e(supportFragmentManager, "fm");
        this.ajo = aVar.a(supportFragmentManager, R.id.splashContainer, false);
        if (supportFragmentManager.findFragmentByTag(com.iqoption.cardsverification.b.aAo.Bx()) == null) {
            com.iqoption.core.ui.d.c b = f.aAt.b((com.iqoption.core.microservices.billing.verification.response.c) getIntent().getParcelableExtra("ARG_CARD"), getIntent().getBooleanExtra("ARG_REFRESH_DESCRIPTION", false));
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, b.bh(this), b.getName()).commitAllowingStateLoss();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        t cj = WebSocketHandler.aTn().cj(TAG);
        com.iqoption.core.c.a.biN.postDelayed(this.cGy, 1000);
        v.a(cj, (o) new b(this));
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onStop();
    }

    public final void Aq() {
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

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.i.e(supportFragmentManager, "fm");
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            BackStackEntry backStackEntryAt = supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1);
            kotlin.jvm.internal.i.e(backStackEntryAt, "fm.getBackStackEntryAt(fm.backStackEntryCount - 1)");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(backStackEntryAt.getName());
            if (findFragmentByTag != null && (findFragmentByTag instanceof com.iqoption.view.b.a) && ((com.iqoption.view.b.a) findFragmentByTag).onBackPressed()) {
                return;
            }
        }
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            kotlin.jvm.internal.i.e(fragment, "fragment");
            if (fragment.isVisible() && (fragment instanceof com.iqoption.view.b.a) && ((com.iqoption.view.b.a) fragment).onBackPressed()) {
                return;
            }
        }
        super.onBackPressed();
    }
}
