package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: DeserializedAnnotations.kt */
public class a implements f {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final e fvQ;

    private final List<c> bOw() {
        return (List) g.a(this.fvQ, (Object) this, anY[0]);
    }

    public a(h hVar, kotlin.jvm.a.a<? extends List<? extends c>> aVar) {
        i.f(hVar, "storageManager");
        i.f(aVar, "compute");
        this.fvQ = hVar.f(aVar);
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
        return bOw().isEmpty();
    }

    public Iterator<c> iterator() {
        return bOw().iterator();
    }
}
