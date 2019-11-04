package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class ak extends aj {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean fgn;
    protected f<g<?>> fgo;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = ConditionalUserProperty.NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public ak(k kVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, w wVar, boolean z, aj ajVar) {
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
        super(kVar, fVar, fVar2, wVar, ajVar);
        this.fgn = z;
    }

    public boolean btW() {
        return this.fgn;
    }

    public g<?> btX() {
        f fVar = this.fgo;
        return fVar != null ? (g) fVar.invoke() : null;
    }

    public void a(f<g<?>> fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(4);
        }
        this.fgo = fVar;
    }
}
