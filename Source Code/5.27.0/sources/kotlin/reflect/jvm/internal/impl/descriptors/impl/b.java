package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class b extends e {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = "source";
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public b(h hVar, k kVar, f fVar, Variance variance, boolean z, int i, aj ajVar, am amVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (kVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        if (variance == null) {
            $$$reportNull$$$0(3);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(4);
        }
        if (amVar == null) {
            $$$reportNull$$$0(5);
        }
        super(hVar, kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug(), fVar, variance, z, i, ajVar, amVar);
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = btb() ? "reified " : str;
        if (bta() != Variance.INVARIANT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bta());
            stringBuilder.append(" ");
            str = stringBuilder.toString();
        }
        objArr[1] = str;
        objArr[2] = bsZ();
        return String.format("%s%s%s", objArr);
    }
}
