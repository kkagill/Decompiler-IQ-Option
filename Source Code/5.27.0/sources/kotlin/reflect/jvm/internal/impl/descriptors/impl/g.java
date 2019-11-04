package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: ClassDescriptorBase */
public abstract class g extends a {
    private final aj fdu;
    private final k fej;
    private final boolean fek;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 4 || i == 5) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 4 || i == 5) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    protected g(h hVar, k kVar, f fVar, aj ajVar, boolean z) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (kVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(3);
        }
        super(hVar, fVar);
        this.fej = kVar;
        this.fdu = ajVar;
        this.fek = z;
    }

    public boolean brD() {
        return this.fek;
    }

    public k brj() {
        k kVar = this.fej;
        if (kVar == null) {
            $$$reportNull$$$0(4);
        }
        return kVar;
    }

    public aj brF() {
        aj ajVar = this.fdu;
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        return ajVar;
    }
}
