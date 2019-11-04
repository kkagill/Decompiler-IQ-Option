package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.HashSet;
import kotlin.TypeCastException;
import kotlin.jvm.a.q;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.f;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.builtins.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.utils.d;

/* compiled from: typeSignatureMapping.kt */
public final class z {
    private static final <T> T a(j<T> jVar, T t, boolean z) {
        return z ? jVar.dH(t) : t;
    }

    public static /* synthetic */ Object a(w wVar, j jVar, x xVar, v vVar, g gVar, q qVar, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            qVar = d.bPY();
        }
        return a(wVar, jVar, xVar, vVar, gVar, qVar, z);
    }

    public static final <T> T a(w wVar, j<T> jVar, x xVar, v<? extends T> vVar, g<T> gVar, q<? super w, ? super T, ? super x, l> qVar, boolean z) {
        w wVar2 = wVar;
        j<T> jVar2 = jVar;
        x xVar2 = xVar;
        v<? extends T> vVar2 = vVar;
        g<T> gVar2 = gVar;
        q<? super w, ? super T, ? super x, l> qVar2 = qVar;
        i.f(wVar, "kotlinType");
        i.f(jVar, "factory");
        i.f(xVar, "mode");
        i.f(vVar, "typeMappingConfiguration");
        i.f(qVar, "writeGenericType");
        w ag = vVar.ag(wVar);
        if (ag != null) {
            return a(ag, jVar, xVar, vVar, gVar, qVar, z);
        }
        if (f.e(wVar)) {
            return a(j.a(wVar, vVar.byN()), jVar, xVar, vVar, gVar, qVar, z);
        }
        Object a = a(wVar, (j) jVar, xVar);
        if (a != null) {
            a = a((j) jVar, a, xVar.byP());
            qVar.b(wVar, a, xVar);
            return a;
        }
        an bMZ = wVar.bMZ();
        if (bMZ instanceof v) {
            return a(a.bq(vVar.L(((v) bMZ).bup())), jVar, xVar, vVar, gVar, qVar, z);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = bMZ.brQ();
        StringBuilder stringBuilder;
        if (brQ != null) {
            i.e(brQ, "constructor.declarationD…structor of $kotlinType\")");
            String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
            if (p.Y(brQ)) {
                a = jVar.mg("error/NonExistentClass");
                if (brQ != null) {
                    vVar.a(wVar, (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ);
                    if (gVar2 != null) {
                        gVar.dF(a);
                    }
                    return a;
                }
                throw new TypeCastException(str);
            }
            boolean z2 = brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
            Object mg;
            if (z2 && g.o(wVar)) {
                if (wVar.btD().size() == 1) {
                    ap apVar = (ap) wVar.btD().get(0);
                    ag = apVar.bpT();
                    i.e(ag, "memberProjection.type");
                    if (apVar.bPD() == Variance.IN_VARIANCE) {
                        mg = jVar.mg("java/lang/Object");
                        if (gVar2 != null) {
                            gVar.byw();
                            gVar.dF(mg);
                            gVar.byx();
                        }
                    } else {
                        if (gVar2 != null) {
                            gVar.byw();
                        }
                        Variance bPD = apVar.bPD();
                        i.e(bPD, "memberProjection.projectionKind");
                        mg = a(ag, jVar, xVar.a(bPD), vVar, gVar, qVar, z);
                        if (gVar2 != null) {
                            gVar.byx();
                        }
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("[");
                    stringBuilder2.append(jVar.toString(mg));
                    return jVar.mf(stringBuilder2.toString());
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            } else if (z2) {
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
                if (dVar.brA() && !xVar.byQ()) {
                    ag = ah(wVar);
                    if (ag != null) {
                        return a(ag, jVar, xVar.byO(), vVar, gVar, qVar, z);
                    }
                }
                if (xVar.bxa() && g.g(dVar)) {
                    a = jVar.byG();
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.d btf = dVar.btf();
                    i.e(btf, "descriptor.original");
                    a = vVar.D(btf);
                    if (a == null) {
                        if (dVar.brt() == ClassKind.ENUM_ENTRY) {
                            k brj = dVar.brj();
                            if (brj != null) {
                                dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brj;
                            } else {
                                throw new TypeCastException(str);
                            }
                        }
                        btf = dVar.btf();
                        i.e(btf, "enumClassIfEnumEntry.original");
                        a = jVar.mg(a(btf, (v) vVar, z));
                    }
                }
                qVar.b(wVar, a, xVar);
                return a;
            } else {
                boolean z3 = z;
                if (brQ instanceof ao) {
                    try {
                        mg = a(a.e((ao) brQ), jVar, xVar, vVar, null, d.bPY(), z);
                        if (gVar2 != null) {
                            kotlin.reflect.jvm.internal.impl.name.f bsZ = brQ.bsZ();
                            i.e(bsZ, "descriptor.getName()");
                            gVar.c(bsZ, mg);
                        }
                        return mg;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                    }
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(wVar);
                    throw new UnsupportedOperationException(stringBuilder.toString());
                }
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("no descriptor for type constructor of ");
        stringBuilder.append(wVar);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    /* JADX WARNING: Missing block: B:14:0x002b, code skipped:
            if ((r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.af) == false) goto L_0x002f;
     */
    public static final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.a r2) {
        /*
        r0 = "descriptor";
        kotlin.jvm.internal.i.f(r2, r0);
        r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j;
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r2.bsN();
        if (r0 != 0) goto L_0x0014;
    L_0x0011:
        kotlin.jvm.internal.i.bnJ();
    L_0x0014:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.H(r0);
        if (r0 == 0) goto L_0x002e;
    L_0x001a:
        r0 = r2.bsN();
        if (r0 != 0) goto L_0x0023;
    L_0x0020:
        kotlin.jvm.internal.i.bnJ();
    L_0x0023:
        r0 = kotlin.reflect.jvm.internal.impl.types.au.bb(r0);
        if (r0 != 0) goto L_0x002e;
    L_0x0029:
        r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.af;
        if (r2 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r1 = 0;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.z.e(kotlin.reflect.jvm.internal.impl.descriptors.a):boolean");
    }

    private static final String gN(boolean z) {
        b bVar;
        if (z) {
            bVar = c.fsU;
        } else {
            bVar = c.fsT;
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.c l = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.l(kotlin.reflect.jvm.internal.impl.name.a.s(bVar));
        i.e(l, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
        String byE = l.byE();
        i.e(byE, "JvmClassName.byClassId(C…vel(fqName)).internalName");
        return byE;
    }

    private static final <T> T a(w wVar, j<T> jVar, x xVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (!(brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            brQ = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) brQ;
        if (dVar != null) {
            boolean z = false;
            if (dVar == j.bre()) {
                return jVar.mg(gN(false));
            }
            if (i.y(dVar, j.brf())) {
                return jVar.mg(gN(true));
            }
            k kVar = dVar;
            PrimitiveType e = g.e(kVar);
            if (e != null) {
                JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(e);
                i.e(jvmPrimitiveType, "JvmPrimitiveType.get(primitiveType)");
                String desc = jvmPrimitiveType.getDesc();
                i.e(desc, "JvmPrimitiveType.get(primitiveType).desc");
                Object mf = jVar.mf(desc);
                if (au.bb(wVar) || kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.p.ae(wVar)) {
                    z = true;
                }
                return a((j) jVar, mf, z);
            }
            PrimitiveType f = g.f(kVar);
            if (f != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.get(f);
                i.e(jvmPrimitiveType2, "JvmPrimitiveType.get(arrayElementType)");
                stringBuilder.append(jvmPrimitiveType2.getDesc());
                return jVar.mf(stringBuilder.toString());
            } else if (g.d(kVar)) {
                kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca.c(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.z(kVar));
                if (c != null) {
                    if (!xVar.byR()) {
                        Iterable<kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a> bsc = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.fca.bsc();
                        if (!(bsc instanceof Collection) || !((Collection) bsc).isEmpty()) {
                            for (kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a bsd : bsc) {
                                if (i.y(bsd.bsd(), c)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (z) {
                            return null;
                        }
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.c l = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.l(c);
                    i.e(l, "JvmClassName.byClassId(classId)");
                    String byE = l.byE();
                    i.e(byE, "JvmClassName.byClassId(classId).internalName");
                    return jVar.mg(byE);
                }
            }
        }
        return null;
    }

    public static final w ah(w wVar) {
        i.f(wVar, "inlineClassType");
        return a(wVar, new HashSet());
    }

    public static final w a(w wVar, HashSet<kotlin.reflect.jvm.internal.impl.descriptors.f> hashSet) {
        i.f(wVar, "kotlinType");
        i.f(hashSet, "visitedClassifiers");
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (brQ != null) {
            i.e(brQ, "kotlinType.constructor.d…n expected: $kotlinType\")");
            if (!hashSet.add(brQ)) {
                return null;
            }
            w a;
            if (brQ instanceof ao) {
                a = a(a.e((ao) brQ), hashSet);
                if (a == null) {
                    wVar = null;
                } else if (!y.aI(a) && wVar.boc()) {
                    wVar = a.aY(a);
                }
                return wVar;
            }
            if ((brQ instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && ((kotlin.reflect.jvm.internal.impl.descriptors.d) brQ).brA()) {
                w aq = kotlin.reflect.jvm.internal.impl.resolve.d.aq(wVar);
                if (aq != null) {
                    a = a(aq, hashSet);
                    if (a != null) {
                        if (y.aI(wVar)) {
                            if (!(y.aI(a) || g.q(a))) {
                                wVar = a.aY(a);
                            }
                        }
                    }
                }
                return null;
            }
            return wVar;
            wVar = a;
            return wVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type with a declaration expected: ");
        stringBuilder.append(wVar);
        throw new AssertionError(stringBuilder.toString());
    }

    public static /* synthetic */ String a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, v vVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            vVar = w.fmh;
        }
        return a(dVar, vVar, z);
    }

    public static final String a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, v<?> vVar, boolean z) {
        i.f(dVar, "klass");
        i.f(vVar, "typeMappingConfiguration");
        Object q = z ? q(dVar.brj()) : dVar.brj();
        kotlin.reflect.jvm.internal.impl.name.f I = h.I(dVar.bsZ());
        i.e(I, "SpecialNames.safeIdentifier(klass.name)");
        String identifier = I.getIdentifier();
        i.e(identifier, "SpecialNames.safeIdentifier(klass.name).identifier");
        StringBuilder stringBuilder;
        if (q instanceof kotlin.reflect.jvm.internal.impl.descriptors.y) {
            b btB = ((kotlin.reflect.jvm.internal.impl.descriptors.y) q).btB();
            if (!btB.isRoot()) {
                stringBuilder = new StringBuilder();
                String boi = btB.boi();
                i.e(boi, "fqName.asString()");
                stringBuilder.append(u.a(boi, '.', '/', false, 4, null));
                stringBuilder.append('/');
                stringBuilder.append(identifier);
                identifier = stringBuilder.toString();
            }
            return identifier;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) (!(q instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) ? null : q);
        if (dVar2 != null) {
            String E = vVar.E(dVar2);
            if (E == null) {
                E = a(dVar2, (v) vVar, z);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(E);
            stringBuilder.append('$');
            stringBuilder.append(identifier);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unexpected container: ");
        stringBuilder2.append(q);
        stringBuilder2.append(" for ");
        stringBuilder2.append(dVar);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    private static final k q(k kVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) (!(kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) ? null : kVar);
        if (dVar == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.y dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.y) (!(kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.y) ? null : kVar);
        }
        k kVar2 = dVar2;
        if (kVar2 != null) {
            return kVar2;
        }
        return kVar != null ? q(kVar.brj()) : null;
    }
}
