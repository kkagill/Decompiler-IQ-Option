package kotlin.reflect.jvm.internal.impl.resolve;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ab;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ac;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorFactory */
public class b {

    /* compiled from: DescriptorFactory */
    private static class a extends f {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public a(d dVar, aj ajVar) {
            if (dVar == null) {
                $$$reportNull$$$0(0);
            }
            if (ajVar == null) {
                $$$reportNull$$$0(1);
            }
            super(dVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), true, Kind.DECLARATION, ajVar);
            a(Collections.emptyList(), c.J(dVar));
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        int i2 = i;
        String str = (i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i3 = (i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? 2 : 3;
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        switch (i2) {
            case 1:
            case 5:
            case 10:
            case 16:
            case 19:
            case 22:
            case 36:
                objArr[0] = "annotations";
                break;
            case 2:
            case 6:
            case 11:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 8:
            case 14:
            case 17:
            case 20:
            case 24:
            case 27:
            case 29:
            case 31:
                objArr[0] = str2;
                break;
            case 7:
            case 13:
            case 23:
                objArr[0] = "sourceElement";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 25:
                objArr[0] = "containingClass";
                break;
            case 26:
                objArr[0] = "source";
                break;
            case 28:
            case 30:
                objArr[0] = "enumClass";
                break;
            case 32:
            case 33:
            case 34:
                objArr[0] = "descriptor";
                break;
            case 35:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        String str3 = "createSetter";
        String str4 = "createDefaultSetter";
        if (i2 == 3) {
            objArr[1] = str4;
        } else if (i2 == 8 || i2 == 14) {
            objArr[1] = str3;
        } else if (i2 == 17) {
            objArr[1] = "createDefaultGetter";
        } else if (i2 == 20 || i2 == 24) {
            objArr[1] = "createGetter";
        } else if (i2 == 27) {
            objArr[1] = "createPrimaryConstructorForObject";
        } else if (i2 == 29) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 31) {
            objArr[1] = str2;
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 8:
            case 14:
            case 17:
            case 20:
            case 24:
            case 27:
            case 29:
            case 31:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = str3;
                break;
            case 15:
            case 16:
                objArr[2] = "createDefaultGetter";
                break;
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
                objArr[2] = "createGetter";
                break;
            case 25:
            case 26:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 28:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 30:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 32:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 33:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 34:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 35:
            case 36:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = str4;
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static ab a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2) {
        if (aeVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(2);
        }
        ab a = a(aeVar, fVar, fVar2, true, false, false, aeVar.brF());
        if (a == null) {
            $$$reportNull$$$0(3);
        }
        return a;
    }

    public static ab a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, boolean z, boolean z2, boolean z3, aj ajVar) {
        if (aeVar == null) {
            $$$reportNull$$$0(4);
        }
        if (fVar == null) {
            $$$reportNull$$$0(5);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(6);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(7);
        }
        ab a = a(aeVar, fVar, fVar2, z, z2, z3, aeVar.brx(), ajVar);
        if (a == null) {
            $$$reportNull$$$0(8);
        }
        return a;
    }

    public static ab a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar2, boolean z, boolean z2, boolean z3, aw awVar, aj ajVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar3 = fVar2;
        if (aeVar == null) {
            $$$reportNull$$$0(9);
        }
        if (fVar == null) {
            $$$reportNull$$$0(10);
        }
        if (fVar3 == null) {
            $$$reportNull$$$0(11);
        }
        if (awVar == null) {
            $$$reportNull$$$0(12);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(13);
        }
        ab abVar = new ab(aeVar, fVar, aeVar.bru(), awVar, z, z2, z3, Kind.DECLARATION, null, ajVar);
        abVar.c(ab.a(abVar, aeVar.bpT(), fVar2));
        return abVar;
    }

    public static aa a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        if (aeVar == null) {
            $$$reportNull$$$0(15);
        }
        if (fVar == null) {
            $$$reportNull$$$0(16);
        }
        aa a = a(aeVar, fVar, true, false, false);
        if (a == null) {
            $$$reportNull$$$0(17);
        }
        return a;
    }

    public static aa a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, boolean z2, boolean z3) {
        if (aeVar == null) {
            $$$reportNull$$$0(18);
        }
        if (fVar == null) {
            $$$reportNull$$$0(19);
        }
        aa a = a(aeVar, fVar, z, z2, z3, aeVar.brF());
        if (a == null) {
            $$$reportNull$$$0(20);
        }
        return a;
    }

    public static aa a(ae aeVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, boolean z, boolean z2, boolean z3, aj ajVar) {
        if (aeVar == null) {
            $$$reportNull$$$0(21);
        }
        if (fVar == null) {
            $$$reportNull$$$0(22);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(23);
        }
        return new aa(aeVar, fVar, aeVar.bru(), aeVar.brx(), z, z2, z3, Kind.DECLARATION, null, ajVar);
    }

    public static f a(d dVar, aj ajVar) {
        if (dVar == null) {
            $$$reportNull$$$0(25);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(26);
        }
        return new a(dVar, ajVar);
    }

    public static ai G(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(28);
        }
        ad b = ad.a((k) dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), c.fsO, Kind.SYNTHESIZED, dVar.brF()).a(null, null, Collections.emptyList(), Collections.emptyList(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(dVar).a(Variance.INVARIANT, dVar.bsY()), Modality.FINAL, av.fde);
        if (b == null) {
            $$$reportNull$$$0(29);
        }
        return b;
    }

    public static ai H(d dVar) {
        k kVar = dVar;
        if (kVar == null) {
            $$$reportNull$$$0(30);
        }
        ad a = ad.a(kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), c.fsP, Kind.SYNTHESIZED, dVar.brF());
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ai aiVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ai(a, null, 0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), kotlin.reflect.jvm.internal.impl.name.f.ms(ConditionalUserProperty.VALUE), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.Q(dVar).bqY(), false, false, false, null, dVar.brF());
        ad b = a.a(null, null, Collections.emptyList(), Collections.singletonList(aiVar), dVar.bsY(), Modality.FINAL, av.fde);
        if (b == null) {
            $$$reportNull$$$0(31);
        }
        return b;
    }

    public static boolean j(s sVar) {
        if (sVar == null) {
            $$$reportNull$$$0(32);
        }
        return sVar.bsZ().equals(c.fsO) && l(sVar);
    }

    public static boolean k(s sVar) {
        if (sVar == null) {
            $$$reportNull$$$0(33);
        }
        return sVar.bsZ().equals(c.fsP) && l(sVar);
    }

    private static boolean l(s sVar) {
        if (sVar == null) {
            $$$reportNull$$$0(34);
        }
        return sVar.bsT() == Kind.SYNTHESIZED && c.H(sVar.brj());
    }

    public static ah a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, w wVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        if (aVar == null) {
            $$$reportNull$$$0(35);
        }
        if (fVar == null) {
            $$$reportNull$$$0(36);
        }
        return wVar == null ? null : new ac(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.a.b(aVar, wVar, null), fVar);
    }
}
