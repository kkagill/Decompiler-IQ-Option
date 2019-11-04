package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a.a;
import kotlin.reflect.jvm.internal.impl.descriptors.ad;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.aw;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class y extends k implements ad {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ae feB;
    private aw feG;
    private final boolean feJ;
    private final Kind feU;
    private s feV;
    private final boolean fek;
    private final Modality fel;
    private boolean isDefault;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        IllegalArgumentException illegalStateException;
        switch (i) {
            case 6:
            case 8:
            case 9:
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
            case 6:
            case 8:
            case 9:
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
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = ConditionalUserProperty.NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        str = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
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

    public void K(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(14);
        }
    }

    public <V> V a(a<V> aVar) {
        return null;
    }

    public boolean brB() {
        return false;
    }

    public boolean brC() {
        return false;
    }

    public boolean brV() {
        return false;
    }

    public boolean bsQ() {
        return false;
    }

    public boolean btk() {
        return false;
    }

    public boolean btl() {
        return false;
    }

    public boolean btm() {
        return false;
    }

    public boolean btn() {
        return false;
    }

    public boolean bto() {
        return false;
    }

    /* renamed from: buT */
    public abstract ad bul();

    public y(Modality modality, aw awVar, ae aeVar, f fVar, kotlin.reflect.jvm.internal.impl.name.f fVar2, boolean z, boolean z2, boolean z3, Kind kind, aj ajVar) {
        if (modality == null) {
            $$$reportNull$$$0(0);
        }
        if (awVar == null) {
            $$$reportNull$$$0(1);
        }
        if (aeVar == null) {
            $$$reportNull$$$0(2);
        }
        if (fVar == null) {
            $$$reportNull$$$0(3);
        }
        if (fVar2 == null) {
            $$$reportNull$$$0(4);
        }
        if (ajVar == null) {
            $$$reportNull$$$0(5);
        }
        super(aeVar.brj(), fVar, fVar2, ajVar);
        this.feV = null;
        this.fel = modality;
        this.feG = awVar;
        this.feB = aeVar;
        this.isDefault = z;
        this.fek = z2;
        this.feJ = z3;
        this.feU = kind;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void gG(boolean z) {
        this.isDefault = z;
    }

    public Kind bsT() {
        Kind kind = this.feU;
        if (kind == null) {
            $$$reportNull$$$0(6);
        }
        return kind;
    }

    public boolean brD() {
        return this.fek;
    }

    public boolean brA() {
        return this.feJ;
    }

    /* renamed from: c */
    public s f(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(7);
        }
        throw new UnsupportedOperationException();
    }

    public List<ao> bsM() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(8);
        }
        return emptyList;
    }

    public Modality bru() {
        Modality modality = this.fel;
        if (modality == null) {
            $$$reportNull$$$0(9);
        }
        return modality;
    }

    public aw brx() {
        aw awVar = this.feG;
        if (awVar == null) {
            $$$reportNull$$$0(10);
        }
        return awVar;
    }

    public void d(aw awVar) {
        this.feG = awVar;
    }

    public ae btF() {
        ae aeVar = this.feB;
        if (aeVar == null) {
            $$$reportNull$$$0(12);
        }
        return aeVar;
    }

    public ah bsK() {
        return btF().bsK();
    }

    public ah bsL() {
        return btF().bsL();
    }

    public s.a<? extends s> btp() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: d */
    public ad a(k kVar, Modality modality, aw awVar, Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* Access modifiers changed, original: protected */
    public Collection<ad> gH(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (ae aeVar : btF().bsR()) {
            Object btG = z ? aeVar.btG() : aeVar.btH();
            if (btG != null) {
                arrayList.add(btG);
            }
        }
        return arrayList;
    }

    public s btj() {
        return this.feV;
    }

    public void g(s sVar) {
        this.feV = sVar;
    }
}
