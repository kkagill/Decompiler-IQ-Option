package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class x extends k implements y {
    private final b fdF;

    public final b btB() {
        return this.fdF;
    }

    public x(v vVar, b bVar) {
        i.f(vVar, "module");
        i.f(bVar, "fqName");
        super(vVar, f.fdA.bug(), bVar.bKd(), aj.fcV);
        this.fdF = bVar;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        i.f(mVar, "visitor");
        return mVar.a((y) this, (Object) d);
    }

    /* renamed from: btA */
    public v brj() {
        k brj = super.brj();
        if (brj != null) {
            return (v) brj;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }

    public aj brF() {
        aj ajVar = aj.fcV;
        i.e(ajVar, "SourceElement.NO_SOURCE");
        return ajVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package ");
        stringBuilder.append(this.fdF);
        return stringBuilder.toString();
    }
}
