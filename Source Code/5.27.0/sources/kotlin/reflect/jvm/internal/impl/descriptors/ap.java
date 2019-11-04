package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: typeParameterUtils.kt */
public final class ap {
    public static final List<ao> a(g gVar) {
        i.f(gVar, "$this$computeConstructorTypeParameters");
        List brI = gVar.brI();
        String str = "declaredTypeParameters";
        i.e(brI, str);
        if (!gVar.brz() && !(gVar.brj() instanceof a)) {
            return brI;
        }
        Object obj;
        List list;
        k kVar = gVar;
        List f = n.f(n.e(n.d(a.S(kVar), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.fcY), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.fcZ));
        Iterator it = a.S(kVar).iterator();
        do {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
        } while (!(obj instanceof d));
        d dVar = (d) obj;
        if (dVar != null) {
            an brm = dVar.brm();
            if (brm != null) {
                list = brm.getParameters();
            }
        }
        if (list == null) {
            list = m.emptyList();
        }
        if (f.isEmpty() && list.isEmpty()) {
            List brI2 = gVar.brI();
            i.e(brI2, str);
            return brI2;
        }
        Iterable<ao> b = u.b((Collection) f, (Iterable) list);
        Collection arrayList = new ArrayList(n.e(b, 10));
        for (ao aoVar : b) {
            i.e(aoVar, "it");
            arrayList.add(a(aoVar, kVar, brI.size()));
        }
        return u.b((Collection) brI, (Iterable) (List) arrayList);
    }

    private static final b a(ao aoVar, k kVar, int i) {
        return new b(aoVar, kVar, i);
    }

    public static final ac O(w wVar) {
        i.f(wVar, "$this$buildPossiblyInnerType");
        f brQ = wVar.bMZ().brQ();
        if (!(brQ instanceof g)) {
            brQ = null;
        }
        return a(wVar, (g) brQ, 0);
    }

    private static final ac a(w wVar, g gVar, int i) {
        ac acVar = null;
        if (gVar != null) {
            k kVar = gVar;
            if (!p.Y(kVar)) {
                int size = gVar.brI().size() + i;
                if (gVar.brz()) {
                    List subList = wVar.btD().subList(i, size);
                    k brj = gVar.brj();
                    if (brj instanceof g) {
                        acVar = brj;
                    }
                    return new ac(gVar, subList, a(wVar, (g) acVar, size));
                }
                Object obj = (size == wVar.btD().size() || c.u(kVar)) ? 1 : null;
                if (!m.eVC || obj != null) {
                    return new ac(gVar, wVar.btD().subList(i, wVar.btD().size()), null);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(wVar.btD().size() - size);
                stringBuilder.append(" trailing arguments were found in ");
                stringBuilder.append(wVar);
                stringBuilder.append(" type");
                throw new AssertionError(stringBuilder.toString());
            }
        }
        return null;
    }
}
