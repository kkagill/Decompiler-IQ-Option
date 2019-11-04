package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.builtins.k;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: ConstUtil.kt */
public final class i {
    public static final boolean M(w wVar) {
        kotlin.jvm.internal.i.f(wVar, "$this$canBeUsedForConstVal");
        return ((g.q(wVar) || k.fby.J(wVar)) && !au.bb(wVar)) || g.I(wVar);
    }
}
