package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.m;
import kotlin.reflect.jvm.internal.impl.load.java.structure.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import kotlin.reflect.jvm.internal.impl.load.java.structure.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: JavaTypeResolver.kt */
public final class b {
    private final h fiV;
    private final m fjb;

    public b(h hVar, m mVar) {
        i.f(hVar, "c");
        i.f(mVar, "typeParameterResolver");
        this.fiV = hVar;
        this.fjb = mVar;
    }

    public final w a(v vVar, a aVar) {
        i.f(vVar, "javaType");
        i.f(aVar, "attr");
        if (vVar instanceof u) {
            Object b;
            PrimitiveType bxJ = ((u) vVar).bxJ();
            if (bxJ != null) {
                b = this.fiV.bql().btw().b(bxJ);
            } else {
                b = this.fiV.bql().btw().bqX();
            }
            i.e(b, "if (primitiveType != nul….module.builtIns.unitType");
            return (w) b;
        } else if (vVar instanceof j) {
            return a((j) vVar, aVar);
        } else {
            if (vVar instanceof f) {
                return a(this, (f) vVar, aVar, false, 4, null);
            } else if (vVar instanceof z) {
                vVar = ((z) vVar).bxM();
                if (vVar != null) {
                    w a = a(vVar, aVar);
                    if (a != null) {
                        return a;
                    }
                }
                ad bqO = this.fiV.bql().btw().bqO();
                i.e(bqO, "c.module.builtIns.defaultBound");
                return bqO;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported type: ");
                stringBuilder.append(vVar);
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }

    public static /* synthetic */ w a(b bVar, f fVar, a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return bVar.a(fVar, aVar, z);
    }

    public final w a(f fVar, a aVar, boolean z) {
        i.f(fVar, "arrayType");
        i.f(aVar, "attr");
        v bxk = fVar.bxk();
        u uVar = (u) (!(bxk instanceof u) ? null : bxk);
        PrimitiveType bxJ = uVar != null ? uVar.bxJ() : null;
        ad c;
        w wVar;
        if (bxJ != null) {
            c = this.fiV.bql().btw().c(bxJ);
            i.e(c, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            if (aVar.bxa()) {
                wVar = c;
            } else {
                wVar = x.a(c, c.gM(true));
            }
            return wVar;
        }
        wVar = a(bxk, c.a(TypeUsage.COMMON, aVar.bxa(), null, 2, null));
        if (aVar.bxa()) {
            c = this.fiV.bql().btw().a(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, wVar);
            i.e(c, "c.module.builtIns.getArr…ctionKind, componentType)");
            return c;
        }
        ad a = this.fiV.bql().btw().a(Variance.INVARIANT, wVar);
        i.e(a, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return x.a(a, this.fiV.bql().btw().a(Variance.OUT_VARIANCE, wVar).gM(true));
    }

    private final w a(j jVar, a aVar) {
        JavaTypeResolver$transformJavaClassifierType$1 javaTypeResolver$transformJavaClassifierType$1 = new JavaTypeResolver$transformJavaClassifierType$1(jVar);
        Object obj = (aVar.bxa() || aVar.bwY() == TypeUsage.SUPERTYPE) ? null : 1;
        boolean bxu = jVar.bxu();
        ad a;
        if (bxu || obj != null) {
            ad a2 = a(jVar, aVar.a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (a2 == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            a = a(jVar, aVar.a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), a2);
            if (a == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            w fVar;
            if (bxu) {
                fVar = new f(a2, a);
            } else {
                fVar = x.a(a2, a);
            }
            return fVar;
        }
        a = a(jVar, aVar, null);
        if (a == null) {
            a = javaTypeResolver$transformJavaClassifierType$1.invoke();
        }
        return a;
    }

    /* JADX WARNING: Missing block: B:2:0x0006, code skipped:
            if (r0 != null) goto L_0x0015;
     */
    private final kotlin.reflect.jvm.internal.impl.types.ad a(kotlin.reflect.jvm.internal.impl.load.java.structure.j r5, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r6, kotlin.reflect.jvm.internal.impl.types.ad r7) {
        /*
        r4 = this;
        if (r7 == 0) goto L_0x0009;
    L_0x0002:
        r0 = r7.brE();
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0015;
    L_0x0009:
        r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.e;
        r1 = r4.fiV;
        r2 = r5;
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.d) r2;
        r0.<init>(r1, r2);
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.f) r0;
    L_0x0015:
        r1 = r4.b(r5, r6);
        r2 = 0;
        if (r1 == 0) goto L_0x0043;
    L_0x001c:
        r3 = r4.a(r6);
        if (r7 == 0) goto L_0x0026;
    L_0x0022:
        r2 = r7.bMZ();
    L_0x0026:
        r2 = kotlin.jvm.internal.i.y(r2, r1);
        if (r2 == 0) goto L_0x003a;
    L_0x002c:
        r2 = r5.bxu();
        if (r2 != 0) goto L_0x003a;
    L_0x0032:
        if (r3 == 0) goto L_0x003a;
    L_0x0034:
        r5 = 1;
        r5 = r7.gM(r5);
        return r5;
    L_0x003a:
        r5 = r4.a(r5, r6, r1);
        r5 = kotlin.reflect.jvm.internal.impl.types.x.c(r0, r1, r5, r3);
        return r5;
    L_0x0043:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(kotlin.reflect.jvm.internal.impl.load.java.structure.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a, kotlin.reflect.jvm.internal.impl.types.ad):kotlin.reflect.jvm.internal.impl.types.ad");
    }

    /* JADX WARNING: Missing block: B:11:0x002e, code skipped:
            if (r5 != null) goto L_0x0063;
     */
    private final kotlin.reflect.jvm.internal.impl.types.an b(kotlin.reflect.jvm.internal.impl.load.java.structure.j r4, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r5) {
        /*
        r3 = this;
        r0 = r4.bxs();
        if (r0 == 0) goto L_0x007d;
    L_0x0006:
        r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.g;
        if (r1 == 0) goto L_0x004f;
    L_0x000a:
        r1 = r0;
        r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.g) r1;
        r2 = r1.btB();
        if (r2 == 0) goto L_0x0036;
    L_0x0013:
        r5 = r3.a(r4, r5, r2);
        if (r5 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0028;
    L_0x001a:
        r5 = r3.fiV;
        r5 = r5.bwl();
        r5 = r5.bvY();
        r5 = r5.b(r1);
    L_0x0028:
        if (r5 == 0) goto L_0x0031;
    L_0x002a:
        r5 = r5.brm();
        if (r5 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0063;
    L_0x0031:
        r5 = r3.a(r4);
        goto L_0x0063;
    L_0x0036:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Class type should have a FQ name: ";
        r4.append(r5);
        r4.append(r0);
        r4 = r4.toString();
        r5 = new java.lang.AssertionError;
        r5.<init>(r4);
        r5 = (java.lang.Throwable) r5;
        throw r5;
    L_0x004f:
        r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.w;
        if (r4 == 0) goto L_0x0064;
    L_0x0053:
        r4 = r3.fjb;
        r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.w) r0;
        r4 = r4.a(r0);
        if (r4 == 0) goto L_0x0062;
    L_0x005d:
        r5 = r4.brm();
        goto L_0x0063;
    L_0x0062:
        r5 = 0;
    L_0x0063:
        return r5;
    L_0x0064:
        r4 = new java.lang.IllegalStateException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "Unknown classifier kind: ";
        r5.append(r1);
        r5.append(r0);
        r5 = r5.toString();
        r4.<init>(r5);
        r4 = (java.lang.Throwable) r4;
        throw r4;
    L_0x007d:
        r4 = r3.a(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(kotlin.reflect.jvm.internal.impl.load.java.structure.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a):kotlin.reflect.jvm.internal.impl.types.an");
    }

    private final an a(j jVar) {
        a s = a.s(new kotlin.reflect.jvm.internal.impl.name.b(jVar.bxv()));
        i.e(s, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        an brm = this.fiV.bwl().bvS().bys().bOf().a(s, l.listOf(Integer.valueOf(0))).brm();
        i.e(brm, "c.components.deserialize…istOf(0)).typeConstructor");
        return brm;
    }

    private final d a(j jVar, a aVar, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (aVar.bxa() && i.y(bVar, c.fkr)) {
            return this.fiV.bwl().bwb().bqI();
        }
        c cVar = c.fca;
        d a = c.a(cVar, bVar, this.fiV.bql().btw(), null, 4, null);
        if (a != null) {
            return (cVar.i(a) && (aVar.bwZ() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || aVar.bwY() == TypeUsage.SUPERTYPE || a(jVar, a))) ? cVar.k(a) : a;
        } else {
            return null;
        }
    }

    private final boolean a(j jVar, d dVar) {
        boolean z = false;
        if (!JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1.fkq.b((v) u.bX(jVar.bxt()))) {
            return false;
        }
        an brm = c.fca.k(dVar).brm();
        i.e(brm, "JavaToKotlinClassMap.con…         .typeConstructor");
        List parameters = brm.getParameters();
        i.e(parameters, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        ao aoVar = (ao) u.bX(parameters);
        if (aoVar != null) {
            Variance bta = aoVar.bta();
            if (bta != null) {
                i.e(bta, "JavaToKotlinClassMap.con….variance ?: return false");
                if (bta != Variance.OUT_VARIANCE) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final List<ap> a(j jVar, a aVar, an anVar) {
        boolean bxu = jVar.bxu();
        Object obj = (bxu || (jVar.bxt().isEmpty() && !anVar.getParameters().isEmpty())) ? 1 : null;
        List parameters = anVar.getParameters();
        i.e(parameters, "constructor.parameters");
        String str = "parameter";
        Iterable<ao> iterable;
        if (obj != null) {
            iterable = parameters;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (ao aoVar : iterable) {
                a aVar2;
                kotlin.reflect.jvm.internal.impl.types.z zVar = new kotlin.reflect.jvm.internal.impl.types.z(this.fiV.bqz(), new JavaTypeResolver$computeArguments$$inlined$map$lambda$1(aoVar, this, aVar, anVar, bxu));
                d dVar = d.fku;
                i.e(aoVar, str);
                if (bxu) {
                    aVar2 = aVar;
                    a aVar3 = aVar2;
                } else {
                    aVar2 = aVar.a(JavaTypeFlexibility.INFLEXIBLE);
                }
                arrayList.add(dVar.a(aoVar, aVar2, (w) zVar));
            }
            return u.T((List) arrayList);
        } else if (parameters.size() != jVar.bxt().size()) {
            iterable = parameters;
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (ao aoVar2 : iterable) {
                i.e(aoVar2, "p");
                arrayList2.add(new ar(p.mK(aoVar2.bsZ().boi())));
            }
            return u.T((List) arrayList2);
        } else {
            Iterable<kotlin.collections.w> W = u.W(jVar.bxt());
            Collection arrayList3 = new ArrayList(n.e(W, 10));
            for (kotlin.collections.w wVar : W) {
                int component1 = wVar.component1();
                v vVar = (v) wVar.bnk();
                Object obj2 = component1 < parameters.size() ? 1 : null;
                if (kotlin.m.eVC && obj2 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Argument index should be less then type parameters count, but ");
                    stringBuilder.append(component1);
                    stringBuilder.append(" > ");
                    stringBuilder.append(parameters.size());
                    throw new AssertionError(stringBuilder.toString());
                }
                ao aoVar3 = (ao) parameters.get(component1);
                a a = c.a(TypeUsage.COMMON, false, null, 3, null);
                i.e(aoVar3, str);
                arrayList3.add(a(vVar, a, aoVar3));
            }
            return u.T((List) arrayList3);
        }
    }

    private final ap a(v vVar, a aVar, ao aoVar) {
        if (!(vVar instanceof z)) {
            return new ar(Variance.INVARIANT, a(vVar, aVar));
        }
        z zVar = (z) vVar;
        v bxM = zVar.bxM();
        Variance variance = zVar.bxN() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bxM == null || a(variance, aoVar)) {
            return c.a(aoVar, aVar);
        }
        return kotlin.reflect.jvm.internal.impl.types.b.a.a(a(bxM, c.a(TypeUsage.COMMON, false, null, 3, null)), variance, aoVar);
    }

    private final boolean a(Variance variance, ao aoVar) {
        boolean z = false;
        if (aoVar.bta() == Variance.INVARIANT) {
            return false;
        }
        if (variance != aoVar.bta()) {
            z = true;
        }
        return z;
    }

    private final boolean a(a aVar) {
        boolean z = false;
        if (aVar.bwZ() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
            return false;
        }
        if (!(aVar.bxa() || aVar.bwY() == TypeUsage.SUPERTYPE)) {
            z = true;
        }
        return z;
    }
}
