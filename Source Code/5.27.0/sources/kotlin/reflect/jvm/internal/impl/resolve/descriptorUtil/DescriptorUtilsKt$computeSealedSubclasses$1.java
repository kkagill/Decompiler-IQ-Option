package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.LinkedHashSet;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$computeSealedSubclasses$1 extends Lambda implements m<h, Boolean, l> {
    final /* synthetic */ LinkedHashSet $result;
    final /* synthetic */ d $sealedClass;

    DescriptorUtilsKt$computeSealedSubclasses$1(d dVar, LinkedHashSet linkedHashSet) {
        this.$sealedClass = dVar;
        this.$result = linkedHashSet;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        a((h) obj, ((Boolean) obj2).booleanValue());
        return l.eVB;
    }

    public final void a(h hVar, boolean z) {
        i.f(hVar, "scope");
        for (k kVar : a.a(hVar, kotlin.reflect.jvm.internal.impl.resolve.scopes.d.fun, null, 2, null)) {
            if (kVar instanceof d) {
                d dVar = (d) kVar;
                if (c.c(dVar, this.$sealedClass)) {
                    this.$result.add(kVar);
                }
                if (z) {
                    DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = this;
                    h btd = dVar.btd();
                    i.e(btd, "descriptor.unsubstitutedInnerClassesScope");
                    descriptorUtilsKt$computeSealedSubclasses$1.a(btd, z);
                }
            }
        }
    }
}
