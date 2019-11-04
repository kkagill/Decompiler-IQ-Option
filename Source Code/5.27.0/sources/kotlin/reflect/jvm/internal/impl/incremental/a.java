package kotlin.reflect.jvm.internal.impl.incremental;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: utils.kt */
public final class a {
    public static final void a(c cVar, b bVar, d dVar, f fVar) {
        i.f(cVar, "$this$record");
        i.f(bVar, "from");
        i.f(dVar, "scopeOwner");
        i.f(fVar, ConditionalUserProperty.NAME);
        if (cVar != kotlin.reflect.jvm.internal.impl.incremental.components.c.a.fgp) {
            kotlin.reflect.jvm.internal.impl.incremental.components.a location = bVar.getLocation();
            if (location != null) {
                Position bvl = cVar.bvm() ? location.bvl() : Position.fgr.bvo();
                String bvk = location.bvk();
                String boi = kotlin.reflect.jvm.internal.impl.resolve.c.w(dVar).boi();
                i.e(boi, "DescriptorUtils.getFqName(scopeOwner).asString()");
                ScopeKind scopeKind = ScopeKind.CLASSIFIER;
                String boi2 = fVar.boi();
                i.e(boi2, "name.asString()");
                cVar.a(bvk, bvl, boi, scopeKind, boi2);
            }
        }
    }

    public static final void a(c cVar, b bVar, y yVar, f fVar) {
        i.f(cVar, "$this$record");
        i.f(bVar, "from");
        i.f(yVar, "scopeOwner");
        i.f(fVar, ConditionalUserProperty.NAME);
        String boi = yVar.btB().boi();
        i.e(boi, "scopeOwner.fqName.asString()");
        String boi2 = fVar.boi();
        i.e(boi2, "name.asString()");
        a(cVar, bVar, boi, boi2);
    }

    public static final void a(c cVar, b bVar, String str, String str2) {
        i.f(cVar, "$this$recordPackageLookup");
        i.f(bVar, "from");
        i.f(str, "packageFqName");
        i.f(str2, ConditionalUserProperty.NAME);
        if (cVar != kotlin.reflect.jvm.internal.impl.incremental.components.c.a.fgp) {
            kotlin.reflect.jvm.internal.impl.incremental.components.a location = bVar.getLocation();
            if (location != null) {
                cVar.a(location.bvk(), cVar.bvm() ? location.bvl() : Position.fgr.bvo(), str, ScopeKind.PACKAGE, str2);
            }
        }
    }
}
