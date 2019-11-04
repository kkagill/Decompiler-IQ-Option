package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: LazyJavaStaticClassScope.kt */
final class LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 extends Lambda implements b<h, Collection<? extends ae>> {
    final /* synthetic */ f $name;

    LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(f fVar) {
        this.$name = fVar;
        super(1);
    }

    /* renamed from: a */
    public final Collection<? extends ae> invoke(h hVar) {
        i.f(hVar, "it");
        return hVar.a(this.$name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
