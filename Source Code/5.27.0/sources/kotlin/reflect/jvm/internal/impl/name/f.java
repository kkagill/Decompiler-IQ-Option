package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;

/* compiled from: Name */
public final class f implements Comparable<f> {
    private final boolean fpv;
    private final String name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/Name";
        if (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) {
            objArr[0] = str2;
        } else {
            objArr[0] = ConditionalUserProperty.NAME;
        }
        String str3 = "guessByFirstCharacter";
        String str4 = "special";
        String str5 = "identifier";
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 4) {
            objArr[1] = str5;
        } else if (i == 7) {
            objArr[1] = str4;
        } else if (i == 9 || i == 10) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 9:
            case 10:
                break;
            case 3:
                objArr[2] = str5;
                break;
            case 5:
                objArr[2] = "isValidIdentifier";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    private f(String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        this.name = str;
        this.fpv = z;
    }

    public String boi() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        return str;
    }

    public String getIdentifier() {
        if (this.fpv) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not identifier: ");
            stringBuilder.append(this);
            throw new IllegalStateException(stringBuilder.toString());
        }
        String boi = boi();
        if (boi == null) {
            $$$reportNull$$$0(2);
        }
        return boi;
    }

    public boolean bKh() {
        return this.fpv;
    }

    /* renamed from: H */
    public int compareTo(f fVar) {
        return this.name.compareTo(fVar.name);
    }

    public static f ms(String str) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        return new f(str, false);
    }

    public static boolean mt(String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f mu(String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("special name must start with '<': ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static f mv(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        f mu;
        if (str.startsWith("<")) {
            mu = mu(str);
            if (mu == null) {
                $$$reportNull$$$0(9);
            }
            return mu;
        }
        mu = ms(str);
        if (mu == null) {
            $$$reportNull$$$0(10);
        }
        return mu;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.fpv == fVar.fpv && this.name.equals(fVar.name);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.fpv;
    }
}
