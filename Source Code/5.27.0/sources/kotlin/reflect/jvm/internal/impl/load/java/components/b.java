package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: JavaAnnotationMapper.kt */
public class b implements c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    private final kotlin.reflect.jvm.internal.impl.name.b fdF;
    private final aj fdu;
    private final e fhQ;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.b fhR;

    /* renamed from: bvI */
    public ad bpT() {
        return (ad) g.a(this.fhQ, (Object) this, anY[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    public b(kotlin.reflect.jvm.internal.impl.load.java.lazy.h r2, kotlin.reflect.jvm.internal.impl.load.java.structure.a r3, kotlin.reflect.jvm.internal.impl.name.b r4) {
        /*
        r1 = this;
        r0 = "c";
        kotlin.jvm.internal.i.f(r2, r0);
        r0 = "fqName";
        kotlin.jvm.internal.i.f(r4, r0);
        r1.<init>();
        r1.fdF = r4;
        if (r3 == 0) goto L_0x0025;
    L_0x0011:
        r4 = r2.bwl();
        r4 = r4.bvX();
        r0 = r3;
        r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.l) r0;
        r4 = r4.a(r0);
        if (r4 == 0) goto L_0x0025;
    L_0x0022:
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.aj) r4;
        goto L_0x002c;
    L_0x0025:
        r4 = kotlin.reflect.jvm.internal.impl.descriptors.aj.fcV;
        r0 = "SourceElement.NO_SOURCE";
        kotlin.jvm.internal.i.e(r4, r0);
    L_0x002c:
        r1.fdu = r4;
        r4 = r2.bqz();
        r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2;
        r0.<init>(r1, r2);
        r0 = (kotlin.jvm.a.a) r0;
        r2 = r4.f(r0);
        r1.fhQ = r2;
        if (r3 == 0) goto L_0x0050;
    L_0x0041:
        r2 = r3.bxf();
        if (r2 == 0) goto L_0x0050;
    L_0x0047:
        r2 = (java.lang.Iterable) r2;
        r2 = kotlin.collections.u.K(r2);
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.b) r2;
        goto L_0x0051;
    L_0x0050:
        r2 = 0;
    L_0x0051:
        r1.fhR = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.b.<init>(kotlin.reflect.jvm.internal.impl.load.java.lazy.h, kotlin.reflect.jvm.internal.impl.load.java.structure.a, kotlin.reflect.jvm.internal.impl.name.b):void");
    }

    public kotlin.reflect.jvm.internal.impl.name.b btB() {
        return this.fdF;
    }

    public aj brF() {
        return this.fdu;
    }

    /* Access modifiers changed, original: protected|final */
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.b bvJ() {
        return this.fhR;
    }

    public Map<f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> buf() {
        return af.emptyMap();
    }
}
