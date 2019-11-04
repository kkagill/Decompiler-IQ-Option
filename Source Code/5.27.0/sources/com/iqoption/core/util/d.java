package com.iqoption.core.util;

import com.crashlytics.android.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/util/CrashlyticsUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "log", "", "message", "logException", "t", "", "core_release"})
/* compiled from: CrashlyticsUtils.kt */
public final class d {
    private static final String TAG = d.class.getSimpleName();
    public static final d bQm = new d();

    private d() {
    }

    public static final void d(Throwable th) {
        kotlin.jvm.internal.i.f(th, "t");
        ag(th.getMessage());
        a.d(th);
    }

    public static final void ag(String str) {
        if (str != null) {
            if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                a.ag(str);
            }
        }
    }
}
