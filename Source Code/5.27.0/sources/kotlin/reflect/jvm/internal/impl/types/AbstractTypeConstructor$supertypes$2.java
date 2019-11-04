package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$2 extends Lambda implements b<Boolean, a> {
    public static final AbstractTypeConstructor$supertypes$2 fwM = new AbstractTypeConstructor$supertypes$2();

    AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return hd(((Boolean) obj).booleanValue());
    }

    public final a hd(boolean z) {
        return new a(l.listOf(p.fwV));
    }
}
