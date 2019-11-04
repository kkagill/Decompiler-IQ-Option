package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: LazyJavaStaticClassScope.kt */
final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements b<h, Set<? extends f>> {
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 fke = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    /* renamed from: b */
    public final Set<f> invoke(h hVar) {
        i.f(hVar, "it");
        return hVar.buy();
    }
}
