package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: CompositePackageFragmentProvider.kt */
public final class i implements z {
    private final List<z> fer;

    public i(List<? extends z> list) {
        kotlin.jvm.internal.i.f(list, "providers");
        this.fer = list;
    }

    public List<y> h(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (z h : this.fer) {
            arrayList.addAll(h.h(bVar));
        }
        return u.T(arrayList);
    }

    public Collection<b> a(b bVar, kotlin.jvm.a.b<? super f, Boolean> bVar2) {
        kotlin.jvm.internal.i.f(bVar, "fqName");
        kotlin.jvm.internal.i.f(bVar2, "nameFilter");
        HashSet hashSet = new HashSet();
        for (z a : this.fer) {
            hashSet.addAll(a.a(bVar, bVar2));
        }
        return hashSet;
    }
}
