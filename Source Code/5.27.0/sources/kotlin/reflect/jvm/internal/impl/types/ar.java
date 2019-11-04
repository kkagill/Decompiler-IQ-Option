package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeProjectionImpl */
public class ar extends aq {
    private final w eYc;
    private final Variance fxy;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 3 || i == 4) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        if (i == 1 || i == 2) {
            objArr[0] = "type";
        } else if (i == 3 || i == 4) {
            objArr[0] = str2;
        } else {
            objArr[0] = "projection";
        }
        if (i == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getType";
        }
        if (!(i == 3 || i == 4)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 3 || i == 4) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public boolean bPC() {
        return false;
    }

    public ar(Variance variance, w wVar) {
        if (variance == null) {
            $$$reportNull$$$0(0);
        }
        if (wVar == null) {
            $$$reportNull$$$0(1);
        }
        this.fxy = variance;
        this.eYc = wVar;
    }

    public ar(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(2);
        }
        this(Variance.INVARIANT, wVar);
    }

    public Variance bPD() {
        Variance variance = this.fxy;
        if (variance == null) {
            $$$reportNull$$$0(3);
        }
        return variance;
    }

    public w bpT() {
        w wVar = this.eYc;
        if (wVar == null) {
            $$$reportNull$$$0(4);
        }
        return wVar;
    }
}
