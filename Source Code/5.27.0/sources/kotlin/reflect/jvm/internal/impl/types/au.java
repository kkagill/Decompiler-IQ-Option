package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.j;

/* compiled from: TypeUtils */
public class au {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ad fxD = p.mL("DONT_CARE");
    public static final ad fxE = p.mK("Cannot be inferred");
    public static final ad fxF = new a("NO_EXPECTED_TYPE");
    public static final ad fxG = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils */
    public static class a extends i {
        private final String name;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i != 1) {
                objArr[0] = "newAnnotations";
            } else {
                objArr[0] = str2;
            }
            if (i != 1) {
                objArr[1] = str2;
            } else {
                objArr[1] = "toString";
            }
            if (i != 1) {
                objArr[2] = "replaceAnnotations";
            }
            str = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(str) : new IllegalStateException(str));
        }

        public a(String str) {
            this.name = str;
        }

        /* Access modifiers changed, original: protected */
        public ad bxe() {
            throw new IllegalStateException(this.name);
        }

        /* renamed from: h */
        public ad f(f fVar) {
            if (fVar == null) {
                $$$reportNull$$$0(0);
            }
            throw new IllegalStateException(this.name);
        }

        /* renamed from: gM */
        public ad gL(boolean z) {
            throw new IllegalStateException(this.name);
        }

        public String toString() {
            String str = this.name;
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return str;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        int i3 = i;
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 26:
            case 33:
            case 36:
            case 47:
            case 49:
            case 54:
            case 55:
            case 56:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 34:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 35:
                objArr[0] = "projections";
                break;
            case 37:
                objArr[0] = "a";
                break;
            case 38:
                objArr[0] = "b";
                break;
            case 40:
                objArr[0] = "typeParameters";
                break;
            case 42:
                objArr[0] = "typeParameterConstructors";
                break;
            case 43:
                objArr[0] = "specialType";
                break;
            case 44:
            case 45:
                objArr[0] = "isSpecialType";
                break;
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 48:
            case 52:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 50:
            case 51:
                objArr[0] = "supertypes";
                break;
            case 53:
                objArr[0] = "expectedType";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 == 2) {
            objArr[1] = "makeNullable";
        } else if (i3 == 4) {
            objArr[1] = "makeNotNullable";
        } else if (i3 == 6) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i3 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i3 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i3 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i3 == 33) {
            objArr[1] = "substituteParameters";
        } else if (i3 == 36) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i3 == 47) {
            objArr[1] = "makeStarProjection";
        } else if (i3 != 49) {
            if (i3 != 8 && i3 != 9 && i3 != 11 && i3 != 12) {
                if (i3 != 14 && i3 != 15) {
                    switch (i3) {
                        case 54:
                        case 55:
                        case 56:
                            objArr[1] = "getPrimitiveNumberType";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                            break;
                    }
                }
                objArr[1] = "makeUnsubstitutedType";
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getDefaultPrimitiveNumberType";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 26:
            case 33:
            case 36:
            case 47:
            case 49:
            case 54:
            case 55:
            case 56:
                break;
            case 3:
                objArr[2] = "makeNotNullable";
                break;
            case 5:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 7:
            case 10:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 13:
                objArr[2] = "canHaveSubtypes";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 34:
            case 35:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 37:
            case 38:
                objArr[2] = "equalTypes";
                break;
            case 39:
            case 40:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 41:
            case 42:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 43:
            case 44:
            case 45:
                objArr[2] = "contains";
                break;
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 48:
            case 50:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 51:
                objArr[2] = "findByFqName";
                break;
            case 52:
            case 53:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 57:
                objArr[2] = "isTypeParameter";
                break;
            case 58:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 59:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 60:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    illegalArgumentException = new IllegalArgumentException(format);
                    break;
            }
        }
        illegalArgumentException = new IllegalStateException(format);
        throw illegalArgumentException;
    }

    public static boolean aW(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(0);
        }
        return wVar == fxF || wVar == fxG;
    }

    public static boolean aX(w wVar) {
        return wVar != null && wVar.bMZ() == fxD.bMZ();
    }

    public static w aY(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(1);
        }
        wVar = b(wVar, true);
        if (wVar == null) {
            $$$reportNull$$$0(2);
        }
        return wVar;
    }

    public static w aZ(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(3);
        }
        wVar = b(wVar, false);
        if (wVar == null) {
            $$$reportNull$$$0(4);
        }
        return wVar;
    }

    public static w b(w wVar, boolean z) {
        if (wVar == null) {
            $$$reportNull$$$0(5);
        }
        ay gL = wVar.bPA().gL(z);
        if (gL == null) {
            $$$reportNull$$$0(6);
        }
        return gL;
    }

    public static w c(w wVar, boolean z) {
        if (wVar == null) {
            $$$reportNull$$$0(10);
        }
        if (z) {
            wVar = aY(wVar);
            if (wVar == null) {
                $$$reportNull$$$0(11);
            }
            return wVar;
        }
        if (wVar == null) {
            $$$reportNull$$$0(12);
        }
        return wVar;
    }

    public static ad a(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, h hVar) {
        ad mK;
        if (p.Y(fVar)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsubstituted type for ");
            stringBuilder.append(fVar);
            mK = p.mK(stringBuilder.toString());
            if (mK == null) {
                $$$reportNull$$$0(14);
            }
            return mK;
        }
        an brm = fVar.brm();
        mK = x.a(f.fdA.bug(), brm, cn(brm.getParameters()), false, hVar);
        if (mK == null) {
            $$$reportNull$$$0(15);
        }
        return mK;
    }

    public static List<ap> cn(List<ao> list) {
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ao bsY : list) {
            arrayList.add(new ar(bsY.bsY()));
        }
        List T = u.T(arrayList);
        if (T == null) {
            $$$reportNull$$$0(17);
        }
        return T;
    }

    public static List<w> ba(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(18);
        }
        TypeSubstitutor aV = TypeSubstitutor.aV(wVar);
        Collection<w> bup = wVar.bMZ().bup();
        ArrayList arrayList = new ArrayList(bup.size());
        for (w a : bup) {
            w a2 = a(wVar, a2, aV);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static w a(w wVar, w wVar2, TypeSubstitutor typeSubstitutor) {
        if (wVar == null) {
            $$$reportNull$$$0(20);
        }
        if (wVar2 == null) {
            $$$reportNull$$$0(21);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(22);
        }
        wVar2 = typeSubstitutor.c(wVar2, Variance.INVARIANT);
        return wVar2 != null ? c(wVar2, wVar.boc()) : null;
    }

    public static boolean bb(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(27);
        }
        if (wVar.boc()) {
            return true;
        }
        if (t.aE(wVar) && bb(t.aF(wVar).bPs())) {
            return true;
        }
        if (bf(wVar)) {
            return bd(wVar);
        }
        an bMZ = wVar.bMZ();
        if (bMZ instanceof v) {
            for (w bb : bMZ.bup()) {
                if (bb(bb)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean bc(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(28);
        }
        if (wVar.boc()) {
            return true;
        }
        if (t.aE(wVar) && bc(t.aF(wVar).bPs())) {
            return true;
        }
        return false;
    }

    public static boolean bd(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(29);
        }
        if (wVar.bMZ().brQ() instanceof d) {
            return false;
        }
        for (w bb : ba(wVar)) {
            if (bb(bb)) {
                return true;
            }
        }
        return false;
    }

    public static d be(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(30);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        return brQ instanceof d ? (d) brQ : null;
    }

    public static boolean b(w wVar, b<ay, Boolean> bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(44);
        }
        return a(wVar, (b) bVar, new HashSet());
    }

    private static boolean a(w wVar, b<ay, Boolean> bVar, HashSet<w> hashSet) {
        if (bVar == null) {
            $$$reportNull$$$0(45);
        }
        if (wVar == null || hashSet.contains(wVar)) {
            return false;
        }
        hashSet.add(wVar);
        ay bPA = wVar.bPA();
        if (((Boolean) bVar.invoke(bPA)).booleanValue()) {
            return true;
        }
        q qVar = bPA instanceof q ? (q) bPA : null;
        if (qVar != null && (a(qVar.bPr(), (b) bVar, (HashSet) hashSet) || a(qVar.bPs(), (b) bVar, (HashSet) hashSet))) {
            return true;
        }
        if ((bPA instanceof g) && a(((g) bPA).bPl(), (b) bVar, (HashSet) hashSet)) {
            return true;
        }
        an bMZ = wVar.bMZ();
        if (bMZ instanceof v) {
            for (w a : ((v) bMZ).bup()) {
                if (a(a, (b) bVar, (HashSet) hashSet)) {
                    return true;
                }
            }
            return false;
        }
        for (ap apVar : wVar.btD()) {
            if (!apVar.bPC()) {
                if (a(apVar.bpT(), (b) bVar, (HashSet) hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ap d(ao aoVar) {
        if (aoVar == null) {
            $$$reportNull$$$0(46);
        }
        return new ah(aoVar);
    }

    public static boolean bf(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(57);
        }
        return bg(wVar) != null || (wVar.bMZ() instanceof j);
    }

    public static ao bg(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(60);
        }
        return wVar.bMZ().brQ() instanceof ao ? (ao) wVar.bMZ().brQ() : null;
    }
}
