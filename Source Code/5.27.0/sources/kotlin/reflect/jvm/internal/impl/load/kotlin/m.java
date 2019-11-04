package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.name.a;

/* compiled from: KotlinClassFinder.kt */
public final class m {
    public static final n a(l lVar, a aVar) {
        i.f(lVar, "$this$findKotlinClass");
        i.f(aVar, "classId");
        l.a a = lVar.a(aVar);
        return a != null ? a.byI() : null;
    }

    public static final n a(l lVar, g gVar) {
        i.f(lVar, "$this$findKotlinClass");
        i.f(gVar, "javaClass");
        l.a a = lVar.a(gVar);
        return a != null ? a.byI() : null;
    }
}
