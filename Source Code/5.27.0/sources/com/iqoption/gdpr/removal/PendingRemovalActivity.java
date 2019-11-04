package com.iqoption.gdpr.removal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.iqoption.gdpr.removal.a.c;
import com.iqoption.util.y;
import com.iqoption.util.y.b;
import com.iqoption.x.R;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/iqoption/gdpr/removal/PendingRemovalDialog$OnPendingRemovalCloseListener;", "()V", "isFullScreen", "", "()Z", "isFullScreen$delegate", "Lkotlin/Lazy;", "systemUiHider", "Lcom/iqoption/util/KeyboardUtil$SystemUiHider;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPendingRemovalClose", "onWindowFocusChanged", "hasFocus", "Companion", "app_optionXRelease"})
/* compiled from: PendingRemovalActivity.kt */
public final class PendingRemovalActivity extends AppCompatActivity implements c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(PendingRemovalActivity.class), "isFullScreen", "isFullScreen()Z"))};
    public static final a drd = new a();
    private b aiX;
    private final d drc = g.c(new PendingRemovalActivity$isFullScreen$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/gdpr/removal/PendingRemovalActivity$Companion;", "", "()V", "ARG_FLAGS", "", "ARG_FULL_SCREEN", "ARG_ORIENTATION", "start", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_optionXRelease"})
    /* compiled from: PendingRemovalActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void v(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            Intent intent = new Intent(fragmentActivity, PendingRemovalActivity.class);
            intent.putExtra("ARG_ORIENTATION", fragmentActivity.getRequestedOrientation());
            intent.putExtra("ARG_FULL_SCREEN", fragmentActivity instanceof com.iqoption.activity.b);
            Window window = fragmentActivity.getWindow();
            kotlin.jvm.internal.i.e(window, "activity.window");
            intent.putExtra("ARG_FLAGS", window.getAttributes().flags);
            fragmentActivity.startActivity(intent);
        }
    }

    private final boolean isFullScreen() {
        d dVar = this.drc;
        j jVar = anY[0];
        return ((Boolean) dVar.getValue()).booleanValue();
    }

    public static final void v(FragmentActivity fragmentActivity) {
        drd.v(fragmentActivity);
    }

    public void onBackPressed() {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (isFullScreen()) {
            String str = "systemUiHider";
            b bVar;
            if (z) {
                bVar = this.aiX;
                if (bVar == null) {
                    kotlin.jvm.internal.i.lG(str);
                }
                bVar.register();
                return;
            }
            bVar = this.aiX;
            if (bVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            bVar.unregister();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(getIntent().getIntExtra("ARG_ORIENTATION", 0));
        int intExtra = getIntent().getIntExtra("ARG_FLAGS", 0);
        getWindow().setFlags(intExtra, 1024);
        getWindow().setFlags(intExtra, 134217728);
        super.onCreate(bundle);
        Activity activity = this;
        b m = y.m(activity);
        kotlin.jvm.internal.i.e(m, "KeyboardUtil.newSystemUiHider(this)");
        this.aiX = m;
        if (isFullScreen()) {
            m = this.aiX;
            String str = "systemUiHider";
            if (m == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            m.JN();
            m = this.aiX;
            if (m == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            m.register();
        }
        DataBindingUtil.setContentView(activity, R.layout.activity_pending_removal);
        if (bundle == null) {
            a.drh.p(this);
        }
    }

    public void aIs() {
        finish();
    }
}
