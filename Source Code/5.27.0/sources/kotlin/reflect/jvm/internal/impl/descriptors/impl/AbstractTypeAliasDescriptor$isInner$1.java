package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: AbstractTypeAliasDescriptor.kt */
final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements b<ay, Boolean> {
    final /* synthetic */ d this$0;

    AbstractTypeAliasDescriptor$isInner$1(d dVar) {
        this.this$0 = dVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((ay) obj));
    }

    public final boolean a(ay ayVar) {
        i.e(ayVar, "type");
        if (y.aJ(ayVar)) {
            return false;
        }
        d dVar = this.this$0;
        f brQ = ayVar.bMZ().brQ();
        Object obj = (!(brQ instanceof ao) || (i.y(((ao) brQ).brj(), this.this$0) ^ 1) == 0) ? null : 1;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
