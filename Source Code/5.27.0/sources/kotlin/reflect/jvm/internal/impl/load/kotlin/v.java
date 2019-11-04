package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: typeSignatureMapping.kt */
public interface v<T> {

    /* compiled from: typeSignatureMapping.kt */
    public static final class a {
        public static <T> w a(v<? extends T> vVar, w wVar) {
            i.f(wVar, "kotlinType");
            return null;
        }
    }

    T D(d dVar);

    String E(d dVar);

    w L(Collection<w> collection);

    void a(w wVar, d dVar);

    w ag(w wVar);

    boolean byN();
}
