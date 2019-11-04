package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: LazyJavaClassMemberScope.kt */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReference implements b<f, Collection<? extends ai>> {
    LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(g gVar) {
        super(1, gVar);
    }

    public final d RW() {
        return k.G(g.class);
    }

    public final String RX() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    public final String getName() {
        return "searchMethodsInSupertypesWithoutBuiltinMagic";
    }

    /* renamed from: h */
    public final Collection<ai> invoke(f fVar) {
        i.f(fVar, "p1");
        return ((g) this.receiver).v(fVar);
    }
}
