package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.i;

/* compiled from: Annotations.kt */
public final class k implements f {
    private final f fdJ;
    private final b<kotlin.reflect.jvm.internal.impl.name.b, Boolean> fdK;

    public k(f fVar, b<? super kotlin.reflect.jvm.internal.impl.name.b, Boolean> bVar) {
        i.f(fVar, "delegate");
        i.f(bVar, "fqNameFilter");
        this.fdJ = fVar;
        this.fdK = bVar;
    }

    public boolean j(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        return ((Boolean) this.fdK.invoke(bVar)).booleanValue() ? this.fdJ.j(bVar) : false;
    }

    public c i(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        return ((Boolean) this.fdK.invoke(bVar)).booleanValue() ? this.fdJ.i(bVar) : null;
    }

    public Iterator<c> iterator() {
        Collection arrayList = new ArrayList();
        for (Object next : this.fdJ) {
            if (c((c) next)) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).iterator();
    }

    public boolean isEmpty() {
        Iterable<c> iterable = this.fdJ;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (c c : iterable) {
            if (c(c)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(c cVar) {
        kotlin.reflect.jvm.internal.impl.name.b btB = cVar.btB();
        return btB != null && ((Boolean) this.fdK.invoke(btB)).booleanValue();
    }
}
