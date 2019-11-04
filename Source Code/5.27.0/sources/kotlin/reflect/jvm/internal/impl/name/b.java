package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.List;

/* compiled from: FqName */
public final class b {
    public static final b fpl = new b("");
    private final c fpm;
    private transient b fpn;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalArgumentException;
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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
        String str2 = "shortName";
        String str3 = "kotlin/reflect/jvm/internal/impl/name/FqName";
        switch (i) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
                objArr[0] = str3;
                break;
            case 2:
            case 3:
            case 4:
                objArr[0] = "fqName";
                break;
            case 9:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 14:
                objArr[0] = "segment";
                break;
            case 15:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "names";
                break;
        }
        String str4 = "topLevel";
        String str5 = "child";
        String str6 = "fromSegments";
        if (i == 1) {
            objArr[1] = str6;
        } else if (i == 16) {
            objArr[1] = str4;
        } else if (i == 5) {
            objArr[1] = "asString";
        } else if (i != 6) {
            if (i != 7 && i != 8) {
                switch (i) {
                    case 10:
                        objArr[1] = str5;
                        break;
                    case 11:
                        objArr[1] = str2;
                        break;
                    case 12:
                        objArr[1] = "shortNameOrSpecial";
                        break;
                    case 13:
                        objArr[1] = "pathSegments";
                        break;
                    default:
                        objArr[1] = str3;
                        break;
                }
            }
            objArr[1] = "parent";
        } else {
            objArr[1] = "toUnsafe";
        }
        switch (i) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
                break;
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 9:
                objArr[2] = str5;
                break;
            case 14:
                objArr[2] = "startsWith";
                break;
            case 15:
                objArr[2] = str4;
                break;
            default:
                objArr[2] = str6;
                break;
        }
        str = String.format(str, objArr);
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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

    public b(String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        this.fpm = new c(str, this);
    }

    public b(c cVar) {
        if (cVar == null) {
            $$$reportNull$$$0(3);
        }
        this.fpm = cVar;
    }

    private b(c cVar, b bVar) {
        if (cVar == null) {
            $$$reportNull$$$0(4);
        }
        this.fpm = cVar;
        this.fpn = bVar;
    }

    public String boi() {
        String boi = this.fpm.boi();
        if (boi == null) {
            $$$reportNull$$$0(5);
        }
        return boi;
    }

    public c bKa() {
        c cVar = this.fpm;
        if (cVar == null) {
            $$$reportNull$$$0(6);
        }
        return cVar;
    }

    public boolean isRoot() {
        return this.fpm.isRoot();
    }

    public b bKb() {
        b bVar = this.fpn;
        if (bVar != null) {
            if (bVar == null) {
                $$$reportNull$$$0(7);
            }
            return bVar;
        } else if (isRoot()) {
            throw new IllegalStateException("root");
        } else {
            this.fpn = new b(this.fpm.bKg());
            bVar = this.fpn;
            if (bVar == null) {
                $$$reportNull$$$0(8);
            }
            return bVar;
        }
    }

    public b C(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(9);
        }
        return new b(this.fpm.F(fVar), this);
    }

    public f bKc() {
        f bKc = this.fpm.bKc();
        if (bKc == null) {
            $$$reportNull$$$0(11);
        }
        return bKc;
    }

    public f bKd() {
        f bKd = this.fpm.bKd();
        if (bKd == null) {
            $$$reportNull$$$0(12);
        }
        return bKd;
    }

    public List<f> pathSegments() {
        List pathSegments = this.fpm.pathSegments();
        if (pathSegments == null) {
            $$$reportNull$$$0(13);
        }
        return pathSegments;
    }

    public boolean D(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(14);
        }
        return this.fpm.D(fVar);
    }

    public static b E(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(15);
        }
        return new b(c.G(fVar));
    }

    public String toString() {
        return this.fpm.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.fpm.equals(((b) obj).fpm);
    }

    public int hashCode() {
        return this.fpm.hashCode();
    }
}
