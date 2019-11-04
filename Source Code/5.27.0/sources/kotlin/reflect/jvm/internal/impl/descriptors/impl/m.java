package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c;

/* compiled from: EmptyPackageFragmentDesciptor.kt */
public final class m extends x {
    public m(v vVar, b bVar) {
        i.f(vVar, "module");
        i.f(bVar, "fqName");
        super(vVar, bVar);
    }

    /* renamed from: bsE */
    public c bsF() {
        return c.fuD;
    }
}
