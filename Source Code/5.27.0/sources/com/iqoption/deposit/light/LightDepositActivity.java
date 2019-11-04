package com.iqoption.deposit.light;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityOptionsCompat;
import com.iqoption.core.util.ag;
import com.iqoption.deposit.l;
import com.iqoption.util.y;
import com.iqoption.util.y.b;
import com.iqoption.x.R;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\"\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/deposit/light/LightDepositActivity;", "Lcom/iqoption/deposit/pro/ProDepositActivity;", "()V", "allowedOrientation", "", "getAllowedOrientation", "()I", "allowedOrientation$delegate", "Lkotlin/Lazy;", "googlePayResultHandler", "Lcom/iqoption/deposit/wallet/GooglePayResultHandler;", "getGooglePayResultHandler", "()Lcom/iqoption/deposit/wallet/GooglePayResultHandler;", "googlePayResultHandler$delegate", "systemUiHider", "Lcom/iqoption/util/KeyboardUtil$SystemUiHider;", "finish", "", "isFullScreen", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onWindowFocusChanged", "hasFocus", "prepareWindow", "Companion", "app_optionXRelease"})
/* compiled from: LightDepositActivity.kt */
public final class LightDepositActivity extends com.iqoption.deposit.pro.a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(LightDepositActivity.class), "allowedOrientation", "getAllowedOrientation()I")), k.a(new PropertyReference1Impl(k.G(LightDepositActivity.class), "googlePayResultHandler", "getGooglePayResultHandler()Lcom/iqoption/deposit/wallet/GooglePayResultHandler;"))};
    public static final a cEx = new a();
    private b aiX;
    private final d cEv = g.c(new LightDepositActivity$allowedOrientation$2(this));
    private final d cEw = g.c(LightDepositActivity$googlePayResultHandler$2.cEy);

    @i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/deposit/light/LightDepositActivity$Companion;", "", "()V", "ARG_ALLOWED_ORIENTATION", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "allowedOrientation", "", "returnToParent", "", "selectOption", "Lcom/iqoption/deposit/InitSelectOption;", "start", "", "activity", "Landroid/app/Activity;", "app_optionXRelease"})
    /* compiled from: LightDepositActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void a(Activity activity, int i, boolean z, l lVar) {
            kotlin.jvm.internal.i.f(activity, "activity");
            try {
                ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(activity, R.anim.slide_in_right, R.anim.slide_out_left);
                kotlin.jvm.internal.i.e(makeCustomAnimation, "ActivityOptionsCompat.ma…t, R.anim.slide_out_left)");
                activity.startActivity(a((Context) activity, i, z, lVar), makeCustomAnimation.toBundle());
            } catch (Throwable th) {
                com.crashlytics.android.a.d(th);
            }
        }

        private final Intent a(Context context, int i, boolean z, l lVar) {
            Intent intent = new Intent(context, LightDepositActivity.class);
            intent.putExtra("ARG_ALLOWED_ORIENTATION", i);
            intent.putExtra("ARG_RETURN_TO_PARENT", z);
            if (lVar != null) {
                intent.putExtra("ARG_INIT_SELECTION", lVar);
            }
            return intent;
        }
    }

    private final int aol() {
        d dVar = this.cEv;
        j jVar = anY[0];
        return ((Number) dVar.getValue()).intValue();
    }

    private final com.iqoption.deposit.e.a arD() {
        d dVar = this.cEw;
        j jVar = anY[1];
        return (com.iqoption.deposit.e.a) dVar.getValue();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        arE();
        super.onCreate(bundle);
        ate().bTs.setBackgroundColor(com.iqoption.core.ext.a.k((Context) this, (int) R.color.deposit_grey));
        setRequestedOrientation(aol());
    }

    private final void arE() {
        String str = "window.decorView";
        String str2 = "window";
        Window window;
        View decorView;
        if (isFullScreen()) {
            getWindow().setFlags(1024, 1024);
            window = getWindow();
            kotlin.jvm.internal.i.e(window, str2);
            decorView = window.getDecorView();
            kotlin.jvm.internal.i.e(decorView, str);
            decorView.setSystemUiVisibility(1280);
            b m = y.m(this);
            m.JN();
            m.register();
            this.aiX = m;
            return;
        }
        getWindow().clearFlags(1024);
        window = getWindow();
        kotlin.jvm.internal.i.e(window, str2);
        decorView = window.getDecorView();
        kotlin.jvm.internal.i.e(decorView, str);
        decorView.setSystemUiVisibility(256);
        this.aiX = (b) null;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b bVar = this.aiX;
        if (bVar == null) {
            return;
        }
        if (z) {
            bVar.register();
        } else {
            bVar.unregister();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!arD().a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    /* Access modifiers changed, original: protected */
    public boolean isFullScreen() {
        return ag.a(getResources());
    }
}
