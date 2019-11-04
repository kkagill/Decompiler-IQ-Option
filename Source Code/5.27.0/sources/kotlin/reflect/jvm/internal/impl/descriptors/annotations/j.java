package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: Annotations.kt */
public final class j implements f {
    private final List<f> fdH;

    public j(List<? extends f> list) {
        i.f(list, "delegates");
        this.fdH = list;
    }

    public j(f... fVarArr) {
        i.f(fVarArr, "delegates");
        this(i.E(fVarArr));
    }

    public boolean isEmpty() {
        Iterable<f> iterable = this.fdH;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (f isEmpty : iterable) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean j(b bVar) {
        i.f(bVar, "fqName");
        for (f j : u.Z(this.fdH)) {
            if (j.j(bVar)) {
                return true;
            }
        }
        return false;
    }

    public c i(b bVar) {
        i.f(bVar, "fqName");
        return (c) n.d(n.g(u.Z(this.fdH), new CompositeAnnotations$findAnnotation$1(bVar)));
    }

    public Iterator<c> iterator() {
        return n.e(u.Z(this.fdH), CompositeAnnotations$iterator$1.fdI).iterator();
    }
}
