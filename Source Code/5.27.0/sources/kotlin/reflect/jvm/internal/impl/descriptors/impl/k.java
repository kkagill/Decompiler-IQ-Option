package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n;

/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class k extends j implements l {
    private final aj fdu;
    private final kotlin.reflect.jvm.internal.impl.descriptors.k fej;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 4 || i == 5 || i == 6) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 4 || i == 5 || i == 6) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    protected k(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(2);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(3);
        }
        super(fVar, fVar2);
        this.fej = kVar;
        this.fdu = ajVar;
    }

    /* renamed from: bul */
    public n bsW() {
        n nVar = (n) super.bsW();
        if (nVar == null) {
            $$$reportNull$$$0(4);
        }
        return nVar;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.k brj() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVar = this.fej;
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        return kVar;
    }

    public aj brF() {
        aj ajVar = this.fdu;
        if (ajVar == null) {
            $$$reportNull$$$0(6);
        }
        return ajVar;
    }
}
