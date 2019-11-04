package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.d;
import kotlin.reflect.jvm.internal.impl.name.a;

/* compiled from: TypeDeserializer.kt */
final /* synthetic */ class TypeDeserializer$typeConstructor$1$classNestingLevel$1 extends FunctionReference implements b<a, a> {
    public static final TypeDeserializer$typeConstructor$1$classNestingLevel$1 fvO = new TypeDeserializer$typeConstructor$1$classNestingLevel$1();

    TypeDeserializer$typeConstructor$1$classNestingLevel$1() {
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
