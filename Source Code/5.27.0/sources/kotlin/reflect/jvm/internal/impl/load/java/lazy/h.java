package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b;

/* compiled from: context.kt */
public final class h {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(h.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};
    private final d fiY = this.fjc;
    private final b fiZ = new b(this, this.fjb);
    private final b fja;
    private final m fjb;
    private final d<d> fjc;

    public final d bwj() {
        d dVar = this.fiY;
        j jVar = anY[0];
        return (d) dVar.getValue();
    }

    public h(b bVar, m mVar, d<d> dVar) {
        i.f(bVar, "components");
        i.f(mVar, "typeParameterResolver");
        i.f(dVar, "delegateForDefaultTypeQualifiers");
        this.fja = bVar;
        this.fjb = mVar;
        this.fjc = dVar;
    }

    public final b bwl() {
        return this.fja;
    }

    public final m bwm() {
        return this.fjb;
    }

    public final d<d> bwn() {
        return this.fjc;
    }

    public final b bwk() {
        return this.fiZ;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.h bqz() {
        return this.fja.bqz();
    }

    public final v bql() {
        return this.fja.bql();
    }
}
