package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.h;
import kotlin.reflect.jvm.internal.impl.descriptors.k;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements a<h> {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.h $storageManager;
    final /* synthetic */ d this$0;

    JvmBuiltInClassDescriptorFactory$cloneable$2(d dVar, kotlin.reflect.jvm.internal.impl.storage.h hVar) {
        this.this$0 = dVar;
        this.$storageManager = hVar;
        super(0);
    }

    /* renamed from: bsm */
    public final h invoke() {
        h hVar = new h((k) this.this$0.fcg.invoke(this.this$0.fcf), d.fci, Modality.ABSTRACT, ClassKind.INTERFACE, l.listOf(this.this$0.fcf.btw().bqM()), aj.fcV, false, this.$storageManager);
        hVar.a(new a(this.$storageManager, hVar), al.emptySet(), null);
        return hVar;
    }
}
