package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: Annotations.kt */
final class CompositeAnnotations$findAnnotation$1 extends Lambda implements b<f, c> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b $fqName;

    CompositeAnnotations$findAnnotation$1(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.$fqName = bVar;
        super(1);
    }

    /* renamed from: b */
    public final c invoke(f fVar) {
        i.f(fVar, "it");
        return fVar.i(this.$fqName);
    }
}
