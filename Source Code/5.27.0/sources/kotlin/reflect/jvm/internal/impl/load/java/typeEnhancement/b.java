package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: typeEnhancement.kt */
final class b implements f {
    private final kotlin.reflect.jvm.internal.impl.name.b fkz;

    public boolean isEmpty() {
        return false;
    }

    public b(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqNameToMatch");
        this.fkz = bVar;
    }

    public boolean j(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b.b(this, bVar);
    }

    /* renamed from: r */
    public a i(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        return i.y(bVar, this.fkz) ? a.fky : null;
    }

    public Iterator<c> iterator() {
        return m.emptyList().iterator();
    }
}
