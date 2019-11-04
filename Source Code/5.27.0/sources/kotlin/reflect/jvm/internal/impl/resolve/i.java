package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a;

/* compiled from: overridingUtils.kt */
public final class i {
    public static final <H> Collection<H> b(Collection<? extends H> collection, b<? super H, ? extends a> bVar) {
        kotlin.jvm.internal.i.f(collection, "$this$selectMostSpecificInEachOverridableGroup");
        kotlin.jvm.internal.i.f(bVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.i bQf = kotlin.reflect.jvm.internal.impl.utils.i.fAh.bQf();
        while (true) {
            Collection collection2 = linkedList;
            if ((collection2.isEmpty() ^ 1) == 0) {
                return bQf;
            }
            Object bU = u.bU(linkedList);
            kotlin.reflect.jvm.internal.impl.utils.i bQf2 = kotlin.reflect.jvm.internal.impl.utils.i.fAh.bQf();
            collection2 = OverridingUtil.a(bU, collection2, (b) bVar, (b) new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(bQf2));
            kotlin.jvm.internal.i.e(collection2, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            if (collection2.size() == 1 && bQf2.isEmpty()) {
                Object N = u.N(collection2);
                kotlin.jvm.internal.i.e(N, "overridableGroup.single()");
                bQf.add(N);
            } else {
                bU = OverridingUtil.a(collection2, (b) bVar);
                kotlin.jvm.internal.i.e(bU, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                a aVar = (a) bVar.invoke(bU);
                for (Object next : collection2) {
                    kotlin.jvm.internal.i.e(next, "it");
                    if (!OverridingUtil.f(aVar, (a) bVar.invoke(next))) {
                        bQf2.add(next);
                    }
                }
                Collection collection3 = bQf2;
                if ((collection3.isEmpty() ^ 1) != 0) {
                    bQf.addAll(collection3);
                }
                bQf.add(bU);
            }
        }
    }

    public static final <D extends a> void O(Collection<D> collection) {
        kotlin.jvm.internal.i.f(collection, "$this$retainMostSpecificInEachOverridableGroup");
        Collection b = b(collection, OverridingUtilsKt$retainMostSpecificInEachOverridableGroup$newResult$1.ftr);
        if (collection.size() != b.size()) {
            collection.retainAll(b);
        }
    }
}
