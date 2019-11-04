package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: JvmClassName */
public class c {
    private b fdF;
    private final String flZ;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "classId";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        String str3 = "byFqNameWithoutInnerClasses";
        String str4 = "byClassId";
        String str5 = "byInternalName";
        if (i == 1) {
            objArr[1] = str5;
        } else if (i != 3) {
            if (i != 5 && i != 7) {
                switch (i) {
                    case 9:
                        objArr[1] = "getFqNameForClassNameWithoutDollars";
                        break;
                    case 10:
                        objArr[1] = "getFqNameForTopLevelClassMaybeWithDollars";
                        break;
                    case 11:
                    case 12:
                        objArr[1] = "getPackageFqName";
                        break;
                    case 13:
                        objArr[1] = "getInternalName";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            }
            objArr[1] = str3;
        } else {
            objArr[1] = str4;
        }
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 2:
                objArr[2] = str4;
                break;
            case 4:
            case 6:
                objArr[2] = str3;
                break;
            case 8:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = str5;
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    illegalArgumentException = new IllegalArgumentException(str);
                    break;
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public static c mH(String str) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return new c(str);
    }

    public static c l(a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(2);
        }
        b packageFqName = aVar.getPackageFqName();
        String replace = aVar.bJU().boi().replace('.', '$');
        if (packageFqName.isRoot()) {
            return new c(replace);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(packageFqName.boi().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(replace);
        return new c(stringBuilder.toString());
    }

    public static c t(b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(4);
        }
        c cVar = new c(bVar.boi().replace('.', '/'));
        cVar.fdF = bVar;
        return cVar;
    }

    private c(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        this.flZ = str;
    }

    public b bNm() {
        return new b(this.flZ.replace('/', '.'));
    }

    public b getPackageFqName() {
        int lastIndexOf = this.flZ.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new b(this.flZ.substring(0, lastIndexOf).replace('/', '.'));
        }
        b bVar = b.fpl;
        if (bVar == null) {
            $$$reportNull$$$0(11);
        }
        return bVar;
    }

    public String byE() {
        String str = this.flZ;
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        return str;
    }

    public String toString() {
        return this.flZ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj == null || getClass() != obj.getClass()) ? false : this.flZ.equals(((c) obj).flZ);
    }

    public int hashCode() {
        return this.flZ.hashCode();
    }
}
