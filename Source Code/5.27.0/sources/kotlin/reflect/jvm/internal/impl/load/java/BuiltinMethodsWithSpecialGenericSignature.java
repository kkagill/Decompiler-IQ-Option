package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithSpecialGenericSignature {
    private static final List<p> fgI;
    private static final List<String> fgJ;
    private static final List<String> fgK;
    private static final Map<p, TypeSafeBarrierDescription> fgL;
    private static final Map<String, TypeSafeBarrierDescription> fgM;
    private static final Set<f> fgN;
    private static final Set<String> fgO;
    public static final BuiltinMethodsWithSpecialGenericSignature fgP = new BuiltinMethodsWithSpecialGenericSignature();

    /* compiled from: specialBuiltinMembers.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        private SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    public enum TypeSafeBarrierDescription {
        NULL(null),
        INDEX(Integer.valueOf(-1)),
        FALSE(Boolean.valueOf(false));
        
        private final Object defaultValue;

        /* compiled from: specialBuiltinMembers.kt */
        static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, null, null);
            }
        }

        private TypeSafeBarrierDescription(Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        String str;
        String desc;
        Iterable of = al.setOf("containsAll", "removeAll", "retainAll");
        Collection arrayList = new ArrayList(n.e(of, 10));
        Iterator it = of.iterator();
        while (true) {
            str = "JvmPrimitiveType.BOOLEAN.desc";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            desc = JvmPrimitiveType.BOOLEAN.getDesc();
            i.e(desc, str);
            arrayList.add(r.j("java/util/Collection", str2, "Ljava/util/Collection;", desc));
        }
        fgI = (List) arrayList;
        Iterable<p> iterable = fgI;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (p RX : iterable) {
            arrayList.add(RX.RX());
        }
        fgJ = (List) arrayList;
        iterable = fgI;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (p RX2 : iterable) {
            arrayList.add(RX2.bsZ().boi());
        }
        fgK = (List) arrayList;
        u uVar = u.fmf;
        Pair[] pairArr = new Pair[10];
        desc = "Collection";
        String mk = uVar.mk(desc);
        String desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        i.e(desc2, str);
        String str3 = "Ljava/lang/Object;";
        pairArr[0] = j.x(r.j(mk, "contains", str3, desc2), TypeSafeBarrierDescription.FALSE);
        desc = uVar.mk(desc);
        mk = JvmPrimitiveType.BOOLEAN.getDesc();
        i.e(mk, str);
        desc2 = ProductAction.ACTION_REMOVE;
        pairArr[1] = j.x(r.j(desc, desc2, str3, mk), TypeSafeBarrierDescription.FALSE);
        desc = "Map";
        mk = uVar.mk(desc);
        String desc3 = JvmPrimitiveType.BOOLEAN.getDesc();
        i.e(desc3, str);
        pairArr[2] = j.x(r.j(mk, "containsKey", str3, desc3), TypeSafeBarrierDescription.FALSE);
        mk = uVar.mk(desc);
        desc3 = JvmPrimitiveType.BOOLEAN.getDesc();
        i.e(desc3, str);
        pairArr[3] = j.x(r.j(mk, "containsValue", str3, desc3), TypeSafeBarrierDescription.FALSE);
        mk = uVar.mk(desc);
        desc3 = JvmPrimitiveType.BOOLEAN.getDesc();
        i.e(desc3, str);
        str = "Ljava/lang/Object;Ljava/lang/Object;";
        pairArr[4] = j.x(r.j(mk, desc2, str, desc3), TypeSafeBarrierDescription.FALSE);
        pairArr[5] = j.x(r.j(uVar.mk(desc), "getOrDefault", str, str3), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        pairArr[6] = j.x(r.j(uVar.mk(desc), "get", str3, str3), TypeSafeBarrierDescription.NULL);
        pairArr[7] = j.x(r.j(uVar.mk(desc), desc2, str3, str3), TypeSafeBarrierDescription.NULL);
        str = "List";
        desc = uVar.mk(str);
        mk = JvmPrimitiveType.INT.getDesc();
        desc2 = "JvmPrimitiveType.INT.desc";
        i.e(mk, desc2);
        pairArr[8] = j.x(r.j(desc, "indexOf", str3, mk), TypeSafeBarrierDescription.INDEX);
        String mk2 = uVar.mk(str);
        str = JvmPrimitiveType.INT.getDesc();
        i.e(str, desc2);
        pairArr[9] = j.x(r.j(mk2, "lastIndexOf", str3, str), TypeSafeBarrierDescription.INDEX);
        fgL = af.a(pairArr);
        Map map = fgL;
        Map linkedHashMap = new LinkedHashMap(af.jL(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((p) entry.getKey()).RX(), entry.getValue());
        }
        fgM = linkedHashMap;
        iterable = am.a(fgL.keySet(), fgI);
        arrayList = new ArrayList(n.e(iterable, 10));
        for (p bsZ : iterable) {
            arrayList.add(bsZ.bsZ());
        }
        fgN = u.V((List) arrayList);
        arrayList = new ArrayList(n.e(iterable, 10));
        for (p RX3 : iterable) {
            arrayList.add(RX3.RX());
        }
        fgO = u.V((List) arrayList);
    }

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    private final boolean j(CallableMemberDescriptor callableMemberDescriptor) {
        return u.b((Iterable) fgO, (Object) r.d(callableMemberDescriptor));
    }

    public static final s h(s sVar) {
        i.f(sVar, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = fgP;
        f bsZ = sVar.bsZ();
        i.e(bsZ, "functionDescriptor.name");
        if (builtinMethodsWithSpecialGenericSignature.m(bsZ)) {
            return (s) a.a(sVar, false, BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1.fgQ, 1, null);
        }
        return null;
    }

    public final boolean m(f fVar) {
        i.f(fVar, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return fgN.contains(fVar);
    }

    public static final SpecialSignatureInfo k(CallableMemberDescriptor callableMemberDescriptor) {
        i.f(callableMemberDescriptor, "$this$getSpecialSignatureInfo");
        if (!fgN.contains(callableMemberDescriptor.bsZ())) {
            return null;
        }
        callableMemberDescriptor = a.a(callableMemberDescriptor, false, BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1.fgR, 1, null);
        if (callableMemberDescriptor != null) {
            String d = r.d(callableMemberDescriptor);
            if (d != null) {
                if (fgJ.contains(d)) {
                    return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                }
                SpecialSignatureInfo specialSignatureInfo;
                Object obj = fgM.get(d);
                if (obj == null) {
                    i.bnJ();
                }
                if (((TypeSafeBarrierDescription) obj) == TypeSafeBarrierDescription.NULL) {
                    specialSignatureInfo = SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
                } else {
                    specialSignatureInfo = SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                }
                return specialSignatureInfo;
            }
        }
        return null;
    }
}
