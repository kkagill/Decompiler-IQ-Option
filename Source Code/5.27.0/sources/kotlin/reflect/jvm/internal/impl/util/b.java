package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.s;

/* compiled from: modifierChecks.kt */
public interface b {

    /* compiled from: modifierChecks.kt */
    public static final class a {
        public static String a(b bVar, s sVar) {
            i.f(sVar, "functionDescriptor");
            return !bVar.n(sVar) ? bVar.getDescription() : null;
        }
    }

    String a(s sVar);

    String getDescription();

    boolean n(s sVar);
}
