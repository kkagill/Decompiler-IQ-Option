package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.name.a;

/* compiled from: findClassInModule.kt */
final /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends FunctionReference implements b<a, a> {
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 fcK = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1();

    FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1() {
        super(1);
    }

    public final d RW() {
        return k.G(a.class);
    }

    public final String RX() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public final String getName() {
        return "getOuterClassId";
    }

    /* renamed from: h */
    public final a invoke(a aVar) {
        i.f(aVar, "p1");
        return aVar.bJX();
    }
}
