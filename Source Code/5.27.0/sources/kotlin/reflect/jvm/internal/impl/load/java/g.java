package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: FakePureImplementationsProvider.kt */
public final class g {
    private static final HashMap<b, b> fgZ = new HashMap();
    public static final g fha;

    static {
        g gVar = new g();
        fha = gVar;
        b bVar = kotlin.reflect.jvm.internal.impl.builtins.g.eZA.faz;
        i.e(bVar, "FQ_NAMES.mutableList");
        gVar.a(bVar, gVar.h("java.util.ArrayList", "java.util.LinkedList"));
        bVar = kotlin.reflect.jvm.internal.impl.builtins.g.eZA.faB;
        i.e(bVar, "FQ_NAMES.mutableSet");
        gVar.a(bVar, gVar.h("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        bVar = kotlin.reflect.jvm.internal.impl.builtins.g.eZA.faC;
        i.e(bVar, "FQ_NAMES.mutableMap");
        gVar.a(bVar, gVar.h("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        gVar.a(new b("java.util.function.Function"), gVar.h("java.util.function.UnaryOperator"));
        gVar.a(new b("java.util.function.BiFunction"), gVar.h("java.util.function.BinaryOperator"));
    }

    private g() {
    }

    public final b m(b bVar) {
        i.f(bVar, "classFqName");
        return (b) fgZ.get(bVar);
    }

    private final void a(b bVar, List<b> list) {
        Map map = fgZ;
        for (b x : list) {
            Pair x2 = j.x(x, bVar);
            map.put(x2.getFirst(), x2.bni());
        }
    }

    private final List<b> h(String... strArr) {
        Collection arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new b(bVar));
        }
        return (List) arrayList;
    }
}
