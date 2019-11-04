package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ah;

/* compiled from: DescriptorSubstitutor */
public class k {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        String str3 = "substituteTypeParameters";
        if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 4) {
            objArr[2] = str3;
        }
        str = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(str) : new IllegalStateException(str));
    }

    public static TypeSubstitutor a(List<ao> list, as asVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, List<ao> list2) {
        if (list == null) {
            $$$reportNull$$$0(0);
        }
        if (asVar == null) {
            $$$reportNull$$$0(1);
        }
        if (kVar == null) {
            $$$reportNull$$$0(2);
        }
        if (list2 == null) {
            $$$reportNull$$$0(3);
        }
        TypeSubstitutor a = a(list, asVar, kVar, list2, null);
        if (a != null) {
            if (a == null) {
                $$$reportNull$$$0(4);
            }
            return a;
        }
        throw new AssertionError("Substitution failed");
    }

    public static TypeSubstitutor a(List<ao> list, as asVar, kotlin.reflect.jvm.internal.impl.descriptors.k kVar, List<ao> list2, boolean[] zArr) {
        ah a;
        as asVar2 = asVar;
        List<ao> list3 = list2;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (asVar2 == null) {
            $$$reportNull$$$0(6);
        }
        if (kVar == null) {
            $$$reportNull$$$0(7);
        }
        if (list3 == null) {
            $$$reportNull$$$0(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (ao aoVar : list) {
            int i2 = i + 1;
            a = ah.a(kVar, aoVar.brE(), aoVar.btb(), aoVar.bta(), aoVar.bsZ(), i, aj.fcV);
            hashMap.put(aoVar.brm(), new ar(a.bsY()));
            hashMap2.put(aoVar, a);
            list3.add(a);
            i = i2;
        }
        TypeSubstitutor b = TypeSubstitutor.b(asVar2, ao.Z(hashMap));
        for (ao aoVar2 : list) {
            a = (ah) hashMap2.get(aoVar2);
            for (w wVar : aoVar2.bod()) {
                w c = b.c(wVar, Variance.IN_VARIANCE);
                if (c == null) {
                    return null;
                }
                if (!(c == wVar || zArr == null)) {
                    zArr[0] = true;
                }
                a.T(c);
            }
            a.setInitialized();
        }
        return b;
    }
}
