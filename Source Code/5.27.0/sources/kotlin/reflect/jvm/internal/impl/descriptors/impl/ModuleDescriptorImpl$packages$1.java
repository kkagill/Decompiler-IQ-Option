package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: ModuleDescriptorImpl.kt */
final class ModuleDescriptorImpl$packages$1 extends Lambda implements b<kotlin.reflect.jvm.internal.impl.name.b, r> {
    final /* synthetic */ v this$0;

    ModuleDescriptorImpl$packages$1(v vVar) {
        this.this$0 = vVar;
        super(1);
    }

    /* renamed from: l */
    public final r invoke(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        i.f(bVar, "fqName");
        v vVar = this.this$0;
        return new r(vVar, bVar, vVar.eZz);
    }
}
