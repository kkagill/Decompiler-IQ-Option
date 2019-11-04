package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;

/* compiled from: SpecialNames */
public class h {
    public static final f fpA = f.ms("Companion");
    public static final f fpB = f.ms("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
    public static final f fpC = f.mu("<anonymous>");
    public static final f fpy = f.mu("<no name provided>");
    public static final f fpz = f.mu("<root package>");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 2 ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        if (i != 2) {
            objArr[0] = str2;
        } else {
            objArr[0] = ConditionalUserProperty.NAME;
        }
        if (i != 2) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = str2;
        }
        if (i == 2) {
            objArr[2] = "isSafeIdentifier";
        }
        str = String.format(str, objArr);
        throw (i != 2 ? new IllegalStateException(str) : new IllegalArgumentException(str));
    }

    public static f I(f fVar) {
        if (fVar == null || fVar.bKh()) {
            fVar = fpB;
        }
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        return fVar;
    }

    public static boolean J(f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        return (fVar.boi().isEmpty() || fVar.bKh()) ? false : true;
    }
}
