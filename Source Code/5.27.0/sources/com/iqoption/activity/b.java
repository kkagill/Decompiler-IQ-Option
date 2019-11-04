package com.iqoption.activity;

import android.os.Bundle;
import com.iqoption.util.y;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, bng = {"Lcom/iqoption/activity/IQFullScreenActivity;", "Lcom/iqoption/activity/IQActivity;", "()V", "systemUiHider", "Lcom/iqoption/util/KeyboardUtil$SystemUiHider;", "getSystemUiHider", "()Lcom/iqoption/util/KeyboardUtil$SystemUiHider;", "setSystemUiHider", "(Lcom/iqoption/util/KeyboardUtil$SystemUiHider;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onWindowFocusChanged", "hasFocus", "", "app_optionXRelease"})
/* compiled from: IQFullScreenActivity.kt */
public abstract class b extends a {
    public com.iqoption.util.y.b aiX;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.iqoption.util.y.b m = y.m(this);
        kotlin.jvm.internal.i.e(m, "KeyboardUtil.newSystemUiHider(this)");
        this.aiX = m;
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

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        String str = "systemUiHider";
        com.iqoption.util.y.b bVar;
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
