package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.b;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: DeclarationDescriptorImpl */
public abstract class j extends b implements k {
    private final f fdP;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = str2;
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        String str3 = "toString";
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = str3;
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public k bsW() {
        return this;
    }

    public j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, f fVar2) {
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(1);
        }
        super(fVar);
        this.fdP = fVar2;
    }

    public f bsZ() {
        f fVar = this.fdP;
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        return fVar;
    }

    public String toString() {
        return m(this);
    }

    public static String m(k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(4);
        }
        StringBuilder stringBuilder;
        Object kVar2;
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append(kotlin.reflect.jvm.internal.impl.renderer.b.frp.s(kVar2));
            stringBuilder.append("[");
            stringBuilder.append(kVar2.getClass().getSimpleName());
            stringBuilder.append("@");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(kVar2)));
            stringBuilder.append("]");
            kVar2 = stringBuilder.toString();
            if (kVar2 == null) {
                $$$reportNull$$$0(5);
            }
            return kVar2;
        } catch (Throwable unused) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(kVar2.getClass().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(kVar2.bsZ());
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2 == null) {
                $$$reportNull$$$0(6);
            }
            return stringBuilder2;
        }
    }
}
