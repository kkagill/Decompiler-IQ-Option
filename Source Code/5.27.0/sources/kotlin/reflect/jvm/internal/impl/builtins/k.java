package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: UnsignedType.kt */
public final class k {
    private static final Set<f> fbu;
    private static final HashMap<a, a> fbv = new HashMap();
    private static final HashMap<a, a> fbw = new HashMap();
    private static final Set<f> fbx;
    public static final k fby = new k();

    static {
        UnsignedType[] values = UnsignedType.values();
        Collection arrayList = new ArrayList(values.length);
        for (UnsignedType typeName : values) {
            arrayList.add(typeName.getTypeName());
        }
        fbu = u.V((List) arrayList);
        values = UnsignedType.values();
        arrayList = new LinkedHashSet();
        for (UnsignedType typeName2 : values) {
            arrayList.add(typeName2.getArrayClassId().bJV());
        }
        fbx = (Set) arrayList;
        for (UnsignedType unsignedType : UnsignedType.values()) {
            fbv.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            fbw.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }

    private k() {
    }

    public final boolean d(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        return fbx.contains(fVar);
    }

    public final a d(a aVar) {
        i.f(aVar, "arrayClassId");
        return (a) fbv.get(aVar);
    }

    public final a e(a aVar) {
        i.f(aVar, "arrayClassId");
        return (a) fbw.get(aVar);
    }

    public final boolean J(w wVar) {
        i.f(wVar, "type");
        if (au.aW(wVar)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (brQ == null) {
            return false;
        }
        i.e(brQ, "type.constructor.declara…escriptor ?: return false");
        return h(brQ);
    }

    public final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        i.f(kVar, "descriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.k brj = kVar.brj();
        return (brj instanceof y) && i.y(((y) brj).btB(), g.eZp) && fbu.contains(kVar.bsZ());
    }
}
