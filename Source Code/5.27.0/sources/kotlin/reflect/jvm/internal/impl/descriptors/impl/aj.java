package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.at;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: VariableDescriptorImpl */
public abstract class aj extends k implements at {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected w fgm;

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
            case 9:
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
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
            case 7:
            case 8:
            case 9:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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
            case 9:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    public <V> V a(a<V> aVar) {
        return null;
    }

    public ah bsK() {
        return null;
    }

    public ah bsL() {
        return null;
    }

    public boolean bsQ() {
        return false;
    }

    public boolean btY() {
        return false;
    }

    public aj(k kVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, w wVar, kotlin.reflect.jvm.internal.impl.descriptors.aj ajVar) {
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
        super(kVar, fVar, fVar2, ajVar);
        this.fgm = wVar;
    }

    public w bpT() {
        w wVar = this.fgm;
        if (wVar == null) {
            $$$reportNull$$$0(4);
        }
        return wVar;
    }

    public void V(w wVar) {
        this.fgm = wVar;
    }

    /* renamed from: buX */
    public at bul() {
        at atVar = (at) super.bsW();
        if (atVar == null) {
            $$$reportNull$$$0(5);
        }
        return atVar;
    }

    public List<ar> bsP() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(6);
        }
        return emptyList;
    }

    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> bsR() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            $$$reportNull$$$0(7);
        }
        return emptySet;
    }

    public List<ao> bsM() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(8);
        }
        return emptyList;
    }

    public w bsN() {
        w bpT = bpT();
        if (bpT == null) {
            $$$reportNull$$$0(9);
        }
        return bpT;
    }
}
