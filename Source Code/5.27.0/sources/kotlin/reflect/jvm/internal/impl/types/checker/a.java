package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.t;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: IntersectionType.kt */
public final class a {
    public static final ay co(List<? extends ay> list) {
        i.f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size == 1) {
            return (ay) u.bY(list);
        } else {
            Iterable<ay> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            Object obj = null;
            Object obj2 = null;
            for (ay ayVar : iterable) {
                Object obj3;
                obj = (obj != null || y.aJ(ayVar)) ? 1 : null;
                if (ayVar instanceof ad) {
                    obj3 = (ad) ayVar;
                } else if (!(ayVar instanceof q)) {
                    throw new NoWhenBranchMatchedException();
                } else if (n.aC(ayVar)) {
                    return ayVar;
                } else {
                    obj3 = ((q) ayVar).bPr();
                    obj2 = 1;
                }
                arrayList.add(obj3);
            }
            List list2 = (List) arrayList;
            if (obj != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Intersection of error types: ");
                stringBuilder.append(list);
                ad mK = p.mK(stringBuilder.toString());
                i.e(mK, "ErrorUtils.createErrorTy… of error types: $types\")");
                return mK;
            } else if (obj2 == null) {
                return TypeIntersector.fye.cr(list2);
            } else {
                Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                for (ay aH : iterable) {
                    arrayList2.add(t.aH(aH));
                }
                return x.a(TypeIntersector.fye.cr(list2), TypeIntersector.fye.cr((List) arrayList2));
            }
        }
    }
}
