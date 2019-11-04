package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: SimpleFunctionDescriptorImpl */
public class ad extends p implements ai {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        switch (i) {
            case 1:
            case 6:
            case 22:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
            case 8:
            case 21:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 23:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
                objArr[0] = str2;
                break;
            case 11:
            case 15:
                objArr[0] = "typeParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 13:
            case 17:
                objArr[0] = "visibility";
                break;
            case 20:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "initialize";
        String str5 = "create";
        if (i == 10) {
            objArr[1] = str5;
        } else if (i == 14 || i == 18) {
            objArr[1] = str4;
        } else if (i != 19) {
            switch (i) {
                case 24:
                    objArr[1] = str3;
                    break;
                case 25:
                    objArr[1] = "copy";
                    break;
                case 26:
                    objArr[1] = "newCopyBuilder";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "getOriginal";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = str5;
                break;
            case 10:
            case 14:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
                break;
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                objArr[2] = str4;
                break;
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    illegalArgumentException = new IllegalArgumentException(str);
                    break;
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    protected ad(k kVar, ai aiVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(2);
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(4);
        }
        super(kVar, aiVar, fVar, fVar2, kind, ajVar);
    }

    public static ad a(k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, Kind kind, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        if (fVar == null) {
            $$$reportNull$$$0(6);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(7);
        }
        if (kind == null) {
            $$$reportNull$$$0(8);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(9);
        }
        return new ad(kVar, null, fVar, fVar2, kind, ajVar);
    }

    /* renamed from: b */
    public ad a(ah ahVar, ah ahVar2, List<? extends ao> list, List<ar> list2, w wVar, Modality modality, aw awVar) {
        if (list == null) {
            $$$reportNull$$$0(11);
        }
        if (list2 == null) {
            $$$reportNull$$$0(12);
        }
        if (awVar == null) {
            $$$reportNull$$$0(13);
        }
        ad a = a(ahVar, ahVar2, list, list2, wVar, modality, awVar, null);
        if (a == null) {
            $$$reportNull$$$0(14);
        }
        return a;
    }

    public ad a(ah ahVar, ah ahVar2, List<? extends ao> list, List<ar> list2, w wVar, Modality modality, aw awVar, Map<? extends a<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(15);
        }
        if (list2 == null) {
            $$$reportNull$$$0(16);
        }
        if (awVar == null) {
            $$$reportNull$$$0(17);
        }
        super.a(ahVar, ahVar2, list, list2, wVar, modality, awVar);
        if (!(map == null || map.isEmpty())) {
            this.feW = new LinkedHashMap(map);
        }
        return this;
    }

    /* renamed from: bvb */
    public ai bul() {
        ai aiVar = (ai) super.bul();
        if (aiVar == null) {
            $$$reportNull$$$0(19);
        }
        return aiVar;
    }

    /* Access modifiers changed, original: protected */
    public p a(k kVar, s sVar, Kind kind, kotlin.reflect.jvm.internal.impl.name.f fVar, f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(20);
        }
        if (kind == null) {
            $$$reportNull$$$0(21);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(22);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(23);
        }
        ai aiVar = (ai) sVar;
        if (fVar == null) {
            fVar = bsZ();
        }
        return new ad(kVar, aiVar, fVar2, fVar, kind, ajVar);
    }

    /* renamed from: f */
    public ai c(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        ai aiVar = (ai) super.a(kVar, modality, awVar, kind, z);
        if (aiVar == null) {
            $$$reportNull$$$0(25);
        }
        return aiVar;
    }

    public s.a<? extends ai> btp() {
        s.a btp = super.btp();
        if (btp == null) {
            $$$reportNull$$$0(26);
        }
        return btp;
    }
}
