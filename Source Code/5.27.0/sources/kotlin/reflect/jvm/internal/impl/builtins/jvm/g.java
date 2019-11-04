package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ao;
import kotlin.reflect.jvm.internal.impl.types.ao.a;

/* compiled from: mappingUtil.kt */
public final class g {
    public static final ao a(d dVar, d dVar2) {
        i.f(dVar, "from");
        i.f(dVar2, "to");
        Object obj = dVar.brI().size() == dVar2.brI().size() ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(dVar);
            stringBuilder.append(" and ");
            stringBuilder.append(dVar2);
            stringBuilder.append(" should have same number of type parameters, ");
            stringBuilder.append("but ");
            stringBuilder.append(dVar.brI().size());
            stringBuilder.append(" / ");
            stringBuilder.append(dVar2.brI().size());
            stringBuilder.append(" found");
            throw new AssertionError(stringBuilder.toString());
        }
        a aVar = ao.fxv;
        List brI = dVar.brI();
        i.e(brI, "from.declaredTypeParameters");
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.ao> iterable = brI;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ao brm : iterable) {
            arrayList.add(brm.brm());
        }
        Iterable iterable2 = (List) arrayList;
        brI = dVar2.brI();
        i.e(brI, "to.declaredTypeParameters");
        iterable = brI;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.ao aoVar : iterable) {
            i.e(aoVar, "it");
            ad bsY = aoVar.bsY();
            i.e(bsY, "it.defaultType");
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.b.a.bp(bsY));
        }
        return a.a(aVar, af.ac(u.e(iterable2, (Iterable) (List) arrayList2)), false, 2, null);
    }
}
