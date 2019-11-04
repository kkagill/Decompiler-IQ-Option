package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.i;

/* compiled from: exceptionUtils.kt */
public final class c {
    public static final RuntimeException j(Throwable th) {
        i.f(th, "e");
        throw th;
    }

    public static final boolean aq(Throwable th) {
        i.f(th, "$this$isProcessCanceledException");
        Class cls = th.getClass();
        while (!i.y(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
