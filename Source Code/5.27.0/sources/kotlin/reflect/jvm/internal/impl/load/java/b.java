package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: specialBuiltinMembers.kt */
public final class b {
    private static final p fgC;
    private static final Map<p, f> fgD;
    private static final Map<String, f> fgE;
    private static final List<f> fgF;
    private static final Map<f, List<f>> fgG;
    public static final b fgH = new b();

    static {
        String desc = JvmPrimitiveType.INT.getDesc();
        String str = "JvmPrimitiveType.INT.desc";
        i.e(desc, str);
        fgC = r.j("java/util/List", "removeAt", desc, "Ljava/lang/Object;");
        u uVar = u.fmf;
        Pair[] pairArr = new Pair[8];
        String str2 = "Number";
        String mj = uVar.mj(str2);
        String desc2 = JvmPrimitiveType.BYTE.getDesc();
        i.e(desc2, "JvmPrimitiveType.BYTE.desc");
        String str3 = "";
        pairArr[0] = j.x(r.j(mj, "toByte", str3, desc2), f.ms("byteValue"));
        mj = uVar.mj(str2);
        desc2 = JvmPrimitiveType.SHORT.getDesc();
        i.e(desc2, "JvmPrimitiveType.SHORT.desc");
        pairArr[1] = j.x(r.j(mj, "toShort", str3, desc2), f.ms("shortValue"));
        mj = uVar.mj(str2);
        desc2 = JvmPrimitiveType.INT.getDesc();
        i.e(desc2, str);
        pairArr[2] = j.x(r.j(mj, "toInt", str3, desc2), f.ms("intValue"));
        mj = uVar.mj(str2);
        desc2 = JvmPrimitiveType.LONG.getDesc();
        i.e(desc2, "JvmPrimitiveType.LONG.desc");
        pairArr[3] = j.x(r.j(mj, "toLong", str3, desc2), f.ms("longValue"));
        mj = uVar.mj(str2);
        desc2 = JvmPrimitiveType.FLOAT.getDesc();
        i.e(desc2, "JvmPrimitiveType.FLOAT.desc");
        pairArr[4] = j.x(r.j(mj, "toFloat", str3, desc2), f.ms("floatValue"));
        str2 = uVar.mj(str2);
        mj = JvmPrimitiveType.DOUBLE.getDesc();
        i.e(mj, "JvmPrimitiveType.DOUBLE.desc");
        pairArr[5] = j.x(r.j(str2, "toDouble", str3, mj), f.ms("doubleValue"));
        pairArr[6] = j.x(fgC, f.ms(ProductAction.ACTION_REMOVE));
        desc = uVar.mj("CharSequence");
        str2 = JvmPrimitiveType.INT.getDesc();
        i.e(str2, str);
        str = JvmPrimitiveType.CHAR.getDesc();
        i.e(str, "JvmPrimitiveType.CHAR.desc");
        pairArr[7] = j.x(r.j(desc, "get", str2, str), f.ms("charAt"));
        fgD = af.a(pairArr);
        Map map = fgD;
        Map linkedHashMap = new LinkedHashMap(af.jL(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((p) entry.getKey()).RX(), entry.getValue());
        }
        fgE = linkedHashMap;
        Iterable<p> keySet = fgD.keySet();
        Collection arrayList = new ArrayList(n.e(keySet, 10));
        for (p bsZ : keySet) {
            arrayList.add(bsZ.bsZ());
        }
        fgF = (List) arrayList;
        Iterable<Entry> entrySet = fgD.entrySet();
        arrayList = new ArrayList(n.e(entrySet, 10));
        for (Entry entry2 : entrySet) {
            arrayList.add(new Pair(((p) entry2.getKey()).bsZ(), entry2.getValue()));
        }
        map = new LinkedHashMap();
        for (Pair pair : (List) arrayList) {
            f fVar = (f) pair.bni();
            ArrayList arrayList2 = map.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(fVar, arrayList2);
            }
            arrayList2.add((f) pair.getFirst());
        }
        fgG = map;
    }

    private b() {
    }

    public final List<f> bvv() {
        return fgF;
    }

    public final boolean k(f fVar) {
        i.f(fVar, "$this$sameAsRenamedInJvmBuiltin");
        return fgF.contains(fVar);
    }

    public final f a(ai aiVar) {
        i.f(aiVar, "functionDescriptor");
        Map map = fgE;
        String d = r.d(aiVar);
        return d != null ? (f) map.get(d) : null;
    }

    public final boolean b(ai aiVar) {
        i.f(aiVar, "functionDescriptor");
        return g.c((k) aiVar) && a.a(aiVar, false, new BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(aiVar), 1, null) != null;
    }

    public final List<f> l(f fVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        List<f> list = (List) fgG.get(fVar);
        return list != null ? list : m.emptyList();
    }

    public final boolean c(ai aiVar) {
        i.f(aiVar, "$this$isRemoveAtByIndex");
        return i.y(aiVar.bsZ().boi(), "removeAt") && i.y(r.d(aiVar), fgC.RX());
    }
}
