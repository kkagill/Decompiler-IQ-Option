package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.m;

/* compiled from: NotFoundClasses.kt */
final class NotFoundClasses$packageFragments$1 extends Lambda implements b<kotlin.reflect.jvm.internal.impl.name.b, m> {
    final /* synthetic */ x this$0;

    NotFoundClasses$packageFragments$1(x xVar) {
        this.this$0 = xVar;
        super(1);
    }

    /* renamed from: g */
    public final m invoke(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        return new m(this.this$0.fbz, bVar);
    }
}
