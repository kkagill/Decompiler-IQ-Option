package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$getFunctions$2 extends Lambda implements b<h, Collection<? extends ai>> {
    final /* synthetic */ f $name;

    JvmBuiltInsSettings$getFunctions$2(f fVar) {
        this.$name = fVar;
        super(1);
    }

    /* renamed from: a */
    public final Collection<? extends ai> invoke(h hVar) {
        i.f(hVar, "it");
        return hVar.b(this.$name, NoLookupLocation.FROM_BUILTINS);
    }
}
