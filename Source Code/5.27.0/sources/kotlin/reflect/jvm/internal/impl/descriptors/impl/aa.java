package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.af;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: PropertyGetterDescriptorImpl */
public class aa extends y implements af {
    private w ffV;
    private final af ffW;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        int i2 = (i == 6 || i == 7 || i == 8) ? 2 : 3;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        str = String.format(str, objArr);
        IllegalArgumentException illegalStateException = (i == 6 || i == 7 || i == 8) ? new IllegalStateException(str) : new IllegalArgumentException(str);
        throw illegalStateException;
    }

    public aa(ae aeVar, f fVar, Modality modality, aw awVar, boolean z, boolean z2, boolean z3, Kind kind, af afVar, aj ajVar) {
        aa aaVar;
        af afVar2;
        if (aeVar == null) {
            $$$reportNull$$$0(0);
        }
        if (fVar == null) {
            $$$reportNull$$$0(1);
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
        }
        if (awVar == null) {
            $$$reportNull$$$0(3);
        }
        if (kind == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<get-");
        stringBuilder.append(aeVar.bsZ());
        stringBuilder.append(">");
        kotlin.reflect.jvm.internal.impl.name.f mu = kotlin.reflect.jvm.internal.impl.name.f.mu(stringBuilder.toString());
        super(modality, awVar, aeVar, fVar, mu, z, z2, z3, kind, ajVar);
        if (afVar != null) {
            aaVar = this;
            afVar2 = afVar;
        } else {
            aaVar = this;
            afVar2 = aaVar;
        }
        aaVar.ffW = afVar2;
    }

    public void S(w wVar) {
        if (wVar == null) {
            wVar = btF().bpT();
        }
        this.ffV = wVar;
    }

    public Collection<? extends af> bsR() {
        Collection gH = super.gH(true);
        if (gH == null) {
            $$$reportNull$$$0(6);
        }
        return gH;
    }

    public List<ar> bsP() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(7);
        }
        return emptyList;
    }

    public w bsN() {
        return this.ffV;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((af) this, (Object) d);
    }

    /* renamed from: buZ */
    public af bul() {
        af afVar = this.ffW;
        if (afVar == null) {
            $$$reportNull$$$0(8);
        }
        return afVar;
    }
}
