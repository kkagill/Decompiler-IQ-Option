package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* compiled from: collections.kt */
public final class a {
    public static final <K> Map<K, Integer> af(Iterable<? extends K> iterable) {
        i.f(iterable, "$this$mapToIndex");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void j(Collection<T> collection, T t) {
        i.f(collection, "$this$addIfNotNull");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <K, V> HashMap<K, V> ch(int i) {
        return new HashMap(ci(i));
    }

    public static final <E> HashSet<E> cs(int i) {
        return new HashSet(ci(i));
    }

    public static final <E> LinkedHashSet<E> mC(int i) {
        return new LinkedHashSet(ci(i));
    }

    private static final int ci(int i) {
        return i < 3 ? 3 : (i + (i / 3)) + 1;
    }

    public static final <T> List<T> i(ArrayList<T> arrayList) {
        i.f(arrayList, "$this$compact");
        int size = arrayList.size();
        if (size == 0) {
            return m.emptyList();
        }
        if (size == 1) {
            return l.listOf(u.bU(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
