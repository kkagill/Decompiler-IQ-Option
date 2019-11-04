package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.renderer.b;

/* compiled from: KotlinType.kt */
public abstract class ad extends ay {
    public abstract ad gM(boolean z);

    public abstract ad h(f fVar);

    public ad() {
        super();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (c cVar : brE()) {
            r.a(stringBuilder, "[", b.a(b.frp, cVar, null, 2, null), "] ");
        }
        stringBuilder.append(bMZ());
        if (!btD().isEmpty()) {
            u.a(btD(), stringBuilder, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (boc()) {
            stringBuilder.append("?");
        }
        String stringBuilder2 = stringBuilder.toString();
        i.e(stringBuilder2, "StringBuilder().apply(builderAction).toString()");
        return stringBuilder2;
    }
}
