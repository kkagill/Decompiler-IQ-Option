package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;

/* compiled from: specialBuiltinMembers.kt */
public final class c {
    private static final Map<b, f> fgS;
    private static final Map<f, List<f>> fgT;
    private static final Set<b> fgU = fgS.keySet();
    private static final Set<f> fgV;
    public static final c fgW = new c();

    static {
        Pair[] pairArr = new Pair[8];
        kotlin.reflect.jvm.internal.impl.name.c cVar = g.eZA.eZU;
        String str = "BUILTIN_NAMES._enum";
        i.e(cVar, str);
        String str2 = ConditionalUserProperty.NAME;
        pairArr[0] = j.x(r.b(cVar, str2), f.ms(str2));
        cVar = g.eZA.eZU;
        i.e(cVar, str);
        str = "ordinal";
        pairArr[1] = j.x(r.b(cVar, str), f.ms(str));
        b bVar = g.eZA.faq;
        i.e(bVar, "BUILTIN_NAMES.collection");
        str = "size";
        pairArr[2] = j.x(r.b(bVar, str), f.ms(str));
        bVar = g.eZA.fau;
        str2 = "BUILTIN_NAMES.map";
        i.e(bVar, str2);
        pairArr[3] = j.x(r.b(bVar, str), f.ms(str));
        cVar = g.eZA.eZI;
        i.e(cVar, "BUILTIN_NAMES.charSequence");
        str = "length";
        pairArr[4] = j.x(r.b(cVar, str), f.ms(str));
        bVar = g.eZA.fau;
        i.e(bVar, str2);
        pairArr[5] = j.x(r.b(bVar, "keys"), f.ms("keySet"));
        bVar = g.eZA.fau;
        i.e(bVar, str2);
        str = "values";
        pairArr[6] = j.x(r.b(bVar, str), f.ms(str));
        bVar = g.eZA.fau;
        i.e(bVar, str2);
        pairArr[7] = j.x(r.b(bVar, "entries"), f.ms("entrySet"));
        fgS = af.a(pairArr);
        Iterable<Entry> entrySet = fgS.entrySet();
        Collection arrayList = new ArrayList(n.e(entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new Pair(((b) entry.getKey()).bKc(), entry.getValue()));
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Pair pair : (List) arrayList) {
            f fVar = (f) pair.bni();
            ArrayList arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            arrayList2.add((f) pair.getFirst());
        }
        fgT = linkedHashMap;
        Iterable<b> iterable = fgU;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (b bKc : iterable) {
            arrayList.add(bKc.bKc());
        }
        fgV = u.V((List) arrayList);
    }

    private c() {
    }

    public final Set<f> bvw() {
        return fgV;
    }

    public final boolean l(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "callableMemberDescriptor");
        if (fgV.contains(callableMemberDescriptor.bsZ())) {
            return m(callableMemberDescriptor);
        }
        return false;
    }

    private final boolean m(CallableMemberDescriptor callableMemberDescriptor) {
        k kVar = callableMemberDescriptor;
        if (u.b((Iterable) fgU, (Object) a.T(kVar)) && callableMemberDescriptor.bsP().isEmpty()) {
            return true;
        }
        boolean c = g.c(kVar);
        boolean z = false;
        if (!c) {
            return false;
        }
        Collection bsR = callableMemberDescriptor.bsR();
        i.e(bsR, "overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = bsR;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (CallableMemberDescriptor callableMemberDescriptor2 : iterable) {
                c cVar = fgW;
                i.e(callableMemberDescriptor2, "it");
                if (cVar.l(callableMemberDescriptor2)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final List<f> n(f fVar) {
        i.f(fVar, "name1");
        List<f> list = (List) fgT.get(fVar);
        return list != null ? list : m.emptyList();
    }

    public final String n(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$getBuiltinSpecialPropertyGetterName");
        boolean c = g.c((k) callableMemberDescriptor);
        if (!m.eVC || c) {
            callableMemberDescriptor = a.a(a.F(callableMemberDescriptor), false, BuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1.fgX, 1, null);
            if (callableMemberDescriptor == null) {
                return null;
            }
            f fVar = (f) fgS.get(a.x(callableMemberDescriptor));
            if (fVar != null) {
                return fVar.boi();
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This method is defined only for builtin members, but ");
        stringBuilder.append(callableMemberDescriptor);
        stringBuilder.append(" found");
        throw new AssertionError(stringBuilder.toString());
    }
}
