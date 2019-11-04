package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.load.java.a.a;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;
import kotlin.reflect.jvm.internal.impl.load.java.structure.o;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.p;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class e implements c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), k.a(new PropertyReference1Impl(k.G(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), k.a(new PropertyReference1Impl(k.G(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.e fhQ = this.fiV.bqz().f(new LazyJavaAnnotationDescriptor$type$2(this));
    private final h fiV;
    private final kotlin.reflect.jvm.internal.impl.storage.e fii = this.fiV.bqz().f(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
    private final f fjs = this.fiV.bqz().g(new LazyJavaAnnotationDescriptor$fqName$2(this));
    private final a fjt = this.fiV.bwl().bvX().a(this.fju);
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.a fju;

    public b btB() {
        return (b) g.a(this.fjs, (Object) this, anY[0]);
    }

    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> buf() {
        return (Map) g.a(this.fii, (Object) this, anY[2]);
    }

    /* renamed from: bvI */
    public ad bpT() {
        return (ad) g.a(this.fhQ, (Object) this, anY[1]);
    }

    public e(h hVar, kotlin.reflect.jvm.internal.impl.load.java.structure.a aVar) {
        i.f(hVar, "c");
        i.f(aVar, "javaAnnotation");
        this.fiV = hVar;
        this.fju = aVar;
    }

    /* renamed from: bwu */
    public a brF() {
        return this.fjt;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b(kotlin.reflect.jvm.internal.impl.load.java.structure.b bVar) {
        if (bVar instanceof o) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.h.ftB.dQ(((o) bVar).getValue());
        }
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            return a(mVar.bxx(), mVar.bxy());
        } else if (bVar instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.e) {
            kotlin.reflect.jvm.internal.impl.name.f bsZ = bVar.bsZ();
            if (bsZ == null) {
                bsZ = n.fhm;
                i.e(bsZ, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            return a(bsZ, ((kotlin.reflect.jvm.internal.impl.load.java.structure.e) bVar).bxj());
        } else if (bVar instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.c) {
            return b(((kotlin.reflect.jvm.internal.impl.load.java.structure.c) bVar).bxh());
        } else {
            return bVar instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.h ? a(((kotlin.reflect.jvm.internal.impl.load.java.structure.h) bVar).bxr()) : null;
        }
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b(kotlin.reflect.jvm.internal.impl.load.java.structure.a aVar) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.a(new e(this.fiV, aVar));
    }

    /* JADX WARNING: Missing block: B:10:0x0027, code skipped:
            if (r3 != null) goto L_0x0048;
     */
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(kotlin.reflect.jvm.internal.impl.name.f r3, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.b> r4) {
        /*
        r2 = this;
        r0 = r2.bpT();
        r1 = "type";
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (kotlin.reflect.jvm.internal.impl.types.w) r0;
        r0 = kotlin.reflect.jvm.internal.impl.types.y.aJ(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        r3 = 0;
        return r3;
    L_0x0014:
        r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m(r2);
        if (r0 != 0) goto L_0x001d;
    L_0x001a:
        kotlin.jvm.internal.i.bnJ();
    L_0x001d:
        r3 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(r3, r0);
        if (r3 == 0) goto L_0x002a;
    L_0x0023:
        r3 = r3.bpT();
        if (r3 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0048;
    L_0x002a:
        r3 = r2.fiV;
        r3 = r3.bwl();
        r3 = r3.bql();
        r3 = r3.btw();
        r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        r1 = "Unknown array element type";
        r1 = kotlin.reflect.jvm.internal.impl.types.p.mK(r1);
        r1 = (kotlin.reflect.jvm.internal.impl.types.w) r1;
        r3 = r3.a(r0, r1);
        r3 = (kotlin.reflect.jvm.internal.impl.types.w) r3;
    L_0x0048:
        r0 = "DescriptorResolverUtils.…e\")\n                    )";
        kotlin.jvm.internal.i.e(r3, r0);
        r4 = (java.lang.Iterable) r4;
        r0 = new java.util.ArrayList;
        r1 = 10;
        r1 = kotlin.collections.n.e(r4, r1);
        r0.<init>(r1);
        r0 = (java.util.Collection) r0;
        r4 = r4.iterator();
    L_0x0060:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x007e;
    L_0x0066:
        r1 = r4.next();
        r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.b) r1;
        r1 = r2.b(r1);
        if (r1 == 0) goto L_0x0073;
    L_0x0072:
        goto L_0x007a;
    L_0x0073:
        r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.r;
        r1.<init>();
        r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r1;
    L_0x007a:
        r0.add(r1);
        goto L_0x0060;
    L_0x007e:
        r0 = (java.util.List) r0;
        r4 = kotlin.reflect.jvm.internal.impl.resolve.constants.h.ftB;
        r3 = r4.a(r0, r3);
        r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r3;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.a(kotlin.reflect.jvm.internal.impl.name.f, java.util.List):kotlin.reflect.jvm.internal.impl.resolve.constants.g");
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(kotlin.reflect.jvm.internal.impl.name.a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return (aVar == null || fVar == null) ? null : new kotlin.reflect.jvm.internal.impl.resolve.constants.j(aVar, fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(v vVar) {
        return p.ftG.at(this.fiV.bwk().a(vVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c.a(TypeUsage.COMMON, false, null, 3, null)));
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.b.a(kotlin.reflect.jvm.internal.impl.renderer.b.frn, this, null, 2, null);
    }

    private final d p(b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.v bql = this.fiV.bql();
        kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(bVar);
        i.e(s, "ClassId.topLevel(fqName)");
        return r.a(bql, s, this.fiV.bwl().bvS().bys().bOf());
    }
}
