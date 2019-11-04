package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.p;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeclaredMemberIndex.kt */
public class a implements b {
    private final Map<f, n> bwK;
    private final b<q, Boolean> fjk = new ClassDeclaredMemberIndex$methodFilter$1(this);
    private final Map<f, List<q>> fjl;
    private final g fjm;
    private final b<p, Boolean> fjn;

    public a(g gVar, b<? super p, Boolean> bVar) {
        i.f(gVar, "jClass");
        i.f(bVar, "memberFilter");
        this.fjm = gVar;
        this.fjn = bVar;
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : n.b(u.Z(this.fjm.bxp()), this.fjk)) {
            f bsZ = ((q) next).bsZ();
            ArrayList arrayList = linkedHashMap.get(bsZ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bsZ, arrayList);
            }
            arrayList.add(next);
        }
        this.fjl = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        for (Object next2 : n.b(u.Z(this.fjm.bxq()), this.fjn)) {
            linkedHashMap.put(((n) next2).bsZ(), next2);
        }
        this.bwK = linkedHashMap;
    }

    public Collection<q> r(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        List list = (List) this.fjl.get(fVar);
        if (list == null) {
            list = m.emptyList();
        }
        return list;
    }

    public Set<f> bwq() {
        Collection linkedHashSet = new LinkedHashSet();
        for (q bsZ : n.b(u.Z(this.fjm.bxp()), this.fjk)) {
            linkedHashSet.add(bsZ.bsZ());
        }
        return (Set) linkedHashSet;
    }

    public n s(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        return (n) this.bwK.get(fVar);
    }

    public Set<f> bwr() {
        Collection linkedHashSet = new LinkedHashSet();
        for (n bsZ : n.b(u.Z(this.fjm.bxq()), this.fjn)) {
            linkedHashSet.add(bsZ.bsZ());
        }
        return (Set) linkedHashSet;
    }
}
