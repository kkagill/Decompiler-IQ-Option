package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.i;
import kotlin.reflect.j;

/* compiled from: storage.kt */
public final class g {
    public static final <T> T a(e<? extends T> eVar, Object obj, j<?> jVar) {
        i.f(eVar, "$this$getValue");
        i.f(jVar, "p");
        return eVar.invoke();
    }

    public static final <T> T a(f<? extends T> fVar, Object obj, j<?> jVar) {
        i.f(fVar, "$this$getValue");
        i.f(jVar, "p");
        return fVar.invoke();
    }
}
