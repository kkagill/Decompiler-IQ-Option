package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.d;

/* compiled from: JavaClassDataFinder.kt */
public final class e implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.e {
    private final l fiA;
    private final d fiB;

    public e(l lVar, d dVar) {
        i.f(lVar, "kotlinClassFinder");
        i.f(dVar, "deserializedDescriptorResolver");
        this.fiA = lVar;
        this.fiB = dVar;
    }

    public d k(a aVar) {
        i.f(aVar, "classId");
        n a = m.a(this.fiA, aVar);
        if (a == null) {
            return null;
        }
        boolean y = i.y(a.getClassId(), aVar);
        if (!m.eVC || y) {
            return this.fiB.f(a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class with incorrect id found: expected ");
        stringBuilder.append(aVar);
        stringBuilder.append(", actual ");
        stringBuilder.append(a.getClassId());
        throw new AssertionError(stringBuilder.toString());
    }
}
