package kotlin.reflect.jvm.internal.impl.metadata.a;

import kotlin.jvm.internal.i;

/* compiled from: versionSpecificBehavior.kt */
public final class l {
    public static final boolean c(a aVar) {
        i.f(aVar, "version");
        return d(aVar);
    }

    public static final boolean d(a aVar) {
        i.f(aVar, "version");
        return aVar.getMajor() == 1 && aVar.getMinor() >= 4;
    }
}
