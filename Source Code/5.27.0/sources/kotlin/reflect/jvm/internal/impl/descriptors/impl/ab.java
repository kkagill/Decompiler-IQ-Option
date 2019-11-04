package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ag;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ar;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: PropertySetterDescriptorImpl */
public class ab extends y implements ag {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ar ffX;
    private final ag ffY;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                illegalStateException = new IllegalStateException(str);
                break;
            default:
                illegalStateException = new IllegalArgumentException(str);
                break;
        }
        throw illegalStateException;
    }

    public ab(ae aeVar, f fVar, Modality modality, aw awVar, boolean z, boolean z2, boolean z3, Kind kind, ag agVar, aj ajVar) {
        ab abVar;
        ag agVar2;
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
        stringBuilder.append("<set-");
        stringBuilder.append(aeVar.bsZ());
        stringBuilder.append(">");
        kotlin.reflect.jvm.internal.impl.name.f mu = kotlin.reflect.jvm.internal.impl.name.f.mu(stringBuilder.toString());
        super(modality, awVar, aeVar, fVar, mu, z, z2, z3, kind, ajVar);
        if (agVar != null) {
            abVar = this;
            agVar2 = agVar;
        } else {
            abVar = this;
            agVar2 = abVar;
        }
        abVar.ffY = agVar2;
    }

    public void c(ar arVar) {
        if (arVar == null) {
            $$$reportNull$$$0(6);
        }
        this.ffX = arVar;
    }

    public static ai a(ag agVar, w wVar, f fVar) {
        if (agVar == null) {
            $$$reportNull$$$0(7);
        }
        if (wVar == null) {
            $$$reportNull$$$0(8);
        }
        if (fVar == null) {
            $$$reportNull$$$0(9);
        }
        return new ai(agVar, null, 0, fVar, kotlin.reflect.jvm.internal.impl.name.f.mu("<set-?>"), wVar, false, false, false, null, aj.fcV);
    }

    public Collection<? extends ag> bsR() {
        Collection gH = super.gH(false);
        if (gH == null) {
            $$$reportNull$$$0(10);
        }
        return gH;
    }

    public List<ar> bsP() {
        ar arVar = this.ffX;
        if (arVar != null) {
            List singletonList = Collections.singletonList(arVar);
            if (singletonList == null) {
                $$$reportNull$$$0(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }

    public w bsN() {
        ad bqX = a.Q(this).bqX();
        if (bqX == null) {
            $$$reportNull$$$0(12);
        }
        return bqX;
    }

    public <R, D> R a(m<R, D> mVar, D d) {
        return mVar.a((ag) this, (Object) d);
    }

    /* renamed from: bva */
    public ag bul() {
        ag agVar = this.ffY;
        if (agVar == null) {
            $$$reportNull$$$0(13);
        }
        return agVar;
    }
}
