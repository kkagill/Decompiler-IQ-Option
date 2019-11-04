package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.aa;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.v;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.storage.e;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.au;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;

/* compiled from: KotlinBuiltIns */
public abstract class g {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final a eZA = new a();
    public static final f eZB = f.mu("<built-ins module>");
    public static final f eZo = f.ms("kotlin");
    public static final kotlin.reflect.jvm.internal.impl.name.b eZp = kotlin.reflect.jvm.internal.impl.name.b.E(eZo);
    private static final kotlin.reflect.jvm.internal.impl.name.b eZq = eZp.C(f.ms("annotation"));
    public static final kotlin.reflect.jvm.internal.impl.name.b eZr = eZp.C(f.ms("collections"));
    public static final kotlin.reflect.jvm.internal.impl.name.b eZs = eZp.C(f.ms("ranges"));
    public static final kotlin.reflect.jvm.internal.impl.name.b eZt = eZp.C(f.ms("text"));
    public static final Set<kotlin.reflect.jvm.internal.impl.name.b> eZu = al.setOf(eZp, eZr, eZs, eZq, i.brd(), eZp.C(f.ms("internal")), c.fsQ);
    private v eZv;
    private final e<b> eZw;
    private final e<Collection<aa>> eZx;
    private final kotlin.reflect.jvm.internal.impl.storage.b<f, d> eZy;
    private final h eZz;

    /* compiled from: KotlinBuiltIns */
    public static class a {
        public final kotlin.reflect.jvm.internal.impl.name.c eZD = lS("Any");
        public final kotlin.reflect.jvm.internal.impl.name.c eZE = lS("Nothing");
        public final kotlin.reflect.jvm.internal.impl.name.c eZF = lS("Cloneable");
        public final kotlin.reflect.jvm.internal.impl.name.b eZG = lT("Suppress");
        public final kotlin.reflect.jvm.internal.impl.name.c eZH = lS("Unit");
        public final kotlin.reflect.jvm.internal.impl.name.c eZI = lS("CharSequence");
        public final kotlin.reflect.jvm.internal.impl.name.c eZJ = lS("String");
        public final kotlin.reflect.jvm.internal.impl.name.c eZK = lS("Array");
        public final kotlin.reflect.jvm.internal.impl.name.c eZL = lS("Boolean");
        public final kotlin.reflect.jvm.internal.impl.name.c eZM = lS("Char");
        public final kotlin.reflect.jvm.internal.impl.name.c eZN = lS("Byte");
        public final kotlin.reflect.jvm.internal.impl.name.c eZO = lS("Short");
        public final kotlin.reflect.jvm.internal.impl.name.c eZP = lS("Int");
        public final kotlin.reflect.jvm.internal.impl.name.c eZQ = lS("Long");
        public final kotlin.reflect.jvm.internal.impl.name.c eZR = lS("Float");
        public final kotlin.reflect.jvm.internal.impl.name.c eZS = lS("Double");
        public final kotlin.reflect.jvm.internal.impl.name.c eZT = lS("Number");
        public final kotlin.reflect.jvm.internal.impl.name.c eZU = lS("Enum");
        public final kotlin.reflect.jvm.internal.impl.name.c eZV = lS("Function");
        public final kotlin.reflect.jvm.internal.impl.name.b eZW = lT("Throwable");
        public final kotlin.reflect.jvm.internal.impl.name.b eZX = lT("Comparable");
        public final kotlin.reflect.jvm.internal.impl.name.c eZY = lV("IntRange");
        public final kotlin.reflect.jvm.internal.impl.name.c eZZ = lV("LongRange");
        public final kotlin.reflect.jvm.internal.impl.name.b faA = lU("MutableListIterator");
        public final kotlin.reflect.jvm.internal.impl.name.b faB = lU("MutableSet");
        public final kotlin.reflect.jvm.internal.impl.name.b faC = lU("MutableMap");
        public final kotlin.reflect.jvm.internal.impl.name.b faD = this.faC.C(f.ms("MutableEntry"));
        public final kotlin.reflect.jvm.internal.impl.name.c faE = lW("KClass");
        public final kotlin.reflect.jvm.internal.impl.name.c faF = lW("KCallable");
        public final kotlin.reflect.jvm.internal.impl.name.c faG = lW("KProperty0");
        public final kotlin.reflect.jvm.internal.impl.name.c faH = lW("KProperty1");
        public final kotlin.reflect.jvm.internal.impl.name.c faI = lW("KProperty2");
        public final kotlin.reflect.jvm.internal.impl.name.c faJ = lW("KMutableProperty0");
        public final kotlin.reflect.jvm.internal.impl.name.c faK = lW("KMutableProperty1");
        public final kotlin.reflect.jvm.internal.impl.name.c faL = lW("KMutableProperty2");
        public final kotlin.reflect.jvm.internal.impl.name.c faM = lW("KProperty");
        public final kotlin.reflect.jvm.internal.impl.name.c faN = lW("KMutableProperty");
        public final kotlin.reflect.jvm.internal.impl.name.a faO = kotlin.reflect.jvm.internal.impl.name.a.s(this.faM.bKf());
        public final kotlin.reflect.jvm.internal.impl.name.b faP = lT("UByte");
        public final kotlin.reflect.jvm.internal.impl.name.b faQ = lT("UShort");
        public final kotlin.reflect.jvm.internal.impl.name.b faR = lT("UInt");
        public final kotlin.reflect.jvm.internal.impl.name.b faS = lT("ULong");
        public final kotlin.reflect.jvm.internal.impl.name.a faT = kotlin.reflect.jvm.internal.impl.name.a.s(this.faP);
        public final kotlin.reflect.jvm.internal.impl.name.a faU = kotlin.reflect.jvm.internal.impl.name.a.s(this.faQ);
        public final kotlin.reflect.jvm.internal.impl.name.a faV = kotlin.reflect.jvm.internal.impl.name.a.s(this.faR);
        public final kotlin.reflect.jvm.internal.impl.name.a faW = kotlin.reflect.jvm.internal.impl.name.a.s(this.faS);
        public final Set<f> faX = kotlin.reflect.jvm.internal.impl.utils.a.cs(PrimitiveType.values().length);
        public final Set<f> faY = kotlin.reflect.jvm.internal.impl.utils.a.cs(PrimitiveType.values().length);
        public final Map<kotlin.reflect.jvm.internal.impl.name.c, PrimitiveType> faZ = kotlin.reflect.jvm.internal.impl.utils.a.ch(PrimitiveType.values().length);
        public final kotlin.reflect.jvm.internal.impl.name.b faa = lT("Deprecated");
        public final kotlin.reflect.jvm.internal.impl.name.b fab = lT("DeprecationLevel");
        public final kotlin.reflect.jvm.internal.impl.name.b fac = lT("ReplaceWith");
        public final kotlin.reflect.jvm.internal.impl.name.b fad = lT("ExtensionFunctionType");
        public final kotlin.reflect.jvm.internal.impl.name.b fae = lT("ParameterName");
        public final kotlin.reflect.jvm.internal.impl.name.b faf = lT("Annotation");
        public final kotlin.reflect.jvm.internal.impl.name.b fag = lX("Target");
        public final kotlin.reflect.jvm.internal.impl.name.b fah = lX("AnnotationTarget");
        public final kotlin.reflect.jvm.internal.impl.name.b fai = lX("AnnotationRetention");
        public final kotlin.reflect.jvm.internal.impl.name.b faj = lX("Retention");
        public final kotlin.reflect.jvm.internal.impl.name.b fak = lX("Repeatable");
        public final kotlin.reflect.jvm.internal.impl.name.b fal = lX("MustBeDocumented");
        public final kotlin.reflect.jvm.internal.impl.name.b fam = lT("UnsafeVariance");
        public final kotlin.reflect.jvm.internal.impl.name.b fan = lT("PublishedApi");
        public final kotlin.reflect.jvm.internal.impl.name.b fao = lU("Iterator");
        public final kotlin.reflect.jvm.internal.impl.name.b fap = lU("Iterable");
        public final kotlin.reflect.jvm.internal.impl.name.b faq = lU("Collection");
        public final kotlin.reflect.jvm.internal.impl.name.b far = lU("List");
        public final kotlin.reflect.jvm.internal.impl.name.b fas = lU("ListIterator");
        public final kotlin.reflect.jvm.internal.impl.name.b fat = lU("Set");
        public final kotlin.reflect.jvm.internal.impl.name.b fau = lU("Map");
        public final kotlin.reflect.jvm.internal.impl.name.b fav = this.fau.C(f.ms("Entry"));
        public final kotlin.reflect.jvm.internal.impl.name.b faw = lU("MutableIterator");
        public final kotlin.reflect.jvm.internal.impl.name.b fax = lU("MutableIterable");
        public final kotlin.reflect.jvm.internal.impl.name.b fay = lU("MutableCollection");
        public final kotlin.reflect.jvm.internal.impl.name.b faz = lU("MutableList");
        public final Map<kotlin.reflect.jvm.internal.impl.name.c, PrimitiveType> fba = kotlin.reflect.jvm.internal.impl.utils.a.ch(PrimitiveType.values().length);

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            int i3 = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? 2 : 3;
            Object[] objArr = new Object[i3];
            String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) {
                objArr[0] = str2;
            } else {
                objArr[0] = "simpleName";
            }
            String str3 = "annotationName";
            String str4 = "reflect";
            String str5 = "rangesFqName";
            String str6 = "collectionsFqName";
            String str7 = "fqName";
            String str8 = "fqNameUnsafe";
            if (i2 == 1) {
                objArr[1] = str8;
            } else if (i2 == 3) {
                objArr[1] = str7;
            } else if (i2 == 5) {
                objArr[1] = str6;
            } else if (i2 == 7) {
                objArr[1] = str5;
            } else if (i2 == 9) {
                objArr[1] = str4;
            } else if (i2 != 11) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = str7;
                    break;
                case 4:
                    objArr[2] = str6;
                    break;
                case 6:
                    objArr[2] = str5;
                    break;
                case 8:
                    objArr[2] = str4;
                    break;
                case 10:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = str8;
                    break;
            }
            str = String.format(str, objArr);
            IllegalArgumentException illegalStateException = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11) ? new IllegalStateException(str) : new IllegalArgumentException(str);
            throw illegalStateException;
        }

        public a() {
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                this.faX.add(primitiveType.getTypeName());
                this.faY.add(primitiveType.getArrayTypeName());
                this.faZ.put(lS(primitiveType.getTypeName().boi()), primitiveType);
                this.fba.put(lS(primitiveType.getArrayTypeName().boi()), primitiveType);
            }
        }

        private static kotlin.reflect.jvm.internal.impl.name.c lS(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            kotlin.reflect.jvm.internal.impl.name.c bKa = lT(str).bKa();
            if (bKa == null) {
                $$$reportNull$$$0(1);
            }
            return bKa;
        }

        private static kotlin.reflect.jvm.internal.impl.name.b lT(String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            kotlin.reflect.jvm.internal.impl.name.b C = g.eZp.C(f.ms(str));
            if (C == null) {
                $$$reportNull$$$0(3);
            }
            return C;
        }

        private static kotlin.reflect.jvm.internal.impl.name.b lU(String str) {
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            kotlin.reflect.jvm.internal.impl.name.b C = g.eZr.C(f.ms(str));
            if (C == null) {
                $$$reportNull$$$0(5);
            }
            return C;
        }

        private static kotlin.reflect.jvm.internal.impl.name.c lV(String str) {
            if (str == null) {
                $$$reportNull$$$0(6);
            }
            kotlin.reflect.jvm.internal.impl.name.c bKa = g.eZs.C(f.ms(str)).bKa();
            if (bKa == null) {
                $$$reportNull$$$0(7);
            }
            return bKa;
        }

        private static kotlin.reflect.jvm.internal.impl.name.c lW(String str) {
            if (str == null) {
                $$$reportNull$$$0(8);
            }
            kotlin.reflect.jvm.internal.impl.name.c bKa = i.brd().C(f.ms(str)).bKa();
            if (bKa == null) {
                $$$reportNull$$$0(9);
            }
            return bKa;
        }

        private static kotlin.reflect.jvm.internal.impl.name.b lX(String str) {
            if (str == null) {
                $$$reportNull$$$0(10);
            }
            kotlin.reflect.jvm.internal.impl.name.b C = g.eZq.C(f.ms(str));
            if (C == null) {
                $$$reportNull$$$0(11);
            }
            return C;
        }
    }

    /* compiled from: KotlinBuiltIns */
    private static class b {
        public final Map<PrimitiveType, ad> fbb;
        public final Map<w, ad> fbc;
        public final Map<ad, ad> fbd;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* synthetic */ b(Map map, Map map2, Map map3, AnonymousClass1 anonymousClass1) {
            this(map, map2, map3);
        }

        private b(Map<PrimitiveType, ad> map, Map<w, ad> map2, Map<ad, ad> map3) {
            if (map == null) {
                $$$reportNull$$$0(0);
            }
            if (map2 == null) {
                $$$reportNull$$$0(1);
            }
            if (map3 == null) {
                $$$reportNull$$$0(2);
            }
            this.fbb = map;
            this.fbc = map2;
            this.fbd = map3;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
        switch (i) {
            case 1:
            case 84:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                objArr[0] = str2;
                break;
            case 8:
            case 9:
            case 89:
            case 90:
            case 98:
            case 105:
            case 110:
            case 114:
            case 115:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 107:
            case 109:
            case 111:
            case 113:
            case 137:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 17:
            case 28:
            case 66:
            case 97:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 106:
            case 108:
            case 112:
            case 116:
            case 117:
            case 118:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 162:
                objArr[0] = "type";
                break;
            case 59:
                objArr[0] = "classSimpleName";
                break;
            case 79:
                objArr[0] = "arrayType";
                break;
            case 83:
                objArr[0] = "notNullArrayType";
                break;
            case 85:
            case 163:
                objArr[0] = "primitiveType";
                break;
            case 87:
                objArr[0] = "kotlinType";
                break;
            case 88:
                objArr[0] = "arrayFqName";
                break;
            case 91:
                objArr[0] = "projectionType";
                break;
            case 92:
            case 94:
                objArr[0] = "argument";
                break;
            case 119:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "getEnumType";
        String str4 = "getArrayType";
        String str5 = "getPrimitiveArrayKotlinType";
        String str6 = "getArrayElementType";
        String str7 = "getPrimitiveKotlinType";
        String str8 = "getBuiltInTypeByClassName";
        String str9 = "getPrimitiveArrayClassDescriptor";
        String str10 = "getPrimitiveClassDescriptor";
        String str11 = "getBuiltInClassByName";
        String str12 = "getBuiltInClassByFqName";
        switch (i) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = str12;
                break;
            case 14:
                objArr[1] = str11;
                break;
            case 15:
                objArr[1] = "getAny";
                break;
            case 16:
                objArr[1] = "getNothing";
                break;
            case 18:
                objArr[1] = str10;
                break;
            case 19:
                objArr[1] = "getByte";
                break;
            case 20:
                objArr[1] = "getShort";
                break;
            case 21:
                objArr[1] = "getInt";
                break;
            case 22:
                objArr[1] = "getLong";
                break;
            case 23:
                objArr[1] = "getFloat";
                break;
            case 24:
                objArr[1] = "getDouble";
                break;
            case 25:
                objArr[1] = "getChar";
                break;
            case 26:
                objArr[1] = "getBoolean";
                break;
            case 27:
                objArr[1] = "getArray";
                break;
            case 29:
                objArr[1] = str9;
                break;
            case 30:
                objArr[1] = "getNumber";
                break;
            case 31:
                objArr[1] = "getUnit";
                break;
            case 32:
                objArr[1] = "getFunctionName";
                break;
            case 33:
                objArr[1] = "getFunctionClassId";
                break;
            case 34:
                objArr[1] = "getFunction";
                break;
            case 35:
                objArr[1] = "getSuspendFunction";
                break;
            case 36:
                objArr[1] = "getThrowable";
                break;
            case 37:
                objArr[1] = "getString";
                break;
            case 38:
                objArr[1] = "getCharSequence";
                break;
            case 39:
                objArr[1] = "getComparable";
                break;
            case 40:
                objArr[1] = "getEnum";
                break;
            case 41:
                objArr[1] = "getAnnotation";
                break;
            case 42:
                objArr[1] = "getKClass";
                break;
            case 43:
                objArr[1] = "getIterator";
                break;
            case 44:
                objArr[1] = "getIterable";
                break;
            case 45:
                objArr[1] = "getMutableIterable";
                break;
            case 46:
                objArr[1] = "getMutableIterator";
                break;
            case 47:
                objArr[1] = "getCollection";
                break;
            case 48:
                objArr[1] = "getMutableCollection";
                break;
            case 49:
                objArr[1] = "getList";
                break;
            case 50:
                objArr[1] = "getMutableList";
                break;
            case 51:
                objArr[1] = "getSet";
                break;
            case 52:
                objArr[1] = "getMutableSet";
                break;
            case 53:
                objArr[1] = "getMap";
                break;
            case 54:
                objArr[1] = "getMutableMap";
                break;
            case 55:
                objArr[1] = "getMapEntry";
                break;
            case 56:
                objArr[1] = "getMutableMapEntry";
                break;
            case 57:
                objArr[1] = "getListIterator";
                break;
            case 58:
                objArr[1] = "getMutableListIterator";
                break;
            case 60:
                objArr[1] = str8;
                break;
            case 61:
                objArr[1] = "getNothingType";
                break;
            case 62:
                objArr[1] = "getNullableNothingType";
                break;
            case 63:
                objArr[1] = "getAnyType";
                break;
            case 64:
                objArr[1] = "getNullableAnyType";
                break;
            case 65:
                objArr[1] = "getDefaultBound";
                break;
            case 67:
                objArr[1] = str7;
                break;
            case 68:
                objArr[1] = "getByteType";
                break;
            case 69:
                objArr[1] = "getShortType";
                break;
            case 70:
                objArr[1] = "getIntType";
                break;
            case 71:
                objArr[1] = "getLongType";
                break;
            case 72:
                objArr[1] = "getFloatType";
                break;
            case 73:
                objArr[1] = "getDoubleType";
                break;
            case 74:
                objArr[1] = "getCharType";
                break;
            case 75:
                objArr[1] = "getBooleanType";
                break;
            case 76:
                objArr[1] = "getUnitType";
                break;
            case 77:
                objArr[1] = "getStringType";
                break;
            case 78:
                objArr[1] = "getIterableType";
                break;
            case 80:
            case 81:
            case 82:
                objArr[1] = str6;
                break;
            case 86:
                objArr[1] = str5;
                break;
            case 93:
                objArr[1] = str4;
                break;
            case 95:
                objArr[1] = str3;
                break;
            case 96:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = str12;
                break;
            case 13:
                objArr[2] = str11;
                break;
            case 17:
                objArr[2] = str10;
                break;
            case 28:
                objArr[2] = str9;
                break;
            case 59:
                objArr[2] = str8;
                break;
            case 66:
                objArr[2] = str7;
                break;
            case 79:
                objArr[2] = str6;
                break;
            case 83:
            case 84:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 85:
                objArr[2] = str5;
                break;
            case 87:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 88:
            case 100:
                objArr[2] = "isPrimitiveArray";
                break;
            case 89:
            case 102:
                objArr[2] = "getPrimitiveType";
                break;
            case 90:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 91:
            case 92:
                objArr[2] = str4;
                break;
            case 94:
                objArr[2] = str3;
                break;
            case 97:
                objArr[2] = "isArray";
                break;
            case 98:
            case 99:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 101:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 103:
                objArr[2] = "isPrimitiveType";
                break;
            case 104:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 105:
                objArr[2] = "isPrimitiveClass";
                break;
            case 106:
            case 107:
            case 108:
            case 109:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 110:
            case 111:
                objArr[2] = "classFqNameEquals";
                break;
            case 112:
            case 113:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 114:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 115:
            case 116:
                objArr[2] = "isAny";
                break;
            case 117:
            case 119:
                objArr[2] = "isBoolean";
                break;
            case 118:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 120:
                objArr[2] = "isNumber";
                break;
            case 121:
                objArr[2] = "isChar";
                break;
            case 122:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 123:
                objArr[2] = "isInt";
                break;
            case 124:
                objArr[2] = "isByte";
                break;
            case 125:
                objArr[2] = "isLong";
                break;
            case 126:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 127:
                objArr[2] = "isShort";
                break;
            case 128:
                objArr[2] = "isFloat";
                break;
            case 129:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 130:
                objArr[2] = "isDouble";
                break;
            case 131:
                objArr[2] = "isUByte";
                break;
            case 132:
                objArr[2] = "isUShort";
                break;
            case 133:
                objArr[2] = "isUInt";
                break;
            case 134:
                objArr[2] = "isULong";
                break;
            case 135:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 136:
            case 137:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 138:
                objArr[2] = "isNothing";
                break;
            case 139:
                objArr[2] = "isNullableNothing";
                break;
            case 140:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 141:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 142:
                objArr[2] = "isNullableAny";
                break;
            case 143:
                objArr[2] = "isDefaultBound";
                break;
            case 144:
                objArr[2] = "isUnit";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 163:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    protected g(h hVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        this.eZz = hVar;
        this.eZx = hVar.f(new kotlin.jvm.a.a<Collection<aa>>() {
            /* renamed from: boS */
            public Collection<aa> invoke() {
                return Arrays.asList(new aa[]{g.this.eZv.f(g.eZp), g.this.eZv.f(g.eZr), g.this.eZv.f(g.eZs), g.this.eZv.f(g.eZq)});
            }
        });
        this.eZw = hVar.f(new kotlin.jvm.a.a<b>() {
            /* renamed from: bra */
            public b invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    ad a = g.this.lR(primitiveType.getTypeName().boi());
                    ad a2 = g.this.lR(primitiveType.getArrayTypeName().boi());
                    enumMap.put(primitiveType, a2);
                    hashMap.put(a, a2);
                    hashMap2.put(a2, a);
                }
                return new b(enumMap, hashMap, hashMap2, null);
            }
        });
        this.eZy = hVar.q(new kotlin.jvm.a.b<f, d>() {
            /* renamed from: c */
            public d invoke(f fVar) {
                kotlin.reflect.jvm.internal.impl.descriptors.f c = g.this.bqB().c(fVar, NoLookupLocation.FROM_BUILTINS);
                if (c == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Built-in class ");
                    stringBuilder.append(g.eZp.C(fVar));
                    stringBuilder.append(" is not found");
                    throw new AssertionError(stringBuilder.toString());
                } else if (c instanceof d) {
                    return (d) c;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Must be a class descriptor ");
                    stringBuilder2.append(fVar);
                    stringBuilder2.append(", but was ");
                    stringBuilder2.append(c);
                    throw new AssertionError(stringBuilder2.toString());
                }
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void bqv() {
        this.eZv = new v(eZB, this.eZz, this, null);
        this.eZv.a(a.eZg.bqr().a(this.eZz, this.eZv, bqy(), bqx(), bqw()));
        this.eZv.a(this.eZv);
    }

    /* Access modifiers changed, original: protected */
    public kotlin.reflect.jvm.internal.impl.descriptors.a.a bqw() {
        kotlin.reflect.jvm.internal.impl.descriptors.a.a.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.a.a.a.fdL;
        if (aVar == null) {
            $$$reportNull$$$0(2);
        }
        return aVar;
    }

    /* Access modifiers changed, original: protected */
    public kotlin.reflect.jvm.internal.impl.descriptors.a.c bqx() {
        kotlin.reflect.jvm.internal.impl.descriptors.a.c.b bVar = kotlin.reflect.jvm.internal.impl.descriptors.a.c.b.fdN;
        if (bVar == null) {
            $$$reportNull$$$0(3);
        }
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.a.b> bqy() {
        List singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.eZz, this.eZv));
        if (singletonList == null) {
            $$$reportNull$$$0(4);
        }
        return singletonList;
    }

    /* Access modifiers changed, original: protected */
    public h bqz() {
        h hVar = this.eZz;
        if (hVar == null) {
            $$$reportNull$$$0(5);
        }
        return hVar;
    }

    public v bqA() {
        v vVar = this.eZv;
        if (vVar == null) {
            $$$reportNull$$$0(6);
        }
        return vVar;
    }

    public static boolean c(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(8);
        }
        return c.a(kVar, b.class, false) != null;
    }

    public static boolean d(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(9);
        }
        while (kVar != null) {
            if (kVar instanceof y) {
                return ((y) kVar).btB().D(eZo);
            }
            kVar = kVar.brj();
        }
        return false;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h bqB() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h bsF = this.eZv.f(eZp).bsF();
        if (bsF == null) {
            $$$reportNull$$$0(10);
        }
        return bsF;
    }

    public d c(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(11);
        }
        d a = p.a(this.eZv, bVar, NoLookupLocation.FROM_BUILTINS);
        if (a == null) {
            $$$reportNull$$$0(12);
        }
        return a;
    }

    private d lQ(String str) {
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        d dVar = (d) this.eZy.invoke(f.ms(str));
        if (dVar == null) {
            $$$reportNull$$$0(14);
        }
        return dVar;
    }

    public d bqC() {
        d lQ = lQ("Any");
        if (lQ == null) {
            $$$reportNull$$$0(15);
        }
        return lQ;
    }

    public d bqD() {
        d lQ = lQ("Nothing");
        if (lQ == null) {
            $$$reportNull$$$0(16);
        }
        return lQ;
    }

    private d a(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(17);
        }
        d lQ = lQ(primitiveType.getTypeName().boi());
        if (lQ == null) {
            $$$reportNull$$$0(18);
        }
        return lQ;
    }

    public d bqE() {
        d lQ = lQ("Array");
        if (lQ == null) {
            $$$reportNull$$$0(27);
        }
        return lQ;
    }

    public d bqF() {
        d lQ = lQ("Number");
        if (lQ == null) {
            $$$reportNull$$$0(30);
        }
        return lQ;
    }

    public d bqG() {
        d lQ = lQ("Unit");
        if (lQ == null) {
            $$$reportNull$$$0(31);
        }
        return lQ;
    }

    public static String jN(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Function");
        stringBuilder.append(i);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2 == null) {
            $$$reportNull$$$0(32);
        }
        return stringBuilder2;
    }

    public static kotlin.reflect.jvm.internal.impl.name.a jO(int i) {
        return new kotlin.reflect.jvm.internal.impl.name.a(eZp, f.ms(jN(i)));
    }

    public d jP(int i) {
        d lQ = lQ(jN(i));
        if (lQ == null) {
            $$$reportNull$$$0(34);
        }
        return lQ;
    }

    public d jQ(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Kind.SuspendFunction.getClassNamePrefix());
        stringBuilder.append(i);
        d c = c(c.fsQ.C(f.ms(stringBuilder.toString())));
        if (c == null) {
            $$$reportNull$$$0(35);
        }
        return c;
    }

    public d bqH() {
        d lQ = lQ("String");
        if (lQ == null) {
            $$$reportNull$$$0(37);
        }
        return lQ;
    }

    public d bqI() {
        d c = c(eZA.faE.bKf());
        if (c == null) {
            $$$reportNull$$$0(42);
        }
        return c;
    }

    public d bqJ() {
        d c = c(eZA.faq);
        if (c == null) {
            $$$reportNull$$$0(47);
        }
        return c;
    }

    private ad lR(String str) {
        if (str == null) {
            $$$reportNull$$$0(59);
        }
        ad bsY = lQ(str).bsY();
        if (bsY == null) {
            $$$reportNull$$$0(60);
        }
        return bsY;
    }

    public ad bqK() {
        ad bsY = bqD().bsY();
        if (bsY == null) {
            $$$reportNull$$$0(61);
        }
        return bsY;
    }

    public ad bqL() {
        ad gM = bqK().gM(true);
        if (gM == null) {
            $$$reportNull$$$0(62);
        }
        return gM;
    }

    public ad bqM() {
        ad bsY = bqC().bsY();
        if (bsY == null) {
            $$$reportNull$$$0(63);
        }
        return bsY;
    }

    public ad bqN() {
        ad gM = bqM().gM(true);
        if (gM == null) {
            $$$reportNull$$$0(64);
        }
        return gM;
    }

    public ad bqO() {
        ad bqN = bqN();
        if (bqN == null) {
            $$$reportNull$$$0(65);
        }
        return bqN;
    }

    public ad b(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(66);
        }
        ad bsY = a(primitiveType).bsY();
        if (bsY == null) {
            $$$reportNull$$$0(67);
        }
        return bsY;
    }

    public ad bqP() {
        ad b = b(PrimitiveType.BYTE);
        if (b == null) {
            $$$reportNull$$$0(68);
        }
        return b;
    }

    public ad bqQ() {
        ad b = b(PrimitiveType.SHORT);
        if (b == null) {
            $$$reportNull$$$0(69);
        }
        return b;
    }

    public ad bqR() {
        ad b = b(PrimitiveType.INT);
        if (b == null) {
            $$$reportNull$$$0(70);
        }
        return b;
    }

    public ad bqS() {
        ad b = b(PrimitiveType.LONG);
        if (b == null) {
            $$$reportNull$$$0(71);
        }
        return b;
    }

    public ad bqT() {
        ad b = b(PrimitiveType.FLOAT);
        if (b == null) {
            $$$reportNull$$$0(72);
        }
        return b;
    }

    public ad bqU() {
        ad b = b(PrimitiveType.DOUBLE);
        if (b == null) {
            $$$reportNull$$$0(73);
        }
        return b;
    }

    public ad bqV() {
        ad b = b(PrimitiveType.CHAR);
        if (b == null) {
            $$$reportNull$$$0(74);
        }
        return b;
    }

    public ad bqW() {
        ad b = b(PrimitiveType.BOOLEAN);
        if (b == null) {
            $$$reportNull$$$0(75);
        }
        return b;
    }

    public ad bqX() {
        ad bsY = bqG().bsY();
        if (bsY == null) {
            $$$reportNull$$$0(76);
        }
        return bsY;
    }

    public ad bqY() {
        ad bsY = bqH().bsY();
        if (bsY == null) {
            $$$reportNull$$$0(77);
        }
        return bsY;
    }

    public w m(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(79);
        }
        if (!o(wVar)) {
            w aZ = au.aZ(wVar);
            w wVar2 = (w) ((b) this.eZw.invoke()).fbd.get(aZ);
            if (wVar2 != null) {
                if (wVar2 == null) {
                    $$$reportNull$$$0(81);
                }
                return wVar2;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.v am = c.am(aZ);
            if (am != null) {
                aZ = a(aZ, am);
                if (aZ != null) {
                    if (aZ == null) {
                        $$$reportNull$$$0(82);
                    }
                    return aZ;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not array: ");
            stringBuilder.append(wVar);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (wVar.btD().size() == 1) {
            wVar = ((ap) wVar.btD().get(0)).bpT();
            if (wVar == null) {
                $$$reportNull$$$0(80);
            }
            return wVar;
        } else {
            throw new IllegalStateException();
        }
    }

    private static w a(w wVar, kotlin.reflect.jvm.internal.impl.descriptors.v vVar) {
        if (wVar == null) {
            $$$reportNull$$$0(83);
        }
        if (vVar == null) {
            $$$reportNull$$$0(84);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        if (brQ == null || !k.fby.d(brQ.bsZ())) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(brQ);
        if (c == null) {
            return null;
        }
        c = k.fby.d(c);
        if (c == null) {
            return null;
        }
        d a = r.a(vVar, c);
        if (a == null) {
            return null;
        }
        return a.bsY();
    }

    public ad c(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(85);
        }
        ad adVar = (ad) ((b) this.eZw.invoke()).fbb.get(primitiveType);
        if (adVar == null) {
            $$$reportNull$$$0(86);
        }
        return adVar;
    }

    public ad n(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(87);
        }
        ad adVar = (ad) ((b) this.eZw.invoke()).fbc.get(wVar);
        if (adVar != null) {
            return adVar;
        }
        if (!k.fby.J(wVar) || au.bb(wVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.v am = c.am(wVar);
        if (am == null) {
            return null;
        }
        d a = r.a(am, k.fby.e(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(wVar.bMZ().brQ())));
        if (a == null) {
            return null;
        }
        return a.bsY();
    }

    public static boolean b(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            $$$reportNull$$$0(88);
        }
        return eZA.fba.get(cVar) != null;
    }

    public static PrimitiveType e(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(89);
        }
        return eZA.faX.contains(kVar.bsZ()) ? (PrimitiveType) eZA.faZ.get(c.w(kVar)) : null;
    }

    public static PrimitiveType f(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(90);
        }
        return eZA.faY.contains(kVar.bsZ()) ? (PrimitiveType) eZA.fba.get(c.w(kVar)) : null;
    }

    public ad a(Variance variance, w wVar) {
        if (variance == null) {
            $$$reportNull$$$0(91);
        }
        if (wVar == null) {
            $$$reportNull$$$0(92);
        }
        ad a = x.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), bqE(), Collections.singletonList(new ar(variance, wVar)));
        if (a == null) {
            $$$reportNull$$$0(93);
        }
        return a;
    }

    public static boolean o(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(97);
        }
        return a(wVar, eZA.eZK);
    }

    public static boolean c(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(98);
        }
        return a((kotlin.reflect.jvm.internal.impl.descriptors.f) dVar, eZA.eZK) || f((k) dVar) != null;
    }

    public static boolean p(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(100);
        }
        k brQ = wVar.bMZ().brQ();
        return (brQ == null || f(brQ) == null) ? false : true;
    }

    public static boolean q(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(103);
        }
        return !wVar.boc() && r(wVar);
    }

    public static boolean r(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(104);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        return (brQ instanceof d) && d((d) brQ);
    }

    public static boolean d(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(105);
        }
        return e((k) dVar) != null;
    }

    private static boolean a(w wVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (wVar == null) {
            $$$reportNull$$$0(106);
        }
        if (cVar == null) {
            $$$reportNull$$$0(107);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f brQ = wVar.bMZ().brQ();
        return (brQ instanceof d) && a(brQ, cVar);
    }

    private static boolean a(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (fVar == null) {
            $$$reportNull$$$0(110);
        }
        if (cVar == null) {
            $$$reportNull$$$0(111);
        }
        return fVar.bsZ().equals(cVar.bKc()) && cVar.equals(c.w(fVar));
    }

    private static boolean b(w wVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (wVar == null) {
            $$$reportNull$$$0(112);
        }
        if (cVar == null) {
            $$$reportNull$$$0(113);
        }
        return !wVar.boc() && a(wVar, cVar);
    }

    public static boolean e(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(114);
        }
        return a((kotlin.reflect.jvm.internal.impl.descriptors.f) dVar, eZA.eZD) || a((kotlin.reflect.jvm.internal.impl.descriptors.f) dVar, eZA.eZE);
    }

    public static boolean f(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(115);
        }
        return a((kotlin.reflect.jvm.internal.impl.descriptors.f) dVar, eZA.eZD);
    }

    public static boolean s(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(117);
        }
        return c(wVar, eZA.eZL);
    }

    public static boolean t(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(121);
        }
        return c(wVar, eZA.eZM);
    }

    public static boolean u(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(123);
        }
        return c(wVar, eZA.eZP);
    }

    public static boolean v(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(124);
        }
        return c(wVar, eZA.eZN);
    }

    public static boolean w(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(125);
        }
        return c(wVar, eZA.eZQ);
    }

    public static boolean x(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(127);
        }
        return c(wVar, eZA.eZO);
    }

    public static boolean y(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(128);
        }
        return z(wVar) && !wVar.boc();
    }

    public static boolean z(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(129);
        }
        return a(wVar, eZA.eZR);
    }

    public static boolean A(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(130);
        }
        return B(wVar) && !wVar.boc();
    }

    public static boolean B(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(135);
        }
        return a(wVar, eZA.eZS);
    }

    private static boolean c(w wVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (wVar == null) {
            $$$reportNull$$$0(136);
        }
        if (cVar == null) {
            $$$reportNull$$$0(137);
        }
        return a(wVar, cVar) && !wVar.boc();
    }

    public static boolean C(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(138);
        }
        return D(wVar) && !au.bb(wVar);
    }

    public static boolean D(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(140);
        }
        return a(wVar, eZA.eZE);
    }

    public static boolean E(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(141);
        }
        return a(wVar, eZA.eZD);
    }

    public static boolean F(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(142);
        }
        return E(wVar) && wVar.boc();
    }

    public static boolean G(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(143);
        }
        return F(wVar);
    }

    public static boolean H(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(144);
        }
        return b(wVar, eZA.eZH);
    }

    public static boolean I(w wVar) {
        return wVar != null && b(wVar, eZA.eZJ);
    }

    public static boolean g(d dVar) {
        if (dVar == null) {
            $$$reportNull$$$0(158);
        }
        return a((kotlin.reflect.jvm.internal.impl.descriptors.f) dVar, eZA.faE);
    }

    public static boolean g(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(161);
        }
        boolean z = true;
        if (kVar.bsW().brE().j(eZA.faa)) {
            return true;
        }
        if (!(kVar instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) kVar;
        boolean btW = aeVar.btW();
        k btG = aeVar.btG();
        kVar = aeVar.btH();
        if (btG == null || !g(btG) || (btW && (kVar == null || !g(kVar)))) {
            z = false;
        }
        return z;
    }

    public static kotlin.reflect.jvm.internal.impl.name.b d(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(163);
        }
        return eZp.C(primitiveType.getTypeName());
    }
}
