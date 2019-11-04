package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;

/* compiled from: ClassId */
public final class a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final b fpj;
    private final boolean fpk;
    private final b packageFqName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = str2;
                break;
            case 2:
            case 4:
                objArr[0] = "packageFqName";
                break;
            case 3:
                objArr[0] = "relativeClassName";
                break;
            case 5:
                objArr[0] = "topLevelName";
                break;
            case 9:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 13:
                objArr[0] = "segment";
                break;
            case 14:
            case 16:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        String str3 = "fromString";
        String str4 = "createNestedClassId";
        String str5 = "topLevel";
        if (i != 1) {
            if (i != 15) {
                if (i == 6) {
                    objArr[1] = "getPackageFqName";
                } else if (i == 7) {
                    objArr[1] = "getRelativeClassName";
                } else if (i != 8) {
                    switch (i) {
                        case 10:
                            objArr[1] = str4;
                            break;
                        case 11:
                        case 12:
                            objArr[1] = "asSingleFqName";
                            break;
                        default:
                            switch (i) {
                                case 17:
                                    break;
                                case 18:
                                case 19:
                                    objArr[1] = "asString";
                                    break;
                                default:
                                    objArr[1] = str2;
                                    break;
                            }
                    }
                } else {
                    objArr[1] = "getShortClassName";
                }
            }
            objArr[1] = str3;
        } else {
            objArr[1] = str5;
        }
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 9:
                objArr[2] = str4;
                break;
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
            case 16:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = str5;
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            illegalArgumentException = new IllegalArgumentException(str);
                            break;
                    }
            }
        }
        illegalArgumentException = new IllegalStateException(str);
        throw illegalArgumentException;
    }

    public static a s(b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(0);
        }
        return new a(bVar.bKb(), bVar.bKc());
    }

    public a(b bVar, b bVar2, boolean z) {
        if (bVar == null) {
            $$$reportNull$$$0(2);
        }
        if (bVar2 == null) {
            $$$reportNull$$$0(3);
        }
        this.packageFqName = bVar;
        this.fpj = bVar2;
        this.fpk = z;
    }

    public a(b bVar, f fVar) {
        if (bVar == null) {
            $$$reportNull$$$0(4);
        }
        if (fVar == null) {
            $$$reportNull$$$0(5);
        }
        this(bVar, b.E(fVar), false);
    }

    public b getPackageFqName() {
        b bVar = this.packageFqName;
        if (bVar == null) {
            $$$reportNull$$$0(6);
        }
        return bVar;
    }

    public b bJU() {
        b bVar = this.fpj;
        if (bVar == null) {
            $$$reportNull$$$0(7);
        }
        return bVar;
    }

    public f bJV() {
        f bKc = this.fpj.bKc();
        if (bKc == null) {
            $$$reportNull$$$0(8);
        }
        return bKc;
    }

    public boolean bJW() {
        return this.fpk;
    }

    public a B(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(9);
        }
        return new a(getPackageFqName(), this.fpj.C(fVar), this.fpk);
    }

    public a bJX() {
        b bKb = this.fpj.bKb();
        return bKb.isRoot() ? null : new a(getPackageFqName(), bKb, this.fpk);
    }

    public boolean bJY() {
        return this.fpj.bKb().isRoot() ^ 1;
    }

    public b bJZ() {
        if (this.packageFqName.isRoot()) {
            b bVar = this.fpj;
            if (bVar == null) {
                $$$reportNull$$$0(11);
            }
            return bVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.packageFqName.boi());
        stringBuilder.append(".");
        stringBuilder.append(this.fpj.boi());
        return new b(stringBuilder.toString());
    }

    public static a mp(String str) {
        if (str == null) {
            $$$reportNull$$$0(14);
        }
        a B = B(str, false);
        if (B == null) {
            $$$reportNull$$$0(15);
        }
        return B;
    }

    public static a B(String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(16);
        }
        return new a(new b(v.c(str, '/', "").replace('/', '.')), new b(v.d(str, '/', str)), z);
    }

    public String boi() {
        String boi;
        if (this.packageFqName.isRoot()) {
            boi = this.fpj.boi();
            if (boi == null) {
                $$$reportNull$$$0(18);
            }
            return boi;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.packageFqName.boi().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(this.fpj.boi());
        boi = stringBuilder.toString();
        if (boi == null) {
            $$$reportNull$$$0(19);
        }
        return boi;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!(this.packageFqName.equals(aVar.packageFqName) && this.fpj.equals(aVar.fpj) && this.fpk == aVar.fpk)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.fpj.hashCode()) * 31) + Boolean.valueOf(this.fpk).hashCode();
    }

    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return boi();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(boi());
        return stringBuilder.toString();
    }
}
