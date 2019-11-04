package com.iqoption.withdrawal.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.t;
import com.iqoption.core.splash.d;
import com.iqoption.e.an;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.util.v;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/withdrawal/common/WithdrawActivity;", "Lcom/iqoption/activity/IQActivity;", "()V", "binding", "Lcom/iqoption/databinding/ActivityWithdrawBinding;", "showSplashRunnable", "Ljava/lang/Runnable;", "splash", "Lcom/iqoption/core/splash/SplashFragment;", "hideSplash", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "showSplash", "Companion", "OpenConnectionCallback", "app_optionXRelease"})
/* compiled from: WithdrawActivity.kt */
public final class WithdrawActivity extends com.iqoption.activity.a {
    private static final String TAG;
    public static final a etK = new a();
    private d ajo;
    private final Runnable cGy = new c(this);
    private an etJ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/withdrawal/common/WithdrawActivity$Companion;", "", "()V", "TAG", "", "start", "", "activity", "Landroid/app/Activity;", "app_optionXRelease"})
    /* compiled from: WithdrawActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void start(Activity activity) {
            kotlin.jvm.internal.i.f(activity, "activity");
            activity.startActivity(new Intent(activity, WithdrawActivity.class));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: WithdrawActivity.kt */
    static final class c implements Runnable {
        final /* synthetic */ WithdrawActivity etL;

        c(WithdrawActivity withdrawActivity) {
            this.etL = withdrawActivity;
        }

        public final void run() {
            this.etL.Aq();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/withdrawal/common/WithdrawActivity$OpenConnectionCallback;", "Lcom/iqoption/system/future/ReferenceFutureCallback;", "Lcom/iqoption/withdrawal/common/WithdrawActivity;", "", "activity", "(Lcom/iqoption/withdrawal/common/WithdrawActivity;)V", "onFailure", "", "t", "", "onSuccess", "result", "app_optionXRelease"})
    /* compiled from: WithdrawActivity.kt */
    private static final class b extends com.iqoption.system.c.b<WithdrawActivity, Object> {
        public b(WithdrawActivity withdrawActivity) {
            kotlin.jvm.internal.i.f(withdrawActivity, "activity");
            super(withdrawActivity, Object.class);
        }

        /* renamed from: a */
        public void v(WithdrawActivity withdrawActivity, Object obj) {
            kotlin.jvm.internal.i.f(withdrawActivity, "activity");
            com.iqoption.core.c.a.biN.removeCallbacks(withdrawActivity.cGy);
            withdrawActivity.Ar();
        }

        /* renamed from: a */
        public void c(WithdrawActivity withdrawActivity, Throwable th) {
            kotlin.jvm.internal.i.f(withdrawActivity, "activity");
            kotlin.jvm.internal.i.f(th, "t");
            com.iqoption.core.c.a.biN.removeCallbacks(withdrawActivity.cGy);
            withdrawActivity.Ar();
        }
    }

    public static final void start(Activity activity) {
        etK.start(activity);
    }

    static {
        String name = WithdrawActivity.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_withdraw);
        kotlin.jvm.internal.i.e(contentView, "DataBindingUtil.setConte…layout.activity_withdraw)");
        this.etJ = (an) contentView;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.iqoption.core.splash.d.a aVar = d.bGp;
        kotlin.jvm.internal.i.e(supportFragmentManager, "fm");
        this.ajo = aVar.a(supportFragmentManager, R.id.splashContainer, false);
        if (supportFragmentManager.findFragmentByTag(a.etI.Bx()) == null) {
            com.iqoption.core.ui.d.c Lj = a.etI.Lj();
            supportFragmentManager.beginTransaction().add(R.id.withdrawContainer, Lj.bh(this), Lj.getName()).commitAllowingStateLoss();
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
        an anVar = this.etJ;
        if (anVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View findFocus = anVar.getRoot().findFocus();
        if (findFocus != null) {
            findFocus.clearFocus();
        }
        d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.show();
        if (VERSION.SDK_INT >= 21) {
            getWindow().clearFlags(Integer.MIN_VALUE);
            if (VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                String str = "window";
                kotlin.jvm.internal.i.e(window, str);
                findFocus = window.getDecorView();
                String str2 = "window.decorView";
                kotlin.jvm.internal.i.e(findFocus, str2);
                int systemUiVisibility = findFocus.getSystemUiVisibility() ^ 8192;
                Window window2 = getWindow();
                kotlin.jvm.internal.i.e(window2, str);
                View decorView = window2.getDecorView();
                kotlin.jvm.internal.i.e(decorView, str2);
                decorView.setSystemUiVisibility(systemUiVisibility);
            }
        }
    }

    public final void Ar() {
        d dVar = this.ajo;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("splash");
        }
        dVar.hide();
        if (VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            if (VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                String str = "window";
                kotlin.jvm.internal.i.e(window, str);
                View decorView = window.getDecorView();
                String str2 = "window.decorView";
                kotlin.jvm.internal.i.e(decorView, str2);
                int systemUiVisibility = decorView.getSystemUiVisibility() | 8192;
                Window window2 = getWindow();
                kotlin.jvm.internal.i.e(window2, str);
                View decorView2 = window2.getDecorView();
                kotlin.jvm.internal.i.e(decorView2, str2);
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
    }
}
