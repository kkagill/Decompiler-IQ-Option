package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.a.b;

/* compiled from: FqNameUnsafe */
public final class c {
    private static final f fpo = f.mu("<root>");
    private static final Pattern fpp = Pattern.compile("\\.");
    private static final b<String, f> fpq = new b<String, f>() {
        /* renamed from: mq */
        public f invoke(String str) {
            return f.mv(str);
        }
    };
    private final String fpr;
    private transient b fps;
    private transient c fpt;
    private transient f fpu;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "shortName";
        String str3 = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 18:
                case 19:
                    objArr[0] = str3;
                    break;
                case 9:
                    objArr[0] = ConditionalUserProperty.NAME;
                    break;
                case 16:
                    objArr[0] = "segment";
                    break;
                case 17:
                    objArr[0] = str2;
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        }
        objArr[0] = "safe";
        String str4 = "topLevel";
        String str5 = "child";
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
                objArr[1] = str5;
                break;
            case 11:
            case 12:
                objArr[1] = str2;
                break;
            case 13:
            case 14:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 15:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = str4;
                break;
            case 19:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = str3;
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                break;
            case 9:
                objArr[2] = str5;
                break;
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = str4;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    c(String str, b bVar) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        if (bVar == null) {
            $$$reportNull$$$0(1);
        }
        this.fpr = str;
        this.fps = bVar;
    }

    public c(String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        this.fpr = str;
    }

    private c(String str, c cVar, f fVar) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        this.fpr = str;
        this.fpt = cVar;
        this.fpu = fVar;
    }

    private void compute() {
        int lastIndexOf = this.fpr.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.fpu = f.mv(this.fpr.substring(lastIndexOf + 1));
            this.fpt = new c(this.fpr.substring(0, lastIndexOf));
            return;
        }
        this.fpu = f.mv(this.fpr);
        this.fpt = b.fpl.bKa();
    }

    public String boi() {
        String str = this.fpr;
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str;
    }

    public boolean bKe() {
        return this.fps != null || boi().indexOf(60) < 0;
    }

    public b bKf() {
        b bVar = this.fps;
        if (bVar != null) {
            if (bVar == null) {
                $$$reportNull$$$0(5);
            }
            return bVar;
        }
        this.fps = new b(this);
        bVar = this.fps;
        if (bVar == null) {
            $$$reportNull$$$0(6);
        }
        return bVar;
    }

    public boolean isRoot() {
        return this.fpr.isEmpty();
    }

    public c bKg() {
        c cVar = this.fpt;
        if (cVar != null) {
            if (cVar == null) {
                $$$reportNull$$$0(7);
            }
            return cVar;
        } else if (isRoot()) {
            throw new IllegalStateException("root");
        } else {
            compute();
            cVar = this.fpt;
            if (cVar == null) {
                $$$reportNull$$$0(8);
            }
            return cVar;
        }
    }

    public c F(f fVar) {
        String boi;
        if (fVar == null) {
            $$$reportNull$$$0(9);
        }
        if (isRoot()) {
            boi = fVar.boi();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.fpr);
            stringBuilder.append(".");
            stringBuilder.append(fVar.boi());
            boi = stringBuilder.toString();
        }
        return new c(boi, this, fVar);
    }

    public f bKc() {
        f fVar = this.fpu;
        if (fVar != null) {
            if (fVar == null) {
                $$$reportNull$$$0(11);
            }
            return fVar;
        } else if (isRoot()) {
            throw new IllegalStateException("root");
        } else {
            compute();
            fVar = this.fpu;
            if (fVar == null) {
                $$$reportNull$$$0(12);
            }
            return fVar;
        }
    }

    public f bKd() {
        f fVar;
        if (isRoot()) {
            fVar = fpo;
            if (fVar == null) {
                $$$reportNull$$$0(13);
            }
            return fVar;
        }
        fVar = bKc();
        if (fVar == null) {
            $$$reportNull$$$0(14);
        }
        return fVar;
    }

    public List<f> pathSegments() {
        List<f> emptyList = isRoot() ? Collections.emptyList() : i.a((Object[]) fpp.split(this.fpr), fpq);
        if (emptyList == null) {
            $$$reportNull$$$0(15);
        }
        return emptyList;
    }

    public boolean D(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(16);
        }
        int indexOf = this.fpr.indexOf(46);
        if (isRoot()) {
            return false;
        }
        String str = this.fpr;
        String boi = fVar.boi();
        if (indexOf == -1) {
            indexOf = this.fpr.length();
        }
        return str.regionMatches(0, boi, 0, indexOf);
    }

    public static c G(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(17);
        }
        return new c(fVar.boi(), b.fpl.bKa(), fVar);
    }

    public String toString() {
        String boi = isRoot() ? fpo.boi() : this.fpr;
        if (boi == null) {
            $$$reportNull$$$0(19);
        }
        return boi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.fpr.equals(((c) obj).fpr);
    }

    public int hashCode() {
        return this.fpr.hashCode();
    }
}
