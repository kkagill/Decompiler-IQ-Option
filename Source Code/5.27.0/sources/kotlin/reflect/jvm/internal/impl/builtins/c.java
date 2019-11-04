package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: CompanionObjectMapping.kt */
public final class c {
    private static final LinkedHashSet<a> eZk;
    public static final c eZl = new c();

    static {
        Set set = PrimitiveType.NUMBER_TYPES;
        i.e(set, "PrimitiveType.NUMBER_TYPES");
        Iterable<PrimitiveType> iterable = set;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (PrimitiveType d : iterable) {
            arrayList.add(g.d(d));
        }
        Iterable<b> i = u.i((Collection) u.i((Collection) u.i((Collection) (List) arrayList, (Object) g.eZA.eZJ.bKf()), (Object) g.eZA.eZL.bKf()), (Object) g.eZA.eZU.bKf());
        arrayList = new LinkedHashSet();
        for (b s : i) {
            arrayList.add(a.s(s));
        }
        eZk = (LinkedHashSet) arrayList;
    }

    private c() {
    }

    public final Set<a> bqt() {
        Set unmodifiableSet = Collections.unmodifiableSet(eZk);
        i.e(unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    public final boolean b(d dVar) {
        i.f(dVar, "classDescriptor");
        if (kotlin.reflect.jvm.internal.impl.resolve.c.D(dVar)) {
            Iterable iterable = eZk;
            a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(dVar);
            if (u.b(iterable, c != null ? c.bJX() : null)) {
                return true;
            }
        }
        return false;
    }
}
