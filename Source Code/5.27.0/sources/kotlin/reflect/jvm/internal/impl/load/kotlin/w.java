package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v.a;

/* compiled from: methodSignatureMapping.kt */
public final class w implements v<i> {
    public static final w fmh = new w();

    public String E(d dVar) {
        i.f(dVar, "classDescriptor");
        return null;
    }

    /* renamed from: F */
    public Void D(d dVar) {
        i.f(dVar, "classDescriptor");
        return null;
    }

    public void a(kotlin.reflect.jvm.internal.impl.types.w wVar, d dVar) {
        i.f(wVar, "kotlinType");
        i.f(dVar, "descriptor");
    }

    public boolean byN() {
        return false;
    }

    private w() {
    }

    public kotlin.reflect.jvm.internal.impl.types.w ag(kotlin.reflect.jvm.internal.impl.types.w wVar) {
        i.f(wVar, "kotlinType");
        return a.a(this, wVar);
    }

    public kotlin.reflect.jvm.internal.impl.types.w L(Collection<? extends kotlin.reflect.jvm.internal.impl.types.w> collection) {
        i.f(collection, "types");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("There should be no intersection type in existing descriptors, but found: ");
        stringBuilder.append(u.a(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(stringBuilder.toString());
    }
}
