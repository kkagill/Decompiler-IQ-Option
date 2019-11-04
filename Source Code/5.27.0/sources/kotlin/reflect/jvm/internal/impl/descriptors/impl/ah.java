package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.a.b;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.am;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: TypeParameterDescriptorImpl */
public class ah extends e {
    private final b<w, Void> fge;
    private final List<w> fgf;
    private boolean initialized;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 4 || i == 24) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        switch (i) {
            case 1:
            case 6:
            case 11:
            case 17:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
            case 12:
            case 18:
                objArr[0] = "variance";
                break;
            case 3:
            case 8:
            case 13:
            case 19:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 4:
            case 24:
                objArr[0] = str2;
                break;
            case 9:
            case 14:
            case 20:
                objArr[0] = "source";
                break;
            case 15:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 21:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 22:
                objArr[0] = "bound";
                break;
            case 23:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createWithDefaultBound";
        if (i == 4) {
            objArr[1] = str3;
        } else if (i != 24) {
            objArr[1] = str2;
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 4:
            case 24:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createForFurtherModification";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "<init>";
                break;
            case 22:
                objArr[2] = "addUpperBound";
                break;
            case 23:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 4 || i == 24) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public static ao a(k kVar, f fVar, boolean z, Variance variance, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (variance == null) {
            $$$reportNull$$$0(2);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(3);
        }
        ah a = a(kVar, fVar, z, variance, fVar2, i, aj.fcV);
        a.T(a.Q(kVar).bqO());
        a.setInitialized();
        if (a == null) {
            $$$reportNull$$$0(4);
        }
        return a;
    }

    public static ah a(k kVar, f fVar, boolean z, Variance variance, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i, aj ajVar) {
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        if (fVar == null) {
            $$$reportNull$$$0(6);
        }
        if (variance == null) {
            $$$reportNull$$$0(7);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(8);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(9);
        }
        return a(kVar, fVar, z, variance, fVar2, i, ajVar, null, am.a.fcX);
    }

    public static ah a(k kVar, f fVar, boolean z, Variance variance, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i, aj ajVar, b<w, Void> bVar, am amVar) {
        if (kVar == null) {
            $$$reportNull$$$0(10);
        }
        if (fVar == null) {
            $$$reportNull$$$0(11);
        }
        if (variance == null) {
            $$$reportNull$$$0(12);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(13);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(14);
        }
        if (amVar == null) {
            $$$reportNull$$$0(15);
        }
        return new ah(kVar, fVar, z, variance, fVar2, i, ajVar, bVar, amVar);
    }

    private ah(k kVar, f fVar, boolean z, Variance variance, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i, aj ajVar, b<w, Void> bVar, am amVar) {
        if (kVar == null) {
            $$$reportNull$$$0(16);
        }
        if (fVar == null) {
            $$$reportNull$$$0(17);
        }
        if (variance == null) {
            $$$reportNull$$$0(18);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(19);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(20);
        }
        if (amVar == null) {
            $$$reportNull$$$0(21);
        }
        super(LockBasedStorageManager.fwt, kVar, fVar, fVar2, variance, z, i, ajVar, amVar);
        this.fgf = new ArrayList(1);
        this.initialized = false;
        this.fge = bVar;
    }

    private void eb() {
        if (!this.initialized) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type parameter descriptor is not initialized: ");
            stringBuilder.append(bvi());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void bvh() {
        if (this.initialized) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type parameter descriptor is already initialized: ");
            stringBuilder.append(bvi());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private String bvi() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bsZ());
        stringBuilder.append(" declared in ");
        stringBuilder.append(c.w(brj()));
        return stringBuilder.toString();
    }

    public void setInitialized() {
        bvh();
        this.initialized = true;
    }

    public void T(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(22);
        }
        bvh();
        U(wVar);
    }

    private void U(w wVar) {
        if (!y.aJ(wVar)) {
            this.fgf.add(wVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public void P(w wVar) {
        if (wVar == null) {
            $$$reportNull$$$0(23);
        }
        b bVar = this.fge;
        if (bVar != null) {
            bVar.invoke(wVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public List<w> buq() {
        eb();
        List list = this.fgf;
        if (list == null) {
            $$$reportNull$$$0(24);
        }
        return list;
    }
}
