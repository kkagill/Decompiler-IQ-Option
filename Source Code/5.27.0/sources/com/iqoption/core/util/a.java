package com.iqoption.core.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build.VERSION;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/util/ActivityUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "finish", "", "activity", "Landroid/app/Activity;", "navigateToParent", "extras", "Landroid/os/Bundle;", "safeStartActivity", "from", "intent", "Landroid/content/Intent;", "core_release"})
/* compiled from: ActivityUtils.kt */
public final class a {
    private static final String TAG = a.class.getSimpleName();
    public static final a bQc = new a();

    private a() {
    }

    public static final void a(Activity activity, Intent intent) {
        kotlin.jvm.internal.i.f(activity, "from");
        kotlin.jvm.internal.i.f(intent, "intent");
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("safeStartActivity");
            stringBuilder.append(intent.toString());
            d.ag(stringBuilder.toString());
            d.d(e);
        }
    }

    public static final void i(Activity activity) {
        kotlin.jvm.internal.i.f(activity, "activity");
        if ((VERSION.SDK_INT >= 21 ? 1 : null) != null) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }
}
