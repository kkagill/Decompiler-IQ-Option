package kotlin.reflect.jvm.internal.impl.resolve;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: DescriptorUtils */
public class c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final f fsO = f.ms("values");
    public static final f fsP = f.ms("valueOf");
    public static final b fsQ = new b("kotlin.coroutines");
    public static final b fsR = fsQ.C(f.ms("experimental"));
    public static final b fsS = fsR.C(f.ms("intrinsics"));
    public static final b fsT;
    public static final b fsU;
    public static final b fsV = new b("kotlin.Result");
    public static final b fsW = new b("kotlin.jvm.JvmName");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
            case 20:
            case 22:
            case 23:
            case 33:
            case 34:
            case 35:
            case 55:
            case 56:
            case 57:
            case 59:
            case 77:
            case 90:
            case 92:
                objArr[0] = "descriptor";
                break;
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                objArr[0] = str2;
                break;
            case 15:
                objArr[0] = "first";
                break;
            case 16:
                objArr[0] = "second";
                break;
            case 17:
            case 18:
                objArr[0] = "aClass";
                break;
            case 19:
                objArr[0] = "kotlinType";
                break;
            case 24:
                objArr[0] = "declarationDescriptor";
                break;
            case 25:
            case 27:
                objArr[0] = "subClass";
                break;
            case 26:
            case 28:
            case 32:
                objArr[0] = "superClass";
                break;
            case 29:
            case 31:
            case 44:
            case 63:
                objArr[0] = "type";
                break;
            case 30:
                objArr[0] = "other";
                break;
            case 36:
                objArr[0] = "classKind";
                break;
            case 37:
            case 38:
            case 40:
            case 43:
            case 48:
            case 52:
            case 64:
            case 65:
            case 66:
            case 73:
            case 74:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 53:
                objArr[0] = "innerClassName";
                break;
            case 54:
                objArr[0] = "location";
                break;
            case 62:
                objArr[0] = "variable";
                break;
            case 67:
                objArr[0] = "f";
                break;
            case 69:
                objArr[0] = "current";
                break;
            case 70:
                objArr[0] = "result";
                break;
            case 71:
                objArr[0] = "memberDescriptor";
                break;
            case 75:
            case 76:
                objArr[0] = "annotated";
                break;
            case 80:
            case 82:
            case 85:
            case 87:
                objArr[0] = "scope";
                break;
            case 83:
            case 86:
            case 88:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "unwrapFakeOverride";
        String str4 = "getDefaultConstructorVisibility";
        String str5 = "getClassDescriptorForTypeConstructor";
        String str6 = "getClassDescriptorForType";
        String str7 = "getSuperClassType";
        String str8 = "getSuperclassDescriptors";
        String str9 = "getContainingModule";
        String str10 = "getFqNameFromTopLevelClass";
        String str11 = "getFqNameUnsafe";
        String str12 = "getFqNameSafe";
        String str13 = "getFqName";
        switch (i) {
            case 3:
                objArr[1] = str13;
                break;
            case 5:
                objArr[1] = str12;
                break;
            case 8:
                objArr[1] = str11;
                break;
            case 10:
            case 11:
                objArr[1] = str10;
                break;
            case 21:
                objArr[1] = str9;
                break;
            case 39:
                objArr[1] = str8;
                break;
            case 41:
            case 42:
                objArr[1] = str7;
                break;
            case 45:
                objArr[1] = str6;
                break;
            case 47:
                objArr[1] = str5;
                break;
            case 49:
            case 50:
            case 51:
                objArr[1] = str4;
                break;
            case 58:
                objArr[1] = str3;
                break;
            case 60:
            case 61:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 68:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 78:
            case 79:
                objArr[1] = "getContainingSourceFile";
                break;
            case 81:
                objArr[1] = "getAllDescriptors";
                break;
            case 84:
                objArr[1] = "getFunctionByName";
                break;
            case 89:
                objArr[1] = "getPropertyByName";
                break;
            case 91:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = str13;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                break;
            case 4:
                objArr[2] = str12;
                break;
            case 6:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 7:
                objArr[2] = str11;
                break;
            case 9:
                objArr[2] = str10;
                break;
            case 12:
                objArr[2] = "isExtension";
                break;
            case 13:
                objArr[2] = "isOverride";
                break;
            case 14:
                objArr[2] = "isStaticDeclaration";
                break;
            case 15:
            case 16:
                objArr[2] = "areInSameModule";
                break;
            case 17:
            case 18:
                objArr[2] = "getParentOfType";
                break;
            case 19:
            case 22:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 20:
                objArr[2] = str9;
                break;
            case 23:
                objArr[2] = "getContainingClass";
                break;
            case 24:
                objArr[2] = "isAncestor";
                break;
            case 25:
            case 26:
                objArr[2] = "isDirectSubclass";
                break;
            case 27:
            case 28:
                objArr[2] = "isSubclass";
                break;
            case 29:
            case 30:
                objArr[2] = "isSameClass";
                break;
            case 31:
            case 32:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 33:
                objArr[2] = "isAnonymousObject";
                break;
            case 34:
                objArr[2] = "isAnonymousFunction";
                break;
            case 35:
                objArr[2] = "isEnumEntry";
                break;
            case 36:
                objArr[2] = "isKindOf";
                break;
            case 37:
                objArr[2] = "hasAbstractMembers";
                break;
            case 38:
                objArr[2] = str8;
                break;
            case 40:
                objArr[2] = str7;
                break;
            case 43:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 44:
                objArr[2] = str6;
                break;
            case 46:
                objArr[2] = str5;
                break;
            case 48:
                objArr[2] = str4;
                break;
            case 52:
            case 53:
            case 54:
                objArr[2] = "getInnerClassByName";
                break;
            case 55:
                objArr[2] = "isStaticNestedClass";
                break;
            case 56:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 57:
                objArr[2] = str3;
                break;
            case 59:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 62:
            case 63:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 64:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 66:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 67:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 69:
            case 70:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 73:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 74:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 75:
                objArr[2] = "getJvmName";
                break;
            case 76:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 77:
                objArr[2] = "getContainingSourceFile";
                break;
            case 80:
                objArr[2] = "getAllDescriptors";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByName";
                break;
            case 85:
            case 86:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 87:
            case 88:
                objArr[2] = "getPropertyByName";
                break;
            case 90:
                objArr[2] = "getDirectMember";
                break;
            case 92:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    static {
        String str = "Continuation";
        fsT = fsR.C(f.ms(str));
        fsU = fsQ.C(f.ms(str));
    }

    private c() {
    }

    public static ah t(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        return kVar instanceof d ? ((d) kVar).bte() : null;
    }

    public static boolean u(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(1);
        }
        while (kVar != null) {
            if (F(kVar) || v(kVar)) {
                return true;
            }
            kVar = kVar.brj();
        }
        return false;
    }

    public static boolean v(k kVar) {
        return (kVar instanceof o) && ((o) kVar).brx() == av.fdf;
    }

    public static kotlin.reflect.jvm.internal.impl.name.c w(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(2);
        }
        b y = y(kVar);
        kotlin.reflect.jvm.internal.impl.name.c bKa = y != null ? y.bKa() : z(kVar);
        if (bKa == null) {
            $$$reportNull$$$0(3);
        }
        return bKa;
    }

    public static b x(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(4);
        }
        b y = y(kVar);
        if (y == null) {
            y = z(kVar).bKf();
        }
        if (y == null) {
            $$$reportNull$$$0(5);
        }
        return y;
    }

    private static b y(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(6);
        }
        if ((kVar instanceof v) || p.Y(kVar)) {
            return b.fpl;
        }
        if (kVar instanceof aa) {
            return ((aa) kVar).btB();
        }
        return kVar instanceof y ? ((y) kVar).btB() : null;
    }

    private static kotlin.reflect.jvm.internal.impl.name.c z(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(7);
        }
        kotlin.reflect.jvm.internal.impl.name.c F = w(kVar.brj()).F(kVar.bsZ());
        if (F == null) {
            $$$reportNull$$$0(8);
        }
        return F;
    }

    public static boolean A(k kVar) {
        return kVar != null && (kVar.brj() instanceof y);
    }

    public static boolean f(k kVar, k kVar2) {
        if (kVar == null) {
            $$$reportNull$$$0(15);
        }
        if (kVar2 == null) {
            $$$reportNull$$$0(16);
        }
        return B(kVar).equals(B(kVar2));
    }

    public static <D extends k> D a(k kVar, Class<D> cls) {
        if (cls == null) {
            $$$reportNull$$$0(17);
        }
        return a(kVar, cls, true);
    }

    public static <D extends k> D a(k kVar, Class<D> cls, boolean z) {
        if (cls == null) {
            $$$reportNull$$$0(18);
        }
        if (kVar == null) {
            return null;
        }
        Object kVar2;
        if (z) {
            kVar2 = kVar2.brj();
        }
        while (kVar2 != null) {
            if (cls.isInstance(kVar2)) {
                return kVar2;
            }
            kVar2 = kVar2.brj();
        }
        return null;
    }

    public static v am(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(19);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (brQ == null) {
            return null;
        }
        return C(brQ);
    }

    public static v B(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(20);
        }
        v C = C(kVar);
        if (C == null) {
            $$$reportNull$$$0(21);
        }
        return C;
    }

    public static v C(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(22);
        }
        while (kVar != null) {
            if (kVar instanceof v) {
                return (v) kVar;
            }
            if (kVar instanceof aa) {
                return ((aa) kVar).bql();
            }
            kVar = kVar.brj();
        }
        return null;
    }

    public static boolean c(d dVar, d dVar2) {
        if (dVar == null) {
            $$$reportNull$$$0(25);
        }
        if (dVar2 == null) {
            $$$reportNull$$$0(26);
        }
        for (w a : dVar.brm().bup()) {
            if (a(a, dVar2.btf())) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(d dVar, d dVar2) {
        if (dVar == null) {
            $$$reportNull$$$0(27);
        }
        if (dVar2 == null) {
            $$$reportNull$$$0(28);
        }
        return b(dVar.bsY(), dVar2.btf());
    }

    private static boolean a(w wVar, k kVar) {
        if (wVar == null) {
            $$$reportNull$$$0(29);
        }
        if (kVar == null) {
            $$$reportNull$$$0(30);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (brQ != null) {
            k bsW = brQ.bsW();
            if ((bsW instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) && (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) && ((kotlin.reflect.jvm.internal.impl.descriptors.f) kVar).brm().equals(((kotlin.reflect.jvm.internal.impl.descriptors.f) bsW).brm())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(w wVar, k kVar) {
        if (wVar == null) {
            $$$reportNull$$$0(31);
        }
        if (kVar == null) {
            $$$reportNull$$$0(32);
        }
        if (a(wVar, kVar)) {
            return true;
        }
        for (w b : wVar.bMZ().bup()) {
            if (b(b, kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(k kVar) {
        return a(kVar, ClassKind.OBJECT) && ((d) kVar).bry();
    }

    public static boolean E(k kVar) {
        return a(kVar, ClassKind.CLASS) && ((d) kVar).bru() == Modality.SEALED;
    }

    public static boolean F(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(33);
        }
        return K(kVar) && kVar.bsZ().equals(h.fpy);
    }

    public static boolean G(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(35);
        }
        return a(kVar, ClassKind.ENUM_ENTRY);
    }

    public static boolean H(k kVar) {
        return a(kVar, ClassKind.ENUM_CLASS);
    }

    public static boolean I(k kVar) {
        return a(kVar, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean J(k kVar) {
        return a(kVar, ClassKind.INTERFACE);
    }

    public static boolean K(k kVar) {
        return a(kVar, ClassKind.CLASS);
    }

    public static boolean L(k kVar) {
        return K(kVar) || H(kVar);
    }

    private static boolean a(k kVar, ClassKind classKind) {
        if (classKind == null) {
            $$$reportNull$$$0(36);
        }
        return (kVar instanceof d) && ((d) kVar).brt() == classKind;
    }

    public static d I(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(43);
        }
        for (w an : dVar.brm().bup()) {
            d an2 = an(an);
            if (an2.brt() != ClassKind.INTERFACE) {
                return an2;
            }
        }
        return null;
    }

    public static d an(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(44);
        }
        d b = b(wVar.bMZ());
        if (b == null) {
            $$$reportNull$$$0(45);
        }
        return b;
    }

    public static d b(an anVar) {
        if (anVar == null) {
            $$$reportNull$$$0(46);
        }
        d dVar = (d) anVar.brQ();
        if (dVar == null) {
            $$$reportNull$$$0(47);
        }
        return dVar;
    }

    public static aw J(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(48);
        }
        ClassKind brt = dVar.brt();
        aw awVar;
        if (brt == ClassKind.ENUM_CLASS || brt.isSingleton() || E(dVar)) {
            awVar = av.fda;
            if (awVar == null) {
                $$$reportNull$$$0(49);
            }
            return awVar;
        } else if (F(dVar)) {
            awVar = av.fdl;
            if (awVar == null) {
                $$$reportNull$$$0(50);
            }
            return awVar;
        } else {
            awVar = av.fde;
            if (awVar == null) {
                $$$reportNull$$$0(51);
            }
            return awVar;
        }
    }

    public static <D extends CallableMemberDescriptor> D z(D d) {
        CallableMemberDescriptor d2;
        if (d2 == null) {
            $$$reportNull$$$0(57);
        }
        while (d2.bsT() == Kind.FAKE_OVERRIDE) {
            Collection bsR = d2.bsR();
            if (bsR.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fake override should have at least one overridden descriptor: ");
                stringBuilder.append(d2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            d2 = (CallableMemberDescriptor) bsR.iterator().next();
        }
        if (d2 == null) {
            $$$reportNull$$$0(58);
        }
        return d2;
    }

    public static <D extends o> D a(D d) {
        if (d == null) {
            $$$reportNull$$$0(59);
        }
        if (d instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor z = z((CallableMemberDescriptor) d);
            if (z == null) {
                $$$reportNull$$$0(60);
            }
            return z;
        }
        if (d == null) {
            $$$reportNull$$$0(61);
        }
        return d;
    }

    public static boolean a(at atVar, w wVar) {
        if (atVar == null) {
            $$$reportNull$$$0(62);
        }
        if (wVar == null) {
            $$$reportNull$$$0(63);
        }
        boolean z = false;
        if (!(atVar.btW() || kotlin.reflect.jvm.internal.impl.types.y.aJ(wVar))) {
            if (au.bc(wVar)) {
                return true;
            }
            g Q = a.Q(atVar);
            if (g.q(wVar) || kotlin.reflect.jvm.internal.impl.types.checker.b.fxI.d(Q.bqY(), wVar) || kotlin.reflect.jvm.internal.impl.types.checker.b.fxI.d(Q.bqF().bsY(), wVar) || kotlin.reflect.jvm.internal.impl.types.checker.b.fxI.d(Q.bqM(), wVar) || kotlin.reflect.jvm.internal.impl.builtins.k.fby.J(wVar)) {
                z = true;
            }
        }
        return z;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> f(D d) {
        if (d == null) {
            $$$reportNull$$$0(67);
        }
        Set linkedHashSet = new LinkedHashSet();
        a(d.bsO(), linkedHashSet);
        return linkedHashSet;
    }

    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void a(D d, Set<D> set) {
        if (d == null) {
            $$$reportNull$$$0(69);
        }
        if (set == null) {
            $$$reportNull$$$0(70);
        }
        if (!set.contains(d)) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.a bsO : d.bsO().bsR()) {
                kotlin.reflect.jvm.internal.impl.descriptors.a bsO2 = bsO2.bsO();
                a(bsO2, (Set) set);
                set.add(bsO2);
            }
        }
    }

    public static ak M(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(77);
        }
        if (kVar instanceof ag) {
            kVar = ((ag) kVar).btF();
        }
        ak bqg;
        if (kVar instanceof n) {
            bqg = ((n) kVar).brF().bqg();
            if (bqg == null) {
                $$$reportNull$$$0(78);
            }
            return bqg;
        }
        bqg = ak.fcW;
        if (bqg == null) {
            $$$reportNull$$$0(79);
        }
        return bqg;
    }
}
