package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.j;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.load.java.n;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.aw;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: typeEnhancement.kt */
public final class p {
    private static final b fll;
    private static final b flm;

    public static final w a(w wVar, b<? super Integer, d> bVar) {
        i.f(wVar, "$this$enhance");
        i.f(bVar, "qualifiers");
        return a(wVar.bPA(), (b) bVar, 0).byf();
    }

    public static final boolean ae(w wVar) {
        i.f(wVar, "$this$hasEnhancedNullability");
        f brE = wVar.brE();
        kotlin.reflect.jvm.internal.impl.name.b bVar = n.fhu;
        i.e(bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return brE.i(bVar) != null;
    }

    private static final i a(ay ayVar, b<? super Integer, d> bVar, int i) {
        w wVar = ayVar;
        boolean z = false;
        if (y.aJ(wVar)) {
            return new i(wVar, 1, false);
        }
        i iVar;
        if (ayVar instanceof q) {
            q qVar = (q) ayVar;
            m a = a(qVar.bPr(), bVar, i, TypeComponentPosition.FLEXIBLE_LOWER);
            m a2 = a(qVar.bPs(), bVar, i, TypeComponentPosition.FLEXIBLE_UPPER);
            Object obj = a.byg() == a2.byg() ? 1 : null;
            if (m.eVC && obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Different tree sizes of bounds: ");
                stringBuilder.append("lower = (");
                stringBuilder.append(qVar.bPr());
                String str = ", ";
                stringBuilder.append(str);
                stringBuilder.append(a.byg());
                stringBuilder.append("), ");
                stringBuilder.append("upper = (");
                stringBuilder.append(qVar.bPs());
                stringBuilder.append(str);
                stringBuilder.append(a2.byg());
                stringBuilder.append(')');
                throw new AssertionError(stringBuilder.toString());
            }
            if (a.byh() || a2.byh()) {
                z = true;
            }
            w bh = aw.bh(a.bpT());
            if (bh == null) {
                bh = aw.bh(a2.bpT());
            }
            if (z) {
                if (ayVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f) {
                    ayVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f(a.bpT(), a2.bpT());
                } else {
                    ayVar = x.a(a.bpT(), a2.bpT());
                }
                ayVar = aw.b(ayVar, bh);
            }
            iVar = new i(ayVar, a.byg(), z);
        } else if (ayVar instanceof ad) {
            iVar = a((ad) ayVar, bVar, i, TypeComponentPosition.INFLEXIBLE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return iVar;
    }

    private static final m a(ad adVar, b<? super Integer, d> bVar, int i, TypeComponentPosition typeComponentPosition) {
        ad adVar2 = adVar;
        b bVar2 = bVar;
        TypeComponentPosition typeComponentPosition2 = typeComponentPosition;
        if (!a(typeComponentPosition) && adVar.btD().isEmpty()) {
            return new m(adVar2, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = adVar.bMZ().brQ();
        if (brQ == null) {
            return new m(adVar2, 1, false);
        }
        i.e(brQ, "constructor.declarationD…pleResult(this, 1, false)");
        d dVar = (d) bVar2.invoke(Integer.valueOf(i));
        c a = a(brQ, dVar, typeComponentPosition2);
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = (kotlin.reflect.jvm.internal.impl.descriptors.f) a.bnj();
        f bxP = a.bxP();
        an brm = fVar.brm();
        String str = "enhancedClassifier.typeConstructor";
        i.e(brm, str);
        int i2 = i + 1;
        Object obj = bxP != null ? 1 : null;
        Iterable btD = adVar.btD();
        Collection arrayList = new ArrayList(n.e(btD, 10));
        int i3 = i2;
        i2 = 0;
        for (Object next : btD) {
            Object d;
            int i4 = i2 + 1;
            if (i2 < 0) {
                m.bno();
            }
            ap apVar = (ap) next;
            if (apVar.bPC()) {
                i3++;
                an brm2 = fVar.brm();
                i.e(brm2, str);
                d = au.d((ao) brm2.getParameters().get(i2));
            } else {
                i a2 = a(apVar.bpT().bPA(), bVar2, i3);
                obj = (obj != null || a2.byh()) ? 1 : null;
                i3 += a2.byg();
                w bpT = a2.bpT();
                Variance bPD = apVar.bPD();
                i.e(bPD, "arg.projectionKind");
                d = a.a(bpT, bPD, (ao) brm.getParameters().get(i2));
            }
            arrayList.add(d);
            i2 = i4;
        }
        List list = (List) arrayList;
        c a3 = a((w) adVar2, dVar, typeComponentPosition2);
        boolean booleanValue = ((Boolean) a3.bnj()).booleanValue();
        f bxP2 = a3.bxP();
        Object obj2 = (obj == null && bxP2 == null) ? null : 1;
        i3 -= i;
        if (obj2 == null) {
            return new m(adVar2, i3, false);
        }
        ad c = x.c(ci(u.P(m.listOf(adVar.brE(), bxP, bxP2))), brm, list, booleanValue);
        if (dVar.bxS()) {
            c = new e(c);
        }
        Object obj3 = (bxP2 == null || !dVar.bxT()) ? null : 1;
        ay b = obj3 != null ? aw.b(adVar2, c) : c;
        if (b != null) {
            return new m((ad) b, i3, true);
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    private static final f ci(List<? extends f> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            return new j(u.T(list));
        } else {
            return (f) u.bY(list);
        }
    }

    private static final boolean a(TypeComponentPosition typeComponentPosition) {
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }

    private static final <T> c<T> dA(T t) {
        return new c(t, null);
    }

    private static final <T> c<T> dB(T t) {
        return new c(t, fll);
    }

    private static final <T> c<T> dC(T t) {
        return new c(t, flm);
    }

    private static final c<kotlin.reflect.jvm.internal.impl.descriptors.f> a(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, d dVar, TypeComponentPosition typeComponentPosition) {
        if (!a(typeComponentPosition)) {
            return dA(fVar);
        }
        if (!(fVar instanceof d)) {
            return dA(fVar);
        }
        c cVar = c.fca;
        MutabilityQualifier bxR = dVar.bxR();
        if (bxR != null) {
            int i = q.aob[bxR.ordinal()];
            d dVar2;
            if (i != 1) {
                if (i == 2 && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                    dVar2 = (d) fVar;
                    if (cVar.i(dVar2)) {
                        return dC(cVar.k(dVar2));
                    }
                }
            } else if (typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                dVar2 = (d) fVar;
                if (cVar.h(dVar2)) {
                    return dC(cVar.j(dVar2));
                }
            }
        }
        return dA(fVar);
    }

    private static final c<Boolean> a(w wVar, d dVar, TypeComponentPosition typeComponentPosition) {
        if (!a(typeComponentPosition)) {
            return dA(Boolean.valueOf(wVar.boc()));
        }
        c<Boolean> dB;
        NullabilityQualifier bxQ = dVar.bxQ();
        if (bxQ != null) {
            int i = q.axg[bxQ.ordinal()];
            if (i == 1) {
                dB = dB(Boolean.valueOf(true));
            } else if (i == 2) {
                dB = dB(Boolean.valueOf(false));
            }
            return dB;
        }
        dB = dA(Boolean.valueOf(wVar.boc()));
        return dB;
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b bVar = n.fhu;
        i.e(bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        fll = new b(bVar);
        bVar = n.fhv;
        i.e(bVar, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        flm = new b(bVar);
    }
}
