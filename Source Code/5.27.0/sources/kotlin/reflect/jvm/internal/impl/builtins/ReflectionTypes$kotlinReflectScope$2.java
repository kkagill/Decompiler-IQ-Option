package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ReflectionTypes.kt */
final class ReflectionTypes$kotlinReflectScope$2 extends Lambda implements a<h> {
    final /* synthetic */ v $module;

    ReflectionTypes$kotlinReflectScope$2(v vVar) {
        this.$module = vVar;
        super(0);
    }

    /* renamed from: brc */
    public final h invoke() {
        return this.$module.f(i.brd()).bsF();
    }
}
