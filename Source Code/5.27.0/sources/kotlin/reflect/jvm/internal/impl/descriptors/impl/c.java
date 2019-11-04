package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ab;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.av;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.a.h;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class c extends j implements ah {
    private static final f fdU = f.mu("<this>");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
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

    /* renamed from: bui */
    public ab bsW() {
        return this;
    }

    public c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f fVar) {
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        super(fVar, fdU);
    }

    /* renamed from: e */
    public ah f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(1);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        w c;
        if (brj() instanceof d) {
            c = typeSubstitutor.c(bpT(), Variance.OUT_VARIANCE);
        } else {
            c = typeSubstitutor.c(bpT(), Variance.INVARIANT);
        }
        if (c == null) {
            return null;
        }
        if (c == bpT()) {
            return this;
        }
        return new ac(brj(), new h(c), brE());
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((ah) this, (Object) d);
    }

    public List<ao> bsM() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(2);
        }
        return emptyList;
    }

    public w bsN() {
        return bpT();
    }

    public w bpT() {
        w bpT = btM().bpT();
        if (bpT == null) {
            $$$reportNull$$$0(3);
        }
        return bpT;
    }

    public List<ar> bsP() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(4);
        }
        return emptyList;
    }

    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> bsR() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            $$$reportNull$$$0(5);
        }
        return emptySet;
    }

    public aw brx() {
        aw awVar = av.fdf;
        if (awVar == null) {
            $$$reportNull$$$0(6);
        }
        return awVar;
    }

    public aj brF() {
        aj ajVar = aj.fcV;
        if (ajVar == null) {
            $$$reportNull$$$0(8);
        }
        return ajVar;
    }
}
