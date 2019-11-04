package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.c;

/* compiled from: JvmAbi */
public final class m {
    public static final b fhi = new b("kotlin.jvm.JvmField");
    public static final a fhj = a.s(new b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "propertyName";
                break;
        }
        String str3 = "setterName";
        String str4 = "getterName";
        String str5 = "getSyntheticMethodNameForAnnotatedTypeAlias";
        String str6 = "getSyntheticMethodNameForAnnotatedProperty";
        if (i == 1) {
            objArr[1] = str6;
        } else if (i == 3) {
            objArr[1] = str5;
        } else if (i == 7) {
            objArr[1] = str4;
        } else if (i != 9) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = str5;
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = str6;
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 1 || i == 3 || i == 7 || i == 9) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static boolean lZ(String str) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str.startsWith("get") || str.startsWith("is");
    }

    public static boolean ma(String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        return str.startsWith("set");
    }

    public static String mb(String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (!md(str)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("get");
            stringBuilder.append(kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.a.mP(str));
            str = stringBuilder.toString();
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        return str;
    }

    public static String mc(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("set");
        stringBuilder.append(md(str) ? str.substring(2) : kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.a.mP(str));
        str = stringBuilder.toString();
        if (str == null) {
            $$$reportNull$$$0(9);
        }
        return str;
    }

    public static boolean md(String str) {
        boolean z = false;
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if ('a' > charAt || charAt > 'z') {
            z = true;
        }
        return z;
    }

    public static boolean g(ae aeVar) {
        if (aeVar == null) {
            $$$reportNull$$$0(10);
        }
        if (aeVar.bsT() == Kind.FAKE_OVERRIDE) {
            return false;
        }
        boolean z = true;
        if (p(aeVar.brj())) {
            return true;
        }
        if (!(c.D(aeVar.brj()) && o(aeVar))) {
            z = false;
        }
        return z;
    }

    public static boolean p(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(11);
        }
        return c.D(kVar) && c.L(kVar.brj()) && !b((d) kVar);
    }

    public static boolean b(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(12);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.c.eZl.b(dVar);
    }

    public static boolean o(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (callableMemberDescriptor instanceof ae) {
            q btK = ((ae) callableMemberDescriptor).btK();
            if (btK != null && btK.brE().j(fhi)) {
                return true;
            }
        }
        return callableMemberDescriptor.brE().j(fhi);
    }
}
