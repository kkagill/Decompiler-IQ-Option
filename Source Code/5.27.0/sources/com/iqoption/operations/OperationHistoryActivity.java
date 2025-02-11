package com.iqoption.operations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.iqoption.activity.b;
import com.iqoption.core.ui.d.c;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\n"}, bng = {"Lcom/iqoption/operations/OperationHistoryActivity;", "Lcom/iqoption/activity/IQFullScreenActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "Companion", "app_optionXRelease"})
/* compiled from: OperationHistoryActivity.kt */
public final class OperationHistoryActivity extends b {
    private static final String TAG = "javaClass";
    public static final a dKu = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/operations/OperationHistoryActivity$Companion;", "", "()V", "TAG", "", "startActivity", "", "activity", "Landroid/app/Activity;", "app_optionXRelease"})
    /* compiled from: OperationHistoryActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void h(Activity activity) {
            kotlin.jvm.internal.i.f(activity, "activity");
            activity.startActivity(new Intent(activity, OperationHistoryActivity.class));
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.operations_activity);
        if (bundle == null) {
            c Lj = iqoption.operationhistory.a.a.eVh.Lj();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, Lj.bh(this), Lj.getName()).commitAllowingStateLoss();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        WebSocketHandler.aTn().cj(TAG);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        WebSocketHandler.aTn().n(TAG, 30000);
        super.onStop();
    }
}
