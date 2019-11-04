package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.e;

/* compiled from: ReceiverParameterDescriptorImpl */
public class ac extends c {
    private final k fej;
    private final e ffZ;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 3 || i == 4 || i == 6) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = ConditionalUserProperty.VALUE;
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
            case 6:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "copy";
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = str3;
            } else if (i != 6) {
                objArr[2] = "<init>";
            }
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 3 || i == 4 || i == 6) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public ac(k kVar, e eVar, f fVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (eVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar == null) {
            $$$reportNull$$$0(2);
        }
        super(fVar);
        this.fej = kVar;
        this.ffZ = eVar;
    }

    public e btM() {
        e eVar = this.ffZ;
        if (eVar == null) {
            $$$reportNull$$$0(3);
        }
        return eVar;
    }

    public k brj() {
        k kVar = this.fej;
        if (kVar == null) {
            $$$reportNull$$$0(4);
        }
        return kVar;
    }
}
