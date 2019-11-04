package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: AnnotationsImpl.kt */
public final class g implements f {
    private final List<c> fdD;

    public g(List<? extends c> list) {
        i.f(list, "annotations");
        this.fdD = list;
    }

    public c i(b bVar) {
        i.f(bVar, "fqName");
        return f.b.a(this, bVar);
    }

    public boolean j(b bVar) {
        i.f(bVar, "fqName");
        return f.b.b(this, bVar);
    }

    public boolean isEmpty() {
        return this.fdD.isEmpty();
    }

    public Iterator<c> iterator() {
        return this.fdD.iterator();
    }

    public String toString() {
        return this.fdD.toString();
    }
}
