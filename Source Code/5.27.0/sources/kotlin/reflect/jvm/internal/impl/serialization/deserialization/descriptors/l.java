package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: DeserializedAnnotations.kt */
public final class l extends a {
    public boolean isEmpty() {
        return false;
    }

    public l(h hVar, a<? extends List<? extends c>> aVar) {
        i.f(hVar, "storageManager");
        i.f(aVar, "compute");
        super(hVar, aVar);
    }
}
